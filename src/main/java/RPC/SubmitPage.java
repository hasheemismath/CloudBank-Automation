package RPC;

import org.openqa.selenium.By;
import utils.UIActions;

public class SubmitPage extends UIActions {

    By loggedUserInfo = By.id("//a[@class='nav-link'][@role='button']");
    By submitBtn = By.xpath("//*[@type=\"submit\"]");
    By phoneCheckBox = By.xpath("//*[@id=\"page-content\"]/div/main/div/div/div/section/form/div[1]/label[2]/span[1]");
    By grandRapidsCheckBox = By.xpath("//*[@id=\"page-content\"]/div/main/div/div/div/section/form/div[1]/label[4]/span[1]");
    By iConfirmCheckBox = By.xpath("//*[@id=\"page-content\"]/div/main/div/div/div/section/form/div[1]/label[5]/span[1]");
    By cancelBtn = By.xpath("//*[@id=\"page-content\"]/div/main/div/div/div/section/form/div[2]/a");

    public ProcessingPage navigateToProcessingPage(){
        waitForElementClickable(cancelBtn);
        pause(2);
        click(phoneCheckBox);
        click(grandRapidsCheckBox);
        click(iConfirmCheckBox);
        click(submitBtn);
        return new ProcessingPage();
    }

}
