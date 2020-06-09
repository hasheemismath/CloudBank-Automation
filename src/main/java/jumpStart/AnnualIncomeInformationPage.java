package jumpStart;

import Elements.LoanElements;
import org.openqa.selenium.By;
import utils.UIActions;

public class AnnualIncomeInformationPage extends UIActions implements LoanElements {

    double annualIncome = 45000;
    double otherIncome = 0;

    //Income information section
    By annualSalTxt = By.xpath("//*[@id=\"root_salaryInformation_applicantSalarySection_annualSalaryAndBonusOfApplicant\"]/div[1]/input");
    By incomeNextBtn = By.xpath("//*[@id=\"next-btn-incomeInformation\"]");

    public LoanPaymentInformationPage fillAnnualIncomeInfo(){
        waitForElement(incomeNextBtn);
        pause(2);
        //click(annualSalTxt);
        sendKeys(annualSalTxt, "35000");
        click(incomeNextBtn);
        return new LoanPaymentInformationPage();
    }

    public LoanPaymentInformationPage navigateToAnnualInfoPage(){
        waitForElementClickable(incomeNextBtn);
        pause(2);
        click(incomeNextBtn);
        return new LoanPaymentInformationPage();
    }

    public double getAnnualIncome(){
        return annualIncome;
    }

    public double getOtherIncome(){
        return otherIncome;
    }
}
