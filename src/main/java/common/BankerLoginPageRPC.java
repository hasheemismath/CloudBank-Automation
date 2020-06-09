package common;

import RPC.DLFPage;
import RPC.MyDigitalApplicationsPage;
import org.openqa.selenium.By;
import utils.UIActions;

public class BankerLoginPageRPC extends UIActions {

    By emailTxtBox = By.xpath("//*[@id=\"register-form\"]/div[1]/input");
    By passwordTxtBox = By.xpath("//*[@id=\"register-form\"]/div[2]/input");
    By loginBtn = By.xpath("//*[@id=\"register-form\"]/div[3]/div/button");

    public void loginToBanker(String email){
        sendKeys(emailTxtBox, email);
        sendKeys(passwordTxtBox,"Qwerty1!");
        click(loginBtn);
    }
}