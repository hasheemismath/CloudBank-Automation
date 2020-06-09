package common;

import Elements.BankerElements;
import Elements.LoanElements;
import Elements.LoginElements;
import au.com.bytecode.opencsv.CSVReader;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.*;
import jumpStart.*;
import java.util.ArrayList;

public class BankerHomePage extends UIActions implements BankerElements, LoanElements, LoginElements {

    static WebDriver driver = Utils.getInstance().getDriver();
    PersonalInformationPage personalInformationPage;
    ChildCareInformationPage childCareInfoPage;
    AnnualIncomeInformationPage annualIncomeInformationPage;
    MonthlyExpensesInformationPage monthlyExpensesInformationPage;
    LoanPaymentInformationPage loanPaymentInformationPage;
    PersonalDocumentsPage personalDocumentsPage;
    SubmitDLFPage submitDLFPage;
    ViewLoanApplicationPage viewLoanApplicationPage;

    public void navigateToDraftDLFs()
    {
        waitForElement(draftBtn);
        pause(3);
        click(draftBtn);
        pause(5);
    }
    public void navigateToNewDLFsByTile()
    {
        refreshPage();
        waitForPageLoad();
        waitForElementClickable(newBtn);
        pause(10);
        click(newBtn);
    }
    public void navigateToNewDLFsByLeftMenu()
    {
        waitForElement(newLeftMenu);
        pause(5);
        click(newLeftMenu);
        pause(3);
    }
    public void navigateToDraftSelectedDLF(String id)
    {
        pause(3);
        waitForElement(filterBtn);
        sendKeys(codeSearch, id);
        click(filterBtn);
        pause(3);
        waitForElement(draftSelectedDLF);
        click(draftSelectedDLF);
        pause(3);
    }
    public void navigateToNewSelectedDLF(String id)
    {
        waitForPageLoad();
        waitForElementClickable(codeSearch);
        sendKeys(codeSearch, id);
        waitForElementClickable(filterBtn);
        pause(10);
        click(filterBtn);
        if (!driver.findElement(newSelectedDLF).isDisplayed()){
            pause(5);
            refreshPage();
            click(filterBtn);
            waitForElementClickable(newSelectedDLF);
            click(newSelectedDLF);
        }
        else {
            //waitForElementClickable(newSelectedDLF);
            click(newSelectedDLF);
        }
    }

    public void navigateToAllSelectedDLF(String id)
    {
        waitForPageLoad();
        waitForElementClickable(filterBtn);
        sendKeys(codeSearch, id);
        pause(8);
        click(filterBtn);
        while (!driver.findElement(allSelectedDLF).isDisplayed()){
            click(filterBtn);
            refreshPage();
            waitForPageLoad();
        }
        click(allSelectedDLF);
        pause(3);
    }

    public void unlockDLF(){
        waitForElement(unlockDLFBtn);
        pause(3);
        click(unlockDLFBtn);
        navigateToBorrowerPortal();

    }

    public void navigateToBorrowerPortal(){
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        driver.navigate().refresh();
        pause(3);
    }

    public void assignDLF(String CAName){
        pause(3);
        waitForElement(assignmentMenuItem);
        pause(1);
        click(assignmentMenuItem);
        pause(3);
        setDropDownValue(selectCAdropdown, CAName);
        sendKeys(caComment, "Assigned to CA");
        click(assignBtn);
        pause(5);
    }

    public void ApproveDLF(){
        pause(3);
        waitForElement(actionMenuItem);
        click(actionMenuItem);
        waitForElement(approveBtn);
        pause(3);
        click(approveBtn);
        click(makeOfferBtn);
        click(confirmOfferBtn);
        pause(3);
        waitForElement(DLFStatus);
    }

    public void cancelApprovingDLF(){
        pause(3);
        waitForElement(actionMenuItem);
        click(actionMenuItem);
        waitForElement(approveBtn);
        pause(3);
        click(approveBtn);
        click(cancelOfferBtn);
        waitForElement(approveBtn);
    }

    public void declineDLF(){
        pause(3);
        waitForElement(declineBtn);
        click(declineBtn);
    }

    public void cancelDecliningDLF(){
        pause(3);
        waitForElement(cancelDeclineBtn);
        click(cancelDeclineBtn);
        waitForElement(declineBtn);
    }
    public void confirmDecliningDLF(){
        pause(3);
        waitForElement(confirmDeclineBtn);
        click(confirmDeclineBtn);
        waitForElement(declineBtn);
    }
    public void cancelConfirmationDecliningDLF(){
        waitForElement(cancelConfirmBtn);
        click(cancelConfirmBtn);
        waitForElement(declineBtn);
    }

