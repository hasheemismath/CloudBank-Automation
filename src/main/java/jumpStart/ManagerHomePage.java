package jumpStart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.UIActions;
import utils.Utils;

public class ManagerHomePage extends UIActions {

    static WebDriver driver = Utils.getInstance().getDriver();
    ChildCareInformationPage childCareInfoPage;
    PersonalDocumentsPage personalDocumentsPage;
    SubmitDLFPage submitDLFPage;
    ViewLoanApplicationPage viewLoanApplicationPage;

    By codeSearch =  By.xpath("//*[@id=\"page-content\"]/div/main/div[1]/div/div/ul/li[2]/input");
    By managerSearchByCareCenterTxtBox = By.xpath("//*[@id=\"page-content\"]/div/main/div[1]/ul/li[3]/div/div[1]/input");
    By managerSearchByBorrowerTxtBox = By.xpath("//*[@id=\"page-content\"]/div/main/div[1]/ul/li[4]/div/div[1]/input");
    By digitalApplicationLink =  By.xpath("//*[@id=\"mainNav\"]/li[2]/a");
    By userDetailsDropDown = By.xpath("//*[@id=\"actionNav\"]/li[2]/a/i[2]");
    By myDigitalApplicationsUrl =  By.xpath("//*[@id=\"page-content\"]/div/main/div[1]/ul/li[2]/a");
    By logoutButtonInUserInfoDropDown = By.xpath("//*[@id=\"actionNav\"]/li[2]/div/a[2]");
    By dashboardLink =  By.xpath("//*[@id=\"mainNav\"]/li[1]/a");
    By newSelectedDLF = By.xpath("//*[@id=\"wr-dlf\"]/div/div[2]/div/div/div/div/div[1]/div[2]/table/tbody/tr/td[2]/a");
    By approveTile = By.linkText("Approved");
    By filterBtn = By.xpath("//*[@id=\"page-content\"]/div/main/div[1]/div/div/ul/li[5]/button[1]");
    By newBtn = By.xpath("//*[@id=\"wr-content\"]/section[1]/div/div[1]/a");
    By userSettingsInUserInfoDropDown = By.xpath("//*[@id=\"actionNav\"]/li[2]/div/a[1]");
    By newDLFTile = By.xpath("//*[@id=\"tab1\"]/div/a[1]");

    public void navigateToNewDLFsByTile()
    {
        refreshPage();
        waitForPageLoad();
        waitForElementClickable(newBtn);
        pause(10);
        click(newBtn);
    }

    public void navigateToNewSelectedDLF(String id)
    {
        waitForPageLoad();
        waitForElementClickable(codeSearch);
        sendKeys(codeSearch, id);
        waitForElementClickable(filterBtn);
        pause(10);
        click(filterBtn);
        if (driver.findElement(newSelectedDLF).isEnabled())
            click(newSelectedDLF);
        else {
            //waitForElementClickable(newSelectedDLF);
            pause(8);
            click(newSelectedDLF);
        }
    }

    public void navigateToDashboard(){
        pause(5);
        waitForElement(dashboardLink);
        click(dashboardLink);
        pause(5);
        waitForElement(approveTile);
    }

    public void refreshPage(){
        driver.navigate().refresh();
    }

    public void validateDigitalApplicationLinkIsVisible(){
        Assert.assertTrue(driver.findElement(digitalApplicationLink).isDisplayed(), "Digital Application Link is not displayed!!!");
    }

    public void validateLoggedUserDetailsIsVisible(){
        Assert.assertTrue(driver.findElement(userDetailsDropDown).isDisplayed(), "Logged User Details Drop down is not displayed!!!");
    }

    public void validateUserSettingsIsVisible(){
        waitForElement(userDetailsDropDown);
        pause(1);
        click(userDetailsDropDown);
        pause(1);
        Assert.assertTrue(driver.findElement(userSettingsInUserInfoDropDown).isDisplayed(), "User Settings Section is not displayed!!!");
    }

    public void validateLogoutIsVisible(){
        Assert.assertTrue(driver.findElement(logoutButtonInUserInfoDropDown).isDisplayed(), "Logout is not displayed!!!");
    }

    public void validateMyDigitalApplicationsLinkIsVisible(){
        Assert.assertTrue(driver.findElement(myDigitalApplicationsUrl).isDisplayed(), "My Digital Applications Link is not displayed!!!");
    }

    public void validateManagerSearchForCareCenterSearchboxIsVisible(){
        Assert.assertTrue(driver.findElement(managerSearchByCareCenterTxtBox).isDisplayed(), "Search For Care Center Search box is not displayed!!!");
    }

    public void validateManagerSearchForBorrowerSearchboxIsVisible(){
        Assert.assertTrue(driver.findElement(managerSearchByBorrowerTxtBox).isDisplayed(), "Search For Borrower Search box is not displayed!!!");
    }

    public void logout(){
        if (!driver.findElement(logoutButtonInUserInfoDropDown).isEnabled()){
            click(userDetailsDropDown);
            waitForElementClickable(logoutButtonInUserInfoDropDown);
            click(logoutButtonInUserInfoDropDown);
        }
        else
            click(logoutButtonInUserInfoDropDown);
    }

    public void validateManagerLogin(){
        waitForElementClickable(newDLFTile);
        validateDigitalApplicationLinkIsVisible();
        validateMyDigitalApplicationsLinkIsVisible();
        validateManagerSearchForCareCenterSearchboxIsVisible();
        validateManagerSearchForBorrowerSearchboxIsVisible();
        validateLoggedUserDetailsIsVisible();
        validateUserSettingsIsVisible();
        validateLogoutIsVisible();
        logout();
    }
}
