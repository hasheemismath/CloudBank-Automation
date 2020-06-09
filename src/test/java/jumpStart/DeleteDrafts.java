package jumpStart;

import au.com.bytecode.opencsv.CSVReader;
import common.BankerHomePage;
import common.BorrowerHomePage;
import common.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.CSVReadWrite;
import utils.Utils;

public class DeleteDrafts {
    
    LoginPage lPage,bLPage;
    BankerHomePage bankerHomePage;

    @BeforeClass
    public void setUp() {
        Utils.getInstance().openBrowser();
        Utils.getInstance().navigateToURL("http://cloudbnq-oabdev-loan-application.s3-website.us-east-2.amazonaws.com/");
        lPage = new LoginPage();
    }

    @Test(priority = 6)
    public void testLoginAsBanker() {
        bLPage = new LoginPage();
        bLPage.navigateTOBankerPortal("http://cloudbnq-oabdev-banker-application.s3-website.us-east-2.amazonaws.com/login?redirect=/");
        bankerHomePage = bLPage.successfulBankerLogin("jsonrose@mailinator.com", "Qwerty1!");
    }

    @Test(priority = 7)
    public void testDeleteDLF(){

        for(int i = 0; i<100;++i)
        {
            bankerHomePage.navigateToDraftDLFs();
            bankerHomePage.deleteDLFs();
        }

    }

    @AfterMethod
    public void tearDown() {

    }
}
