package RPC;

import org.openqa.selenium.By;
import utils.UIActions;

public class Interview1Page extends UIActions {

    By loggedUserInfo = By.xpath("//a[@class='nav-link'][@role='button']");
    By nextPageButton = By.id("next-btn-interview1");
    By question1AnswerTextfield = By.xpath("//*[@id=\"root_inclusionPartOfBusiness\"]/div[1]/textarea");
    By question2AnswerTextfield = By.xpath("//*[@id=\"root_purpose\"]/div[1]/textarea");
    By question3AnswerTextfield = By.xpath("//*[@id=\"root_impactOnFamilly\"]/div[1]/textarea");
    By question4AnswerTextfield = By.xpath("//*[@id=\"root_positiveImpact\"]/div[1]/textarea");
    By question5AnswerTextfield = By.xpath("//*[@id=\"root_currentSourceOfIncome\"]/div[1]/textarea");
    By question6AnswerTextfield = By.xpath("//*[@id=\"root_noOfJobs\"]/div[1]/textarea");

    public void fillInterview1Questions(){
        waitForElement(nextPageButton);
        pause(1);
        sendKeys(question1AnswerTextfield, "Test Answer 1");
        sendKeys(question2AnswerTextfield, "Test Answer 2");
        sendKeys(question3AnswerTextfield, "Test Answer 3");
        sendKeys(question4AnswerTextfield, "Test Answer 4");
        sendKeys(question5AnswerTextfield, "Test Answer 5");
        sendKeys(question6AnswerTextfield, "Test Answer 6");
    }

    public Interview2Page navigateToInterview2Page(){
        click(nextPageButton);
        return new Interview2Page();
    }
}
