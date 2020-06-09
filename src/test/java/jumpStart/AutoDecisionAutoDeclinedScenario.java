package jumpStart;

import Validations.Validations;
import au.com.bytecode.opencsv.CSVReader;
import common.BankerHomePage;
import common.BorrowerHomePage;
import common.LoginPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.CSVReadWrite;
import utils.Utils;

public class AutoDecisionAutoDeclinedScenario {

    LoginPage loginPage, bankerLogin;
    BorrowerHomePage borrowerHomePage;
    DLFPage dlfPage;
    PersonalInformationPage personalInformationPage;
    ChildCareInformationPage childCareInformationPage;
    AnnualIncomeInformationPage annualIncomeInformationPage;
    MonthlyExpensesInformationPage monthlyExpensesInformationPage;
    LoanPaymentInformationPage loanPaymentInformationPage;
    PersonalDocumentsPage personalDocumentsPage;
    SubmitDLFPage submitDLFPage;
    BankerHomePage bankerHomePage;
    AutoDecisionPage autoDecisionPage;

    @BeforeClass
    public void setUp() {
        Utils.getInstance().openBrowser();
        Utils.getInstance().navigateToURL("http://cloudbnq-oabdev-loan-application.s3-website.us-east-2.amazonaws.com/");
        loginPage = new LoginPage();
    }

    @Test(priority =1)
    public void testLoginWithAnExistingBorrower()  {
        borrowerHomePage = loginPage.successfulBorrowerLogin("johnfuiek@mailinator.com", "Qwerty1!");
    }

    @Test(priority =2)
    public void testSelectProduct()  {
        dlfPage = borrowerHomePage.navigateToSelectProduct("http://cloudbnq-oabdev-loan-application.s3-website.us-east-2.amazonaws.com/select-product");
        personalInformationPage =  dlfPage.startApplication();
    }

    @Test(priority =3)
    public void testFillCorrectPersonalDetails() throws Exception {
        Validations validations = new Validations();
        validations.validateLogedUser("John Fuiek");
        CSVReadWrite csvReadWrite = new CSVReadWrite();
        CSVReader csvReader = csvReadWrite.readfile("D:\\Cloudbnq\\07.04.19\\test-automation-v2\\CloudBank\\dataSets\\AutoDeclineDataSet.csv");
        String [] line;
        while ((line = csvReader.readNext()) != null) {
            childCareInformationPage  = personalInformationPage.successfulFillingPersonalInfo(line);
            break;
        }
    }

    @Test(priority =4)
    public void testFillCorrectChildCareDetails() {
        annualIncomeInformationPage  = childCareInformationPage.fillingChildCareInfo();
    }

    @Test(priority =5)
    public void testFillCorrectIncomeDetails() {
        loanPaymentInformationPage  = annualIncomeInformationPage.fillAnnualIncomeInfo();
    }

    @Test(priority =7)
    public void testFillCorrectLoanPaymentDetails() {
        personalDocumentsPage  = loanPaymentInformationPage.fillLoanPaymentInformation();
    }

    @Test(priority =8)
    public void testAddPersonalDocuments() {
        submitDLFPage  = personalDocumentsPage.fillPersonalDocs();
    }

    @Test(priority =9)
    public void testSubmitForm() {
        submitDLFPage.SubmitForm();
    }

    @Test(priority =10)
    public void testBankerLogin() {
        bankerLogin = new LoginPage();
        bankerLogin.navigateTOBankerPortal("http://cloudbnq-oabdev-banker-application.s3-website.us-east-2.amazonaws.com/login?redirect=/");
        bankerHomePage = bankerLogin.successfulBankerLogin("jsonrose@mailinator.com", "Qwerty1!");
    }

    @Test(priority = 11)
    public void testNavigateToDLF(){
        String id = personalInformationPage.getDLFId();
        bankerHomePage.navigateToDeniedDLFsByTile();
        bankerHomePage.navigateToNewDeniedDLF(id);
    }

    @Test(priority = 12)
    public void testNavigateToAutoDecisionTab(){
        bankerHomePage.navigateToAutoDecisionTab();
    }

    @Test(priority = 13)
    public void testCalculateSelfReportedDTI(){
        autoDecisionPage = new AutoDecisionPage();
        autoDecisionPage.validateSelfReportedDTI();
    }

    @Test(priority = 14)
    public void testCalculateCalculationOne(){
        autoDecisionPage = new AutoDecisionPage();
        autoDecisionPage. validateCalculationOne();
    }

    @Test(priority = 15)
    public void testCalculateCalculationTwo(){
        autoDecisionPage = new AutoDecisionPage();
        autoDecisionPage. validateCalculationTwo();
    }

    @Test(priority = 16)
    public void testCentennialCalculation(){
        autoDecisionPage = new AutoDecisionPage();
        autoDecisionPage. validateCentanialCalculation();
    }

    @Test(priority = 17)
    public void testAutoDecisionStatus(){
        autoDecisionPage = new AutoDecisionPage();
        autoDecisionPage. validateAutoDecisionStatus("AUTO DECLINED");
    }



}
