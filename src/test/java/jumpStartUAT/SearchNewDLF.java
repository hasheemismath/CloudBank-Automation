package jumpStartUAT;

import common.BankerHomePage;
import common.BorrowerHomePage;
import common.LoginPage;
import jumpStart.*;
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

    }

    @Test(priority = 10)
    public void testLoginAsBanker() {
        bLPage = new LoginPage();
        bLPage.navigateTOBankerPortal("https://jumpstartback.cloudbnq.com/");
        bankerHomePage = bLPage.successfulBankerLogin("jsonrose@mailinator.com", "Qwerty1!");
    }

    @Test(priority = 14)
    public void testNewDLFInList() throws Exception {
        bankerHomePage = new BankerHomePage();
        viewLoanApplicationPage = new ViewLoanApplicationPage();
        String id = "C-CCS-1428";
        viewLoanApplicationPage.navigateToDashboard();
        bankerHomePage.navigateToNewDLFsByTile();
        bankerHomePage.navigateToNewSelectedDLF(id);
        bankerHomePage.assignDLF("Jason Rose");

        viewLoanApplicationPage.navigateToActionsTab();
        viewLoanApplicationPage.confirmReopenDLF();

        bankerHomePage = new BankerHomePage();
        Utils.getInstance().navigateToURL("https://jumpstartback.cloudbnq.com/");
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
