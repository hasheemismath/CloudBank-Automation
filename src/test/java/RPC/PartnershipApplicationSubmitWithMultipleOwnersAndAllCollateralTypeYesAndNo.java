package RPC;

import au.com.bytecode.opencsv.CSVReader;
import common.LoginPageRPC;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.CSVReadWrite;
import utils.PropertyFileReader;
import utils.Utils;

import java.awt.*;

public class PartnershipApplicationSubmitWithMultipleOwnersAndAllCollateralTypeYesAndNo {

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
        String rendeUrl = propertyFileReader.getProperty("config", "urlRendeQABorrower");
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
    public void testSelectPartnershipApplicationSection(){
        applyForNewProductPage.clickPartnershipApplication();
        loanDetailsPage = applyForNewProductPage.clickLetsBeginInSplashPage();
    }

    @Test(priority = 4)
    public void testNavigateToInterview1(){
        interview1Page = loanDetailsPage.navigateToInterview1Page();
    }

    @Test(priority = 5)
    public void testNavigateToInterview2Section(){
        interview1Page.fillInterview1Questions();
        interview2Page = interview1Page.navigateToInterview2Page();
    }

    @Test(priority = 7)
    public void testNavigateToBusinessSection(){
        interview2Page.fillInterview2Questions();
        businessPage = interview2Page.navigateToBusinessPage();
    }

    @Test(priority = 8)
    public void testNavigateToOwnershipSection() throws Exception {
        propertyFileReader = new PropertyFileReader();
        String positiveBusinessData1 = propertyFileReader.getProperty("config", "positiveBusinessData1");
        CSVReadWrite csvReadWrite = new CSVReadWrite();
        CSVReader csvReader = csvReadWrite.readfile(positiveBusinessData1);
        String [] line;
        while ((line = csvReader.readNext()) != null) {
            businessPage.fillBusinessInfo(line);
            break;
        }
        ownershipPage = businessPage.navigateToOwnershipSection();
    }

    @Test(priority = 9)
    public void testNavigateToCollateralSection() throws Exception {
        //owner1 details
        propertyFileReader = new PropertyFileReader();
        String positiveBusinessData1 = propertyFileReader.getProperty("config", "positiveOwnershipData3");
        CSVReadWrite csvReadWrite = new CSVReadWrite();
        CSVReader csvReader = csvReadWrite.readfile(positiveBusinessData1);
        String [] line;
        while ((line = csvReader.readNext()) != null) {
            ownershipPage.fillOwnershipInfo(line);
            break;
        }

        //owner2 details
        String positiveBusinessData2 = propertyFileReader.getProperty("config", "positiveOwnershipData4");
        CSVReadWrite csvReadWrite2 = new CSVReadWrite();
        CSVReader csvReader2 = csvReadWrite2.readfile(positiveBusinessData2);
        String [] line2;
        while ((line2 = csvReader2.readNext()) != null) {
            ownershipPage.fillSecondOwnerInfo(line2);
            break;
        }

        //owner3 details
        String positiveBusinessData3 = propertyFileReader.getProperty("config", "positiveOwnershipData5");
        CSVReadWrite csvReadWrite3 = new CSVReadWrite();
        CSVReader csvReader3 = csvReadWrite3.readfile(positiveBusinessData3);
        String [] line3;
        while ((line3 = csvReader3.readNext()) != null) {
            ownershipPage.fillThirdOwnerInfo(line3);
            break;
        }
        collateralPage = ownershipPage.navigateToCollateralSection();
    }

    @Test(priority = 10)
    public void testNavigateToPersonalDocumentsSection() {
//        collateralPage.selectYesInFurniturePurchased();
//        collateralPage.selectYesInFurnitureOwned();
//        collateralPage.selectYesInComRealStatePurchased();
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
        personalDocumentsPage.uploadOwner3PersonalDocuments();
        businesslDocumentsPage = personalDocumentsPage.navigateToBusinessDocumentsSection();
    }

    @Test(priority = 12)
    public void testNavigateToCollateralDocumentsSection() throws AWTException {
        businesslDocumentsPage.uploadBusinessDocuments();
        collateralDocumentsPage = businesslDocumentsPage.navigateToCollateralDocumentsSection();
    }

    @Test(priority = 13)
    public void testNavigateToOtherDocumentsSection() throws AWTException {
//        collateralDocumentsPage.firstTabDocumentUpload();
//        collateralDocumentsPage.secondTabDocumentUpload();
//        collateralDocumentsPage.thirdTabDocumentUpload();
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
