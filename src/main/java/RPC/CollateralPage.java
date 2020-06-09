package RPC;

import org.openqa.selenium.By;
import utils.UIActions;

public class CollateralPage extends UIActions {

    By loggedUserInfo = By.xpath("//a[@class='nav-link'][@role='button']");
    By nextPageButton = By.id("next-btn-realEstate");
    By CollateralSectionNavigation = By.xpath("//*[@id=\"progress\"]/div[6]/div/span");
    By selectCollateralMenu = By.xpath("//select[@id=\"collateraltypeSelect\"]");
    By addCollateralTypeBtn = By.xpath("//*[@id=\"tab-root_realEstate-array-field\"]/div[1]/div[3]/div/div/button");

    //Furniture, Fixtures and Equipment to be Purchased
    By furnitureToBePurchasedSectionTab = By.xpath("//*[@id=\"tab-root_realEstate-array-field\"]/div[2]/div[1]/ul[1]/li[1]/a");
    By furnitureToBePurchasedYesBtn = By.xpath("//*[@id=\"root_realEstate_0_vehicleCondition_conditionSection_condition\"]/div[1]/label[1]");
    By furnitureToBePurchasedNoBtn = By.xpath("//*[@id=\"root_realEstate_0_vehicleCondition_conditionSection_condition\"]/div[1]/label[2]");
    By furnitureToBePurchasedMarketValue = By.xpath("//*[@id=\"undefined_0_marketValue\"]/div[1]/input");
    By furnitureToBePurchasedDescription = By.xpath("//input[@id=\"undefined_0_descriptionwrap_description2\"]");

    //Furniture, Fixtures and Equipment Owned
    By furnitureOwnedSectionTab = By.xpath("//*[@id=\"tab-root_realEstate-array-field\"]/div[2]/div[1]/ul[1]/li[2]/a");
    By furnitureOwnedYesBtn = By.xpath("//*[@id=\"root_realEstate_1_vehicleCondition_conditionSection_condition\"]/div[1]/label[1]");
    By furnitureOwnedNoBtn = By.xpath("//*[@id=\"root_realEstate_1_vehicleCondition_conditionSection_condition\"]/div[1]/label[2]");
    By furnitureOwnedMarketValue = By.xpath("//*[@id=\"root_realEstate_1_vehicleCondition_conditionSection\"]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[2]/div/div/div/div/input");
    By furnitureOwnedDescription = By.xpath("//*[@id=\"root_realEstate_1_vehicleCondition_conditionSection\"]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/input");

    //Commercial Real Estate to be Purchased
    By commercialRealEstatePurchasedSectionTab = By.xpath("//*[@id=\"tab-root_realEstate-array-field\"]/div[2]/div[1]/ul[1]/li[3]/a");
    By commercialRealEstatePurchasedYesBtn = By.xpath("//*[@id=\"root_realEstate_2_vehicleCondition_conditionSection_condition\"]/div[1]/label[1]");
    By commercialRealEstatePurchasedNoBtn = By.xpath("//*[@id=\"root_realEstate_2_vehicleCondition_conditionSection_condition\"]/div[1]/label[2]");
    By streetNoTxtCommercial = By.xpath("//input[@id=\"undefined_0_buildingNumber\"]");
    By streetNameCommercial = By.xpath("//input[@id=\"undefined_0_streetName\"]");
    By unitNoTxtCommercial = By.xpath("//input[@id=\"undefined_0_unitNumber\"]");
    By cityTxtCommercial = By.xpath("//input[@id=\"undefined_0_city\"]");
    By stateDropdownCommercial = By.xpath("//*[@id=\"undefined_0_state\"]/select");
    By zipCodeTxtCommercial = By.xpath("//input[@id=\"undefined_0_zipCode\"]");
    By yearAccquiredTxtCommercial = By.xpath("//*[@id=\"undefined_0_yearAcquired\"]/div[1]/input");
    By originalCostTxtCommercial = By.xpath("//*[@id=\"undefined_0_originalCost\"]/div[1]/input");
    By marketCostTxtCommercial = By.xpath("//*[@id=\"root_realEstate_2_vehicleCondition_conditionSection\"]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[2]/div/div/div[9]/div/input");
    By amountOfLienTxtCommercial = By.xpath("//*[@id=\"undefined_0_amountOfLien\"]/div[1]/input");
    By nameOfHolderTxtCommercial = By.xpath("//input[@id=\"undefined_0_firstName\"]");
    By DescriptionTxtCommercial = By.xpath("//*[@id=\"root_realEstate_2_vehicleCondition_conditionSection\"]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[2]/div/div/div[12]/div/div[2]/div/div/div/div/textarea");

