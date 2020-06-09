package RPC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import sun.security.krb5.internal.PAData;
import utils.UIActions;
import utils.Utils;

public class OwnershipPage extends UIActions {

    static WebDriver driver = Utils.getInstance().getDriver();

    By loggedUserInfo = By.id("//a[@class='nav-link'][@role='button']");
    By firstNameTxt = By.xpath("//input[@id=\"root_businessOwnership_0_firstName\"]");
    By middleNameTxt = By.xpath("//input[@id=\"root_businessOwnership_0_middleName\"]");
    By lastNameTxt = By.xpath("//input[@id=\"root_businessOwnership_0_lastName\"]");
    By titleTxt = By.xpath("//input[@id=\"root_businessOwnership_0_title\"]");
    By streetNoTxt = By.xpath("//input[@id=\"root_businessOwnership_0_buildingNumber\"]");
    By streetNameTxt = By.xpath("//input[@id=\"root_businessOwnership_0_streetName\"]");
    By unitNoTxt = By.xpath("//input[@id=\"root_businessOwnership_0_unitNumber\"]");
    By cityText = By.xpath("//input[@id=\"root_businessOwnership_0_city\"]");
    By stateDropDown = By.xpath("//*[@id=\"root_businessOwnership_0_state\"]/select");
    By zipcodeTxt = By.xpath("//*[@id=\"root_businessOwnership_0_zipCode\"]/div[1]/input");
    By telephoneNoTxt = By.xpath("//*[@id=\"root_businessOwnership_0_phoneNumber\"]/div[1]/input");
    By cellphoneNoTxt = By.xpath("//*[@id=\"root_businessOwnership_0_cellPhoneNumber\"]/div[1]/input");
    By receDropdown = By.xpath("//*[@id=\"root_businessOwnership_0_race\"]/select");
    By ethnicityDropdown = By.xpath("//*[@id=\"root_businessOwnership_0_ethnicity\"]/select");
    By educationDropdown = By.xpath("//*[@id=\"root_businessOwnership_0_education\"]/select");
    By referralSourceDropdown = By.xpath("//*[@id=\"root_businessOwnership_0_referralSource\"]/select");
    By emailTxt = By.xpath("//input[@id=\"root_businessOwnership_0_email\"]");
    By ownershiptTxt = By.xpath("//*[@id=\"root_businessOwnership_0_ownership\"]/div[1]/input");
    By DobSelect = By.xpath("//*[@id=\"root_businessOwnership_0_dob\"]/div[1]/div/div/input");
    By SSNTxt = By.xpath("//input[@id=\"root_businessOwnership_0_ssnOrTaxId\"]");

    //Ownership 2
    By ownerTwoTab = By.xpath("//*[@id=\"tab-root_businessOwnership-array-field\"]/div[2]/div[1]/ul/li[2]/a");
    By firstNameTxtOwn2 = By.xpath("//input[@id=\"root_businessOwnership_1_firstName\"]");
    By middleNameTxtOwn2 = By.xpath("//input[@id=\"root_businessOwnership_1_middleName\"]");
    By lastNameTxtOwn2 = By.xpath("//input[@id=\"root_businessOwnership_1_lastName\"]");
    By titleTxtOwn2 = By.xpath("//input[@id=\"root_businessOwnership_1_title\"]");
    By streetNoTxtOwn2 = By.xpath("//input[@id=\"root_businessOwnership_1_buildingNumber\"]");
    By streetNameTxtOwn2 = By.xpath("//input[@id=\"root_businessOwnership_1_streetName\"]");
    By unitNoTxtOwn2 = By.xpath("//input[@id=\"root_businessOwnership_1_unitNumber\"]");
    By cityTextOwn2 = By.xpath("//input[@id=\"root_businessOwnership_1_city\"]");
    By stateDropDownOwn2 = By.xpath("//*[@id=\"root_businessOwnership_1_state\"]/select");
    By zipcodeTxtOwn2 = By.xpath("//input[@id=\"root_businessOwnership_1_zipCode\"]");
    By telephoneNoTxtOwn2 = By.xpath("//*[@id=\"root_businessOwnership_1_phoneNumber\"]/div[1]/input");
    By cellphoneNoTxtOwn2 = By.xpath("//*[@id=\"root_businessOwnership_1_cellPhoneNumber\"]/div[1]/input");
    By receDropdownOwn2 = By.xpath("//*[@id=\"root_businessOwnership_1_race\"]/select");
    By ethnicityDropdownOwn2 = By.xpath("//*[@id=\"root_businessOwnership_1_ethnicity\"]/select");
    By educationDropdownOwn2 = By.xpath("//*[@id=\"root_businessOwnership_1_education\"]/select");
    By referralSourceDropdownOwn2 = By.xpath("//*[@id=\"root_businessOwnership_1_referralSource\"]/select");
    By emailTxtOwn2 = By.xpath("//input[@id=\"root_businessOwnership_1_email\"]");
    By ownershiptTxtOwn2 = By.xpath("//*[@id=\"root_businessOwnership_1_ownership\"]/div[1]/input");
    By DobSelectOwn2 = By.xpath("//*[@id=\"root_businessOwnership_1_dob\"]/div[1]/div/input");
    By SSNTxtOwn2 = By.xpath("//input[@id=\"root_businessOwnership_1_ssnOrTaxId\"]");

