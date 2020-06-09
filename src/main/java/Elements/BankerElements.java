package Elements;

import org.openqa.selenium.By;

public interface BankerElements {

    By unlockDLFBtn = By.xpath("//*[@id=\"wr-application-view\"]/div/div[1]/div[1]/div/div/div/button");
    By assignmentMenuItem = By.xpath("//*[@id=\"dlf-bar\"]/div/ul/li[8]/a");
    By selectCAdropdown = By.xpath("//*[@id=\"tab-reassign\"]/div/form/div[1]/select");
    //*[@id="tab-reassign"]/div/form/div[1]/select
    By caComment = By.xpath("//*[@id=\"tab-reassign\"]/div/form/div[2]/textarea");
    By assignBtn = By.xpath("//*[@id=\"tab-reassign\"]/div/form/div[3]/button");

    By actionMenuItem = By.xpath("//*[@id=\"dlf-bar\"]/div/ul/li[7]/a");
    By approveBtn = By.xpath("//*[@id=\"tab-actions\"]/div/div/div/section/button[1]/div");
    By declineBtn = By.xpath("//*[@id=\"tab-actions\"]/div/div/div/section/button[2]/div");
    By cancelDeclineBtn = By.xpath("//*[@id=\"react-confirm-alert\"]/div/div/div/button[1]");
    By confirmDeclineBtn = By.xpath("//*[@id=\"tab-actions\"]/div/div/div/section/form/div/button[2]");
    By cancelConfirmBtn = By.xpath("//*[@id=\"react-confirm-alert\"]/div/div/div/button[1]");
    By ConfirmBtn = By.xpath("//*[@id=\"react-confirm-alert\"]/div/div/div/button[2]");
    //*[@id="react-confirm-alert"]/div/div/div/button[2]
    By declineStatus = By.xpath("//*[@id=\"tab-actions\"]/div/div/section/div[1]/span");
    By autoDecisionMenuItem = By.xpath("//*[@id=\"dlf-bar\"]/div/ul/li[6]/a");

    By makeOfferBtn = By.xpath("//*[@id=\"tab-actions\"]/div/div/div/section/form/div[4]/button[2]");
    By cancelOfferBtn = By.xpath("//*[@id=\"tab-actions\"]/div/div/div/section/form/div[4]/button[1]");
    By confirmOfferBtn = By.xpath("//*[@id=\"react-confirm-alert\"]/div/div/div/button[2]");

    By newBtn = By.xpath("//*[@id=\"wr-content\"]/section[1]/div/div[1]/a");
    By deniedBtn = By.xpath("//*[@id=\"tab-\"]/a/span[text()='Declined']");
    By deniedSection = By.xpath("//*[@id=\"profile-bar\"]/div/ul/li[2]/a");
    By deniedSearch = By.xpath("//*[@id=\"wr-dlf\"]/div/div[2]/div[1]/div/form/div/div[1]/div/input");
    By deniedFilterBtn = By.xpath("//*[@id=\"wr-dlf\"]/div/div[2]/div[1]/div/form/div/div[4]/div/button");
    By newLeftMenu = By.xpath("//*[@id=\"tab\"]/a");
    By draftBtn = By.xpath("//*[@id=\"wr-content\"]/section[1]/div/div[2]/div[1]/div/a");
    By codeSearch =  By.xpath("//*[@id=\"page-content\"]/div/main/div[1]/div/div/ul/li[2]/input");
    By filterBtn = By.xpath("//*[@id=\"page-content\"]/div/main/div[1]/div/div/ul/li[5]/button[1]");
    By draftSelectedDLF = By.xpath("//*[@id=\"wr-dlf\"]/div/div[3]/div/div/div/div/div[1]/div[2]/table/tbody/tr/td[2]/a");
    By newSelectedDLF = By.xpath("//*[@id=\"wr-dlf\"]/div/div[2]/div/div/div/div/div[1]/div[2]/table/tbody/tr/td[2]/a");
    By newDeniedDLF = By.xpath("//*[@id=\"wr-dlf\"]/div/div[2]/div[2]/div/div/div/div[1]/div[2]/table/tbody/tr/td[2]/a");
    By allSelectedDLF = By.xpath("//*[@id=\"wr-dlf\"]/div/div[1]/div/div/div/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/a");

