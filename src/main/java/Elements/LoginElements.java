package Elements;

import org.openqa.selenium.By;

public interface LoginElements {

    //Borrower Login
    By LoginEmail = By.name("login.username");
    By firstName = By.name("model.firstName");
    By lastName = By.name("model.lastName");
    By LoginPassword =By.name("login.password") ;
    By LoginBtn = By.xpath("//*[@id=\"register-form\"]/div[3]/div/button");
    By ErrorMessage = By.xpath(".//div[@class='has-error']");
    By forgotPassowordLink = By.xpath("//a[text()=\"Forgot Password\"]");

    //Forgot Password
    By requestPasswordResetBtn = By.xpath("//button[text()=\"Request Password Reset\"]");
    By forgotPasswordEmail = By.xpath("//*[@id=\"root\"]/div/div/main/div/div/div/div/div[2]/div/div/form/div[1]/input");
    //Reset Password
    By verificationCodeTxt = By.name("resetPassword.verificationCode");
    By newPasswordTxt = By.name("resetPassword.newPassword");
    By confirmNewPasswordTxt = By.name("resetPassword.confirmPassword");
    By resetPasswordBtn = By.xpath("//button[text()=\"Reset Password\"]");

    //loan selection
    By ApplyNewProdBtn = By.xpath("//*[@id=\"mainNav\"]/li[3]/a");
    By AutoLoanbtn = By.xpath("//*[@id=\"consumer\"]/div/div[1]/a/div[1]/table/tr/td[2]/div/p");
    By PopupBtn = By.xpath("/html/body/div[2]/div/div[1]/div/div/div[3]/button");
    By Amountbtn = By.xpath("//*[@id=\"root_amount\"]/div[1]/div/div/div[2]/div[2]");
    By VehicleTypeBtn = By.xpath("//*[@id=\"root_vehicleType\"]/div[1]/label[2]/span");
    By purchaseFromBtn = By.xpath("//*[@id=\"root_purchaseFrom\"]/div[1]/label[2]/span");
    By CustomizeNextBtn = By.id("next-btn-productInfo");
    By PersonalInfoNextBtn = By.xpath("//*[@id='next-btn-personal']");

    By consumerProductBtn = By.xpath("//*[@id='consumer']/div/div/a");
    By letsBeginBtn = By.xpath("/html/body/div[2]/div/div[1]/div/div/div[3]/button");
    By HomeSelector = By.xpath("//*[@id='wr-form']/div/div/div/div/form/div[7]/div[1]/div/label[3]/input");

    By registerLink = By.xpath("//*[@id=\"root\"]/div/div/main/div/div/div/div[1]/div/div[2]/a");

    //Banker Login
    By mfaUpdateBtn = By.xpath("/html/body/div/div[7]/button");
    By codeRecieved = By.xpath("//*[@id=\"msgtbl\"]/div[3]/div[1]/div[1]");
    By codeRecievedTime = By.xpath("//*[@id=\"msgtbl\"]/div[3]/div[2]");
    By mfaCodeText = By.xpath("//*[@id=\"msgtbl\"]/div[3]/div[3]/span");
    By verifictionTextBox = By.xpath("//*[@id=\"register-form\"]/div[1]/input");
    By verifyButton = By.xpath("//*[@id=\"register-form\"]/div[2]/div/button");
}