    //Commercial Real Estate Owned
    By commercialRealEstateOwnedSectionTab = By.xpath("//*[@id=\"tab-root_realEstate-array-field\"]/div[2]/div[1]/ul[1]/li[4]/a");
    By streetNoTxt = By.xpath("//input[@id=\"root_realEstate_3_vehicleCondition_conditionSection_collateralDetails_0_buildingNumber\"]");
    By streetName = By.xpath("//input[@id=\"root_realEstate_3_vehicleCondition_conditionSection_collateralDetails_0_streetName\"]");
    By unitNoTxt = By.xpath("//input[@id=\"root_realEstate_3_vehicleCondition_conditionSection_collateralDetails_0_unitNumber\"]");
    By cityTxt = By.xpath("//input[@id=\"root_realEstate_3_vehicleCondition_conditionSection_collateralDetails_0_city\"]");
    By stateDropdown = By.xpath("//*[@id=\"root_realEstate_3_vehicleCondition_conditionSection_collateralDetails_0_state\"]/select");
    By zipCodeTxt = By.xpath("//input[@id=\"root_realEstate_3_vehicleCondition_conditionSection_collateralDetails_0_zipCode\"]");
    By yearAccquiredTxt = By.xpath("//*[@id=\"root_realEstate_3_vehicleCondition_conditionSection_collateralDetails_0_yearAcquired\"]/div[1]/input");
    By originalCostTxt = By.xpath("//*[@id=\"root_realEstate_3_vehicleCondition_conditionSection_collateralDetails_0_originalCost\"]/div[1]/input");
    By marketCostTxt = By.xpath("//*[@id=\"root_realEstate_3_vehicleCondition_conditionSection_collateralDetails_0_marketValue\"]/div[1]/input");
    By amountOfLienTxt = By.xpath("//*[@id=\"root_realEstate_3_vehicleCondition_conditionSection_collateralDetails_0_amountOfLien\"]/div[1]/input");
    By nameOfHolderTxt = By.xpath("//input[@id=\"root_realEstate_3_vehicleCondition_conditionSection_collateralDetails_0_firstName\"]");
    By nameOfPropertyOwnerTxt = By.xpath("//input[@id=\"root_realEstate_3_vehicleCondition_conditionSection_collateralDetails_0_ownerName\"]");
    By DescriptionTxt = By.xpath("//*[@id=\"root_realEstate_3_vehicleCondition_conditionSection_collateralDetails_0_descriptionwrap_description\"]/div[1]/textarea");

    //Personal Real Estate Owned
    By personalRealEstateOwnedTab = By.xpath("//*[@id=\"tab-root_realEstate-array-field\"]/div[2]/div[1]/ul[1]/li[5]/a");
    By streetNoTxtPersonal = By.xpath("//input[@id=\"root_realEstate_4_vehicleCondition_conditionSection_collateralDetails_0_buildingNumber\"]");
    By streetNamePersonal = By.xpath("//input[@id=\"root_realEstate_4_vehicleCondition_conditionSection_collateralDetails_0_streetName\"]");
    By unitNoTxtPersonal = By.xpath("//input[@id=\"root_realEstate_4_vehicleCondition_conditionSection_collateralDetails_0_unitNumber\"]");
    By cityTxtPersonal = By.xpath("//input[@id=\"root_realEstate_4_vehicleCondition_conditionSection_collateralDetails_0_city\"]");
    By stateDropdownPersonal = By.xpath("//*[@id=\"root_realEstate_4_vehicleCondition_conditionSection_collateralDetails_0_state\"]/select");
    By zipCodeTxtPersonal = By.xpath("//input[@id=\"root_realEstate_4_vehicleCondition_conditionSection_collateralDetails_0_zipCode\"]");
    By yearAccquiredTxtPersonal = By.xpath("//*[@id=\"root_realEstate_4_vehicleCondition_conditionSection_collateralDetails_0_yearAcquired\"]/div[1]/input");
    By originalCostTxtPersonal = By.xpath("//*[@id=\"root_realEstate_4_vehicleCondition_conditionSection_collateralDetails_0_originalCost\"]/div[1]/input");
    By marketCostTxtPersonal = By.xpath("//*[@id=\"root_realEstate_4_vehicleCondition_conditionSection_collateralDetails_0_marketValue\"]/div[1]/input");
    By amountOfLienTxtPersonal = By.xpath("//*[@id=\"root_realEstate_4_vehicleCondition_conditionSection_collateralDetails_0_amountOfLien\"]/div[1]/input");
    By nameOfHolderTxtPersonal = By.xpath("//input[@id=\"root_realEstate_4_vehicleCondition_conditionSection_collateralDetails_0_firstName\"]");
    By nameOfPropertyOwnerTxtPersonal = By.xpath("//input[@id=\"root_realEstate_4_vehicleCondition_conditionSection_collateralDetails_0_ownerName\"]");
    By DescriptionTxtPersonal = By.xpath("//*[@id=\"root_realEstate_4_vehicleCondition_conditionSection_collateralDetails_0_descriptionwrap_description\"]/div[1]/textarea");

