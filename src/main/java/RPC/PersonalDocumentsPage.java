package RPC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.UIActions;
import utils.Utils;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class PersonalDocumentsPage extends UIActions {

    By loggedUserInfo = By.xpath("//a[@class='nav-link'][@role='button']");
    By nextPageButton = By.id("next-btn-personalDocumentsInfo");
    By personalTaxReturn1 = By.xpath("//*[@id=\"root_documentsInfo\"]/div[1]/div[1]/div/label/span[2]");
    By personalTaxReturnPreviewBtn = By.xpath("//*[@id=\"root_documentsInfo\"]/div[1]/div[1]/div/div/div/button[1]/span");
    By personalTaxReturn2 = By.xpath("//*[@id=\"root_documentsInfo\"]/div[1]/div[2]/div/label");
    By personalTaxReturn2PreviewBtn = By.xpath("//*[@id=\"root_documentsInfo\"]/div[1]/div[2]/div/div/div/button/span");
    By photoId = By.xpath("//*[@id=\"root_documentsInfo\"]/div[1]/div[3]/div/label");
    By photoIdPreviewBtn = By.xpath("//*[@id=\"root_documentsInfo\"]/div[1]/div[3]/div/div/div/button/span");
    By personalBudget = By.xpath("//*[@id=\"root_documentsInfo\"]/div[1]/div[5]/div/label");
    By personalBudgetPreviewBtn = By.xpath("//*[@id=\"root_documentsInfo\"]/div[1]/div[5]/div/div/div/button[2]/span");
    By personalFinancialStatement = By.xpath("//*[@id=\"root_documentsInfo\"]/div[1]/div[6]/div/label");
    By personalFinancialStatementPreviewBtn = By.xpath("//*[@id=\"root_documentsInfo\"]/div[1]/div[6]/div/div/div/button[2]/span");
    By SSN = By.xpath("//*[@id=\"root_documentsInfo\"]/div[1]/div[7]/div/label");
    By SSNPreviewBtn = By.xpath("//*[@id=\"root_documentsInfo\"]/div[1]/div[7]/div/div/div/button[2]/span");

    //owner 3
//    By personalTaxReturn2 = By.xpath("//*[@id=\"doc-tab-personalDocumentsInfo-2\"]/div/div/div/div[2]/div/label");
//    By personalTaxReturn2PreviewBtn = By.xpath("//*[@id=\"root_documentsInfo\"]/div[1]/div[2]/div/div/div/button[1]/span");
    By personalBudget3 = By.xpath("//*[@id=\"doc-tab-personalDocumentsInfo-2\"]/div/div/div/div[5]/div/label");
    By personalBudget3PreviewBtn = By.xpath("//*[@id=\"root_documentsInfo\"]/div[1]/div[5]/div/div/div/button[1]/span");
    By trust = By.xpath("//*[@id=\"doc-tab-personalDocumentsInfo-2\"]/div/div/div/div[8]/div/label");
    By trustPreviewBtn = By.xpath("//*[@id=\"doc-tab-personalDocumentsInfo-2\"]/div/div/div/div[8]/div/div/div/button[1]/span");

//    By photoId = By.xpath("//*[@id=\"doc-tab-personalDocumentsInfo-1\"]/div/div/div/div[3]/div/label");
//    By photoIdPreviewBtn = By.xpath("//*[@id=\"doc-tab-personalDocumentsInfo-1\"]/div/div/div/div[3]/div/div/div/button[1]/span");
    By passport = By.xpath("//*[@id=\"root_documentsInfo\"]/div[1]/div[4]/div/label");
    By passportPreviewBtn = By.xpath("//*[@id=\"root_documentsInfo\"]/div[1]/div[4]/div/div/div/button[1]/span");
//    By personalBudget = By.xpath("//*[@id=\"doc-tab-personalDocumentsInfo-1\"]/div/div/div/div[5]/div/label");
//    By personalBudgetPreviewBtn = By.xpath("//*[@id=\"doc-tab-personalDocumentsInfo-1\"]/div/div/div/div[5]/div/div/div/button[1]/span");
    By personalFinanceStatement = By.xpath("//*[@id=\"root_documentsInfo\"]/div[1]/div[6]/div/label");
    By socialSecurity = By.xpath("//*[@id=\"root_documentsInfo\"]/div[1]/div[7]/div/label");
    By socialSecurityPreviewBtn = By.xpath("//*[@id=\"root_documentsInfo\"]/div[1]/div[7]/div/div/div/button[1]/span");
    By secondOwnerTab = By.xpath("//*[@id=\"wr-form\"]/div/div/div[1]/div[1]/ul/li[2]/a");
    By thirdOwnerTab = By.xpath("//*[@id=\"wr-form\"]/div/div/div[1]/div[1]/ul/li[3]/a");

    static WebDriver driver = Utils.getInstance().getDriver();

    public void uploadPersonalDocuments() throws AWTException {
        waitForElement(nextPageButton);
        personalTaxReturnUpload();
        personalTaxReturn2Upload();
        photoIDOwner2Upload();
        personalBudgetUpload();
        personalFinancialStatementUpload();
        socialSecurityUpload();
    }

    public void uploadOwner2PersonalDocuments() throws AWTException {
        waitForElement(secondOwnerTab);
        click(secondOwnerTab);
        photoIDOwner2Upload();
        personalBudgetOwner2Upload();
    }

    public void uploadOwner3PersonalDocuments() throws AWTException {
        waitForElement(thirdOwnerTab);
        click(thirdOwnerTab);
        personalTaxReturn2Upload();
        trustOwn3Upload();
    }

    public void photoIDUpload() throws AWTException {
        //Upload Photo ID
        waitForElement(photoId);
        click(photoId);
        StringSelection uploadDoc = new StringSelection("D:\\Cloudbnq\\07.04.19\\test-automation-v2\\CloudBank\\testDocuments\\passport.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(uploadDoc, null);
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
        pause(8);
        validatePhotoIDPreviewBtn();
    }

    public void validatePhotoIDPreviewBtn(){
        boolean actual = isElementPresent(photoIdPreviewBtn);
        Assert.assertEquals(actual, true, "Document upload error!!!");
    }

    public void photoIDOwner2Upload() throws AWTException {
        //Upload Photo ID
        waitForElement(photoId);
        click(photoId);
        StringSelection uploadDoc = new StringSelection("D:\\Cloudbnq\\07.04.19\\test-automation-v2\\CloudBank\\testDocuments\\passport.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(uploadDoc, null);
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
        pause(8);
        validatePhotoIDOwner2PreviewBtn();
    }

    public void validatePhotoIDOwner2PreviewBtn(){
        boolean actual = isElementPresent(photoIdPreviewBtn);
        Assert.assertEquals(actual, true, "Document upload error!!!");
    }

    public void personalBudgetUpload() throws AWTException {
        //Upload Personal Budget
        click(personalBudget);
        StringSelection uploadDoc = new StringSelection("D:\\Cloudbnq\\07.04.19\\test-automation-v2\\CloudBank\\testDocuments\\passport.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(uploadDoc, null);
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
        pause(8);
        validatePersonalBudgetPreviewBtn();
    }

    public void validatePersonalBudgetPreviewBtn(){
        boolean actual = isElementPresent(personalBudgetPreviewBtn);
        Assert.assertEquals(actual, true, "Document upload error!!!");
    }

    public void personalBudgetOwner2Upload() throws AWTException {
        //Upload Personal Budget
        click(personalBudget);
        StringSelection uploadDoc = new StringSelection("D:\\Cloudbnq\\07.04.19\\test-automation-v2\\CloudBank\\testDocuments\\passport.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(uploadDoc, null);
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
        pause(8);
        validatePersonalBudgetOwner2PreviewBtn();
    }

    public void validatePersonalBudgetOwner2PreviewBtn(){
        boolean actual = isElementPresent(personalBudgetPreviewBtn);
        Assert.assertEquals(actual, true, "Document upload error!!!");
    }

    public void personalTaxReturnUpload() throws AWTException {
        //Upload Personal Tax Return
        click(personalTaxReturn1);
        StringSelection uploadDoc = new StringSelection("D:\\Cloudbnq\\07.04.19\\test-automation-v2\\CloudBank\\testDocuments\\acceptance letter.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(uploadDoc, null);
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
        pause(8);
        validatePersonalTaxReturnPreviewBtn();
    }

    public void validatePersonalTaxReturnPreviewBtn(){
        boolean actual = isElementPresent(personalTaxReturnPreviewBtn);
        Assert.assertEquals(actual, true, "Document upload error!!!");
    }

    public void personalTaxReturn2Upload() throws AWTException {
        //Upload Personal Tax Return
        click(personalTaxReturn2);
        StringSelection uploadDoc = new StringSelection("D:\\Cloudbnq\\07.04.19\\test-automation-v2\\CloudBank\\testDocuments\\acceptance letter.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(uploadDoc, null);
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
        pause(8);
        validatePersonalTaxReturn2PreviewBtn();
    }

    private void validatePersonalTaxReturn2PreviewBtn() {
        boolean actual = isElementPresent(personalTaxReturn2PreviewBtn);
        Assert.assertEquals(actual, true, "Document upload error!!!");
    }

    public void passportUpload() throws AWTException {
        click(passport);
        StringSelection uploadDoc = new StringSelection("D:\\Cloudbnq\\07.04.19\\test-automation-v2\\CloudBank\\testDocuments\\passport.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(uploadDoc, null);
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
        pause(8);
        validatePassportPreviewBtn();
    }

    public void validatePassportPreviewBtn(){
        boolean actual = isElementPresent(passportPreviewBtn);
        Assert.assertEquals(actual, true, "Document upload error!!!");
    }

    public void socialSecurityUpload() throws AWTException {
        click(socialSecurity);
        StringSelection uploadDoc = new StringSelection("D:\\Cloudbnq\\07.04.19\\test-automation-v2\\CloudBank\\testDocuments\\Social Security Card.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(uploadDoc, null);
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
        pause(8);
        validateSocialSecurityPreviewBtn();
    }

    public void validateSocialSecurityPreviewBtn(){
        boolean actual = isElementPresent(socialSecurityPreviewBtn);
        Assert.assertEquals(actual, true, "Document upload error!!!");
    }

    private void personalFinancialStatementUpload() throws AWTException {
        click(personalFinanceStatement);
        StringSelection uploadDoc = new StringSelection("D:\\Cloudbnq\\07.04.19\\test-automation-v2\\CloudBank\\testDocuments\\Social Security Card.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(uploadDoc, null);
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
        pause(8);
        validatePersonalFinancialStatementPreviewBtn();
    }

    private void validatePersonalFinancialStatementPreviewBtn(){
        boolean actual = isElementPresent(personalFinancialStatementPreviewBtn);
        Assert.assertEquals(actual, true, "Document upload error!!!");
    }

    private void trustOwn3Upload() throws AWTException {
        click(trust);
        StringSelection uploadDoc = new StringSelection("D:\\Cloudbnq\\07.04.19\\test-automation-v2\\CloudBank\\testDocuments\\Social Security Card.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(uploadDoc, null);
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
        pause(8);
        validateTrustPreviewBtn();
    }

    private void validateTrustPreviewBtn() {
        boolean actual = isElementPresent(trustPreviewBtn);
        Assert.assertEquals(actual, true, "Document upload error!!!");
    }

    public BusinesslDocumentsPage navigateToBusinessDocumentsSection(){
        click(nextPageButton);
        return new BusinesslDocumentsPage();
    }

}
