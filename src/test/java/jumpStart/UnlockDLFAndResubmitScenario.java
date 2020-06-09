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

public class UnlockDLFAndResubmitScenario {


    LoginPage lPage,bLPage;
    BorrowerHomePage borrowerPage;
    BankerHomePage bankerHomePage;
    DLFPage dlfPage;
    PersonalInformationPage personalInfoPage;
    UnsuccessfulPersonalInfoSubmitPage unsuccessfulPersonalInfoSubmitPage;
    ChildCareInformationPage childCareInfoPage;
    AnnualIncomeInformationPage annualIncomeInfoPage;
    MonthlyExpensesInformationPage monthlyExpensesInfoPage;
    LoanPaymentInformationPage loanPaymentInfoPage;
    PersonalDocumentsPage personalDocumentsPage;
    SubmitDLFPage submitDLFPage;

    @BeforeClass
    public void setUp() {
        Utils.getInstance().openBrowser();
        Utils.getInstance().navigateToURL("http://cloudbnq-oabdev-loan-application.s3-website.us-east-2.amazonaws.com/");
        lPage = new LoginPage();
    }

    @Test(priority = 1)
    public void testBorrowerLogin() {
        borrowerPage = lPage.successfulBorrowerLogin("robertuphold@mailinator.com", "Qwerty1!");
   }

    @Test(priority = 2)
    public void testApplyDLF(){
        dlfPage = borrowerPage.navigateToSelectProduct("http://cloudbnq-oabdev-loan-application.s3-website.us-east-2.amazonaws.com/");
        personalInfoPage =  dlfPage.startApplication();
    }

    @Test(priority = 3)
    public void testWrongPersonalInfoFilling1() throws Exception
    {
        CSVReadWrite csvReadWrite = new CSVReadWrite();
        CSVReader csvReader = csvReadWrite.readfile("C:\\Users\\Aushadhee-PC\\Documents\\CloudBankProject\\Automation Project\\CloudBank\\dataSets\\NegativeSet.csv");
        String [] line;
        while ((line = csvReader.readNext()) != null) {
            unsuccessfulPersonalInfoSubmitPage = personalInfoPage.unSuccessfulFillingPersonalInfo(line);
            break;
        }
    }

    @Test(priority = 4)
    public void testTryAgainNavigation1(){
        personalInfoPage = unsuccessfulPersonalInfoSubmitPage.tryAgainFunctionality();
    }


    @Test(priority = 5)
    public void testWrongPersonalInfoFilling2() throws Exception
    {
        CSVReadWrite csvReadWrite = new CSVReadWrite();
        CSVReader csvReader = csvReadWrite.readfile("C:\\Users\\Aushadhee-PC\\Documents\\CloudBankProject\\Automation Project\\CloudBank\\dataSets\\NegativeSet.csv");
        String [] line;
        while ((line = csvReader.readNext()) != null) {
            unsuccessfulPersonalInfoSubmitPage = personalInfoPage.unSuccessfulFillingPersonalInfo(line);
            break;
        }
    }

    @Test(priority = 6)
    public void testLoginAsBanker() {
        bLPage = new LoginPage();
        bLPage.navigateTOBankerPortal("http://cloudbnq-oabdev-banker-application.s3-website.us-east-2.amazonaws.com/login?redirect=/");
        bankerHomePage = bLPage.successfulBankerLogin("jsonrose@mailinator.com", "Qwerty1!");
    }

    @Test(priority = 7)
    public void testUnlockDLF(){
        String id = personalInfoPage.getDLFId();
        bankerHomePage.navigateToDraftDLFs();
        bankerHomePage.navigateToDraftSelectedDLF(id);
        bankerHomePage.unlockDLF();

    }


    @Test(priority = 8)
    public void testCorrectPersonalInfoFilling() throws Exception
    {
        CSVReadWrite csvReadWrite = new CSVReadWrite();
        CSVReader csvReader = csvReadWrite.readfile("C:\\Users\\Aushadhee-PC\\Documents\\CloudBankProject\\Automation Project\\CloudBank\\dataSets\\PositiveSet.csv");
        String [] line;
        while ((line = csvReader.readNext()) != null) {
            childCareInfoPage = personalInfoPage.successfulFillingPersonalInfo(line);
            break;
        }
    }

    @Test(priority = 9)
    public void testChildInfoFilling(){
        annualIncomeInfoPage = childCareInfoPage.fillingChildCareInfo();
    }

    @Test(priority = 10)
    public void testAnnualIncomeInfoFilling(){
        loanPaymentInfoPage = annualIncomeInfoPage.fillAnnualIncomeInfo();
    }

    @Test(priority = 12)
    public void testLoanPaymentInfoFilling(){
        personalDocumentsPage = loanPaymentInfoPage.fillLoanPaymentInformation();
    }

    @Test(priority = 13)
    public void testPersonalDocsFilling(){
        submitDLFPage = personalDocumentsPage.fillPersonalDocs();
    }

    @Test(priority = 14)
    public void testSubmitForm()
    {
        submitDLFPage.SubmitForm();
    }

    @AfterMethod
    public void tearDown() {

    }
}