    //Vehicles to be Purchased
    By vehiclesPurchasedSectionTab = By.xpath("//*[@id=\"tab-root_realEstate-array-field\"]/div[2]/div[1]/ul[1]/li[6]/a");
    By vehiclesPurchasedYesBtn = By.xpath("//*[@id=\"root_realEstate_5_vehicleCondition_conditionSection_condition\"]/div[1]/label[1]");
    By vehiclesPurchasedNoBtn = By.xpath("//*[@id=\"root_realEstate_5_vehicleCondition_conditionSection_condition\"]/div[1]/label[2]");
    By vehiclesPurchasedCondition = By.xpath("//*[@id=\"root_realEstate_5_vehicleCondition_conditionSection\"]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[2]/div/div/div/select");
    By vehiclesPurchasedYear = By.xpath("//*[@id=\"root_realEstate_5_vehicleCondition_conditionSection\"]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[2]/div/div/div[2]/div/input");
    By vehiclesPurchasedVin = By.xpath("//*[@id=\"root_realEstate_5_vehicleCondition_conditionSection\"]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[2]/div/div/div[3]/div/input");
    By vehiclesPurchasedMake = By.xpath("//*[@id=\"root_realEstate_5_vehicleCondition_conditionSection\"]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[2]/div/div/div[4]/div/input");
    By vehiclesPurchasedModel = By.xpath("//*[@id=\"root_realEstate_5_vehicleCondition_conditionSection\"]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[2]/div/div/div[5]/div/input");
    By vehiclesPurchasedMileage = By.xpath("//*[@id=\"root_realEstate_5_vehicleCondition_conditionSection\"]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[2]/div/div/div[6]/div/input");
    By vehiclesPurchasedMarketValue = By.xpath("//*[@id=\"root_realEstate_5_vehicleCondition_conditionSection\"]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[2]/div/div/div[7]/div/input");
    By vehiclesPurchasedOwner = By.xpath("//*[@id=\"root_realEstate_5_vehicleCondition_conditionSection\"]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[2]/div/div/div[8]/div/input");
    By vehiclesPurchasedExistingLienYes = By.xpath("//*[@id=\"root_realEstate_5_vehicleCondition_conditionSection\"]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[2]/div/div/div[9]/div/label[1]/div");
    By vehiclesPurchasedExistingLienNo = By.xpath("//*[@id=\"root_realEstate_5_vehicleCondition_conditionSection\"]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[2]/div/div/div[9]/div/label[2]/div");
    By vehiclesPurchasedDescription = By.xpath("//*[@id=\"root_realEstate_5_vehicleCondition_conditionSection\"]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[2]/div/div/div[10]/div/div[2]/div/div/div/div/textarea");