    //Ownership 3
    By ownerThreeTab = By.xpath("//*[@id=\"tab-root_businessOwnership-array-field\"]/div[2]/div[1]/ul/li[3]/a");
    By firstNameTxtOwn3 = By.xpath("//input[@id=\"root_businessOwnership_2_firstName\"]");
    By middleNameTxtOwn3 = By.xpath("//input[@id=\"root_businessOwnership_2_middleName\"]");
    By lastNameTxtOwn3 = By.xpath("//input[@id=\"root_businessOwnership_2_lastName\"]");
    By titleTxtOwn3 = By.xpath("//input[@id=\"root_businessOwnership_2_title\"]");
    By streetNoTxtOwn3 = By.xpath("//input[@id=\"root_businessOwnership_2_buildingNumber\"]");
    By streetNameTxtOwn3 = By.xpath("//input[@id=\"root_businessOwnership_2_streetName\"]");
    By unitNoTxtOwn3 = By.xpath("//input[@id=\"root_businessOwnership_2_unitNumber\"]");
    By cityTextOwn3 = By.xpath("//input[@id=\"root_businessOwnership_2_city\"]");
    By stateDropDownOwn3 = By.xpath("//*[@id=\"root_businessOwnership_2_state\"]/select");
    By zipcodeTxtOwn3 = By.xpath("//input[@id=\"root_businessOwnership_2_zipCode\"]");
    By telephoneNoTxtOwn3 = By.xpath("//*[@id=\"root_businessOwnership_2_phoneNumber\"]/div[1]/input");
    By cellphoneNoTxtOwn3 = By.xpath("//*[@id=\"root_businessOwnership_2_cellPhoneNumber\"]/div[1]/input");
    By raceDropdownOwn3 = By.xpath("//*[@id=\"root_businessOwnership_2_race\"]/select");
    By ethnicityDropdownOwn3 = By.xpath("//*[@id=\"root_businessOwnership_2_ethnicity\"]/select");
    By educationDropdownOwn3 = By.xpath("//*[@id=\"root_businessOwnership_2_education\"]/select");
    By referralSourceDropdownOwn3 = By.xpath("//*[@id=\"root_businessOwnership_2_referralSource\"]/select");
    By emailTxtOwn3 = By.xpath("//input[@id=\"root_businessOwnership_2_email\"]");
    By ownershiptTxtOwn3 = By.xpath("//*[@id=\"root_businessOwnership_2_ownership\"]/div[1]/input");
    By DobSelectOwn3 = By.xpath("//*[@id=\"root_businessOwnership_2_dob\"]/div[1]/div/input");
    By SSNTxtOwn3 = By.xpath("//input[@id=\"root_businessOwnership_2_ssnOrTaxId\"]");

    By ownershiptLabel = By.xpath("//*[@id=\"tab-root_businessOwnership-array-field\"]/div[3]/div/div/text()[1]");
    By nextPageBtn = By.id("next-btn-businessOwnership");
    By prevPageBtn = By.id("prev-btn");
    By addOwnerBtn = By.xpath("//*[@id=\"tab-root_businessOwnership-array-field\"]/div[1]/div[2]/div/div/button");
    By navigationbarOwnershipSection = By.xpath("//*[@id=\"progress\"]/div[5]/div/span");

