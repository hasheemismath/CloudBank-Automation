package jumpStart;

import Elements.LoanElements;
import Elements.LoginElements;
import utils.UIActions;

public class DLFPage  extends UIActions implements LoginElements, LoanElements {

    public PersonalInformationPage startApplication(){
        click(consumerProductBtn);
        waitForElement(letsBeginBtn);
        click(letsBeginBtn);
        waitForElement(submitPersonalInfoBtn);
        pause(10);
        return new PersonalInformationPage();
    }
}