    //Vehicles Owned
    By vehiclesOwnedSectionTab = By.xpath("//*[@id=\"tab-root_realEstate-array-field\"]/div[2]/div[1]/ul[1]/li[7]/a");
    By vehiclesOwnedYesBtn = By.xpath("//*[@id=\"root_realEstate_6_vehicleCondition_conditionSection_condition\"]/div[1]/label[1]");
    By vehiclesOwnedNoBtn = By.xpath("//*[@id=\"root_realEstate_6_vehicleCondition_conditionSection_condition\"]/div[1]/label[2]");
    By vehiclesOwnedCondition = By.xpath("//*[@id=\"root_realEstate_6_vehicleCondition_conditionSection\"]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[2]/div/div/div/select");
    By vehiclesOwnedYear = By.xpath("//*[@id=\"root_realEstate_6_vehicleCondition_conditionSection\"]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[2]/div/div/div[2]/div/input");
    By vehiclesOwnedVin = By.xpath("//*[@id=\"root_realEstate_6_vehicleCondition_conditionSection\"]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[2]/div/div/div[3]/div/input");
    By vehiclesOwnedMake = By.xpath("//*[@id=\"root_realEstate_6_vehicleCondition_conditionSection\"]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[2]/div/div/div[4]/div/input");
    By vehiclesOwnedModel = By.xpath("//*[@id=\"root_realEstate_6_vehicleCondition_conditionSection\"]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[2]/div/div/div[5]/div/input");
    By vehiclesOwnedMileage = By.xpath("//*[@id=\"root_realEstate_6_vehicleCondition_conditionSection\"]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[2]/div/div/div[6]/div/input");
    By vehiclesOwnedMarketValue = By.xpath("//*[@id=\"root_realEstate_6_vehicleCondition_conditionSection\"]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[2]/div/div/div[7]/div/input");
    By vehiclesOwnedOwner = By.xpath("//*[@id=\"root_realEstate_6_vehicleCondition_conditionSection\"]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[2]/div/div/div[8]/div/input");
    By vehiclesOwnedExistingLienYes = By.xpath("//*[@id=\"root_realEstate_6_vehicleCondition_conditionSection\"]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[2]/div/div/div[9]/div/label[1]/div");
    By vehiclesOwnedExistingLienNo = By.xpath("//*[@id=\"root_realEstate_6_vehicleCondition_conditionSection\"]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[2]/div/div/div[9]/div/label[2]/div");
    By vehiclesOwnedDescription = By.xpath("//*[@id=\"root_realEstate_6_vehicleCondition_conditionSection\"]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[2]/div/div/div[10]/div/div[2]/div/div/div/div/textarea");

    //Certificate of Deposit Secured
    By certificateOfDepositSectionTab = By.xpath("//*[@id=\"tab-root_realEstate-array-field\"]/div[2]/div[1]/ul[1]/li[8]/a");
    By certificateOfDepositYesBtn = By.xpath("//*[@id=\"root_realEstate_7_vehicleCondition_conditionSection_condition\"]/div[1]/label[1]");
    By certificateOfDepositNoBtn = By.xpath("//*[@id=\"root_realEstate_7_vehicleCondition_conditionSection_condition\"]/div[1]/label[2]");
    By certificateOfDepositValue = By.xpath("//*[@id=\"root_realEstate_7_vehicleCondition_conditionSection\"]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[2]/div/div/div/div/input");
    By certificateOfDepositExistingLienYes = By.xpath("//*[@id=\"root_realEstate_7_vehicleCondition_conditionSection\"]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[2]/div/div/div[2]/div/label[1]");
    By certificateOfDepositExistingLienNo = By.xpath("//*[@id=\"root_realEstate_7_vehicleCondition_conditionSection\"]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[2]/div/div/div[2]/div/label[2]");
    By certificateOfDepositDescription = By.xpath("//*[@id=\"root_realEstate_7_vehicleCondition_conditionSection\"]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[2]/div/div/div[3]/div/div[2]/div/div/div/div/textarea");

    //Business Insurance Information
    By businessInsuranceSectionTab = By.xpath("//*[@id=\"tab-root_realEstate-array-field\"]/div[2]/div[1]/ul[1]/li[9]/a");
    By businessInsuranceYesBtn = By.xpath("//*[@id=\"root_realEstate_8_vehicleCondition_conditionSection_condition\"]/div[1]/label[1]");
    By businessInsuranceNoBtn = By.xpath("//*[@id=\"root_realEstate_8_vehicleCondition_conditionSection_condition\"]/div[1]/label[2]");
    By businessInsuranceValue = By.xpath("//*[@id=\"root_realEstate_8_vehicleCondition_conditionSection\"]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[2]/div/div/div/div/input");
    By businessInsuranceExistingLienYes = By.xpath("//*[@id=\"root_realEstate_8_vehicleCondition_conditionSection\"]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[2]/div/div/div[2]/div/label[1]");
    By businessInsuranceExistingLienNo = By.xpath("//*[@id=\"root_realEstate_8_vehicleCondition_conditionSection\"]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[2]/div/div/div[2]/div/label[2]");
    By businessInsuranceDescription = By.xpath("//*[@id=\"root_realEstate_8_vehicleCondition_conditionSection\"]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[2]/div/div/div[3]/div/div[2]/div/div/div/div/textarea");

