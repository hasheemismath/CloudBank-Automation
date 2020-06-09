package jumpStart;

import Elements.LoanElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.UIActions;
import utils.Utils;


public class PersonalInformationPage extends UIActions implements LoanElements {

    static WebDriver driver = Utils.getInstance().getDriver();
    String dlfID;

    //Personal Information section
    By middleNameTxtBox = By.xpath("//*[@id=\"wr-form\"]/div/div/div/div/form/div[2]/div[2]/input");
    By socialSecNoTxtBox = By.xpath("//*[@id=\"wr-form\"]/div/div/div/div/form/div[3]/div[2]/input");
   // By drivingLicensetxtBox = By.xpath("//*[@id=\"wr-form\"]/div/div/div/div/form/div[4]/div[1]/input");
    By houseNoTxtBox = By.xpath("//*[@id=\"wr-form\"]/div/div/div/div/form/div[5]/div[1]/input");
    By streetNameTxtBox = By.xpath("//*[@id=\"wr-form\"]/div/div/div/div/form/div[5]/div[2]/input");
    By cityTxtBox = By.xpath("//*[@id=\"wr-form\"]/div/div/div/div/form/div[5]/div[4]/input");
    By zipCodeTxtBox = By.name("model.zipCode");
    By dobSelector = By.xpath("//*[@id=\"wr-form\"]/div/div/div/div/form/div[3]/div[3]/div[1]/div/input");
    By homeOwnershipbtn = By.xpath("//*[text()=\"Rent\"]"); // to select rent option
    By monthlyHousingPayment = By.xpath("//*[@id=\"wr-form\"]/div/div/div/div/form/div[6]/div[2]/div/input");
    By yearTxtBox = By.name("model.years");
    By residantBtn = By.xpath("//*[text()=\"US Citizen\"]"); // to select US Citizen option
    By agreeChkBox = By.xpath("//*[text()=\"I agree to verification of my identity with third parties\"]");
    By submitPersonalInfoBtn = By.id("next-btn-identityInformation");
    By stateSelector = By.name("model.state");
//    By lisenceStateSelector = By.name("model.licenseState");

    By agreeChkBoxInput = By.xpath("//input[@name=\"model.agreement\"]");
    By loggedUserName = By.xpath(".//span[@class='float-left']");

    public PersonalInformationPage(){
        dlfID = getDLFIdFromURL();
    }

    public PersonalInformationPage(boolean bool){
    }

    public void fillPersonalInfo(String[] line) throws Exception {
            String email = line[0];
            String password = line[1];
            String fName = line[2];
            String mName = line[3];
            String lName = line[4];
            String zipCode = line[5];
            String houseNo = line[6];
            String streetNo = line[7];
            String city = line[8];
            String state = line[9];
            String ssNo = line[10];
            String dob = line[11];
            String monthlyExpense = line[12];

            clear(middleNameTxtBox);
            sendKeys(middleNameTxtBox, mName);
            clear(socialSecNoTxtBox);
            sendKeys(socialSecNoTxtBox, ssNo);
            clear(dobSelector);
            updateValueUsingXpath(dobSelector, dob);
//            clear(drivingLicensetxtBox);
//            sendKeys(drivingLicensetxtBox, drivingLicense);
//            setDropDownValue(lisenceStateSelector,dLicenseState);
            clear(houseNoTxtBox);
            sendKeys(houseNoTxtBox,houseNo);
            clear(streetNameTxtBox);
            sendKeys(streetNameTxtBox,streetNo);
            clear(cityTxtBox);
            sendKeys(cityTxtBox,city);
            setDropDownValue(stateSelector,state);
            clear(zipCodeTxtBox);
            sendKeys(zipCodeTxtBox,zipCode);
            click(homeOwnershipbtn);
            clear(monthlyHousingPayment);
            sendKeys(monthlyHousingPayment, monthlyExpense);
//            clear(yearTxtBox);
//            sendKeys(yearTxtBox, yearsThere);
            click(residantBtn);
            if(!driver.findElement(agreeChkBoxInput).isSelected()) {
                    click(agreeChkBox);
            }
            click(submitPersonalInfoBtn);
    }

    public void fillPersonalInfoOfSubmittedUser(String[] line) throws Exception {
        String monthlyExpense = line[0];
        clear(monthlyHousingPayment);
        sendKeys(monthlyHousingPayment, monthlyExpense);
        click(homeOwnershipbtn);
        click(residantBtn);
        if(!driver.findElement(agreeChkBoxInput).isSelected()) {
            click(agreeChkBox);
        }
        click(submitPersonalInfoBtn);
    }

    public ChildCareInformationPage successfulFillingPersonalInfo(String[] line) throws Exception {
            pause(3);
            fillPersonalInfo(line);
            return new ChildCareInformationPage();
    }

    public ChildCareInformationPage successfulFillingPersonalInfoSubmittedUser(String[] line) throws Exception {
        pause(3);
        fillPersonalInfoOfSubmittedUser(line);
        return new ChildCareInformationPage();
    }


    public String getDLFIdFromURL(){
        String heading = driver.findElement(dlfHeadingTxt).getText();
        String splitFromName[] = heading.split("\\Q|\\E");
        String firstHalf[] = splitFromName[0].split("Digital Application #");
        String id = firstHalf[1].trim();
        return id;
    }

    public UnsuccessfulPersonalInfoSubmitPage unSuccessfulFillingPersonalInfo(String[] line) throws Exception {
             fillPersonalInfo(line);
             waitForElement(unsuccessMsg);
             return new UnsuccessfulPersonalInfoSubmitPage();
    }

    public String getDLFId(){
            return dlfID;
    }

    public void printDLFID(){
        System.out.println("DLF ID : " + dlfID);
    }


}
