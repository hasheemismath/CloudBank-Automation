package jumpStart;

import au.com.bytecode.opencsv.CSVReader;
import common.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.CSVReadWrite;
import utils.Utils;

public class NegativeScenario01 {
    LoginPage lPage, bLPage;

    @BeforeClass
    public void setUp() {
        Utils.getInstance().openBrowser();
        Utils.getInstance().navigateToURL("http://cloudbnq-oabdev-loan-application.s3-website.us-east-2.amazonaws.com/");
        lPage = new LoginPage();
    }

    @Test(priority =1)
    public void testIncorrectPasswordBorrowerLogin() throws Exception {
        CSVReadWrite csvReadWrite = new CSVReadWrite();
        //incorrect password test
        CSVReader csvReader = csvReadWrite.readfile("E:\\CloudBank\\Automation\\repo\\test-automation-v2\\CloudBank\\dataSets\\IncorrectPasswordLogin.csv");
        String [] line;
        while ((line = csvReader.readNext()) != null) {
            lPage.incorrectLoginInfo(line);
            lPage.validateIncorrectPasswordErrorMessage();
            break;
        }
    }

    @Test(priority =2)
    public void testIncorrectUserNameBorrowerLogin() throws Exception {
        CSVReadWrite csvReadWrite = new CSVReadWrite();
        //incorrect username test
        CSVReader csvReader = csvReadWrite.readfile("E:\\CloudBank\\Automation\\repo\\test-automation-v2\\CloudBank\\dataSets\\IncorrectUserNameLogin.csv");
        String [] line;
        while ((line = csvReader.readNext()) != null) {
            lPage.incorrectLoginInfo(line);
            lPage.validateIncorrectUserNameErrorMessage();
        }
    }

    @Test(priority =3)
    public void testInvalidUserNameBorrowerLogin() throws Exception {
        CSVReadWrite csvReadWrite = new CSVReadWrite();
        //invalid username test
        CSVReader csvReader = csvReadWrite.readfile("E:\\CloudBank\\Automation\\repo\\test-automation-v2\\CloudBank\\dataSets\\InvalidUserNameLogin.csv");
        String [] line;
        while ((line = csvReader.readNext()) != null) {
            lPage.incorrectLoginInfo(line);
            lPage.validateInvalidValuesErrorMessage();
        }
    }

    @AfterMethod
    public void tearDown() {

    }
}
