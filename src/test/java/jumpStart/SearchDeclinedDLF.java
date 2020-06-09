package jumpStart;

import common.BankerHomePage;
import common.BorrowerHomePage;
import common.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.Utils;

public class SearchDeclinedDLF {

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
        Utils.getInstance().navigateToURL("http://cloudbnq-oabdev-loan-application.s3-website.us-east-2.amazonaws.com/");
        lPage = new LoginPage();
    }

    @Test(priority = 10)
    public void testLoginAsBanker() {
        bLPage = new LoginPage();
        bLPage.navigateTOBankerPortal("http://cloudbnq-oabdev-banker-application.s3-website.us-east-2.amazonaws.com/login?redirect=/");
        bankerHomePage = bLPage.successfulBankerLogin("jsonrose@mailinator.com", "Qwerty1!");
    }

    @Test(priority = 14)
    public void testDeclinedDLFInList(){
        viewLoanApplicationPage = new ViewLoanApplicationPage();
        bankerHomePage = new BankerHomePage();
        String id = "C-CCS-1312";
        viewLoanApplicationPage.navigateToDashboard();
        bankerHomePage.navigateToDeclinedSelectedDLF(id);
        viewLoanApplicationPage.validateDLFStatus(ViewLoanApplicationPage.Status.DECLINED);
    }

    @AfterMethod
    public void tearDown() {

    }
}
