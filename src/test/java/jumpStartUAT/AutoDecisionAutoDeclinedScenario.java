package jumpStartUAT;

import Validations.Validations;
import au.com.bytecode.opencsv.CSVReader;
import common.BankerHomePage;
import common.BorrowerHomePage;
import common.LoginPage;
import jumpStart.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.CSVReadWrite;
import utils.PropertyFileReader;
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
    PropertyFileReader propertyFileReader;

    @BeforeClass
    public void setUp() {
        Utils.getInstance().openBrowser();
        propertyFileReader = new PropertyFileReader();
        String borrowerURL = propertyFileReader.getProperty("JSFconfig", "urlJSFUATBorrower");
        Utils.getInstance().navigateToURL(borrowerURL);
        loginPage = new LoginPage();
    }

    @Test(priority =1)
    public void testLoginWithAnExistingBorrower() {
        borrowerHomePage = loginPage.successfulBorrowerLogin("robertrhutchinson8+100@gmail.com", "Qwerty1!");
    }

    @Test(priority =2)
    public void testSelectProduct() {
        String selectProductURL = propertyFileReader.getProperty("JSFconfig", "urlJSFUATBorrowerSelectProduct");
        dlfPage = borrowerHomePage.navigateToSelectProduct(selectProductURL);
        personalInformationPage =  dlfPage.startApplication();
    }

    @Test(priority =3)
    public void testFillCorrectPersonalDetails() throws Exception {
        Validations validations = new Validations();
        validations.validateLogedUser("JOHN FUIEK");
        String autoDeclineDataSet = propertyFileReader.getProperty("JSFconfig", "autoDeclineDataSet");
        CSVReadWrite csvReadWrite = new CSVReadWrite();
        CSVReader csvReader = csvReadWrite.readfile(autoDeclineDataSet);
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
        bankerLogin.navigateTOBankerPortal("https://jumpstartback.cloudbnq.com/");
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
      //  autoDecisionPage.validateSelfReportedDTI();
    }

    @Test(priority = 14)
    public void testCalculateCalculationOne(){
        autoDecisionPage. validateCalculationOne();
    }

    @Test(priority = 15)
    public void testCalculateCalculationTwo(){
        autoDecisionPage. validateCalculationTwo();
    }

    @Test(priority = 16)
    public void testCentennialCalculation(){
        autoDecisionPage. validateCentanialCalculation();
    }

    @Test(priority = 17)
    public void testAutoDecisionStatus(){
        autoDecisionPage. validateAutoDecisionStatus("DECLINED");
    }



}
