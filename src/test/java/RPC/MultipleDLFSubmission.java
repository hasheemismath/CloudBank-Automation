package RPC;

import au.com.bytecode.opencsv.CSVReader;
import common.LoginPageRPC;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import utils.CSVReadWrite;
import utils.PropertyFileReader;
import utils.Utils;

public class MultipleDLFSubmission {

    PropertyFileReader propertyFileReader;
    LoginPageRPC loginPage;
    MyDigitalApplicationsPage myDigitalApplicationsPage;
    ApplyForNewProductPage applyForNewProductPage;
    LoanDetailsPage loanDetailsPage;
    Interview1Page interview1Page;
    Interview2Page interview2Page;
    BusinessPage businessPage;
    OwnershipPage ownershipPage;
    CollateralPage collateralPage;
    PersonalDocumentsPage personalDocumentsPage;
    BusinesslDocumentsPage businesslDocumentsPage;
    CollateralDocumentsPage collateralDocumentsPage;
    OtherDocumentsPage otherDocumentsPage;
    SubmitPage submitPage;
    ProcessingPage processingPage;

    @BeforeSuite
    public void setUp() {
        propertyFileReader = new PropertyFileReader();
        Utils.getInstance().openBrowser();
        String rendeUrl = propertyFileReader.getProperty("config", "urlRendeProdBorrower");
        Utils.getInstance().navigateToURL(rendeUrl);
        loginPage = new LoginPageRPC();
        myDigitalApplicationsPage = loginPage.borrowerLogin("jaredhunt456@gmail.com", "Qwerty1!");
        myDigitalApplicationsPage.validateSuccessfulBorrowerLogin();
    }

    @Test(invocationCount = 1)
    public void testBorrowerLogin() throws Exception {
        applyForNewProductPage = myDigitalApplicationsPage.clickApplyForNewProduct();
        applyForNewProductPage.clickPartnershipApplication();
        loanDetailsPage = applyForNewProductPage.clickLetsBeginInSplashPage();
        loanDetailsPage.getDLFIdFromURL();
        interview1Page = loanDetailsPage.navigateToInterview1Page();
        interview1Page.fillInterview1Questions();
        interview2Page = interview1Page.navigateToInterview2Page();

        interview2Page.fillInterview2Questions();
        businessPage = interview2Page.navigateToBusinessPage();

        propertyFileReader = new PropertyFileReader();
        String positiveBusinessData1 = propertyFileReader.getProperty("config", "positiveBusinessData2");
        CSVReadWrite csvReadWrite = new CSVReadWrite();
        CSVReader csvReader = csvReadWrite.readfile(positiveBusinessData1);
        String [] line;
        while ((line = csvReader.readNext()) != null) {
            businessPage.fillBusinessInfo(line);
            break;
        }
        ownershipPage = businessPage.navigateToOwnershipSection();

        propertyFileReader = new PropertyFileReader();
        String positiveOwnershipData1 = propertyFileReader.getProperty("config", "positiveOwnershipData2");
        CSVReadWrite csvReadWrite1 = new CSVReadWrite();
        CSVReader csvReader1 = csvReadWrite1.readfile(positiveOwnershipData1);
        String [] line1;
        while ((line1 = csvReader1.readNext()) != null) {
            ownershipPage.fillOwnershipInfo(line1);
            break;
        }

        collateralPage = ownershipPage.navigateToCollateralSection();
        collateralPage.selectNoInFurniturePurchased();
        personalDocumentsPage = collateralPage.navigateToPersonalDocumentsPage();

        personalDocumentsPage.uploadPersonalDocuments();
        businesslDocumentsPage = personalDocumentsPage.navigateToBusinessDocumentsSection();

        collateralDocumentsPage = businesslDocumentsPage.navigateToCollateralDocumentsSection();
        otherDocumentsPage = collateralDocumentsPage.navigateToOtherDocumentsSection();
        submitPage = otherDocumentsPage.navigateToSubmitPageSection();
        processingPage = submitPage.navigateToProcessingPage();
        processingPage.closeCurrentTabAndSwitchToPrevious();

    }

    @AfterTest
    public void closeOtherTab(){

    }

}
