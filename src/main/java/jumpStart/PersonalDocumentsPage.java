package jumpStart;

import Elements.LoanElements;
import org.openqa.selenium.By;
import utils.UIActions;

public class PersonalDocumentsPage extends UIActions implements LoanElements {

    //Personal Documents
    By personalDocsNexBtn = By.xpath("//*[@id=\"next-btn-personalDocumentsInfo\"]");

    public SubmitDLFPage fillPersonalDocs(){
        waitForElement(personalDocsNexBtn);
        pause(2);
        click(personalDocsNexBtn);
        return new SubmitDLFPage();
    }

    public SubmitDLFPage navigateToSubmitDLFPage(){
       waitForElementClickable(personalDocsNexBtn);
       pause(2);
       click(personalDocsNexBtn);
        return new SubmitDLFPage();
    }
}
