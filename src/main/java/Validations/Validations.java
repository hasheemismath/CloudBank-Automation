package Validations;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import Elements.LoanElements;
import utils.Utils;

public class Validations implements LoanElements{

    WebDriver driver = Utils.getInstance().getDriver();

    public void validateLoggedUser(String userName){
        String loggedUser = driver.findElement(loggedUserName).getText();
        Assert.assertEquals(loggedUser, userName, "Incorrect User Name in User Information");
    }

    public void validateLogedUser(String userName){
        String loggedUser = driver.findElement(loggedUserName).getText();
        Assert.assertEquals(loggedUser, userName, "Incorrect User Name in User Information");
    }

    public void validateCareCenter(String givenCareCenter, String careCenterInForm){
        Assert.assertEquals(careCenterInForm, givenCareCenter, "Care Center in the form is different to given care center");
    }

    public void validateBorrower (String[] givenBorrower, String[] borrowerData){
        Assert.assertEquals(givenBorrower[0], borrowerData[0], "The borrower in the form is diffrent to the given borrower");
        Assert.assertEquals(givenBorrower[1], borrowerData[1], "The borrower in the form is diffrent to the given borrower");
        Assert.assertEquals(givenBorrower[2], borrowerData[2], "The borrower in the form is diffrent to the given borrower");
    }


}
