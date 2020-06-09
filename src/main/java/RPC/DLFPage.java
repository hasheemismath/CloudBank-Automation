package RPC;

import org.openqa.selenium.By;
import utils.UIActions;

public class DLFPage extends UIActions {

    By actionsTab = By.xpath("//*[@id=\"dlf-bar\"]/div/ul/li[6]/a");
    By approveBtn = By.xpath("//*[@id=\"tab-actions\"]/div/div/div/section/button[1]");
    By declineBtn = By.xpath("//*[@id=\"tab-actions\"]/div/div/div/section/button[2]");
    By reopenBtn = By.xpath("//*[@id=\"tab-actions\"]/div/div/div/section/div/div/button");

    By loanAmtField = By.xpath("//*[@id=\"tab-actions\"]/div/div/div/section/div[2]/form/div[1]/div/table[1]/tbody/tr[2]/td[1]/div/input");
    By termField = By.xpath("//*[@id=\"tab-actions\"]/div/div/div/section/div[2]/form/div[1]/div/table[1]/tbody/tr[2]/td[2]/div/input");
    By closingFeeField = By.xpath("//*[@id=\"tab-actions\"]/div/div/div/section/div[2]/form/div[1]/div/table[1]/tbody/tr[2]/td[3]/div[1]/input");
    By firstYearRateField = By.xpath("//*[@id=\"tab-actions\"]/div/div/div/section/div[2]/form/div[1]/div/table[2]/tbody/tr[2]/td[1]/div/input");
    By monthlyPaymentField = By.xpath("//*[@id=\"tab-actions\"]/div/div/div/section/div[2]/form/div[1]/div/table[2]/tbody/tr[2]/td[2]/div/input");
    By remainingTermRateField = By.xpath("//*[@id=\"tab-actions\"]/div/div/div/section/div[2]/form/div[1]/div/table[2]/tbody/tr[2]/td[3]/div/input");
    By monthlyPay2Field = By.xpath("//*[@id=\"tab-actions\"]/div/div/div/section/div[2]/form/div[1]/div/table[2]/tbody/tr[2]/td[4]/div/input");

    By sendLOIBtn = By.xpath("//*[@id=\"tab-actions\"]/div/div/div/section/div[2]/form/div[3]/span/button[1]");

    public void approveDLF(){
        waitForPageLoad();
        waitForElementClickable(actionsTab);
        pause(3);
        click(actionsTab);
        waitForElementClickable(approveBtn);
        click(approveBtn);
    }

    public void declineDLF(){
        waitForPageLoad();
        click(actionsTab);
        waitForElementClickable(declineBtn);
        click(declineBtn);
    }

    public void reopenDLF(){
        waitForPageLoad();
        click(actionsTab);
        waitForElementClickable(reopenBtn);
        click(reopenBtn);
    }

    public void sendlLOI(int loanAmt, int term, int closingFee, int firstYearRate, int monthlyPayment, int remainingTermRate, int monthlyPay2){
        waitForElementClickable(loanAmtField);
        sendKeys(loanAmtField, Integer.toString(loanAmt));
        sendKeys(termField, Integer.toString(term));
        sendKeys(closingFeeField, Integer.toString(closingFee));
        sendKeys(firstYearRateField, Integer.toString(firstYearRate));
        sendKeys(monthlyPaymentField, Integer.toString(monthlyPayment));
        sendKeys(remainingTermRateField, Integer.toString(remainingTermRate));
        sendKeys(monthlyPay2Field, Integer.toString(monthlyPay2));
        click(sendLOIBtn);
    }
}
