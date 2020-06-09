package RPC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.UIActions;
import utils.Utils;

import java.util.ArrayList;

public class ProcessingPage extends UIActions {

    By loggedUserInfo = By.id("//a[@class='nav-link'][@role='button']");
    By clickHereLink = By.xpath("//*[@id=\"page-content\"]/div/div[1]/div/section/div/div/p/a");
    By headerText = By.xpath("//*[@id=\"page-content\"]/div/div[1]/div/section/div/div/div/div/h2");


    public void validateSuccessfullySubmitDLF(){
        waitForElement(headerText);
        boolean actValue = isElementPresent(clickHereLink);
        Assert.assertEquals(actValue, true, "DLF Submit error!!!");
    }

    WebDriver driver = Utils.getInstance().getDriver();

    public void closeCurrentTabAndSwitchToPrevious(){
        waitForElement(clickHereLink);
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1)).close();
        driver.switchTo().window(tabs.get(0));

    }

}
