package jumpStart;

import au.com.bytecode.opencsv.CSVReader;
import common.BorrowerHomePage;
import common.LoginPage;
import common.RegistrationPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.CSVReadWrite;
import utils.Utils;

public class SuccessfulRegistrationScenario {
    LoginPage lPage;
    RegistrationPage rPage;

    @BeforeClass
    public void setUp() {
        Utils.getInstance().openBrowser();
        Utils.getInstance().navigateToURL("http://cloudbnq-oabdev-loan-application.s3-website.us-east-2.amazonaws.com/");
        lPage = new LoginPage();
    }

    @Test(priority =1)
    public void testNavigationToRegistrationPage() {
        rPage = lPage.navigateToRegistrationPage();
   }

    @Test(priority =2)
    public void testfillingRegistrationPage() {
        rPage.fillingRegForm();
   }


    @Test(priority =3)
    public void testconfirmEmail() {
        rPage.navigateToInbox();
        rPage.getTheCode();
   }


    @AfterClass
    public void tearDown() {

       // Utils.getInstance().closeBrowser();
    }
}
