package RPC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.UIActions;
import utils.Utils;

public class LoanDetailsPage extends UIActions {

    static WebDriver driver = Utils.getInstance().getDriver();

    By contactBankBtn = By.xpath("//*[text()=\"Contact Bank\"]");
    By nextPageBtn = By.id("next-btn-loanAmount");
    By loanAmountSlider = By.xpath("//*[@id=\"root_amount\"]/div[1]/div/div/div[2]/div[2]");
//    By loanAmountSlider = By.xpath("//*[@id=\"root_amount\"]/div[1]/div/div/div[2]");
    By letsBeginBtn = By.xpath("//*[text()=\"Let's Begin \"]");
    By dlfHeadingTxt = By.xpath("//*[@id=\"page-content\"]/div[1]/main/div/div/div[1]/div/div[1]/h2");

    public void clickContactBankButton(){
        waitForElement(contactBankBtn);
        click(contactBankBtn);
    }

    public Interview1Page navigateToInterview1Page(){
        waitForElement(nextPageBtn);
        pause(2);
        click(nextPageBtn);
        return new Interview1Page();
    }

    public void changeLoanAmount(int a, int b){
        waitForElement(loanAmountSlider);
        pause(2);
        Action_Drag_and_DropByCoordinates(loanAmountSlider, a, b);
    }

    public void getDLFIdFromURL(){
        waitForElement(dlfHeadingTxt);
        pause(2);
        String heading = driver.findElement(dlfHeadingTxt).getText();
        String splitFromName[] = heading.split("#");
       // String firstHalf[] = splitFromName[1].split("Digital Application #");
        String id = splitFromName[1].trim();
        System.out.println("DLF ID : " + id);
    }
}
