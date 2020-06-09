package jumpStart;

import common.BankerHomePage;
import common.BorrowerHomePage;
import common.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.Utils;

public class UserRoleBasedAccess {

    LoginPage lPage, bLPage;
    BorrowerHomePage borrowerPage;
    DLFPage dlfPage;
    PersonalInformationPage personalInfoPage;
    ChildCareInformationPage childCareInfoPage;
    AnnualIncomeInformationPage annualIncomeInfoPage;
    MonthlyExpensesInformationPage monthlyExpensesInfoPage;
    LoanPaymentInformationPage loanPaymentInfoPage;
    PersonalDocumentsPage personalDocumentsPage;
    SubmitDLFPage submitDLFPage;
    BankerHomePage bankerHomePage;
    ViewLoanApplicationPage viewLoanApplicationPage;
    ManagerHomePage managerHomePage;
    CSL1HomePage csl1HomePage;
    CAHomePage caHomePage;
    CSL2HomePage csl2HomePage;

    @BeforeClass
    public void setUp() {
        Utils.getInstance().openBrowser();
        Utils.getInstance().navigateToURL("https://jumpstartback.cloudbnq.com/");
    }

//    @Test(priority = 1)
//    public void testManagerLogin(){
//        bLPage = new LoginPage();
//        bankerHomePage = bLPage.successfulBankerLogin("mernadiaz@mailinator.com", "Qwerty1!");
//        managerHomePage = new ManagerHomePage();
//        managerHomePage.validateManagerLogin();
//    }
//
//    @Test(priority = 2)
//    public void testCALogin(){
//        bLPage = new LoginPage();
//        bankerHomePage = bLPage.successfulBankerLogin("jsonrose@mailinator.com", "Qwerty1!");
//        caHomePage = new CAHomePage();
//        caHomePage.validateCALogin();
//    }

    @Test(priority = 3)
    public void testCSL1Login(){
        bLPage = new LoginPage();
//        lPage =  new LoginPage();
        bankerHomePage = bLPage.successfulBankerLogin("jaredhunt456+32@gmail.com", "Qwerty1!");
//        csl1HomePage = new CSL1HomePage();
//        csl1HomePage.validateCSL1Login();
    }

}
