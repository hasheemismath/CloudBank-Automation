package RPC;

import au.com.bytecode.opencsv.CSVReader;
import common.LoginPageRPC;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.CSVReadWrite;
import utils.PropertyFileReader;
import utils.Utils;

import java.awt.*;

public class CorporateApplicationSubmitWithTwoOwnersAndAllCollateralTypeNo {

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

    @BeforeClass
    public void setUp() {
        propertyFileReader = new PropertyFileReader();
        Utils.getInstance().openBrowser();
        String rendeUrl = propertyFileReader.getProperty("config", "urlRendeUATBorrower");
        Utils.getInstance().navigateToURL(rendeUrl);
        loginPage = new LoginPageRPC();
    }

    @Test(priority = 1)
    public void testBorrowerLogin() {
        myDigitalApplicationsPage = loginPage.borrowerLogin("jaredhunt456@gmail.com", "Qwerty1!");
        myDigitalApplicationsPage.validateSuccessfulBorrowerLogin();
    }

    @Test(priority = 2)
    public void testApplyNewProduct(){
        applyForNewProductPage = myDigitalApplicationsPage.clickApplyForNewProduct();
    }

    @Test(priority = 3)
    public void testSelectCorporateApplicationSection(){
        applyForNewProductPage.clickCorporateApplication();
        loanDetailsPage = applyForNewProductPage.clickLetsBeginInSplashPage();
    }

    @Test(priority = 4)
    public void testNavigateToInterview1(){
        interview1Page = loanDetailsPage.navigateToInterview1Page();
    }

    @Test(priority = 5)
    public void testNavigateToInterview2Section(){
//        interview1Page.fillInterview1Questions();
        interview2Page = interview1Page.navigateToInterview2Page();
    }

    @Test(priority = 7)
    public void testNavigateToBusinessSection(){
//        interview2Page.fillInterview2Questions();
        businessPage = interview2Page.navigateToBusinessPage();
    }

    @Test(priority = 8)
    public void testNavigateToOwnershipSection() throws Exception {
//        propertyFileReader = new PropertyFileReader();
//        String positiveBusinessData1 = propertyFileReader.getProperty("config", "positiveBusinessData2");
//        CSVReadWrite csvReadWrite = new CSVReadWrite();
//        CSVReader csvReader = csvReadWrite.readfile(positiveBusinessData1);
//        String [] line;
//        while ((line = csvReader.readNext()) != null) {
//            businessPage.fillBusinessInfo(line);
//            break;
//        }
        ownershipPage = businessPage.navigateToOwnershipSection();
    }

    @Test(priority = 9)
    public void testNavigateToCollateralSection() throws Exception {
        propertyFileReader = new PropertyFileReader();
        String positiveBusinessData1 = propertyFileReader.getProperty("config", "positiveOwnershipData3");
        CSVReadWrite csvReadWrite = new CSVReadWrite();
        CSVReader csvReader = csvReadWrite.readfile(positiveBusinessData1);
        String [] line;
        while ((line = csvReader.readNext()) != null) {
            ownershipPage.fillOwnershipInfo(line);
            break;
        }

        //owner 2 details
        String positiveBusinessData2 = propertyFileReader.getProperty("config", "positiveOwnershipData4");
        CSVReadWrite csvReadWrite2 = new CSVReadWrite();
        CSVReader csvReader2 = csvReadWrite2.readfile(positiveBusinessData2);
        String [] line2;
        while ((line2 = csvReader2.readNext()) != null) {
            ownershipPage.fillSecondOwnerInfo(line2);
            break;
        }
        collateralPage = ownershipPage.navigateToCollateralSection();
    }

    @Test(priority = 10)
    public void testNavigateToPersonalDocumentsSection() {
//        collateralPage = new CollateralPage();
//        collateralPage.selectNoInFurniturePurchased();
//        collateralPage.selectNoInFurnitureOwned();
//        collateralPage.selectNoInComRealStatePurchased();
//        collateralPage.fillComRealEstateOwned();
//        collateralPage.fillPersonalRealEstateOwned();
//        collateralPage.selectNoInVehiclePurchased();
//        collateralPage.selectNoInVehicleOwned();
//        collateralPage.selectNoInCertifiedOfDeposit();
//        collateralPage.selectNoInBusinessInsuranceInformation();
//        collateralPage.selectNoInJewelery();
//        collateralPage.selectNoInOther();
        personalDocumentsPage = collateralPage.navigateToPersonalDocumentsPage();
    }

    @Test(priority = 11)
    public void testNavigateToBusinessDocumentsSection() throws AWTException {
        personalDocumentsPage.uploadPersonalDocuments();
        personalDocumentsPage.uploadOwner2PersonalDocuments();
        businesslDocumentsPage = personalDocumentsPage.navigateToBusinessDocumentsSection();
    }

    @Test(priority = 12)
    public void testNavigateToCollateralDocumentsSection() throws AWTException {
        businesslDocumentsPage.uploadBusinessDocuments();
        collateralDocumentsPage = businesslDocumentsPage.navigateToCollateralDocumentsSection();
    }

    @Test(priority = 13)
    public void testNavigateToOtherDocumentsSection(){
        otherDocumentsPage = collateralDocumentsPage.navigateToOtherDocumentsSection();
    }

    @Test(priority = 14)
    public void testNavigateToSubmitDLFSection() throws AWTException {
        otherDocumentsPage.uploadOtherDocuments();
        submitPage = otherDocumentsPage.navigateToSubmitPageSection();
    }

    @Test(priority = 15)
    public void testSubmitForm() {
        processingPage = submitPage.navigateToProcessingPage();
        processingPage.validateSuccessfullySubmitDLF();
    }
}
