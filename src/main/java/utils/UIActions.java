package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.ArrayList;


public class UIActions {

    static WebDriver driver = Utils.getInstance().getDriver();
    public String errorMessage = "no such element exception: ";
    JavascriptExecutor js = (JavascriptExecutor) driver;

    public void fail(String errorMessage) {
        System.out.println("[-FAILED BECAUSE OF] " + errorMessage);
      //  Assert.assertTrue(false);
    }

    public void pause(int seconds) {

        try {
            Thread.sleep(seconds * 1000);
        } catch (Exception e) {
        }
    }

    public void waitForPageLoad() {
        ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString()
                        .equals("complete");
            }
        };
        try {
            pause(1);
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(expectation);
        } catch (Throwable error) {
            fail(errorMessage + error);
        }
    }
    public void sendKeys(By element, String input) {
        try {
            waitForPageLoad();
            WebElement sendKeys = driver.findElement(element);
            sendKeys.sendKeys(input);
        } catch (NoSuchElementException e) {
            fail(errorMessage + element);
        }
    }

    public void clear(By element) {
        try {
            waitForPageLoad();
            driver.findElement(element).click();
            driver.findElement(element).sendKeys(Keys.chord(Keys.CONTROL,"a"));
        } catch (NoSuchElementException e) {
            fail(errorMessage + element);
        }
    }

    public void updateValueUsingXpath(By element, String value){
        driver.findElement(element).sendKeys(value);
    }

    public void setDropDownValue(By element, String value) {
        Select licenseState = new Select(driver.findElement(element));
        licenseState.selectByVisibleText(value);
     }

    public void click(By element) {
        try {
            waitForPageLoad();
            waitForElement(element);
            driver.findElement(element).click();
        } catch (NoSuchElementException exception) {
            fail(errorMessage + element);
        }
    }

    public void Action_Drag_and_DropByCoordinates(By fromElement, int a, int b) {
        try {
            WebElement from = driver.findElement(fromElement);
            Actions action = new Actions(driver);
            Action draganddrop = action.dragAndDropBy(from, a, b).build();
            draganddrop.perform();
        } catch (NoSuchElementException exception) {
            fail(errorMessage + fromElement);
        }
    }

    public void waitForElement(By element ){
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public void waitForElementVisible(WebElement element ){
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForElementClickable(By element ){
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void createANewTab(){
        ((JavascriptExecutor) driver).executeScript("window.open('about:blank','_blank');");
    }

    public void verifyErrorMessageText(By element, String errorMessage){
        //wait until error message display
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));

        //verify the error message
        WebElement errorMsg = driver.findElement(element);
        System.out.println(errorMsg.getText());
        Assert.assertEquals(errorMsg.getText(), errorMessage);

    }

    public String getText(By element){
        String text = driver.findElement(element).getText();
        return text;
    }

    public String getValue(By element){
        String text = driver.findElement(element).getAttribute("value");
        return text;
    }

    public boolean isElementPresent(By element){
        boolean result = driver.findElement(element).isDisplayed();
        return result;
    }

    public void switchTab(int tabID){
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabID));
    }

}