    //Jewelry
    By JewelrySectionTab = By.xpath("//*[@id=\"tab-root_realEstate-array-field\"]/div[2]/div[1]/ul[1]/li[10]/a");
    //*[@id="root_realEstate_0_vehicleCondition_conditionSection_condition"]/div[1]/label[2]
    By JewelryYesBtn = By.xpath("//*[@id=\"root_realEstate_9_vehicleCondition_conditionSection_condition\"]/div[1]/label[1]");
    By JewelryNoBtn = By.xpath("//*[@id=\"root_realEstate_9_vehicleCondition_conditionSection_condition\"]/div[1]/label[2]");//*[@id="root_realEstate_0_vehicleCondition_conditionSection_condition"]/div[1]/label[2]
    By JewelryValue = By.xpath("//*[@id=\"root_realEstate_9_vehicleCondition_conditionSection\"]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[2]/div/div/div/div/input");
    By JewelryExistingLienYes = By.xpath("//*[@id=\"root_realEstate_9_vehicleCondition_conditionSection\"]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[2]/div/div/div[2]/div/label[1]");
    By JewelryExistingLienNo = By.xpath("//*[@id=\"root_realEstate_9_vehicleCondition_conditionSection\"]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[2]/div/div/div[2]/div/label[2]");
    By JewelryDDescription = By.xpath("//*[@id=\"root_realEstate_9_vehicleCondition_conditionSection\"]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[2]/div/div/div[3]/div/div[2]/div/div/div/div/textarea");

    //Other
    By OtherSectionTab = By.xpath("//*[@id=\"tab-root_realEstate-array-field\"]/div[2]/div[1]/ul[1]/li[11]/a");
    By OtherYesBtn = By.xpath("//*[@id=\"root_realEstate_10_vehicleCondition_conditionSection_condition\"]/div[1]/label[1]");
    By OtherNoBtn = By.xpath("//*[@id=\"root_realEstate_10_vehicleCondition_conditionSection_condition\"]/div[1]/label[2]");
    By OtherValue = By.xpath("//*[@id=\"root_realEstate_10_vehicleCondition_conditionSection\"]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[2]/div/div/div/div/input");
    By OtherDescription = By.xpath("//*[@id=\"root_realEstate_10_vehicleCondition_conditionSection\"]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/input");

    public PersonalDocumentsPage navigateToPersonalDocumentsPage(){
        click(nextPageButton);
        return new PersonalDocumentsPage();
    }

    public CollateralPage navigateStraightToCollateralSection(){
        waitForElementClickable(CollateralSectionNavigation);
        pause(3);
        click(CollateralSectionNavigation);
        return new CollateralPage();
    }

    public void selectYesInFurniturePurchased(){
        waitForElementClickable(selectCollateralMenu);
        pause(2);
        setDropDownValue(selectCollateralMenu, "Furniture, Fixtures and Equipment to be Purchased");
        click(addCollateralTypeBtn);
        waitForElementClickable(furnitureToBePurchasedSectionTab);
        pause(1);
        click(furnitureToBePurchasedSectionTab);
        waitForElementClickable(furnitureToBePurchasedYesBtn);
        click(furnitureToBePurchasedYesBtn);
    }

    public void selectNoInFurniturePurchased(){
        waitForElementClickable(selectCollateralMenu);
        pause(2);
        setDropDownValue(selectCollateralMenu, "Furniture, Fixtures and Equipment to be Purchased");
        click(addCollateralTypeBtn);
        waitForElementClickable(furnitureToBePurchasedSectionTab);
        pause(1);
        click(furnitureToBePurchasedSectionTab);
        waitForElementClickable(furnitureToBePurchasedNoBtn);
        click(furnitureToBePurchasedNoBtn);
        sendKeys(furnitureToBePurchasedMarketValue, "15000");
        sendKeys(furnitureToBePurchasedDescription, "Purchased 15000");
    }

