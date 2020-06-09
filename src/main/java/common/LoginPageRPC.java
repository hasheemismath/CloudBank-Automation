package common;

import RPC.MyDigitalApplicationsPage;
import org.openqa.selenium.By;
import utils.UIActions;

public class LoginPageRPC extends UIActions {

    By LoginEmail = By.name("login.username");
    By LoginPassword = By.name("login.password");
    By LoginBtn = By.xpath("//*[@type=\"submit\"]");

    private void loginAs(String user, String pass) {
        sendKeys(LoginEmail, user);
        sendKeys(LoginPassword, pass);
        click(LoginBtn);
    }

    public MyDigitalApplicationsPage borrowerLogin(String user, String pass){
        loginAs(user,pass);
        return new MyDigitalApplicationsPage();
    }


}