package jumpStart;

import Elements.LoanElements;
import org.openqa.selenium.By;
import utils.UIActions;

public class LoanPaymentInformationPage extends UIActions implements LoanElements {

    ChildCareInformationPage childCareInformationPage;

    //Loan Payment section
    By loanPaymentNextBtn = By.xpath("//*[@id=\"next-btn-paymentInformation\"]");
    By noReduceBtn = By.xpath("//*[@id=\"root_optAutoPlay\"]/div/div/div[2]/div/div/label");

    public PersonalDocumentsPage fillLoanPaymentInformation(){
        waitForElement(loanPaymentNextBtn);
        pause(2);
        click(noReduceBtn);
        click(loanPaymentNextBtn);
        return new PersonalDocumentsPage();
    }

    public double getMonthlyMinPaymentAmount(){
        childCareInformationPage = new ChildCareInformationPage();
        double careCenterTutionAmount = childCareInformationPage.getCareCenterTutionAmmount();
        double minMonthlyPayment =  careCenterTutionAmount/2;
        System.out.println("Min Mothly Payment Amount = " + minMonthlyPayment);
        return minMonthlyPayment;
    }

    public PersonalDocumentsPage navigateToLoanPaymentInfoPage(){
        waitForElementClickable(loanPaymentNextBtn);
        pause(2);
        click(loanPaymentNextBtn);
        return new PersonalDocumentsPage();
    }
}
