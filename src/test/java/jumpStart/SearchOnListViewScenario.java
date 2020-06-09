package jumpStart;

import common.BankerHomePage;
import common.BorrowerHomePage;
import common.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.Utils;

public class SearchOnListViewScenario {

    LoginPage loginPage;
    BorrowerHomePage borrowerPage;
    OpenDigitalApplicationsPage openDigitalApplicationsPage;
    ViewLoanApplicationPage viewLoanApplicationPage;
    BankerHomePage bankerHomePage;

    @Test(priority = 1)
    public void testFilterByCareCenter(){
        Utils.getInstance().openBrowser();
        Utils.getInstance().navigateToURL("http://cloudbnq-oabdev-banker-application.s3-website.us-east-2.amazonaws.com/");
        loginPage = new LoginPage();
        bankerHomePage = loginPage.successfulBankerLogin("franktaylor@mailinator.com", "Qwerty1!");
        bankerHomePage = new BankerHomePage();
        bankerHomePage.navigateToNewDLFsByTile();
        openDigitalApplicationsPage = new OpenDigitalApplicationsPage();
        openDigitalApplicationsPage.selectAllFromLeftMenu();
        openDigitalApplicationsPage.filterByCareCenter("MY ROOM TO GROW");
        viewLoanApplicationPage = new ViewLoanApplicationPage();
        viewLoanApplicationPage.clickChildCareTab();
        String expCareCenterName = "MY ROOM TO GROW PRESCHOOL (92064)";
        String actCareCenterName = viewLoanApplicationPage.getCareCenterValue();
        Assert.assertEquals(actCareCenterName, expCareCenterName, "Incorrect Care Center Name in Searched Loan File!!!");
    }

    @Test(priority = 2)
    public void testFilterByBorrowerName(){
        Utils.getInstance().openBrowser();
        Utils.getInstance().navigateToURL("Banker");
        loginPage = new LoginPage();
        bankerHomePage = loginPage.successfulBankerLogin("franktaylor@mailinator.com", "Qwerty1!");
        bankerHomePage = new BankerHomePage();
        bankerHomePage.navigateToNewDLFsByTile();
        openDigitalApplicationsPage = new OpenDigitalApplicationsPage();
        openDigitalApplicationsPage.selectAllFromLeftMenu();
        openDigitalApplicationsPage.filterByBorrower("Robert Uphold");
        viewLoanApplicationPage = new ViewLoanApplicationPage();
        String expCAName = "Robert Uphold";
        String actCAName = viewLoanApplicationPage.getBorrowerNameValue();
        Assert.assertEquals(actCAName, expCAName, "Incorrect Full Name in Searched Loan File!!!");
    }

    @Test(priority = 3)
    public void testFilterByCode(){
        Utils.getInstance().openBrowser();
        Utils.getInstance().navigateToURL("Banker");
        loginPage = new LoginPage();
        bankerHomePage = loginPage.successfulBankerLogin("franktaylor@mailinator.com", "Qwerty1!");
        bankerHomePage = new BankerHomePage();
        bankerHomePage.navigateToNewDLFsByTile();
        openDigitalApplicationsPage = new OpenDigitalApplicationsPage();
        openDigitalApplicationsPage.selectAllFromLeftMenu();
        openDigitalApplicationsPage.filterByCode("C-CCS-1000");
        viewLoanApplicationPage = new ViewLoanApplicationPage();
        String expCode = "C-CCS-1000";
        String actCode = viewLoanApplicationPage.getDLFCodeValue();
        Assert.assertEquals(actCode, expCode, "Incorrect DLF code in Searched Loan File!!!");
    }

    @Test(priority = 4)
    public void testFilterByCAName(){
        Utils.getInstance().openBrowser();
        Utils.getInstance().navigateToURL("Banker");
        loginPage = new LoginPage();
        bankerHomePage = loginPage.successfulBankerLogin("franktaylor@mailinator.com", "Qwerty1!");
        bankerHomePage = new BankerHomePage();
        bankerHomePage.navigateToNewDLFsByTile();
        openDigitalApplicationsPage = new OpenDigitalApplicationsPage();
        openDigitalApplicationsPage.selectAllFromLeftMenu();
        openDigitalApplicationsPage.filterByCA("Merna Diaz");
        viewLoanApplicationPage = new ViewLoanApplicationPage();
        String expCode = "Merna Diaz";
        String actCode = viewLoanApplicationPage.getCAName();
        Assert.assertEquals(actCode, expCode, "Incorrect CA name in Searched Loan File!!!");
    }

}
