package jumpStart;

import Elements.LoanElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.UIActions;
import utils.Utils;

import java.text.DecimalFormat;

public class AutoDecisionPage extends UIActions implements LoanElements {

    DecimalFormat two = new DecimalFormat("0.00");
    static WebDriver driver = Utils.getInstance().getDriver();

    By selfReportedDTIElement = By.xpath("//*[@id=\"auto-decision-tab\"]/div/div/div[4]/div/div/div/table/tbody/tr[33]/td[2]");
    By ficoElement = By.xpath("//*[@id='auto-decision-tab']/div/div/div[4]/div/div/div/table/tbody/tr[4]/td[2]");
    By totalIncomeElement = By.xpath("//*[@id='auto-decision-tab']/div/div/div[4]/div/div/div/table/tbody/tr[17]/td[2]");
    By monthsSinceMostRecentInquiryElement = By.xpath("//*[@id='auto-decision-tab']/div/div/div[4]/div/div/div/table/tbody/tr[18]/td[2]");
    By accountsOpenedInLast24MonthsElement = By.xpath("//*[@id='auto-decision-tab']/div/div/div[4]/div/div/div/table/tbody/tr[19]/td[2]");
    By mortgageIndicatorElement = By.xpath("//*[@id='auto-decision-tab']/div/div/div[4]/div/div/div/table/tbody/tr[20]/td[2]");
    By consumerDerivedDebtElement = By.xpath("//*[@id='auto-decision-tab']/div/div/div[4]/div/div/div/table/tbody/tr[27]/td[2]");
    By earliestTradeLineElement = By.xpath("//*[@id='auto-decision-tab']/div/div/div[4]/div/div/div/table/tbody/tr[12]/td[2]");
    By calculationOneElement = By.xpath("//*[@id=\"auto-decision-tab\"]/div/div/div[4]/div/div/div/table/tbody/tr[28]/td[2]");
    By calculationTwoElement = By.xpath("//*[@id='auto-decision-tab']/div/div/div[4]/div/div/div/table/tbody/tr[29]/td[2]");
    By centennialScoreElement = By.xpath("//*[@id='auto-decision-tab']/div/div/div[4]/div/div/div/table/tbody/tr[30]/td[2]");
    By autoDecisionStatusElement = By.xpath("//*[@id=\"dlf-bar\"]/div/div/div/span");

    MonthlyExpensesInformationPage monthlyExpensesInformationPage;
    LoanPaymentInformationPage loanPaymentInformationPage;
    AnnualIncomeInformationPage annualIncomeInformationPage;

    public String calcSelfReportedDTI(){
        double valSelfReportedDTI;

        monthlyExpensesInformationPage = new MonthlyExpensesInformationPage();
        double creditCardPayValue = monthlyExpensesInformationPage.getCreditCardPayValue();
        double carPayValue = monthlyExpensesInformationPage.getCarPayValue();
        double childSupPayValue = monthlyExpensesInformationPage.getChildSupPayValue();

        loanPaymentInformationPage = new LoanPaymentInformationPage();
        double minMonthlyPayment = loanPaymentInformationPage.getMonthlyMinPaymentAmount();

        annualIncomeInformationPage = new AnnualIncomeInformationPage();
        double annualIncome = annualIncomeInformationPage.getAnnualIncome();
        double otherIncome = annualIncomeInformationPage.getOtherIncome();
        double totIncome = annualIncome + otherIncome;
        System.out.println("Total income : " + totIncome);

        double selfReportedDebtService;
        selfReportedDebtService = (creditCardPayValue + carPayValue + childSupPayValue + minMonthlyPayment);
        System.out.println("Self reported Debt Service amount : " + selfReportedDebtService);
        valSelfReportedDTI = selfReportedDebtService/totIncome;
        String selfReportedDTIFormat = two.format(valSelfReportedDTI);
        System.out.println("Self Reported DTI = " + selfReportedDTIFormat);
        return selfReportedDTIFormat;
    }

    public void validateSelfReportedDTI(){
        String ActualVal = driver.findElement(selfReportedDTIElement).getText();
        String ExpValue = calcSelfReportedDTI();
        Assert.assertEquals(ActualVal, ExpValue, "Unexpected Self Reported DTI value!!!");
    }