    public void ConfirmationDecliningDLF(){
        waitForElement(ConfirmBtn);
        pause(3);
        click(ConfirmBtn);
        waitForElement(declineStatus);
    }

    public void navigateToDashboard(){
        pause(5);
        waitForElement(dashboardLink);
        click(dashboardLink);
        pause(5);
        waitForElement(approveTile);
    }

    public void navigateToApprovedSelectedDLF(String id)
    {   pause(3);
        click(approveTile);
        waitForElement(approveSearchBtn);
        refreshPage();
        pause(2);
        waitForElement(approveSearchBtn);
        sendKeys(approveSearchTxt, id);
        pause(2);
        click(approveSearchBtn);
        pause(3);
        waitForElement(selectedDLFLink);
        click(selectedDLFLink);
    }

    public String getDLFStatus()
    {   waitForElement(DLFStatusTxt);
        return driver.findElement(DLFStatusTxt).getText();
    }


    public void deleteDLFs(){
        waitForElement(filterBtn);
        pause(3);
        click(firstDLF);
        pause(3);
        waitForElement(deleteDLFBtn);
        click(deleteDLFBtn);
        pause(3);
        click(confirmDeleteDLF);
        waitForElement(draftBtn);
        pause(3);

    }

    public void navigateToAutoDecisionTab(){
        waitForElement(autoDecisionMenuItem);
        pause(6);
        click(autoDecisionMenuItem);
        pause(3);
    }

    public void navigateToDeniedDLFsByTile()
    {
        waitForElement(deniedBtn);
        pause(5);
        click(deniedBtn);
        pause(3);
    }

    public void navigateToNewDeniedDLF(String id){
        pause(80);
        waitForPageLoad();
        waitForElement(deniedSection);
        pause(2);
        sendKeys(deniedSearch, id);
        pause(2);
        click(deniedFilterBtn);
        pause(3);
        waitForElement(newDeniedDLF);
        pause(2);
        click(newDeniedDLF);
        pause(3);
    }

    public void refreshPage(){
        driver.navigate().refresh();
    }

    public void navigateToDeclinedSelectedDLF(String id)
    {   pause(3);
        click(deniedBtn);
        pause(3);
        //waitForElement(deniedFilterBtn);
        refreshPage();
        pause(5);
        waitForElementClickable(declinedSearchTxt);
        sendKeys(declinedSearchTxt, id);
        pause(2);
        click(declinedSearchBtn);
        pause(3);
        waitForElement(selectedDeniedDLFLink);
        click(selectedDeniedDLFLink);
    }

    public void navigateToOpenLoanFilesSection(){
       waitForPageLoad();
       waitForElementClickable(totalProcessingTile);
       pause(15);
       click(totalProcessingTile);
    }

    public void refillPersonalInfoData() throws Exception {
        personalInformationPage = new PersonalInformationPage(true);
        CSVReadWrite csvReadWrite = new CSVReadWrite();
        CSVReader csvReader = csvReadWrite.readfile("D:\\Cloudbnq\\07.04.19\\test-automation-v2\\CloudBank\\dataSets\\PositiveSetForSubmittedUser.csv");
        String [] line;
        while ((line = csvReader.readNext()) != null) {
            childCareInfoPage = personalInformationPage.successfulFillingPersonalInfoSubmittedUser(line);
            break;
        }
    }

    public void refillChildCareInfoData(){
        childCareInfoPage =  new ChildCareInformationPage();
        childCareInfoPage.navigateToAnnualInfoPage();
    }

    public void refillAnnualIncomeInfoData(){
        annualIncomeInformationPage =  new AnnualIncomeInformationPage();
        annualIncomeInformationPage.navigateToAnnualInfoPage();
    }

    public void refillMonthlyExpenseInfoData(){
        monthlyExpensesInformationPage =  new MonthlyExpensesInformationPage();
        monthlyExpensesInformationPage.navigateToExpenseInfoPage();
    }

    public void refillLoanPaymentInfoData(){
        loanPaymentInformationPage =  new LoanPaymentInformationPage();
        loanPaymentInformationPage.navigateToLoanPaymentInfoPage();
    }

    public void resubmitPersonalDocuments(){
        personalDocumentsPage = new PersonalDocumentsPage();
        personalDocumentsPage.navigateToSubmitDLFPage();
    }

    public void resubmitDLFile(){
        submitDLFPage = new SubmitDLFPage();
        submitDLFPage.resubmitDLFile();
    }

