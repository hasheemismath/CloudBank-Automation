package RPC;

import org.openqa.selenium.By;
import org.testng.Assert;
import utils.UIActions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class OtherDocumentsPage extends UIActions {

    By loggedUserInfo = By.xpath("//a[@class='nav-link'][@role='button']");
    By nextPageButton = By.id("next-btn-otherDocumentsInfo");
    By uploadDocNameTxt = By.xpath("//*[@id=\"root_documentsInfo\"]/div[1]/div/div/div/input");
    By uploadDocLbl = By.xpath("//*[@id=\"root_documentsInfo\"]/div[1]/div/div/label");
    By uploadDocPreviewBtn = By.xpath("//*[@id=\"root_documentsInfo\"]/div[1]/div[1]/div/div/div/button[1]/span");
    By uploadDocSection = By.xpath("//*[@id=\"progress\"]/div[10]/div/span");
    By otherDocumentsSection = By.xpath("//*[@id=\"progress\"]/div[10]/div/span");
    By reuploadLbl = By.xpath("//*[@id=\"root_documentsInfo\"]/div[1]/div[1]/div/label/span[2]");

    public void uploadOtherDocuments() throws AWTException {
        waitForElement(nextPageButton);
        sendKeys(uploadDocNameTxt, "TestDoc 1");
        waitForElementClickable(uploadDocLbl);
        click(uploadDocLbl);
        StringSelection otherDoc1 = new StringSelection("D:\\Cloudbnq\\07.04.19\\test-automation-v2\\CloudBank\\testDocuments\\Vehicle details.png");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(otherDoc1, null);
        pause(2);
        //Native key strokes for CTRL, V and ENTER keys
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        pause(3);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        //wait till document upload
        pause(4);
        validateOtherDocPreviewBtn();
    }

    public void validateOtherDocPreviewBtn(){
        waitForElementClickable(reuploadLbl);
        boolean actual = isElementPresent(uploadDocPreviewBtn);
        Assert.assertEquals(actual, true, "Document upload error!!!");
    }

    public OtherDocumentsPage navigateStraightToOtherDocumentsSection(){
        waitForElementClickable(uploadDocSection);
        pause(3);
        click(uploadDocSection);
        return new OtherDocumentsPage();
    }

    public SubmitPage navigateToSubmitPageSection(){
        click(nextPageButton);
        return new SubmitPage();
    }
}
