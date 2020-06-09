package RPC;

import org.openqa.selenium.By;
import utils.UIActions;
public class BankerHomePage extends UIActions {

    DLFPage dlfPage;

    By digitalApplicationLabel = By.xpath("//*[@id=\"mainNav\"]/li[2]/a");
    By openDigitalApplications = By.xpath("//*[@id=\"mainNav\"]/li[2]/div/a[1]");
    By closedDigitalApplications = By.xpath("//*[@id=\"mainNav\"]/li[2]/div/a[2]");

    By createdDateSort = By.xpath("//*[@id=\"wr-dlf\"]/div/div[1]/div/div/div/div/div[1]/div[1]/table/thead/tr/th[6]/span/span[2]/span");
    By firstDLFID = By.xpath("//*[@id=\"wr-dlf\"]/div/div[1]/div/div/div/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/a");

    public void navigateToOpenDigitalApplications(){
        waitForPageLoad();
        waitForElementClickable(digitalApplicationLabel);
        pause(5);
        click(digitalApplicationLabel);
        click(openDigitalApplications);
    }

    public void navigateToClosedDigitalApplications(){
        waitForPageLoad();
        click(digitalApplicationLabel);
        click(closedDigitalApplications);
    }

    public DLFPage selectLatestDLF(){
        waitForPageLoad();
        waitForElementClickable(createdDateSort);
        pause(5);
        click(createdDateSort);
        waitForElementClickable(firstDLFID);
        click(firstDLFID);
        return new DLFPage();
    }

}