    public double calculationOne() {
        double calculationOne;
        double fico;
        double total_income_i;
        double mo_recent_inq_i;
        double acc_24_i;
        double mort_acc_i;
        double dti;
        double tenure;

        fico = Double.parseDouble(driver.findElement(ficoElement).getText());
        total_income_i = Double.parseDouble(driver.findElement(totalIncomeElement).getText());
        mo_recent_inq_i = Double.parseDouble(driver.findElement(monthsSinceMostRecentInquiryElement).getText());
        acc_24_i = Double.parseDouble(driver.findElement(accountsOpenedInLast24MonthsElement).getText());
        mort_acc_i = Double.parseDouble(driver.findElement(mortgageIndicatorElement).getText());
        dti = Double.parseDouble(driver.findElement(consumerDerivedDebtElement).getText());
        tenure = Double.parseDouble(driver.findElement(earliestTradeLineElement).getText());

        calculationOne = (2.563859000 - (fico * 0.007892989) - (total_income_i * 0.000001528) - (mo_recent_inq_i * 0.029793620) + (acc_24_i * 0.051828540) - (mort_acc_i * 0.193104600) + (dti * 0.510091500)
                                    - (tenure * 0.012118120));
        return calculationOne;
    }

    public String formatCalculationOne() {

        double calculationOne = calculationOne();

        String calculationOneFormat = Double.toString(calculationOne);

        //Display calculation One Answer
        System.out.println("Calculation One value = " + calculationOneFormat);
        return calculationOneFormat;
    }

    public void validateCalculationOne(){
        waitForElement(calculationOneElement);
        String ActualVal = driver.findElement(calculationOneElement).getText();
        String ExpValue = formatCalculationOne();
        Assert.assertEquals(ActualVal, ExpValue, "Incorrect Calculation One value!!!");
    }

    public double calculationTwo() {
        double calculationOneValue;
        double calculationTwo;
        double calculationTwoStepOne;
        double calculationTwoStepTwo;
        double calculationTwoStepThree;

        calculationOneValue = calculationOne();
        calculationTwoStepOne = calculationOneValue*(-1);
        System.out.println("Calculation Two Step One : " + calculationOneValue);

        calculationTwoStepTwo = Math.exp(calculationTwoStepOne);
        System.out.println("Calculation Two Step Two : " + calculationTwoStepTwo);

        calculationTwoStepThree = 1 + calculationTwoStepTwo;
        System.out.println("Calculation Two Step Three : " + calculationTwoStepThree);

        calculationTwo = 1/(calculationTwoStepThree);
        System.out.println("Calculation Two value : " + calculationTwo);

        return calculationTwo;
    }

    public String formatCalculationTwo() {
        double calculationTwo = calculationTwo();

        String calculationTwoFormat = Double.toString(calculationTwo);

        //Display calculation Two Answer
        System.out.println("Calculation Two value = " + calculationTwoFormat);
        return calculationTwoFormat;
    }

    public void validateCalculationTwo(){
        String ActualVal = driver.findElement(calculationTwoElement).getText();
        String ExpValue = formatCalculationTwo();
        Assert.assertEquals(ActualVal, ExpValue, "Incorrect Calculation Two value!!!");
    }

    public double centennialCalculation() {
        double calculationTwoValue;
        double centennialCalculation;

        calculationTwoValue = calculationTwo();
        centennialCalculation = calculationTwoValue*500;
        System.out.println("Centennial Calculation: " + centennialCalculation);

        return centennialCalculation;
    }

    public String formatCentanialCalculation() {
        double centennialScore = centennialCalculation();

        String calculationTwoFormat = two.format(centennialScore);

        //Display calculation Two Answer
        System.out.println("Centennial Calculation: " + calculationTwoFormat);
        return calculationTwoFormat;
    }

    public void validateCentanialCalculation(){
        String ActualVal = driver.findElement(centennialScoreElement).getText();
        String ExpValue = formatCentanialCalculation();
        Assert.assertEquals(ActualVal, ExpValue, "Incorrect Centennial Calculation value!!!");
    }

    public void validateAutoDecisionStatus(String autoDecisionStatus){
        refreshPage();
        pause(5);
        waitForElement(autoDecisionStatusElement);
        pause(5);
        String ActualVal = driver.findElement(autoDecisionStatusElement).getText();
        String ExpValue = autoDecisionStatus;
        Assert.assertEquals(ActualVal, ExpValue, "Incorrect Centennial Calculation value!!!");
    }

    public void refreshPage(){
        driver.navigate().refresh();
    }
}
