package common;

import Elements.BankerElements;
import Elements.LoanElements;
import Elements.LoginElements;
import org.openqa.selenium.*;
import utils.*;
import java.util.ArrayList;
import static Elements.LoanElements.LoggedUserInfo;

public class LoginPage extends UIActions implements LoginElements, LoanElements , BankerElements {

    static WebDriver driver = Utils.getInstance().getDriver();
    
    private void loginAs(String user, String pass)
    {
        sendKeys(LoginEmail, user);
        sendKeys(LoginPassword, pass);
        click(LoginBtn);
    }

    public BorrowerHomePage successfulBorrowerLogin(String user, String pass){
        loginAs(user,pass);
        waitForElement(LoggedUserInfo);
        return new BorrowerHomePage();
    }

    public LoginPage unSuccessfulBorrowerLogin(String user, String pass){
        loginAs(user,pass);
        return this;
    }

    public BankerHomePage successfulBankerLogin(String user, String pass){
        loginAs(user,pass);
        pause(3);
        mfaVerification(user,pass);
        waitForElement(LoggedUserInfo);
        return new BankerHomePage();
    }

    public BankerHomePage successfulAdminLogin(String user, String pass){
        loginAs(user,pass);
        pause(3);
        waitForElementClickable(LoggedUserInfo);
        pause(5);
        click(LoggedUserInfo);
        waitForElementClickable(bankDashboard);
        pause(5);
        click(bankDashboard);
        return new BankerHomePage();
    }

    public void navigateTOBankerPortal(String url){
        createANewTab();
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1)); //navigate to new tab
      //  driver.get("http://cloudbnq-oabdev-banker-application.s3-website.us-east-2.amazonaws.com/login?redirect=/");
        driver.get(url);
    }

    public void mfaVerification(String user, String pass){
        createANewTab();
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));//navigate to new tab
        driver.get("https://www.receivesms.co/us-phone-number/3378/");

        waitForElement(mfaUpdateBtn);
        while (!(driver.findElement(codeRecieved).getText().equals("58988") && driver.findElement(codeRecievedTime).getText().contains("sec")))
        {
            driver.navigate().refresh();
        }
        String mfaCode = driver.findElement(mfaCodeText).getText();

        driver.switchTo().window(tabs.get(0));
        sendKeys(verifictionTextBox, mfaCode);
        click(verifyButton);
        pause(2);
    }

    public void incorrectLoginInfo(String[] line) throws Exception{
        fillIncorrectLoginInfo(line);

    }

    public void fillIncorrectLoginInfo(String[] line) throws Exception{
        String email = line[0];
        String password = line[1];
        clear(LoginEmail);
        sendKeys(LoginEmail, email);
        clear(LoginPassword);
        sendKeys(LoginPassword, password);
        click(LoginBtn);
    }

    public void validateIncorrectPasswordErrorMessage(){
        verifyErrorMessageText(ErrorMessage, "Username or Password is invalid");
    }

    public void validateIncorrectUserNameErrorMessage(){
        verifyErrorMessageText(ErrorMessage, "User does not exist.");
    }

    public void validateInvalidValuesErrorMessage(){
        verifyErrorMessageText(ErrorMessage, "Username or Password is invalid");
    }

    public RegistrationPage navigateToRegistrationPage(){
        pause(2);
        click(registerLink);
        return new RegistrationPage();
    }

    public void updateForgotPassword(){
        click(forgotPassowordLink);
        waitForElement(requestPasswordResetBtn);
        sendKeys(forgotPasswordEmail, "jaredhunt456+19@gmail.com");
        click(requestPasswordResetBtn);
        waitForElement(resetPasswordBtn);
        sendKeys(verificationCodeTxt, "Qwerty1!");

    }


}