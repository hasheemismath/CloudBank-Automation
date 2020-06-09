package jumpStart;

import org.openqa.selenium.By;
import utils.UIActions;

public class OpenDigitalApplicationsPage extends UIActions {

    By leftMenuAll = By.xpath("//*[@id=\"profile-bar\"]/div[2]/ul/li[1]/a");
    By leftMenuNew = By.xpath("//*[@id=\"profile-bar\"]/div[2]/ul/li[2]/a");
    By leftMenuDraft = By.xpath("//*[@id=\"profile-bar\"]/div[2]/ul/li[3]/a");
    By leftMenuCAReviewing = By.xpath("//*[@id=\"profile-bar\"]/div[2]/ul/li[4]/a");
    By filterBtn = By.xpath("//*[@id=\"page-content\"]/div/main/div[1]/div/div/ul/li[5]/button[1]");
    By resetBtn = By.xpath("//*[@id=\"page-content\"]/div/main/div[1]/div/div/ul/li[5]/button[2]");
    By filterByCode = By.xpath("//*[@id=\"page-content\"]/div/main/div[1]/div/div/ul/li[2]/input");
    By filterByCA = By.xpath("//*[@id=\"page-content\"]/div/main/div[1]/div/div/ul/li[1]/div/div[1]/input");
    By resultId = By.xpath("//*[@id=\"wr-dlf\"]/div/div[1]/div/div/div/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/a");
    By filterByBorrower = By.xpath("//*[@id=\"page-content\"]/div/main/div[1]/div/div/ul/li[4]/div/div[1]/input");
    By filterCarecenter = By.xpath("//*[@id='page-content']/div/main/div[1]/div/div/ul/li[3]/div/div[1]/input");
    By careCenterSearchResult = By.xpath("//*[@id=\"rbt-menu-item-0\"]/a/span/span");
    By borrowerSearchResult = By.xpath("//*[@id=\"rbt-menu-item-0\"]/a/span/span");
    By CASearchResult = By.xpath("//*[@id=\"rbt-menu-item-0\"]/a/span/span");

    public void selectNewFromLeftMenu(){
        click(leftMenuNew);
    }

    public void selectAllFromLeftMenu(){
        waitForElementClickable(leftMenuAll);
        pause(10);
        click(leftMenuAll);
    }

    public void selectDraftFromLeftMenu(){
        waitForElementClickable(leftMenuDraft);
        click(leftMenuDraft);
    }

    public void selectCAReviewingFromLeftMenu(){
        waitForElementClickable(leftMenuCAReviewing);
        click(leftMenuCAReviewing);
    }

    public void selectAfterSearchDLFByCode(String id) {
        waitForElementClickable(filterBtn);
        sendKeys(filterBtn, id);
        click(filterBtn);
        pause(3);
        waitForElementClickable(resultId);
        pause(2);
        click(resultId);
    }

    public void filterByCareCenter(String careCenterName){
        waitForElementClickable(filterCarecenter);
        sendKeys(filterCarecenter, careCenterName);
        waitForElementClickable(careCenterSearchResult);
        click(careCenterSearchResult);
        click(filterBtn);
        waitForElementClickable(resultId);
        pause(10);
        click(resultId);
    }

    public void filterByCode(String code){
        waitForElementClickable(filterByCode);
        sendKeys(filterByCode, code);
        click(filterBtn);
        waitForElementClickable(resultId);
        pause(3);
        click(resultId);
    }

    public void filterByCA(String caName){
        waitForElementClickable(filterByCA);
        sendKeys(filterByCA, caName);
        waitForElementClickable(borrowerSearchResult);
        click(borrowerSearchResult);
        click(filterBtn);
        waitForElementClickable(resultId);
        pause(2);
        click(resultId);
    }

    public void filterByBorrower(String borrowerName){
        waitForElementClickable(filterByBorrower);
        sendKeys(filterByBorrower, borrowerName);
        waitForElementClickable(CASearchResult);
        click(CASearchResult);
        click(filterBtn);
        waitForElementClickable(resultId);
        pause(5);
        click(resultId);
    }

    public void resetSearch(){
        waitForElementClickable(resetBtn);
        click(resetBtn);
    }

}
