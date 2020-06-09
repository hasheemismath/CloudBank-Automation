package jumpStart;

import Elements.LoanElements;
import utils.UIActions;

public class UnsuccessfulPersonalInfoSubmitPage extends UIActions implements LoanElements {

    public PersonalInformationPage tryAgainFunctionality()
    {
        waitForElement(tryAgainBtn);
        click(tryAgainBtn);
        return new PersonalInformationPage();
    }

    public void ExitFunctionality()
    {
        waitForElement(exitBtn);
        click(exitBtn);
    }
}
