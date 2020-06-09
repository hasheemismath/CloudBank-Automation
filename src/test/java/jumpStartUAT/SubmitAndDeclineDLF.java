package jumpStartUAT;

import au.com.bytecode.opencsv.CSVReader;
import common.BankerHomePage;
import common.BorrowerHomePage;
import common.LoginPage;
import jumpStart.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.CSVReadWrite;
import utils.Utils;

public class SubmitAndDeclineDLF {

    LoginPage lPage, bLPage;
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

    @BeforeClass
    public void setUp() {
        Utils.getInstance().openBrowser();
        Utils.getInstance().navigateToURL("https://jumpstartfront.cloudbnq.com/");
        lPage = new LoginPage();
    }

    @Test(priority =1)
    public void testBorrowerLogin() {
        borrowerPage = lPage.successfulBorrowerLogin("robertuphold@mailinator.com", "Qwerty1!");
   }

    @Test(priority =2)
    public void testApplyDLF(){
        dlfPage = borrowerPage.navigateToSelectProduct("https://jumpstartfront.cloudbnq.com/select-product");
        personalInfoPage =  dlfPage.startApplication();
    }

    @Test(priority = 3)
    public void testPersonalInfoFilling() throws Exception {
        CSVReadWrite csvReadWrite = new CSVReadWrite();
        CSVReader csvReader = csvReadWrite.readfile("D:\\Cloudbnq\\07.04.19\\test-automation-v2\\CloudBank\\dataSets\\PositiveSet.csv");
        String [] line;
        while ((line = csvReader.readNext()) != null) {
            childCareInfoPage = personalInfoPage.successfulFillingPersonalInfo(line);
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
    public void testSubmitForm() {
        submitDLFPage.SubmitForm();
    }

    @Test(priority = 10)
    public void testLoginAsBanker() {
        bLPage = new LoginPage();
        bLPage.navigateTOBankerPortal("https://jumpstartback.cloudbnq.com/");
        bankerHomePage = bLPage.successfulBankerLogin("jaredhunt456@gmail.com", "Qwerty1!");
    }

    @Test(priority = 11)
    public void testNavigateToDLF(){
        String id = personalInfoPage.getDLFId();
        bankerHomePage.navigateToNewDLFsByTile();
        bankerHomePage.navigateToNewSelectedDLF(id);
    }

    @Test(priority = 12)
    public void testAssignCA(){
        bankerHomePage.assignDLF("Jason Rose");
    }

    @Test(priority = 13)
    public void testDeclineDLF(){
        viewLoanApplicationPage = new ViewLoanApplicationPage();
        viewLoanApplicationPage.navigateToActionsTab();
        bankerHomePage.declineDLF();
        viewLoanApplicationPage.validateButtonsPresentAfterClickingDecline();
        viewLoanApplicationPage.confirmDecline();
    }

    @Test(priority = 14)
    public void testDeclinedDLFInList(){
        String id = personalInfoPage.getDLFId();
        viewLoanApplicationPage.navigateToDashboard();
        bankerHomePage.navigateToDeclinedSelectedDLF(id);
        viewLoanApplicationPage.validateDLFStatus(ViewLoanApplicationPage.Status.DECLINED);
    }

    @AfterMethod
    public void tearDown() {

    }
}
