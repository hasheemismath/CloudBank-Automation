package common;

import Elements.LoginElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.*;

import java.util.ArrayList;

public class RegistrationPage extends UIActions implements LoginElements {

    static WebDriver driver = Utils.getInstance().getDriver();

    public void fillingRegForm(){
        By fName = By.name("register.firstname");
        By lName = By.name("register.lastname");
        By regEmail = By.name("register.emailAddress");
        By phone = By.name("register.phoneNumber");
        By password = By.name("register.password");
        By registerButton = By.xpath("//*[@id=\"register-form\"]/div[6]/div/button");
        sendKeys(fName,"Sam");
        sendKeys(lName,"James");
        sendKeys(regEmail,"sam_james@mailinator.com");
        sendKeys(phone,"3028580567");
        sendKeys(password,"Qwerty1!");
        click(registerButton);
    }

    public void navigateToInbox(){
        createANewTab();
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1)); //navigate to new tab
        driver.get("https://www.mailinator.com/v3/index.jsp?zone=public&query=sam_james#/#inboxpane");
    }

    public void getTheCode(){
        By emailFrom = By.xpath("//*[@id=\"row_sam_james-1565262876-18662280\"]/td[3]");
        By iframe = By.xpath("//*[@id='msg_body']");
        click(emailFrom);
        WebElement frame = driver.findElement(iframe);
        driver.switchTo().frame(frame);
       // String text = driver.findElement(iframe[0]).getText();
        //System.out.println(text);
    }
}
