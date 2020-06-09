package RPC;

import org.openqa.selenium.By;
import utils.UIActions;

public class ApplyForNewProductPage extends UIActions {

    By corporateApplicationBtn = By.xpath("//*[@id=\"business\"]/div/div[1]/a");
    By partnershipApplicationBtn = By.xpath("//*[@id=\"business\"]/div/div[2]/a");
    By soleProprietorApplicationBtn = By.xpath("//h4[text()=\"Sole Proprietor Application\"]");
    By letsBeginBtn = By.xpath("//*[text()=\"Let's Begin \"]");

    public void clickCorporateApplication(){
        switchTab(1);
        waitForElement(corporateApplicationBtn);
        click(corporateApplicationBtn);
    }

    public void clickPartnershipApplication(){
        switchTab(1);
        waitForElement(partnershipApplicationBtn);
        click(partnershipApplicationBtn);
    }

    public void clickSoleProprietorApplication(){
        switchTab(1);
        waitForElement(partnershipApplicationBtn);
        click(soleProprietorApplicationBtn);
    }

    public LoanDetailsPage clickLetsBeginInSplashPage(){
        waitForElement(letsBeginBtn);
        pause(2);
        click(letsBeginBtn);
        return new LoanDetailsPage();
    }
}
