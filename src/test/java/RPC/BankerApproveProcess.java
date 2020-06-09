package RPC;

import au.com.bytecode.opencsv.CSVReader;
import common.BankerLoginPageRPC;
import common.LoginPageRPC;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.CSVReadWrite;
import utils.PropertyFileReader;
import utils.Utils;

import java.awt.*;

public class BankerApproveProcess {

    PropertyFileReader propertyFileReader;
    BankerLoginPageRPC bankerLoginPageRPC;
    BankerHomePage bankerHomePage;
    DLFPage dlfPage;

    @BeforeClass
    public void setUp() {
        propertyFileReader = new PropertyFileReader();
        Utils.getInstance().openBrowser();
        String rendeBankerUrl = propertyFileReader.getProperty("config", "urlRendeUATBanker");
        Utils.getInstance().navigateToURL(rendeBankerUrl);
        bankerLoginPageRPC = new BankerLoginPageRPC();
    }

    @Test(priority = 1)
    public void testBorrowerLogin() {
        bankerLoginPageRPC.loginToBanker("davidthomas@mailinator.com");
        bankerHomePage = new BankerHomePage();
        bankerHomePage.navigateToOpenDigitalApplications();
        dlfPage = bankerHomePage.selectLatestDLF();
        dlfPage.approveDLF();
        dlfPage.sendlLOI(1000, 36, 9000, 2, 1200, 3, 1500);
    }
}
