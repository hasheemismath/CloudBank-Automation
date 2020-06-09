package RPC;

import org.openqa.selenium.By;
import utils.UIActions;

public class Interview2Page extends UIActions {

    By loggedUserInfo = By.xpath("//a[@class='nav-link'][@role='button']");
    By nextPageButton = By.id("next-btn-interview2");
    By question1AnswerButton = By.xpath("//*[@id=\"root_businessPlan\"]/div[1]/label[1]/div");
    By question2AnswerButton = By.xpath("//*[@id=\"root_gotALoanFromLocalBank\"]/div[1]/label[2]/div");
    By question3AnswerButton = By.xpath("//*[@id=\"root_question1\"]/div[1]/label[1]");
    By question4AnswerButton = By.xpath("//*[@id=\"root_question2\"]/div[1]/label[1]/div");
    By question5AnswerButton = By.xpath("//*[@id=\"root_question3\"]/div[1]/label[2]");
    By question6AnswerButton = By.xpath("//*[@id=\"root_question4\"]/div[1]/label[1]/div");
    By question7AnswerButton = By.xpath("//*[@id=\"root_question5\"]/div[1]/label[2]/div");
    By question8AnswerButton = By.xpath("//*[@id=\"root_question6\"]/div[1]/label[1]/div");
    By question9AnswerButton = By.xpath("//*[@id=\"root_question7\"]/div[1]/label[2]/div");
    By question10AnswerButton = By.xpath("//*[@id=\"root_question8\"]/div[1]/label[1]/div");
    By question11AnswerButton = By.xpath("//*[@id=\"root_question9\"]/div[1]/label[1]/div");
    By question12AnswerButton = By.xpath("//*[@id=\"root_question10\"]/div[1]/label[2]/div");

    public void fillInterview2Questions(){
        waitForElement(nextPageButton);
        pause(1);
        click(question1AnswerButton);
        click(question2AnswerButton);
        click(question3AnswerButton);
        click(question4AnswerButton);
        click(question5AnswerButton);
        click(question6AnswerButton);
        click(question7AnswerButton);
        click(question8AnswerButton);
        click(question9AnswerButton);
        click(question10AnswerButton);
        click(question11AnswerButton);
        click(question12AnswerButton);
    }

    public BusinessPage navigateToBusinessPage(){
        click(nextPageButton);
        return new BusinessPage();
    }
}
