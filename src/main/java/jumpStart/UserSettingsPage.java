package jumpStart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.UIActions;
import utils.Utils;

public class UserSettingsPage extends UIActions {

    static WebDriver driver = Utils.getInstance().getDriver();
    ChildCareInformationPage childCareInfoPage;
    PersonalDocumentsPage personalDocumentsPage;
    SubmitDLFPage submitDLFPage;
    ViewLoanApplicationPage viewLoanApplicationPage;

    By currentPasswordTxt =  By.xpath("//*[@id=\"wr-content\"]/section/div/div[2]/form/div[1]/input");
    By newPasswordTxt = By.xpath("//*[@id=\"wr-content\"]/section/div/div[2]/form/div[2]/input");
    By confirmPasswordTxt = By.xpath("//*[@id=\"wr-content\"]/section/div/div[2]/form/div[3]/input");
    By changePasswordBtn =  By.xpath("//*[@id=\"wr-content\"]/section/div/div[2]/form/div[4]/div/button");
    By passwordChangeAlertMessage =  By.xpath("//*[@id=\"page-content\"]/div/div[3]/div/span");

    public void changePassword(String currentPassword, String newPassword) {
        waitForPageLoad();
        sendKeys(currentPasswordTxt, currentPassword);
        sendKeys(newPasswordTxt, newPassword);
        sendKeys(confirmPasswordTxt, newPassword);
        click(changePasswordBtn);
        waitForElement(passwordChangeAlertMessage);
        String actMessage = getText(passwordChangeAlertMessage);
        String expMessage = "Password Changed Successfully";
        Assert.assertEquals(actMessage, expMessage, "Update Password Unsuccessfull!!!");
    }

}
