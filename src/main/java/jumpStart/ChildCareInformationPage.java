package jumpStart;

import Elements.LoanElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.UIActions;
import utils.Utils;

public class ChildCareInformationPage extends UIActions implements LoanElements {

    String focusDiv = "wr-form";
    String careCenterName = "MY ROOM TO GROW PRESCHOOL (92064)";
    static WebDriver driver = Utils.getInstance().getDriver();

    //Child Care Information Section
    By fNameChildtxtBox = By.xpath("//*[@id=\"root_firstNameOfChild\"]/div/input");
    By lNameChildtxtBox = By.xpath("//*[@id=\"root_lastNameOfChild\"]/div/input");
    By dobChild = By.xpath("//*[@id=\"root_dobOfChild\"]/div[1]/div/input");
    By enrollMonthSelector = By.xpath("//*[@id=\"root_expectedMonths_enrollExpectedMonths\"]/select");
    By enrollDate = By.xpath("//*[@id=\"root_ageWarningContainer_enrollmentDate\"]/div[1]/div/input");
    By careCenterTxtBox = By.xpath("//*[@id=\"root_careCenter\"]/div[1]/div/div[1]/input[1]");
    By careCenterSelector = By.xpath("//*[@id=\"rbt-menu-item-0\"]/a");
    By careCenterChkBox = By.xpath("//*[text()=\"I confirm Care Center and Target Monthly Invoice are correct\"]");
    By childcareNextBtn = By.id("next-btn-demographicInfo");
    By annualIncomeInfo = By.xpath("//*[@id=\"progress\"]/div[3]/div/span");

    public AnnualIncomeInformationPage  fillingChildCareInfo() {
        waitForElement(childcareNextBtn);
        pause(3);
//        clear(fNameChildtxtBox);
//        sendKeys(fNameChildtxtBox, "Jamie");
//        clear(lNameChildtxtBox);
//        sendKeys(lNameChildtxtBox, "Stephan");
        clear(dobChild);
        sendKeys(dobChild, "11/24/2015");
        setDropDownValue(enrollMonthSelector, "24");
        //clear(enrollDate);
        sendKeys(enrollDate, "05/06/2019");
        clear(careCenterTxtBox);
        sendKeys(careCenterTxtBox, careCenterName);
        pause(2);
        click(careCenterSelector);
        pause(2);
        click(careCenterChkBox);
        click(childcareNextBtn);
        return new AnnualIncomeInformationPage();
    }

    public double getCareCenterTutionAmmount() {
        boolean careCenterTutionStatus = careCenterName.contains("MY ROOM TO GROW PRESCHOOL (92064)");
        if (careCenterTutionStatus = true){
            return 880;
        }
        else
            return 1468;
    }

    public AnnualIncomeInformationPage navigateToAnnualInfoPage(){
//        if (!driver.findElement(careCenterChkBox).isSelected()) {
//            click(careCenterChkBox);
//            waitForElementClickable(childcareNextBtn);
//            click(childcareNextBtn);
//        }
//        else{
            waitForElementClickable(childcareNextBtn);
            pause(2);
            click(childcareNextBtn);
     //   }

        return new AnnualIncomeInformationPage();
    }
}