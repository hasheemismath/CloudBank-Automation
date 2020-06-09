package jumpStart;

import common.BankerHomePage;
import common.BorrowerHomePage;
import common.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.Utils;

public class SearchNewDLF {

    LoginPage lPage, bLPage;
    BorrowerHomePage borrowerPage;
    DLFPage dlfPage;
    PersonalInformationPage personalInfoPage;
    PersonalDocumentsPage personalDocumentsPage;
    SubmitDLFPage submitDLFPage;
    BankerHomePage bankerHomePage;
    ViewLoanApplicationPage viewLoanApplicationPage;

    @BeforeClass
    public void setUp() {
        Utils.getInstance().openBrowser();
        Utils.getInstance().navigateToURL("http://cloudbnq-oabdev-banker-application.s3-website.us-east-2.amazonaws.com/");
        lPage = new LoginPage();
    }

    @Test(priority = 1)
    public void testLoginAsBanker() {
        bLPage = new LoginPage();
        bLPage.navigateTOBankerPortal("http://cloudbnq-oabdev-banker-application.s3-website.us-east-2.amazonaws.com/login?redirect=/");
        bankerHomePage = bLPage.successfulBankerLogin("jsonrose@mailinator.com", "Qwerty1!");
    }

    @Test(priority = 2)
    public void testNewDLFInList() throws Exception {
        bankerHomePage = new BankerHomePage();
        viewLoanApplicationPage = new ViewLoanApplicationPage();
        String id = "C-CCS-1428";
        viewLoanApplicationPage.navigateToDashboard();
        bankerHomePage.navigateToNewDLFsByTile();
        bankerHomePage.navigateToNewSelectedDLF(id);
        bankerHomePage.assignDLF("Json Rose");

        viewLoanApplicationPage.navigateToActionsTab();
        viewLoanApplicationPage.confirmReopenDLF();

        bankerHomePage = new BankerHomePage();
        Utils.getInstance().navigateToURL("Borrower");
        lPage = new LoginPage();
        borrowerPage = lPage.successfulBorrowerLogin("robertuphold@mailinator.com", "Qwerty1!");
        viewLoanApplicationPage.validateBorrowerReOpenedStatus();
        viewLoanApplicationPage.startEditingDLF();

        bankerHomePage.resubmitDLF();
    }

    @AfterMethod
    public void tearDown() {

    }
}
