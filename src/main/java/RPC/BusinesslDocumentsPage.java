package RPC;

import org.openqa.selenium.By;
import org.testng.Assert;
import utils.UIActions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class BusinesslDocumentsPage extends UIActions {

    By loggedUserInfo = By.xpath("//a[@class='nav-link'][@role='button']");
    By nextPageButton = By.id("next-btn-businessDocumentsInfo");
    By businessTaxReturn1 = By.xpath("//*[@id=\"root_documentsInfo\"]/div[1]/div[1]/div/label");
    By businessTaxReturn1PreviewBtn = By.xpath("//*[@id=\"root_documentsInfo\"]/div[1]/div[1]/div/div/div/button[1]/span");
    By cashFlowProjection = By.xpath("//*[@id=\"root_documentsInfo\"]/div[1]/div[5]/div/label");
    By cashFlowProjectionPreviewBtn = By.xpath("//*[@id=\"root_documentsInfo\"]/div[1]/div[5]/div/div/div/button[1]/span");
    By profitAndLoss = By.xpath("//*[@id=\"root_documentsInfo\"]/div[1]/div[9]/div/label");
    By profitAndLossPreviewBtn = By.xpath("//*[@id=\"root_documentsInfo\"]/div[1]/div[9]/div/div/div/button[1]/span");

    public void uploadBusinessDocuments() throws AWTException {
        waitForElement(nextPageButton);
    }

    public void businessTaxReturnUpload() throws AWTException {
        //Upload Personal Tax Return
        click(businessTaxReturn1);
        StringSelection personalTaxReturn = new StringSelection("D:\\Cloudbnq\\07.04.19\\test-automation-v2\\CloudBank\\testDocuments\\income-tax-statement-template-hp4ixdtq.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(personalTaxReturn, null);
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
        validateBusinessTaxReturnPreviewBtn();
    }

    public void validateBusinessTaxReturnPreviewBtn(){
        boolean actual = isElementPresent(businessTaxReturn1PreviewBtn);
        Assert.assertEquals(actual, true, "Document upload error!!!");
    }

    public void cashFlowProjectionUpload() throws AWTException {
        //Upload Personal Tax Return
        click(cashFlowProjection);
        StringSelection personalTaxReturn = new StringSelection("D:\\Cloudbnq\\07.04.19\\test-automation-v2\\CloudBank\\testDocuments\\income-tax-statement-template-hp4ixdtq.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(personalTaxReturn, null);
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
        validateCashFlowProjectionPreviewBtn();
    }

    public void validateCashFlowProjectionPreviewBtn(){
        boolean actual = isElementPresent(cashFlowProjectionPreviewBtn);
        Assert.assertEquals(actual, true, "Document upload error!!!");
    }

    public void profitAndLossUpload() throws AWTException {
        //Upload Personal Tax Return
        click(profitAndLoss);
        StringSelection personalTaxReturn = new StringSelection("D:\\Cloudbnq\\07.04.19\\test-automation-v2\\CloudBank\\testDocuments\\income-tax-statement-template-hp4ixdtq.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(personalTaxReturn, null);
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
        validateProfitAndLossPreviewBtn();
    }

    public void validateProfitAndLossPreviewBtn(){
        boolean actual = isElementPresent(profitAndLossPreviewBtn);
        Assert.assertEquals(actual, true, "Document upload error!!!");
    }

    public CollateralDocumentsPage navigateToCollateralDocumentsSection(){
        click(nextPageButton);
        return new CollateralDocumentsPage();
    }
}