    public void fillOwnershipInfo(String[] line) throws Exception {
        String fName = line[0];
        String mName = line[1];
        String lName = line[2];
        String title = line[3];
        String streetNo = line[4];
        String streetName = line[5];
        String unitNo = line[6];
        String city = line[7];
        String state = line[8];
        String zip = line[9];
        String telephoneNo = line[10];
        String cellphoneNo = line[11];
        String race = line[12];
        String ethnicity = line[13];
        String education = line[14];
        String referralSource = line[15];
        String email = line[16];
        String ownership = line[17];
        String Dob = line[18];
        String SSN = line[19];

        waitForElementClickable(firstNameTxt);
        pause(5);
//        clear(firstNameTxt);
        sendKeys(firstNameTxt, fName);
        clear(middleNameTxt);
        sendKeys(middleNameTxt, mName);
        clear(lastNameTxt);
        sendKeys(lastNameTxt, lName);
        clear(titleTxt);
        sendKeys(titleTxt, title);
        clear(streetNoTxt);
        sendKeys(streetNoTxt, streetNo);
        clear(streetNameTxt);
        sendKeys(streetNameTxt, streetName);
        clear(unitNoTxt);
        sendKeys(unitNoTxt, unitNo);
        clear(cityText);
        sendKeys(cityText, city);
        setDropDownValue(stateDropDown,state);
        clear(zipcodeTxt);
        sendKeys(zipcodeTxt, zip);
        clear(telephoneNoTxt);
        sendKeys(telephoneNoTxt, telephoneNo);
        clear(cellphoneNoTxt);
        sendKeys(cellphoneNoTxt, cellphoneNo);
        setDropDownValue(receDropdown,race);
        setDropDownValue(ethnicityDropdown,ethnicity);
        setDropDownValue(educationDropdown,education);
        setDropDownValue(referralSourceDropdown,referralSource);
        clear(emailTxt);
        sendKeys(emailTxt, email);
        clear(ownershiptTxt);
        sendKeys(ownershiptTxt, ownership);
        updateValueUsingXpath(DobSelect, Dob);
        clear(SSNTxt);
        sendKeys(SSNTxt, SSN);
    }

    public void fillSecondOwnerInfo(String[] line) throws Exception {
        click(addOwnerBtn);
        waitForElementClickable(ownerTwoTab);
        click(ownerTwoTab);
        waitForElementClickable(firstNameTxtOwn2);
        pause(1);
        String fName = line[0];
        String mName = line[1];
        String lName = line[2];
        String title = line[3];
        String streetNo = line[4];
        String streetName = line[5];
        String unitNo = line[6];
        String city = line[7];
        String state = line[8];
        String zip = line[9];
        String telephoneNo = line[10];
        String cellphoneNo = line[11];
        String rece = line[12];
        String ethnicity = line[13];
        String education = line[14];
        String referralSource = line[15];
        String email = line[16];
        String ownership = line[17];
        String Dob = line[18];
        String SSN = line[19];

        waitForElementClickable(firstNameTxtOwn2);
        pause(5);
//        clear(firstNameTxt);
        sendKeys(firstNameTxtOwn2, fName);
        clear(middleNameTxtOwn2);
        sendKeys(middleNameTxtOwn2, mName);
        clear(lastNameTxtOwn2);
        sendKeys(lastNameTxtOwn2, lName);
        clear(titleTxtOwn2);
        sendKeys(titleTxtOwn2, title);
        clear(streetNoTxtOwn2);
        sendKeys(streetNoTxtOwn2, streetNo);
        clear(streetNameTxtOwn2);
        sendKeys(streetNameTxtOwn2, streetName);
        clear(unitNoTxtOwn2);
        sendKeys(unitNoTxtOwn2, unitNo);
        clear(cityTextOwn2);
        sendKeys(cityTextOwn2, city);
        setDropDownValue(stateDropDownOwn2,state);
        clear(zipcodeTxtOwn2);
        sendKeys(zipcodeTxtOwn2, zip);
        clear(telephoneNoTxtOwn2);
        sendKeys(telephoneNoTxtOwn2, telephoneNo);
        clear(cellphoneNoTxtOwn2);
        sendKeys(cellphoneNoTxtOwn2, cellphoneNo);
        setDropDownValue(receDropdownOwn2,rece);
        setDropDownValue(ethnicityDropdownOwn2,ethnicity);
        setDropDownValue(educationDropdownOwn2,education);
        setDropDownValue(referralSourceDropdownOwn2,referralSource);
        clear(emailTxtOwn2);
        sendKeys(emailTxtOwn2, email);
        clear(ownershiptTxtOwn2);
        sendKeys(ownershiptTxtOwn2, ownership);
        updateValueUsingXpath(DobSelectOwn2, Dob);
        clear(SSNTxtOwn2);
        sendKeys(SSNTxtOwn2, SSN);
    }