    public void selectYesInFurnitureOwned(){
        waitForElementClickable(selectCollateralMenu);
        setDropDownValue(selectCollateralMenu, "Furniture, Fixtures and Equipment Owned");
        click(addCollateralTypeBtn);
        waitForElementClickable(furnitureOwnedSectionTab);
        pause(1);
        click(furnitureOwnedSectionTab);
        waitForElementClickable(furnitureOwnedYesBtn);
        click(furnitureOwnedYesBtn);
    }

    public void selectNoInFurnitureOwned(){
        waitForElementClickable(selectCollateralMenu);
        setDropDownValue(selectCollateralMenu, "Furniture, Fixtures and Equipment Owned");
        click(addCollateralTypeBtn);
        waitForElementClickable(furnitureOwnedSectionTab);
        pause(1);
        click(furnitureOwnedSectionTab);
        waitForElementClickable(furnitureOwnedNoBtn);
        click(furnitureOwnedNoBtn);
        sendKeys(furnitureOwnedMarketValue, "15000");
        sendKeys(furnitureOwnedDescription, "Purchased 15000");
    }

    public void selectYesInComRealStatePurchased(){
        waitForElementClickable(selectCollateralMenu);
        setDropDownValue(selectCollateralMenu, "Commercial Real Estate to be Purchased");
        click(addCollateralTypeBtn);
        waitForElementClickable(commercialRealEstatePurchasedSectionTab);
        pause(1);
        click(commercialRealEstatePurchasedSectionTab);
        waitForElementClickable(commercialRealEstatePurchasedYesBtn);
        click(commercialRealEstatePurchasedYesBtn);
    }

    public void selectNoInComRealStatePurchased(){
        waitForElementClickable(selectCollateralMenu);
        setDropDownValue(selectCollateralMenu, "Commercial Real Estate to be Purchased");
        click(addCollateralTypeBtn);
        waitForElementClickable(commercialRealEstatePurchasedSectionTab);
        pause(1);
        click(commercialRealEstatePurchasedSectionTab);
        waitForElementClickable(commercialRealEstatePurchasedNoBtn);
        click(commercialRealEstatePurchasedNoBtn);
        waitForElementClickable(streetNoTxtCommercial);
        sendKeys(streetNoTxtCommercial, "12");
        sendKeys(streetNameCommercial, "Top Lane");
        sendKeys(unitNoTxtCommercial, "12");
        sendKeys(cityTxtCommercial, "Roseville");
        setDropDownValue(stateDropdownCommercial, "Michigan");
        sendKeys(stateDropdownCommercial, "12");
        sendKeys(zipCodeTxtCommercial, "256874");
        sendKeys(yearAccquiredTxtCommercial, "2000");
        sendKeys(originalCostTxtCommercial, "12000");
        sendKeys(marketCostTxtCommercial, "12000");
        sendKeys(amountOfLienTxtCommercial, "5000");
        sendKeys(nameOfHolderTxtCommercial, "Jack");
        sendKeys(DescriptionTxtCommercial, "Commercial Real Estate to be Purchased");
    }

    public void fillComRealEstateOwned(){
        waitForElementClickable(selectCollateralMenu);
        setDropDownValue(selectCollateralMenu, "Commercial Real Estate Owned");
        click(addCollateralTypeBtn);
        waitForElementClickable(commercialRealEstateOwnedSectionTab);
        pause(1);
        click(commercialRealEstateOwnedSectionTab);
        waitForElementClickable(streetNoTxt);
        sendKeys(streetNoTxt, "20");
        sendKeys(streetName, "Top Lane");
        sendKeys(unitNoTxt, "4A");
        sendKeys(cityTxt, "Roseville");
        setDropDownValue(stateDropdown, "Michigan");
        sendKeys(zipCodeTxt, "45897");
        sendKeys(yearAccquiredTxt, "2015");
        sendKeys(originalCostTxt, "201500");
        sendKeys(marketCostTxt, "201545");
        sendKeys(amountOfLienTxt, "15");
        sendKeys(nameOfHolderTxt, "Anne");
        sendKeys(nameOfPropertyOwnerTxt, "Robert");
        sendKeys(DescriptionTxt, "Need to buy this");
    }

