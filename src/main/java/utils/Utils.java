package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;

public class Utils {

    private WebDriver driver;
    //for soucelab intergration
    public static final String URL = "https://cloudbnq:b27a3141-25e4-40fa-af4b-096d700387e5@ondemand.saucelabs.com:443/wd/hub";

    private static Utils myObj;
    public static Utils getInstance() {
        if (myObj == null) {
            myObj = new Utils();
            return myObj;
        } else {
            return myObj;
        }
    }

    //get the selenium driver
    public WebDriver getDriver() {
        return driver;
    }

    //when selenium opens the browsers it will automatically set the web driver
    private void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public static void setMyObj(Utils myObj) {
        Utils.myObj = myObj;
    }

    public void openBrowser(){

//        sauceLabsConfiguration();
        localWebdriverConfiguration();

//        DesiredCapabilities caps = DesiredCapabilities.chrome();
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--disable-notifications");
//        options.addArguments("disable-infobars");
//        options.addArguments("test-type");
//        caps.setCapability("platform", "Windows 10");
//        caps.setCapability("version", "latest");
//        caps.setCapability("name", "CloudBank chrome");
//        caps.setCapability("extendedDebugging", "true");
//        caps.setCapability(ChromeOptions.CAPABILITY, options);

//        DesiredCapabilities caps = DesiredCapabilities.safari();
//        caps.setCapability("platform", "macOS 10.14");
//        caps.setCapability("version", "12.0");
//        caps.setCapability("name", "CloudBank safari");
//        caps.setCapability("screenResolution", "2360x1770");

//        EdgeOptions caps = new EdgeOptions();
//        caps.setCapability("platform", "Windows 10");
//        caps.setCapability("version", "42.17134.1.0");
//        caps.setCapability("name", "CloudBnq edge");
//        caps.setCapability("screenResolution", "1024x768");

      /*  FirefoxOptions caps = new FirefoxOptions();
        caps.setCapability("platform", "Windows 10");
        caps.setCapability("version", "67.0");
        caps.setCapability("name", "CloudBnq firefox");
        caps.setCapability("screenResolution", "1024x768");*/

//        try {
//            driver = new RemoteWebDriver(new java.net.URL(URL), caps);
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        }

//        String chromeDriverPath = "C:\\Users\\Aushadhee-PC\\Documents\\AutomationLibraries\\chromedriver_win32\\chromedriver.exe";
//        System.setProperty("webdriver.chrome.driver", chromeDriverPath);


    }

    public void sauceLabsConfiguration(){
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("disable-infobars");
        options.addArguments("test-type");
        caps.setCapability("platform", "Windows 10");
        caps.setCapability("version", "latest");
        caps.setCapability("name", "CloudBank chrome");
        caps.setCapability("extendedDebugging", "true");
        caps.setCapability(ChromeOptions.CAPABILITY, options);

        try {
            driver = new RemoteWebDriver(new java.net.URL(URL), caps);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public void localWebdriverConfiguration(){
        PropertyFileReader propertyFileReader = new PropertyFileReader();
        String chromeDriver = propertyFileReader.getProperty("JSFconfig", "chromeDriver");
        System.out.println(chromeDriver);
        System.setProperty("webdriver.chrome.driver", chromeDriver);
        ChromeOptions options1 = new ChromeOptions();
        options1.addArguments("--disable-notifications");
        options1.addArguments("disable-infobars");
        driver = new ChromeDriver(options1);
        driver.manage().window().maximize();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void navigateToURL(String url) {
            driver.get(url);
    }

    public void closeBrowser() {
        driver.quit();
    }

    public void closeAllBrowsers() {
        driver.close();
    }

    public WebElement waitForElement(By locator, int timeout) {
        WebElement element = new WebDriverWait(Utils.getInstance().getDriver(), timeout).until
                (ExpectedConditions.presenceOfElementLocated(locator));
        return element;
    }
}