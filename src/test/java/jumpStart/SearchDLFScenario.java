package jumpStart;

import Validations.Validations;
import au.com.bytecode.opencsv.CSVReader;
import common.BankerHomePage;
import common.BorrowerHomePage;
import common.LoginPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.CSVReadWrite;
import utils.Utils;

public class SearchDLFScenario{
    LoginPage bLPage;
    BankerHomePage bankerHomePage;
    Validations validations = new Validations();

    @BeforeClass
    public void setUp() {
        Utils.getInstance().openBrowser();
    }

    @Test(priority = 1)
    public void testLoginAsBanker() {
        bLPage = new LoginPage();
        bLPage.navigateTOBankerPortal("http://cloudbnq-oabdev-banker-application.s3-website.us-east-2.amazonaws.com/login?redirect=/");
        bankerHomePage = bLPage.successfulBankerLogin("jsonrose@mailinator.com", "Qwerty1!");
    }

    @Test(priority = 2)
    public void testCareCenterSearch() {
        String careCenter = "MY ROOM TO GROW PRESCHOOL";
        bankerHomePage.searchCareCenter(careCenter);
        bankerHomePage.selectaNewDLF();
        String careCenterTxt = bankerHomePage.NavigateToChildCareTab();
        validations.validateCareCenter(careCenter, careCenterTxt);
    }

    @Test(priority = 3)
    public void removePreviousSearch() {
        bankerHomePage.closeTab();
        bankerHomePage.removeSearch();
    }

    @Test(priority = 4)
    public void testborrowerSearch() {
        String borrower = "Robert Uphold";
        bankerHomePage.searchBorrower(borrower);
         bankerHomePage.selectaNewDLF();
        String[] borrowerData = bankerHomePage.getBorrowerData();
        String[] givenBorrower = {"Robert", "Uphold", "robertuphold@mailinator.com"};
        validations.validateBorrower(givenBorrower,borrowerData );
    }


    @AfterClass
    public void tearDown() {

      //  Utils.getInstance().closeBrowser();
    }
}
