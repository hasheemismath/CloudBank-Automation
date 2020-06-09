package Elements;

import org.openqa.selenium.By;

public interface LoanElements {

    By loggedUserName = By.xpath(".//span[@class='float-left']");
    By LoggedUserInfo = By.xpath("//*[@id=\"actionNav\"]/li/a");
    By submitPersonalInfoBtn = By.id("next-btn-identityInformation");

    //Expense information section
    By monthlyExpenseNextBtn = By.xpath("//*[@id=\"next-btn-expenseInformation\"]");
    By monthlyHousePaymentTxt = By.xpath("//*[@id=\"root_monthlyHousingPayment\"]/div[1]/input");
    By monthlyChildSupPaymentTxt = By.xpath("//*[@id=\"root_monthlyChildSupportPayments\"]/div[1]/input");
    By monthlyCarPaymentTxt = By.xpath("//*[@id=\"root_monthlyPaymentsForAllCars\"]/div[1]/input");
    By monthlyCCardPaymentTxt = By.xpath("//*[@id=\"root_monthlyPaymentsTowardCreditCards\"]/div[1]/input");
    By monthlyPLoanPaymentTxt = By.xpath("//*[@id=\"root_monthlyPaymentsTowardPersonalLoans\"]/div[1]/input");
    By monthlySLoanPaymentTxt = By.xpath("//*[@id=\"root_monthlyStudentLoanPayment\"]/div[1]/input");
    By monthlyOtherChildCarePaymentTxt = By.xpath("//*[@id=\"root_monthlyChildCareExpensesForOtherChildren\"]/div[1]/input");

    //Processing page
    By viewFormLink = By.xpath("//*[@id=\"page-content\"]/div/div[1]/div/section/div/div/div/p[3]/a[1]");

    //Incorrect Identity information page
    By tryAgainBtn = By.xpath("//*[@id=\"wr-form\"]/div/div/div/div/div/button[2]");
    By exitBtn = By.xpath("//*[@id=\"wr-form\"]/div/div/div/div/div/button[1]");
    By dlfHeadingTxt = By.xpath("//*[@id=\"page-content\"]/div[1]/main/div/div/div[1]/div/div[1]/h2");
    By unsuccessMsg = By.xpath("//*[@id=\"wr-form\"]/div/div/div/div/div/div/p");

    By careCenter = By.xpath("//*[@id=\"root_careCenterInfo_tutionInfo\"]/div[1]/table/tr[1]/td");
}
