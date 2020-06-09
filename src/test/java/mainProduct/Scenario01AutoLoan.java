package mainProduct;

import common.BorrowerHomePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.Utils;
import common.*;

public class Scenario01AutoLoan {
    LoginPage lPage;
    BorrowerHomePage borrowerPage;
    SelectLoginPage selectProPage;

    @BeforeClass
    public void setUp() {
        Utils.getInstance().openBrowser();
        Utils.getInstance().navigateToURL("Borrower");
        lPage = new LoginPage();
    }

    @Test(priority =1)
    public void testBorrowerLogin() {
        //borrowerPage = lPage.successfulBorrowerLogin("jackrose@mailinator.com", "Qwerty1!");
    }

    @Test(priority =2)
    public void testApplyForAutoLoan(){
        selectProPage = borrowerPage.navigateToNewProduct();
        selectProPage.applyForAutoLoan();
    }


    @AfterMethod
    public void tearDown() {

    }
}
