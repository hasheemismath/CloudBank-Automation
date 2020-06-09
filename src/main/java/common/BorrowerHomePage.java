package common;

import jumpStart.DLFPage;
import mainProduct.SelectLoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Elements.LoginElements;
import org.testng.Assert;
import utils.*;
import java.util.ArrayList;
import static Elements.LoanElements.loggedUserName;

public class BorrowerHomePage extends UIActions {

    By loggedUserName = By.xpath(".//span[@class='float-left']");
    By LoggedUserInfo = By.xpath("//*[@id=\"actionNav\"]/li/a");
    By ApplyNewProdBtn = By.xpath("//*[@id=\"mainNav\"]/li[3]/a");
    By consumerProductBtn = By.xpath("//*[@id='consumer']/div/div/a");
    By userSettings = By.xpath("//*[@id=\"actionNav\"]/li/div/a[1]");

    static WebDriver driver = Utils.getInstance().getDriver();
    //Base product
    public SelectLoginPage navigateToNewProduct(){
        click(ApplyNewProdBtn);
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0)).close();
        driver.switchTo().window(tabs2.get(1));
        return new SelectLoginPage();
    }

    //jump start
    public DLFPage navigateToSelectProduct(String url){
        driver.navigate().to(url);
        waitForElement(consumerProductBtn);
        return new DLFPage();
    }

    private void validateLogedUser(String userName) {
        String loggedUser = driver.findElement(loggedUserName).getText();
        Assert.assertEquals(loggedUser, userName, "Incorrect User Name in User Information");
    }

    public void navigateToUserSettings(){
        waitForElementClickable(LoggedUserInfo);
        click(LoggedUserInfo);
        waitForElementClickable(userSettings);
        click(userSettings);
    }
}

