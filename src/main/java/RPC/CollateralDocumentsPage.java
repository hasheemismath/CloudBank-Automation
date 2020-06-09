package RPC;

import org.openqa.selenium.By;
import org.testng.Assert;
import utils.UIActions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class CollateralDocumentsPage extends UIActions {

    By loggedUserInfo = By.xpath("//a[@class='nav-link'][@role='button']");
    By nextPageButton = By.id("next-btn-collateralInfo");
    By firstTabDocument = By.xpath("//*[@id=\"root_documentsInfo\"]/div[1]/div/div/label");
    By firstTabDocumentPreviewBtn = By.xpath("//*[@id=\"root_documentsInfo\"]/div[1]/div/div/div/div/button[1]/span");
    By secondTab = By.xpath("//*[@id=\"wr-form\"]/div/div/div[1]/div[1]/ul/li[2]/a");
    By secondTabDocument = By.xpath("//div[@id=\"doc-tab-collateralInfo-1\"]/div/div/div/div/div/label");
    By secondTabDocumentPreviewBtn = By.xpath("//div[@id=\"doc-tab-collateralInfo-1\"]/div/div/div/div/div/div/div/button/span");
    By thirdTab = By.xpath("//*[@id=\"wr-form\"]/div/div/div[1]/div[1]/ul/li[3]/a");
    By thirdTabDocument = By.xpath("//div[@id=\"doc-tab-collateralInfo-2\"]/div/div/div/div/div/label");
    By thirdTabDocumentPreviewBtn = By.xpath("//div[@id=\"doc-tab-collateralInfo-2\"]/div/div/div/div/div/div/div/button/span");
    By forthTab = By.xpath("//*[@id=\"wr-form\"]/div/div/div[1]/div[1]/ul/li[4]/a");
    By forthTabDocument = By.xpath("//div[@id=\"doc-tab-collateralInfo-3\"]/div/div/div/div/div/label");
    By forthTabDocumentPreviewBtn = By.xpath("//div[@id=\"doc-tab-collateralInfo-3\"]/div/div/div/div/div/div/div/button/span");
    By fifthTab = By.xpath("//*[@id=\"wr-form\"]/div/div/div[1]/div[1]/ul/li[5]/a");
    By fifthTabDocument = By.xpath("//div[@id=\"doc-tab-collateralInfo-4\"]/div/div/div/div/div/label");
    By fifthTabDocumentPreviewBtn = By.xpath("//div[@id=\"doc-tab-collateralInfo-4\"]/div/div/div/div/div/div/div/button/span");
    By sixthTab = By.xpath("//*[@id=\"wr-form\"]/div/div/div[1]/div[1]/ul/li[6]/a");
    By sixthTabDocument = By.xpath("//div[@id=\"doc-tab-collateralInfo-5\"]/div/div/div/div/div/label");
    By sixthTabDocumentPreviewBtn = By.xpath("//div[@id=\"doc-tab-collateralInfo-5\"]/div/div/div/div/div/div/div/button/span");
    By seventhTab = By.xpath("//*[@id=\"wr-form\"]/div/div/div[1]/div[1]/ul/li[7]/a");
    By seventhTabDocument = By.xpath("//div[@id=\"doc-tab-collateralInfo-6\"]/div/div/div/div/div/label");
    By seventhTabDocumentPreviewBtn = By.xpath("//div[@id=\"doc-tab-collateralInfo-6\"]/div/div/div/div/div/div/div/button/span");
    By eighthTab = By.xpath("//*[@id=\"wr-form\"]/div/div/div[1]/div[1]/ul/li[8]/a");
    By eighthTabDocument = By.xpath("//div[@id=\"doc-tab-collateralInfo-7\"]/div/div/div/div/div/label");
    By eighthTabDocumentPreviewBtn = By.xpath("//div[@id=\"doc-tab-collateralInfo-7\"]/div/div/div/div/div/div/div/button/span");
    By ninethTab = By.xpath("//*[@id=\"wr-form\"]/div/div/div[1]/div[1]/ul/li[9]/a");
    By ninethTabDocument = By.xpath("//div[@id=\"doc-tab-collateralInfo-8\"]/div/div/div/div/div/label");
    By ninethTabDocumentPreviewBtn = By.xpath("//div[@id=\"doc-tab-collateralInfo-8\"]/div/div/div/div/div/div/div/button/span");

    public OtherDocumentsPage navigateToOtherDocumentsSection(){
        click(nextPageButton);
        return new OtherDocumentsPage();
    }

    public void firstTabDocumentUpload() throws AWTException {
        waitForElement(firstTabDocument);
        click(firstTabDocument);
        StringSelection documentUrl = new StringSelection("D:\\Cloudbnq\\07.04.19\\test-automation-v2\\CloudBank\\testDocuments\\income-tax-statement-template-hp4ixdtq.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(documentUrl, null);
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
        pause(6);
        validatefirstTabDocumentPreviewBtn();
    }

    public void validatefirstTabDocumentPreviewBtn(){
        boolean actual = isElementPresent(firstTabDocumentPreviewBtn);
        Assert.assertEquals(actual, true, "Document upload error!!!");
    }

    public void secondTabDocumentUpload() throws AWTException {
        waitForElement(secondTab);
        click(secondTab);
        waitForElement(secondTabDocument);
        click(secondTabDocument);
        StringSelection documentUrl = new StringSelection("D:\\Cloudbnq\\07.04.19\\test-automation-v2\\CloudBank\\testDocuments\\income-tax-statement-template-hp4ixdtq.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(documentUrl, null);
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
        pause(6);
        validateSecondTabDocumentPreviewBtn();
    }

    private void validateSecondTabDocumentPreviewBtn() {
        boolean actual = isElementPresent(secondTabDocumentPreviewBtn);
        Assert.assertEquals(actual, true, "Document upload error!!!");
    }

    public void thirdTabDocumentUpload() throws AWTException {
        waitForElement(thirdTab);
        click(thirdTab);
        waitForElement(thirdTabDocument);
        click(thirdTabDocument);
        StringSelection documentUrl = new StringSelection("D:\\Cloudbnq\\07.04.19\\test-automation-v2\\CloudBank\\testDocuments\\income-tax-statement-template-hp4ixdtq.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(documentUrl, null);
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
        pause(6);
        validateThirdTabDocumentPreviewBtn();
    }

    private void validateThirdTabDocumentPreviewBtn() {
        boolean actual = isElementPresent(thirdTabDocumentPreviewBtn);
        Assert.assertEquals(actual, true, "Document upload error!!!");
    }

    public void forthTabDocumentUpload() throws AWTException {
        waitForElement(forthTab);
        click(forthTab);
        waitForElement(forthTabDocument);
        click(forthTabDocument);
        StringSelection documentUrl = new StringSelection("D:\\Cloudbnq\\07.04.19\\test-automation-v2\\CloudBank\\testDocuments\\income-tax-statement-template-hp4ixdtq.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(documentUrl, null);
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
        pause(6);
        validateForthTabDocumentPreviewBtn();
    }

    private void validateForthTabDocumentPreviewBtn() {
        boolean actual = isElementPresent(forthTabDocumentPreviewBtn);
        Assert.assertEquals(actual, true, "Document upload error!!!");
    }

    public void fifthTabDocumentUpload() throws AWTException {
        waitForElement(fifthTab);
        click(fifthTab);
        waitForElement(fifthTabDocument);
        click(fifthTabDocument);
        StringSelection documentUrl = new StringSelection("D:\\Cloudbnq\\07.04.19\\test-automation-v2\\CloudBank\\testDocuments\\income-tax-statement-template-hp4ixdtq.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(documentUrl, null);
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
        pause(6);
        validateFifthTabDocumentPreviewBtn();
    }

    private void validateFifthTabDocumentPreviewBtn() {
        boolean actual = isElementPresent(fifthTabDocumentPreviewBtn);
        Assert.assertEquals(actual, true, "Document upload error!!!");
    }

    public void sixthTabDocumentUpload() throws AWTException {
        waitForElement(sixthTab);
        click(sixthTab);
        waitForElement(sixthTabDocument);
        click(sixthTabDocument);
        StringSelection documentUrl = new StringSelection("D:\\Cloudbnq\\07.04.19\\test-automation-v2\\CloudBank\\testDocuments\\income-tax-statement-template-hp4ixdtq.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(documentUrl, null);
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
        pause(6);
        validateSixthTabDocumentPreviewBtn();
    }

    private void validateSixthTabDocumentPreviewBtn() {
        boolean actual = isElementPresent(sixthTabDocumentPreviewBtn);
        Assert.assertEquals(actual, true, "Document upload error!!!");
    }

    public void seventhTabDocumentUpload() throws AWTException {
        waitForElement(seventhTab);
        click(seventhTab);
        waitForElement(seventhTabDocument);
        click(seventhTabDocument);
        StringSelection documentUrl = new StringSelection("D:\\Cloudbnq\\07.04.19\\test-automation-v2\\CloudBank\\testDocuments\\income-tax-statement-template-hp4ixdtq.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(documentUrl, null);
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
        pause(6);
        validateSeventhTabDocumentPreviewBtn();
    }

    private void validateSeventhTabDocumentPreviewBtn() {
        boolean actual = isElementPresent(seventhTabDocumentPreviewBtn);
        Assert.assertEquals(actual, true, "Document upload error!!!");
    }

    public void eigthTabDocumentUpload() throws AWTException {
        waitForElement(eighthTab);
        click(eighthTab);
        waitForElement(eighthTabDocument);
        click(eighthTabDocument);
        StringSelection documentUrl = new StringSelection("D:\\Cloudbnq\\07.04.19\\test-automation-v2\\CloudBank\\testDocuments\\income-tax-statement-template-hp4ixdtq.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(documentUrl, null);
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
        pause(6);
        validateEigthTabDocumentPreviewBtn();
    }

    private void validateEigthTabDocumentPreviewBtn() {
        boolean actual = isElementPresent(eighthTabDocumentPreviewBtn);
        Assert.assertEquals(actual, true, "Document upload error!!!");
    }

    public void ninethTabDocumentUpload() throws AWTException {
        waitForElement(ninethTab);
        click(ninethTab);
        waitForElement(ninethTabDocument);
        click(ninethTabDocument);
        StringSelection documentUrl = new StringSelection("D:\\Cloudbnq\\07.04.19\\test-automation-v2\\CloudBank\\testDocuments\\income-tax-statement-template-hp4ixdtq.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(documentUrl, null);
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
        pause(6);
        validateNinethTabDocumentPreviewBtn();
    }

    private void validateNinethTabDocumentPreviewBtn() {
        boolean actual = isElementPresent(ninethTabDocumentPreviewBtn);
        Assert.assertEquals(actual, true, "Document upload error!!!");
    }
}
