package jumpStart;

import au.com.bytecode.opencsv.CSVReader;
import common.BorrowerHomePage;
import common.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.CSVReadWrite;
import utils.Utils;

public class SubmitHundradDLFJohnScenario {
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

    @BeforeClass
    public void setUp() {
        Utils.getInstance().openBrowser();
        Utils.getInstance().navigateToURL("http://cloudbnq-oabdev-loan-application.s3-website.us-east-2.amazonaws.com/login?redirect=/");
        lPage = new LoginPage();
    }

    @Test(invocationCount = 100)
    public void testSubmitFromJohn() throws Exception {

        borrowerPage = lPage.successfulBorrowerLogin("johnfuiek@mailinator.com", "Qwerty1!");

        dlfPage = borrowerPage.navigateToSelectProduct("http://cloudbnq-oabdev-loan-application.s3-website.us-east-2.amazonaws.com/");
        personalInfoPage =  dlfPage.startApplication();

        CSVReadWrite csvReadWrite = new CSVReadWrite();
        CSVReader csvReader = csvReadWrite.readfile("D:\\Cloudbnq\\07.04.19\\test-automation-v2\\CloudBank\\dataSets\\AutoDeclineDataSet.csv");
        String [] line;
        while ((line = csvReader.readNext()) != null) {
            childCareInfoPage = personalInfoPage.successfulFillingPersonalInfo(line);
            break;
        }

        annualIncomeInfoPage = childCareInfoPage.fillingChildCareInfo();
        loanPaymentInfoPage = annualIncomeInfoPage.fillAnnualIncomeInfo();
        personalDocumentsPage = loanPaymentInfoPage.fillLoanPaymentInformation();

        submitDLFPage = personalDocumentsPage.fillPersonalDocs();

        submitDLFPage.SubmitForm();
        submitDLFPage.waitForProcessingPage();
        submitDLFPage.viewSubmitedForm();
        Thread.sleep(10000);
        viewLoanApplicationPage = new ViewLoanApplicationPage();
        viewLoanApplicationPage.switchToSubmittedDLF();
        viewLoanApplicationPage.validateDLFSubStatus("Closed");
    }

    @AfterMethod
    public void logout(){
        submitDLFPage.logout();
    }


}
