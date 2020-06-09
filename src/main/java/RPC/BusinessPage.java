package RPC;

import org.openqa.selenium.By;
import utils.UIActions;

public class BusinessPage extends UIActions {

    By loggedUserInfo = By.id("//a[@class='nav-link'][@role='button']");
    By companyNameTxt = By.xpath("//input[@id=\"root_companyName\"]");
    By firstNameTxt = By.xpath("//input[@id=\"root_firstName\"]");
    By middleNameTxt = By.xpath("//input[@id=\"root_middleName\"]");
    By lastNameTxt = By.xpath("//input[@id=\"root_lastName\"]");
    By businessPhoneTxt = By.xpath("//*[@id=\"root_businessPhone\"]/div[1]/input");
    By cellPhoneTxt = By.xpath("//*[@id=\"root_cellPhone\"]/div[1]/input");
    By businessEmailTxt = By.xpath("//input[@id=\"root_businessEmail\"]");
    By websiteTxt = By.xpath("//input[@id=\"root_website\"]");
    By streetNoTxt = By.xpath("//input[@id=\"root_buildingNumber\"]");
    By streetNameTxt = By.xpath("//input[@id=\"root_streetName\"]");
    By unitNoTxt = By.xpath("//input[@id=\"root_unitNumber\"]");
    By cityText = By.xpath("//input[@id=\"root_businessCity\"]");
    By stateDropDown = By.xpath("//*[@id=\"root_businessState\"]/select");
    By zipcodeTxt = By.xpath("//*[@id=\"root_zipCode\"]/div[1]/input");
    By dateEstablishedTxt = By.xpath("//*[@id=\"root_dateEstablished\"]/div[1]/div/input");
    By federalTaxIDTxt = By.xpath("//*[@id=\"root_federalTaxId\"]/div[1]/input");
    By nextPageButton = By.id("next-btn-business");
    By lastYearGross = By.xpath("//*[@id=\"root_lastyearGrossAnnualSales\"]/div[1]/input");
    By yearToDateGross = By.xpath("//*[@id=\"root_yearToDateGrossAnnualSales\"]/div[1]/input");

    public void fillBusinessInfo(String[] line) throws Exception {
        String companyName = line[0];
        String fName = line[1];
        String mName = line[2];
        String lName = line[3];
        String businessPhone = line[4];
        String cellPhone = line[5];
        String businessEmail = line[6];
        String website = line[7];
        String streetNo = line[8];
        String streetName = line[9];
        String unitNo = line[10];
        String city = line[11];
        String state = line[12];
        String zip = line[13];
        String dateEstd = line[14];
        String federalTax = line[15];
        String latYear = line[16];
        String yearToDate = line[17];

        clear(companyNameTxt);
        sendKeys(companyNameTxt, companyName);
        clear(firstNameTxt);
        sendKeys(firstNameTxt, fName);
        clear(middleNameTxt);
        sendKeys(middleNameTxt, mName);
        clear(lastNameTxt);
        sendKeys(lastNameTxt, lName);
        clear(businessPhoneTxt);
        sendKeys(businessPhoneTxt, businessPhone);
        clear(cellPhoneTxt);
        sendKeys(cellPhoneTxt, cellPhone);
        clear(businessEmailTxt);
        sendKeys(businessEmailTxt, businessEmail);
        clear(websiteTxt);
        sendKeys(websiteTxt, website);
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
        clear(cityText);
        updateValueUsingXpath(dateEstablishedTxt, dateEstd);
        clear(federalTaxIDTxt);
        sendKeys(federalTaxIDTxt, federalTax);
        clear(lastYearGross);
        sendKeys(lastYearGross, latYear);
        clear(yearToDateGross);
        sendKeys(yearToDateGross, yearToDate);
    }

    public OwnershipPage navigateToOwnershipSection(){
        click(nextPageButton);
        return new OwnershipPage();
    }

}