    public void fillPersonalRealEstateOwned(){
        waitForElementClickable(selectCollateralMenu);
        setDropDownValue(selectCollateralMenu, "Personal Real Estate Owned");
        click(addCollateralTypeBtn);
        waitForElementClickable(personalRealEstateOwnedTab);
        pause(1);
        click(personalRealEstateOwnedTab);
        waitForElementClickable(streetNoTxtPersonal);
        sendKeys(streetNoTxtPersonal, "20");
        sendKeys(streetNamePersonal, "Top Lane");
        sendKeys(unitNoTxtPersonal, "4A");
        sendKeys(cityTxtPersonal, "Roseville");
        setDropDownValue(stateDropdownPersonal, "Michigan");
        sendKeys(zipCodeTxtPersonal, "45897");
        sendKeys(yearAccquiredTxtPersonal, "2015");
        sendKeys(originalCostTxtPersonal, "201500");
        sendKeys(marketCostTxtPersonal, "201545");
        sendKeys(amountOfLienTxtPersonal, "15");
        sendKeys(nameOfHolderTxtPersonal, "Anne");
        sendKeys(nameOfPropertyOwnerTxtPersonal, "Robert");
        sendKeys(DescriptionTxtPersonal, "Need to buy this");
    }

    public void selectYesInVehiclePurchased(){
        waitForElementClickable(selectCollateralMenu);
        setDropDownValue(selectCollateralMenu, "Vehicles to be Purchased");
        click(addCollateralTypeBtn);
        waitForElementClickable(vehiclesPurchasedSectionTab);
        pause(1);
        click(vehiclesPurchasedSectionTab);
        waitForElementClickable(vehiclesPurchasedYesBtn);
        click(vehiclesPurchasedYesBtn);
    }

    public void selectNoInVehiclePurchased(){
        waitForElementClickable(selectCollateralMenu);
        setDropDownValue(selectCollateralMenu, "Vehicles to be Purchased");
        click(addCollateralTypeBtn);
        waitForElementClickable(vehiclesPurchasedSectionTab);
        pause(1);
        click(vehiclesPurchasedSectionTab);
        waitForElementClickable(vehiclesPurchasedNoBtn);
        click(vehiclesPurchasedNoBtn);
        waitForElement(vehiclesPurchasedCondition);
        setDropDownValue(vehiclesPurchasedCondition, "Good");
        sendKeys(vehiclesPurchasedYear, "1989");
        sendKeys(vehiclesPurchasedVin, "4214");
        sendKeys(vehiclesPurchasedMake, "25000");
        sendKeys(vehiclesPurchasedModel, "Sunny");
        sendKeys(vehiclesPurchasedMileage, "20000");
        sendKeys(vehiclesPurchasedMarketValue, "23500");
        sendKeys(vehiclesPurchasedOwner, "John");
        click(vehiclesPurchasedExistingLienNo);
        sendKeys(vehiclesPurchasedDescription, "Vehicles to be Purchased");
    }

    public void selectYesInVehicleOwned(){
        waitForElementClickable(selectCollateralMenu);
        setDropDownValue(selectCollateralMenu, "Vehicles Owned");
        click(addCollateralTypeBtn);
        waitForElementClickable(vehiclesOwnedSectionTab);
        pause(1);
        click(vehiclesOwnedSectionTab);
        waitForElementClickable(vehiclesOwnedYesBtn);
        click(vehiclesOwnedYesBtn);
    }

    public void selectNoInVehicleOwned(){
        waitForElementClickable(selectCollateralMenu);
        setDropDownValue(selectCollateralMenu, "Vehicles Owned");
        click(addCollateralTypeBtn);
        waitForElementClickable(vehiclesOwnedSectionTab);
        pause(1);
        click(vehiclesOwnedSectionTab);
        waitForElementClickable(vehiclesOwnedNoBtn);
        click(vehiclesOwnedNoBtn);
        waitForElement(vehiclesOwnedCondition);
        setDropDownValue(vehiclesOwnedCondition, "Fair");
        sendKeys(vehiclesOwnedYear, "1994");
        sendKeys(vehiclesOwnedVin, "8541");
        sendKeys(vehiclesOwnedMake, "21000");
        sendKeys(vehiclesOwnedModel, "Sunny");
        sendKeys(vehiclesOwnedMileage, "18000");
        sendKeys(vehiclesOwnedMarketValue, "20500");
        sendKeys(vehiclesOwnedOwner, "Jill");
        click(vehiclesOwnedExistingLienNo);
        sendKeys(vehiclesOwnedDescription, "Vehicles Owned");
    }

