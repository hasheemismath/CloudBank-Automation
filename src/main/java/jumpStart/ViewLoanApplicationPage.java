package jumpStart;

import Elements.LoanElements;
import Elements.LoginElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.UIActions;
import utils.Utils;

import java.util.ArrayList;

public class ViewLoanApplicationPage extends UIActions implements LoginElements, LoanElements {

    By DLFStatusTxt = By.xpath("//*[@id=\"dlf-bar\"]/div/div/div/span");
    By DLFBorrowerStatusTxt = By.xpath("//*[@id=\"dlf-bar\"]/div/div/div[1]/span");
    By DLFSubStatusTxt = By.xpath("//*[@id=\"dlf-bar\"]/div/div/a/span");
    By DLFDecisionStatus = By.xpath("//*[@id=\"tab-actions\"]/div/div/section/div[1]/span");
    By dashboardLink =  By.xpath("//*[@id=\"mainNav\"]/li[1]/a");
    By actionsSection =  By.xpath("//*[@id=\"dlf-bar\"]/div/ul/li[7]/a");
    By decisionStatusInActions =  By.xpath("//*[@id='tab-actions']/div/div/div/section/div/span");
    By cancelDeclineBtn = By.xpath("//*[@id=\"tab-actions\"]/div/div/div/section/form/div/button[1]");
    By confirmDeclineBtn = By.xpath("//*[@id=\"tab-actions\"]/div/div/div/section/form/div/button[2]");
    By confirmDeclineBtnConfirmationBOx = By.xpath("//*[@id=\"react-confirm-alert\"]/div/div/div/button[2]");
    By reopenBtn = By.xpath("//*[@id=\"tab-actions\"]/div/div/div/section/div/div/button/div");
    By confirmReopenBtn = By.xpath("//*[@id=\"tab-actions\"]/div/div/div/section/form/div[2]/button[2]");
    By reopenComment = By.xpath("//*[@id=\"tab-actions\"]/div/div/div/section/form/div[1]/textarea");
    By confirmReopenBtnInConfirmationWindow = By.xpath("//*[@id=\"react-confirm-alert\"]/div/div/div/button[2]");
    By cancelReopen = By.xpath("//*[@id=\"tab-actions\"]/div/div/div/section/form/div[2]/button[1]");
    By editButton = By.xpath("//*[@id=\"wr-application-view\"]/div/div[1]/div[1]/div/div/form/div[1]/a");
    By approveTile = By.linkText("Approved");
    By dlfHeader = By.xpath("//*[@id=\"wr-dlf\"]/div[1]/div[1]/h2");
    By caName = By.xpath("//*[@id=\"wr-dlf\"]/div[1]/div[2]/div/b");

    //Care Center Tab Details
    By childCareTab = By.xpath("//a[text()=\"Child Care Information\"]");
    By careCenterValue = By.xpath("//*[@id=\"root_careCenter\"]/input");

    //Personal Information Details
    By firstNameValue = By.xpath("//*[@id=\"wr-application-view\"]/div/div[1]/div[1]/div/div/form/div[2]/div[1]/input");
    By lastNameValue = By.xpath("//*[@id=\"wr-application-view\"]/div/div[1]/div[1]/div/div/form/div[2]/div[3]/input");

    static WebDriver driver = Utils.getInstance().getDriver();

    public void validateDLFStatus(Status status){
        driver.navigate().refresh();
        waitForPageLoad();
        waitForElement(DLFStatusTxt);
        String actValue = driver.findElement(DLFStatusTxt).getText();
        String expValue = status.toString();
        Assert.assertEquals(actValue, expValue, "Incorrect DLF Status!!!");
    }

    public void validateDLFSubStatus(String status){
        driver.navigate().refresh();
        waitForPageLoad();
        waitForElement(DLFSubStatusTxt);
        String actValue = driver.findElement(DLFSubStatusTxt).getText();
        Assert.assertEquals(actValue, status, "Incorrect DLF Status!!!");
    }

    public void validateReOpenedStatus(){
        driver.navigate().refresh();
        waitForPageLoad();
        waitForElement(DLFStatusTxt);
        String actValue = driver.findElement(DLFStatusTxt).getText();
        String expValue = "RE-OPENED";
        Assert.assertEquals(actValue, expValue, "Incorrect DLF Status!!!");
    }

    public void validateBorrowerReOpenedStatus(){
        waitForPageLoad();
        waitForElement(DLFStatusTxt);
        String actValue = driver.findElement(DLFStatusTxt).getText();
        String expValue = "RE-OPENED";
        Assert.assertEquals(actValue, expValue, "Incorrect DLF Status!!!");
    }

    public void navigateToDashboard(){
        waitForElementClickable(dashboardLink);
        pause(3);
        click(dashboardLink);
        pause(3);
    }

    public void navigateToActionsTab(){
        waitForElementClickable(actionsSection);
        pause(3);
        click(actionsSection);
    }

    public void validateButtonsPresentAfterClickingDecline()
    {   waitForPageLoad();
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOfElementLocated(decisionStatusInActions));
        pause(5);
        if (!driver.findElement(cancelDeclineBtn).isDisplayed() && !driver.findElement(confirmDeclineBtn).isDisplayed()){
            System.out.println("Expected Buttons are not visible!!!");
        }
    }

    public void confirmDecline(){
        click(confirmDeclineBtn);
        waitForElement(confirmDeclineBtnConfirmationBOx);
        click(confirmDeclineBtnConfirmationBOx);
        pause(3);
    }

    public void cancelDecline(){
        waitForElement(cancelDeclineBtn);
        click(cancelDeclineBtn);
    }

    public void confirmReopenDLF(){
        click(reopenBtn);
        validateButtonsPresentAfterClickingDecline();
        waitForElement(confirmReopenBtn);
        sendKeys(reopenComment, "Re Opening");
        click(confirmReopenBtn);
        waitForElementClickable(confirmReopenBtnInConfirmationWindow);
        click(confirmReopenBtnInConfirmationWindow);
    }

    public void cancelReopenDLF(){
        click(reopenBtn);
        waitForElement(cancelReopen);
        click(cancelReopen);
    }

    public void startEditingDLF(){
        waitForElementClickable(editButton);
        pause(8);
        click(editButton);
    }

    //CareCenterTab
    public void clickChildCareTab(){
        waitForElementClickable(childCareTab);
        pause(3);
        click(childCareTab);
    }

    public String getCareCenterValue(){
        waitForElement(careCenterValue);
        pause(3);
        String careCenterName = getValue(careCenterValue);
        return careCenterName;
    }

    public String getBorrowerNameValue(){
        waitForElement(firstNameValue);
        pause(3);
        String firstName = getValue(firstNameValue) + " ";
        String lastName = getValue(lastNameValue);
        String fullName = firstName + lastName;
        return fullName;
    }

    public String getDLFCodeValue(){
        waitForElement(dlfHeader);
        pause(3);
        String dlfCode = getDLFIdFromURL();
        return dlfCode;
    }

    public String getDLFIdFromURL(){
        String heading = driver.findElement(dlfHeader).getText();
        String splitFromName[] = heading.split("\\Q|\\E");
        String firstHalf[] = splitFromName[0].split("Digital Application #");
        String id = firstHalf[1].trim();
        return id;
    }

    public String getCAName(){
        waitForElement(caName);
        pause(3);
        String canName = driver.findElement(caName).getText();
        return canName;
    }

    public void switchToSubmittedDLF(){

        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        driver.close();
        driver.switchTo().window(tabs.get(1));
    }

    public enum Status{
        APPROVED, DECLINED, PROCESSING

    }

}
