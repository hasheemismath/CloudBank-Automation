package jumpStart;

import Elements.LoanElements;
import utils.UIActions;

public class MonthlyExpensesInformationPage extends UIActions implements LoanElements {

    double personalLoans = 1500.0;
    double carPayValue = 2500.0;
    double creditCardPayValue = 2500.0;

    public LoanPaymentInformationPage fillMonthlyIncomeInfo(){
        waitForElement(monthlyExpenseNextBtn);
        pause(2);
        clear(monthlyHousePaymentTxt);
        sendKeys(monthlyHousePaymentTxt,"4500");
        clear(monthlyChildSupPaymentTxt);
        sendKeys(monthlyChildSupPaymentTxt,"1500");
        clear(monthlyPLoanPaymentTxt);
        sendKeys(monthlyPLoanPaymentTxt,"1500");
        clear(monthlyPLoanPaymentTxt);
        sendKeys(monthlyCarPaymentTxt, "2500");
        clear(monthlyPLoanPaymentTxt);
        sendKeys(monthlyCCardPaymentTxt, "2500");
        click(monthlyExpenseNextBtn);
        return new LoanPaymentInformationPage();
    }

    public double getChildSupPayValue(){
        return personalLoans;
    }

    public double getCarPayValue(){
        return carPayValue;
    }

    public double getCreditCardPayValue(){
        return creditCardPayValue;
    }

    public LoanPaymentInformationPage navigateToExpenseInfoPage(){
        waitForElementClickable(monthlyExpenseNextBtn);
        pause(2);
        click(monthlyExpenseNextBtn);
        return new LoanPaymentInformationPage();
    }
}