    public void resubmitDLF() throws Exception {
        refillPersonalInfoData();
        refillChildCareInfoData();
        refillAnnualIncomeInfoData();
        refillMonthlyExpenseInfoData();
        refillLoanPaymentInfoData();
        resubmitPersonalDocuments();
        resubmitDLFile();
    }

    public void searchCareCenter(String careCenter){
        sendKeys(searchByCareCenterTxtBox, careCenter);
        waitForElementClickable(careCenterDropdown);
        pause(2);
        click(careCenterDropdown);
    }

    public void selectaNewDLF(){
        pause(2);
        waitForElementClickable(newDLFTile);
        click(newDLFTile);
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(2));
        pause(3);
    }

    public String NavigateToChildCareTab(){
        waitForElementClickable(childCareTab);
        click(childCareTab);
        return driver.findElement(careCenter).getText();
    }

    public String[] getBorrowerData(){
        String[] data = new String[3];
        data[0] = driver.findElement(firstName).getText();
        data[1] = driver.findElement(LoginEmail).getText();
        data[2] = driver.findElement(lastName).getText();
        return data;
    }

    public void closeTab(){
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(2)).close();
    }

    public void removeSearch(){
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        pause(2);
        waitForElementClickable(allButton);
        click(allButton);
        pause(3);
    }

    public void searchBorrower(String borrower){
        sendKeys(searchByBorrowerTxtBox, borrower);
        waitForElementClickable(borrowerDropDown);
        pause(2);
        click(borrowerDropDown);
    }

    public void validateDigitalApplicationLinkIsVisible(){
        Assert.assertTrue(driver.findElement(digitalApplicationLink).isDisplayed(), "Digital Application Link is not displayed!!!");
    }

    public void validateMyDigitalApplicationsLinkIsVisible(){
        Assert.assertTrue(driver.findElement(myDigitalApplicationsUrl).isDisplayed(), "My Digital Applications Link is not displayed!!!");
    }

    public void validateCASearchForCareCenterSearchboxIsVisible(){
        Assert.assertTrue(driver.findElement(searchByCareCenterTxtBox).isDisplayed(), "Search For Care Center Search box is not displayed!!!");
    }

    public void validateCASearchForBorrowerSearchboxIsVisible(){
        Assert.assertTrue(driver.findElement(searchByBorrowerTxtBox).isDisplayed(), "Search For Borrower Search box is not displayed!!!");
    }

    public void validateLoggedUserDetailsIsVisible(){
        Assert.assertTrue(driver.findElement(userDetailsDropDown).isDisplayed(), "Logged User Details Drop down is not displayed!!!");
    }

    public void validateUserSettingsIsVisible(){
        waitForElement(userDetailsDropDown);
        pause(1);
        click(userDetailsDropDown);
        Assert.assertTrue(driver.findElement(userSettingsInUserInfoDropDown).isDisplayed(), "User Settings Section is not displayed!!!");
    }

    public void validateLogoutIsVisible(){
        Assert.assertTrue(driver.findElement(logoutButtonInUserInfoDropDown).isDisplayed(), "Logout is not displayed!!!");
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

    public void validateCALogin(){
        waitForElementClickable(newDLFTile);
        validateDigitalApplicationLinkIsVisible();
        validateCASearchForCareCenterSearchboxIsVisible();
        validateCASearchForBorrowerSearchboxIsVisible();
        validateLoggedUserDetailsIsVisible();
        validateUserSettingsIsVisible();
        validateLogoutIsVisible();
        logout();
    }

    public String viewLastDLFAndClickMessageTab(){
        pause(90);
        refreshPage();
        waitForElementClickable(LastDLF1);
        pause(3);
        String actDLFID = getDLFCode();
        click(LastDLF1);
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(2));
        waitForElementClickable(messageMenuItem);
        pause(4);
        click(messageMenuItem);
        validateSubmittedEmail();
        return actDLFID;
    }

    private void validateSubmittedEmail() {
        waitForElementClickable(messageArea);
        pause(2);
        String actSubject = getText(submittedEmailSubject);
        Assert.assertEquals(actSubject, "Your application has been successfully submitted.", "Submitted Email subject error!!!");
//        boolean actValue = isElementPresent(submittedEmailSubject);
//        Assert.assertEquals(actValue, true, "Submit Email not received!!!");
    }

    public String getDLFCode(){
        waitForElement(LastDLFID);
        String ActLastDLFID = driver.findElement(LastDLFID).getText();
        return ActLastDLFID;
    }

}
