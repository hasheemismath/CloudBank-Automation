package mainProduct;

import Elements.LoginElements;
import utils.UIActions;

public class SelectLoginPage extends UIActions implements LoginElements {

    public void applyForAutoLoan(){
        waitForPageLoad();
        click(AutoLoanbtn);
        click(PopupBtn);
        waitForPageLoad();
        pause(5);
        Action_Drag_and_DropByCoordinates( Amountbtn, 359, 564);
        click(VehicleTypeBtn);
        click(purchaseFromBtn);
        click(CustomizeNextBtn);
      //  waitForPageLoad();
       // click(PersonalInfoNextBtn);
    }

}