    public void fillThirdOwnerInfo(String[] line) {
        click(addOwnerBtn);
        waitForElementClickable(ownerThreeTab);
        click(ownerThreeTab);
        waitForElementClickable(firstNameTxtOwn3);
        pause(1);
        String fName = line[0];
        String mName = line[1];
        String lName = line[2];
        String title = line[3];
        String streetNo = line[4];
        String streetName = line[5];
        String unitNo = line[6];
        String city = line[7];
        String state = line[8];
        String zip = line[9];
        String telephoneNo = line[10];
        String cellphoneNo = line[11];
        String rece = line[12];
        String ethnicity = line[13];
        String education = line[14];
        String referralSource = line[15];
        String email = line[16];
        String ownership = line[17];
        String Dob = line[18];
        String SSN = line[19];

        waitForElementClickable(firstNameTxtOwn3);
        pause(5);
//        clear(firstNameTxt);
        sendKeys(firstNameTxtOwn3, fName);
        clear(middleNameTxtOwn3);
        sendKeys(middleNameTxtOwn3, mName);
        clear(lastNameTxtOwn3);
        sendKeys(lastNameTxtOwn3, lName);
        clear(titleTxtOwn3);
        sendKeys(titleTxtOwn3, title);
        clear(streetNoTxtOwn3);
        sendKeys(streetNoTxtOwn3, streetNo);
        clear(streetNameTxtOwn3);
        sendKeys(streetNameTxtOwn3, streetName);
        clear(unitNoTxtOwn3);
        sendKeys(unitNoTxtOwn3, unitNo);
        clear(cityTextOwn3);
        sendKeys(cityTextOwn3, city);
        setDropDownValue(stateDropDownOwn3,state);
        clear(zipcodeTxtOwn3);
        sendKeys(zipcodeTxtOwn3, zip);
        clear(telephoneNoTxtOwn3);
        sendKeys(telephoneNoTxtOwn3, telephoneNo);
        clear(cellphoneNoTxtOwn3);
        sendKeys(cellphoneNoTxtOwn3, cellphoneNo);
        setDropDownValue(raceDropdownOwn3,rece);
        setDropDownValue(ethnicityDropdownOwn3,ethnicity);
        setDropDownValue(educationDropdownOwn3,education);
        setDropDownValue(referralSourceDropdownOwn3,referralSource);
        clear(emailTxtOwn3);
        sendKeys(emailTxtOwn3, email);
        clear(ownershiptTxtOwn3);
        sendKeys(ownershiptTxtOwn3, ownership);
        updateValueUsingXpath(DobSelectOwn3, Dob);
        clear(SSNTxtOwn3);
        sendKeys(SSNTxtOwn3, SSN);
    }

    public CollateralPage navigateToCollateralSection(){
        click(nextPageBtn);
        return new CollateralPage();
    }

    public BusinessPage navigateToBusinessSection(){
        click(prevPageBtn);
        return new BusinessPage();
    }

    public void setAddOwnerBtn(){
        waitForElementClickable(addOwnerBtn);
        click(addOwnerBtn);
    }

    public void validateOwnershipValueInLabel(){
        String expectedValue = driver.findElement(ownershiptTxt).getText();
        String actualValue = driver.findElement(ownershiptLabel).getText();
        Assert.assertEquals(actualValue, expectedValue, "Incorrect Ownership value!!!");
    }

    public OwnershipPage navigateStraightToOwnershipSection(){
        waitForElementClickable(navigationbarOwnershipSection);
        pause(3);
        click(navigationbarOwnershipSection);
        return new OwnershipPage();
    }


}
