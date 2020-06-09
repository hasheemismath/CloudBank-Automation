package jumpStart;

import au.com.bytecode.opencsv.CSVReader;
import common.BankerHomePage;
import common.BorrowerHomePage;
import common.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.CSVReadWrite;
import utils.Utils;

public class ReopenReSubmitAndApproveDLFScenario {
    LoginPage lPage, bankerLogin;
    BorrowerHomePage borrowerPage;
    DLFPage dlfPage;
    PersonalInformationPage personalInfoPage;
    ChildCareInformationPage childCareInfoPage;
    AnnualIncomeInformationPage annualIncomeInfoPage;
    MonthlyExpensesInformationPage monthlyExpensesInfoPage;
    LoanPaymentInformationPage loanPaymentInfoPage;
    PersonalDocumentsPage personalDocumentsPage;
    SubmitDLFPage submitDLFPage;
    BankerHomePage bankerHomePage;
    ViewLoanApplicationPage viewLoanApplicationPage;
    OpenDigitalApplicationsPage openDigitalApplicationsPage;

    @BeforeClass
    public void setUp() {
        Utils.getInstance().openBrowser();
        Utils.getInstance().navigateToURL("http://cloudbnq-oabdev-loan-application.s3-website.us-east-2.amazonaws.com/");
        lPage = new LoginPage();
    }

    @Test(priority =1)
    public void testBorrowerLogin() {
        borrowerPage = lPage.successfulBorrowerLogin("robertuphold@mailinator.com", "Qwerty1!");
   }

    @Test(priority =2)
    public void testApplyDLF(){
        dlfPage = borrowerPage.navigateToSelectProduct("http://cloudbnq-oabdev-loan-application.s3-website.us-east-2.amazonaws.com/");
        personalInfoPage =  dlfPage.startApplication();
    }

    @Test(priority = 3)
    public void testPersonalInfoFilling() throws Exception {
        CSVReadWrite csvReadWrite = new CSVReadWrite();
        CSVReader csvReader = csvReadWrite.readfile("D:\\Cloudbnq\\07.04.19\\test-automation-v2\\CloudBank\\dataSets\\ResubmitDataSet.csv");
        String [] line;
        while ((line = csvReader.readNext()) != null) {
            childCareInfoPage = personalInfoPage.successfulFillingPersonalInfoSubmittedUser(line);
            break;
        }
    }

    @Test(priority = 4)
    public void testChildInfoFilling(){
        annualIncomeInfoPage = childCareInfoPage.fillingChildCareInfo();
    }

    @Test(priority = 5)
    public void testAnnualIncomeInfoFilling(){
        loanPaymentInfoPage = annualIncomeInfoPage.fillAnnualIncomeInfo();
    }

    @Test(priority = 7)
    public void testLoanPaymentInfoFilling(){
        personalDocumentsPage = loanPaymentInfoPage.fillLoanPaymentInformation();
    }

    @Test(priority = 8)
    public void testPersonalDocsFilling(){
        submitDLFPage = personalDocumentsPage.fillPersonalDocs();
    }

    @Test(priority = 9)
    public void testSubmitForm()
    {
        submitDLFPage.SubmitForm();
    }

    @Test(priority = 10)
    public void testLoginAsBanker() {
        bankerLogin = new LoginPage();
        bankerLogin.navigateTOBankerPortal("http://cloudbnq-oabdev-banker-application.s3-website.us-east-2.amazonaws.com/login?redirect=/");
        bankerHomePage = bankerLogin.successfulBankerLogin("jsonrose@mailinator.com", "Qwerty1!");
        //bankerHomePage = bankerLogin.successfulAdminLogin("franktaylor@mailinator.com", "Qwerty1!");
    }

    @Test(priority = 11)
    public void testNavigateToDLF(){
        String id = personalInfoPage.getDLFId();
        bankerHomePage.navigateToNewDLFsByTile();
        bankerHomePage.navigateToNewSelectedDLF(id);
    }

    @Test(priority = 12)
    public void testAssignCA(){
        bankerHomePage.assignDLF("Json Rose");
    }

    @Test(priority = 13)
    public void testReopenDLF(){
        viewLoanApplicationPage = new ViewLoanApplicationPage();
        viewLoanApplicationPage.navigateToActionsTab();
        viewLoanApplicationPage.confirmReopenDLF();
    }

    @Test(priority = 14)
    public void testStartEditingDLF(){
        bankerHomePage = new BankerHomePage();
        bankerHomePage.navigateToBorrowerPortal();
        submitDLFPage.viewSubmitedForm();
        submitDLFPage.switchToBorrowerDLF();
    }

    @Test(priority = 15)
    public void resubmitDLF() throws Exception{
        bankerHomePage.resubmitDLF();
    }

    @Test(priority = 16)
    public void testReLoginAsBanker() {
        bankerLogin = new LoginPage();
        bankerLogin.navigateTOBankerPortal("http://cloudbnq-oabdev-banker-application.s3-website.us-east-2.amazonaws.com/login?redirect=/");
        bankerHomePage = bankerLogin.successfulBankerLogin("jsonrose@mailinator.com", "Qwerty1!");
    }

    @Test(priority = 17)
    public void testReNavigateToDLF(){
        String id = personalInfoPage.getDLFId();
        bankerHomePage.navigateToOpenLoanFilesSection();
        openDigitalApplicationsPage = new OpenDigitalApplicationsPage();
        openDigitalApplicationsPage.selectAllFromLeftMenu();
        bankerHomePage.navigateToAllSelectedDLF(id);
    }

    @Test(priority = 18)
    public void testApproveDLF(){
        bankerHomePage.ApproveDLF();
    }

    @Test(priority = 19)
    public void testApproveDLFInList(){
        viewLoanApplicationPage = new ViewLoanApplicationPage();
        String id = personalInfoPage.getDLFId();
        viewLoanApplicationPage.navigateToDashboard();
        bankerHomePage.navigateToApprovedSelectedDLF(id);
        viewLoanApplicationPage.validateDLFStatus(ViewLoanApplicationPage.Status.APPROVED);
    }

    @Test(priority = 20)
    public void testApprovedDLFAsBorrower(){
        bankerHomePage.navigateToBorrowerPortal();
        submitDLFPage.viewSubmitedForm();
    }

    @AfterMethod
    public void tearDown() {
    }
}