    public void selectYesInCertifiedOfDeposit(){
        waitForElementClickable(selectCollateralMenu);
        setDropDownValue(selectCollateralMenu, "Certificate of Deposit Secured");
        click(addCollateralTypeBtn);
        waitForElementClickable(certificateOfDepositSectionTab);
        pause(1);
        click(certificateOfDepositSectionTab);
        waitForElementClickable(certificateOfDepositYesBtn);
        click(certificateOfDepositYesBtn);
    }

    public void selectNoInCertifiedOfDeposit(){
        waitForElementClickable(selectCollateralMenu);
        setDropDownValue(selectCollateralMenu, "Certificate of Deposit Secured");
        click(addCollateralTypeBtn);
        waitForElementClickable(certificateOfDepositSectionTab);
        pause(1);
        click(certificateOfDepositSectionTab);
        waitForElementClickable(certificateOfDepositNoBtn);
        click(certificateOfDepositNoBtn);
        waitForElement(certificateOfDepositValue);
        sendKeys(certificateOfDepositValue, "40000");
        click(certificateOfDepositExistingLienNo);
        sendKeys(certificateOfDepositDescription, "Certificate of Deposit Secured");
    }

    public void selectYesInBusinessInsuranceInformation(){
        waitForElementClickable(selectCollateralMenu);
        setDropDownValue(selectCollateralMenu, "Business Insurance Information");
        click(addCollateralTypeBtn);
        waitForElementClickable(businessInsuranceSectionTab);
        pause(1);
        click(businessInsuranceSectionTab);
        waitForElementClickable(businessInsuranceYesBtn);
        click(businessInsuranceYesBtn);
    }

    public void selectNoInBusinessInsuranceInformation(){
        waitForElementClickable(selectCollateralMenu);
        setDropDownValue(selectCollateralMenu, "Business Insurance Information");
        click(addCollateralTypeBtn);
        waitForElementClickable(businessInsuranceSectionTab);
        pause(1);
        click(businessInsuranceSectionTab);
        waitForElementClickable(businessInsuranceNoBtn);
        click(businessInsuranceNoBtn);
        waitForElement(businessInsuranceNoBtn);
        sendKeys(businessInsuranceValue, "30000");
        click(businessInsuranceExistingLienNo);
        sendKeys(businessInsuranceDescription, "Business Insurance Information");
    }

    public void selectYesInJewelery(){
        waitForElementClickable(selectCollateralMenu);
        setDropDownValue(selectCollateralMenu, "Jewelry");
        click(addCollateralTypeBtn);
        waitForElementClickable(JewelrySectionTab);
        pause(1);
        click(JewelrySectionTab);
        waitForElementClickable(JewelryYesBtn);
        click(JewelryYesBtn);
    }

    public void selectNoInJewelery(){
        waitForElementClickable(selectCollateralMenu);
        setDropDownValue(selectCollateralMenu, "Jewelry");
        click(addCollateralTypeBtn);
        waitForElementClickable(JewelrySectionTab);
        pause(1);
        click(JewelrySectionTab);
        waitForElementClickable(JewelryNoBtn);
        click(JewelryNoBtn);
        waitForElement(JewelryValue);
        sendKeys(JewelryValue, "38000");
        click(JewelryExistingLienNo);
        sendKeys(JewelryDDescription, "Jewelry");
    }

    public void selectYesInOther(){
        waitForElementClickable(selectCollateralMenu);
        setDropDownValue(selectCollateralMenu, "Other");
        click(addCollateralTypeBtn);
        waitForElementClickable(OtherSectionTab);
        pause(1);
        click(OtherSectionTab);
        waitForElementClickable(OtherYesBtn);
        click(OtherYesBtn);
    }

    public void selectNoInOther(){
        waitForElementClickable(selectCollateralMenu);
        setDropDownValue(selectCollateralMenu, "Other");
        click(addCollateralTypeBtn);
        waitForElementClickable(OtherSectionTab);
        pause(1);
        click(OtherSectionTab);
        waitForElementClickable(OtherNoBtn);
        click(OtherNoBtn);
        waitForElement(OtherValue);
        sendKeys(OtherValue, "48000");
        sendKeys(OtherDescription, "Other");
    }

}