    By dashboardLink =  By.xpath("//*[@id=\"mainNav\"]/li[1]/a");
    By digitalApplicationLink =  By.xpath("//*[@id=\"mainNav\"]/li[2]/a");
    By openApplicationsDropDown =  By.xpath("//*[@id=\"mainNav\"]/li[2]/div/a[1]");
    By closeApplicationsDropDown =  By.xpath("//*[@id=\"mainNav\"]/li[2]/div/a[2]");
    By myDigitalApplicationsUrl =  By.xpath("//*[@id=\"page-content\"]/div/main/div[1]/ul/li[2]/a");
    By AllDlfs =  By.xpath("//*[@id=\"page-content\"]/div/main/div[1]/ul/li[1]/a");
    By searchByCareCenterTxtBox = By.xpath("//*[@id=\"page-content\"]/div/main/div[1]/ul/li[2]/div/div[1]/input");

    By searchByBorrowerTxtBox = By.xpath("//*[@id=\"page-content\"]/div/main/div[1]/ul/li[3]/div/div[1]/input");
    By newApplication = By.xpath("//*[@id=\"mainNav\"]/li[4]/a");

    By userDetailsDropDown = By.xpath("//*[@id=\"actionNav\"]/li[2]/a/i[2]");
    By userSettingsInUserInfoDropDown = By.xpath("//*[@id=\"actionNav\"]/li[2]/div/a[1]");
    By logoutButtonInUserInfoDropDown = By.xpath("//*[@id=\"actionNav\"]/li[2]/div/a[2]");
    //*[@id="actionNav"]/li[2]/div/a[2]

    By approveTile = By.linkText("Approved");
    By approveSearchTxt = By.xpath("//*[@id=\"wr-dlf\"]/div/div[1]/div[1]/div/form/div/div[1]/div/input");
    By approveSearchBtn = By.xpath("//*[@id=\"wr-dlf\"]/div/div[1]/div[1]/div/form/div/div[4]/div/button");
    By declinedSearchTxt = By.xpath("//*[@id=\"wr-dlf\"]/div/div[2]/div[1]/div/form/div/div[1]/div/input");
    By declinedSearchBtn = By.xpath("//*[@id=\"wr-dlf\"]/div/div[2]/div[1]/div/form/div/div[4]/div/button");
    By selectedDLFLink = By.xpath("//*[@id=\"wr-dlf\"]/div/div[1]/div[2]/div/div/div/div[1]/div[2]/table/tbody/tr/td[2]/a");
    By selectedDeniedDLFLink = By.xpath("//*[@id=\"wr-dlf\"]/div/div[2]/div[2]/div/div/div/div[1]/div[2]/table/tbody/tr/td[2]/a");
    By DLFStatusTxt = By.xpath("//*[@id=\"dlf-bar\"]/div/div/div/span");
    By DLFStatus = By.xpath("//*[@id=\"tab-actions\"]/div/section/div[1]/span");
    By DLFSubStatus = By.xpath("//*[@id=\"dlf-bar\"]/div/div/a/span");
    By firstDLF = By.xpath("//*[@id=\"wr-dlf\"]/div/div[3]/div/div/div/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/a");
    By deleteDLFBtn = By.xpath("//*[@id=\"wr-dlf\"]/div[1]/div[2]/a/i");
    By confirmDeleteDLF = By.xpath("//*[@id=\"deleteDlfConfirmation\"]/div/div/div[3]/button[2]");

    By totalProcessingTile = By.xpath("//*[@id=\"wr-content\"]/section[1]/div/div[3]/a");
  //By LoggedUserInfo = By.xpath("//*[@id=\"actionNav\"]/li/a");
    By bankDashboard = By.xpath("//*[@id=\"actionNav\"]/li/div/a[2]");

    By careCenterDropdown = By.xpath("//*[@id=\"rbt-menu-item-0\"]/a");
    By newDLFTile = By.xpath("//*[@id=\"tab1\"]/div/a[1]");
    By childCareTab = By.xpath("//*[@id=\"wr-application-view\"]/ul/li[2]");
    By allButton = By.xpath("//*[@id=\"page-content\"]/div/main/div[1]/ul/li[1]/a");

    By borrowerDropDown = By.xpath("//*[@id=\"rbt-menu-item-85\"]/a");

    By LastDLF = By.xpath("//*[@id=\"tab1\"]/div/a[2]/div[1]");
    By LastDLF1 = By.xpath("//*[@id=\"tab1\"]/div/a[1]/div[1]");
    By LastDLFID = By.xpath("//*[@id=\"tab1\"]/div/a[1]/span");
    By messageMenuItem = By.xpath("//*[@id=\"messages\"]");
    By submittedEmailSubject = By.xpath("//*[@id=\"tab-messages\"]/div/div[2]/ul/li/div[2]/p/section[2]/section/div/div/div/h2");
    By messageArea = By.xpath("//*[@id=\"tab-messages\"]/div/div[1]/div[1]/textarea");



}
