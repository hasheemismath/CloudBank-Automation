package jumpStart;

import Elements.LoanElements;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import utils.UIActions;
import utils.Utils;

import java.util.ArrayList;

import static Elements.BankerElements.DLFSubStatus;

public class SubmitDLFPage extends UIActions implements LoanElements {

    static WebDriver driver = Utils.getInstance().getDriver();
    ViewLoanApplicationPage viewLoanApplicationPage;

    //Submit page
    By termsAndConditionsCheckBox = By.xpath("//*[@id=\"page-content\"]/div/main/div/div/div/section/form/div[1]/label/span[1]");
    By SubmitFormBtn = By.xpath("//button[text()=\"Submit\"]");
    By userDetailsDropDown = By.xpath("//*[@id=\"actionNav\"]/li/a/i[2]");
    By logoutButton = By.xpath("//*[@id=\"actionNav\"]/li/div/a[2]");
    //By userDetailsDropDown = By.xpath("//*[@id=\"actionNav\"]/li/a/i[2]");

    public void SubmitForm(){
        waitForElement(termsAndConditionsCheckBox);
        pause(4);
        click(termsAndConditionsCheckBox);
        waitForElement(SubmitFormBtn);
        pause(4);
        click(SubmitFormBtn);
    }

    public void viewSubmitedForm(){
        waitForPageLoad();
        pause(2);
        click(viewFormLink);
    }

    public void waitForProcessingPage(){
        waitForElement(viewFormLink);
        pause(2);
    }

    public void switchToBorrowerDLF(){
        viewLoanApplicationPage = new ViewLoanApplicationPage();
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.close();
        driver.switchTo().window(tabs.get(0));
        driver.close();
        driver.switchTo().window(tabs.get(2));
        String mainWindow = driver.getWindowHandle();
        driver.switchTo().window(mainWindow);
        driver.navigate().refresh();
        pause(3);
        viewLoanApplicationPage.validateBorrowerReOpenedStatus();
        viewLoanApplicationPage.startEditingDLF();
//        driver.quit();
//        Utils.getInstance().openBrowser();
//        Utils.getInstance().navigateToURL("Borrower");
//        loginPage = new LoginPage();
//        viewLoanApplicationPage = new ViewLoanApplicationPage();
//        borrowerHomePage = loginPage.successfulBorrowerLogin("robertuphold@mailinator.com", "Qwerty1!");
//        viewLoanApplicationPage.validateBorrowerReOpenedStatus();
//        viewLoanApplicationPage.startEditingDLF();
    }

    public void validateStatus(String status){

    }

    public void resubmitDLFile(){
        waitForElement(termsAndConditionsCheckBox);
        pause(2);
        click(termsAndConditionsCheckBox);
        waitForElementClickable(SubmitFormBtn);
        pause(2);
        click(SubmitFormBtn);
    }

    public void createANewTab(){
        ((JavascriptExecutor) driver).executeScript("window.open('about:blank','_blank');");
    }

    public void logout(){
        waitForElement(userDetailsDropDown);
        pause(2);
        click(userDetailsDropDown);
        waitForElementClickable(logoutButton);
        click(logoutButton);
        waitForElementClickable(DLFSubStatus);

    }

    public void closeAndLogout(){
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(2));
        driver.close();
        driver.switchTo().window(tabs.get(1));
        driver.close();
        driver.switchTo().window(tabs.get(0));
        waitForElement(userDetailsDropDown);
        pause(2);
        click(userDetailsDropDown);
        waitForElementClickable(logoutButton);
        click(logoutButton);

    }
}
