package RPC;

import org.openqa.selenium.By;
import org.testng.Assert;
import utils.UIActions;

public class MyDigitalApplicationsPage extends UIActions {

    By loggedUserInfo = By.xpath("//a[@class='nav-link'][@role='button']");
    By applyNewProduct = By.xpath("//*[@id=\"mainNav\"]/li[3]/a");

    public void validateSuccessfulBorrowerLogin(){
        waitForPageLoad();
        waitForElementClickable(applyNewProduct);
        boolean elementStatus = isElementPresent(loggedUserInfo);
        Assert.assertEquals(elementStatus, true, "Borrower Login error!!!");
    }

    public ApplyForNewProductPage clickApplyForNewProduct(){
        waitForElementClickable(applyNewProduct);
        pause(5);
        click(applyNewProduct);
        return new ApplyForNewProductPage();
    }
}
