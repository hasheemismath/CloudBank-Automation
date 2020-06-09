package jumpStart;

import au.com.bytecode.opencsv.CSVReader;
import common.BankerHomePage;
import common.BorrowerHomePage;
import common.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.CSVReadWrite;
import utils.PropertyFileReader;
import utils.Utils;

import static Elements.LoanElements.LoggedUserInfo;

public class SubmitHundradDLFScenario {
    LoginPage lPage;
    BorrowerHomePage borrowerPage;
    DLFPage dlfPage;
    PersonalInformationPage personalInfoPage;
    ChildCareInformationPage childCareInfoPage;
    AnnualIncomeInformationPage annualIncomeInfoPage;
    MonthlyExpensesInformationPage monthlyExpensesInfoPage;
    LoanPaymentInformationPage loanPaymentInfoPage;
    PersonalDocumentsPage personalDocumentsPage;
    SubmitDLFPage submitDLFPage;
    ViewLoanApplicationPage viewLoanApplicationPage;
    BankerHomePage bankerHomePage;
    PropertyFileReader propertyFileReader;

    @BeforeClass
    public void setUp() {
        Utils.getInstance().openBrowser();
        String rendeUrl = propertyFileReader.getProperty("config", "urlJSFQABorrower");
        Utils.getInstance().navigateToURL(rendeUrl);
        lPage = new LoginPage();
    }

    @Test(invocationCount = 200)
    public void testSubmitFromRobert() throws Exception {

        borrowerPage = lPage.successfulBorrowerLogin("Jaredhunt456+19@gmail.com", "Qwerty1!");
        dlfPage = borrowerPage.navigateToSelectProduct("http://cloudbnq-oabdev-loan-application.s3-website.us-east-2.amazonaws.com/");
        personalInfoPage =  dlfPage.startApplication();

        CSVReadWrite csvReadWrite = new CSVReadWrite();
        CSVReader csvReader = csvReadWrite.readfile("D:\\Cloudbnq\\07.04.19\\test-automation-v2\\CloudBank\\dataSets\\PositiveSetForSubmittedUser.csv");
        String [] line;
        while ((line = csvReader.readNext()) != null) {
            childCareInfoPage = personalInfoPage.successfulFillingPersonalInfoSubmittedUser(line);
            break;
        }
        String dlfId = personalInfoPage.getDLFId();
        personalInfoPage.printDLFID();
        annualIncomeInfoPage = childCareInfoPage.fillingChildCareInfo();
        loanPaymentInfoPage = annualIncomeInfoPage.fillAnnualIncomeInfo();
        personalDocumentsPage = loanPaymentInfoPage.fillLoanPaymentInformation();

        submitDLFPage = personalDocumentsPage.fillPersonalDocs();
        submitDLFPage.SubmitForm();
        //submitDLFPage.waitForProcessingPage();

        lPage = new LoginPage();
        lPage.navigateTOBankerPortal("http://cloudbnq-oabdev-banker-application.s3-website.us-east-2.amazonaws.com/login?redirect=/");
        bankerHomePage = lPage.successfulBankerLogin("jsonrose@mailinator.com", "Qwerty1!");
        String ActLastDLFID = bankerHomePage.viewLastDLFAndClickMessageTab();
        String ExpLastDLFID = "#" + dlfId;
        System.out.println("Dashboard DLF ID : " + ExpLastDLFID);
        Assert.assertEquals(ActLastDLFID, ExpLastDLFID, "Incorrect Last DLF ID!!!");
        viewLoanApplicationPage = new ViewLoanApplicationPage();
        viewLoanApplicationPage.validateDLFSubStatus("Credit Analyst Assignment Pending");
    }

    @AfterMethod
    public void logout(){
        submitDLFPage.closeAndLogout();
    }

}
