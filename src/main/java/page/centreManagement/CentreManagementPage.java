package page.centreManagement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CentreManagementPage {
    @FindBy(xpath = "//span[text()='Centre Management']")
    public static WebElement centreManagementMenu;
    @FindBy(xpath = "//span[text()='Centre Listing']")
    public static WebElement centreListingMenu;
    @FindBy(tagName = "tr")
    public static List<WebElement> centreListingTable;
    @FindBy(xpath = "//button[text()='Add ']")
    public static WebElement centreAddButton;
    @FindBy(name = "centerName")
    public static WebElement centreNameInput;
    @FindBy(name = "code")
    public static WebElement centreCodeInput;
    @FindBy(name = "zipCode")
    public static WebElement zipCodeInput;
    @FindBy(name = "mobile")
    public static WebElement mobileInput;
    @FindBy(name = "email")
    public static WebElement emailInput;
    @FindBy(xpath = "//input[@name='openingDate']")
    public static WebElement openingDateInput;
    @FindBy(name = "uenNumber")
    public static WebElement uenNumberInput;
    @FindBy(name = "taxRegistrationNumber")
    public static WebElement taxRegistrationNumberInput;
    @FindBy(id = "inlineRadio1")
    public static WebElement gstRadioButton;
    @FindBy(name = "bankName")
    public static WebElement bankNameInput;
    @FindBy(name = "bankAccountNumber")
    public static WebElement bankAccountNumberInput;
    @FindBy(name = "bankBranch")
    public static WebElement bankBranchInput;
    @FindBy(name = "bankAccountName")
    public static WebElement bankAccountNameInput;
    @FindBy(name = "file")
    public static WebElement qrCodeInput;
    @FindBy(name = "centerManager")
    public static WebElement centerManagerInput;
    @FindBy(xpath = "//button[@type='submit']")
    public static WebElement centreSaveButton;
    @FindBy(xpath = "//*[@id=\"2\"]/div[1]")
    public static WebElement centreAddToaster;
    @FindBy(tagName = "td")
    public static List<WebElement> centreListingColumn;
    @FindBy(xpath = "//a[contains(@href, '/center/edit/')]/button[@class='btn btn-sm']")
    public static WebElement centreListingEditButton;
    @FindBy(xpath = "//*[@id=\"3\"]/div[1]")
    public static WebElement centreEditToaster;
    @FindBy(xpath = "//div[@class='d-flex justify-content-center align-items-center ']/button[@class='btn btn-sm']")
    public static WebElement centreListingDeleteButton;
    @FindBy(xpath = "//button[text()='Delete']")
    public static WebElement centreDeleteButton;
    @FindBy(xpath = "//*[@id=\"4\"]/div[1]")
    public static WebElement centreDeleteToaster;
    @FindBy(xpath = "//td/div/div/button[@class='btn dropdown-toggle']")
    public static WebElement centreDropDownAddButton;
    @FindBy(xpath = "//button[@aria-expanded='true']/following::ul[@class='dropdown-menu show']/li/button[text()='Add Registration Fees']")
    public static WebElement addRegistrationButton;
    @FindBy(name = "effectiveDate")
    public static WebElement effectiveDateInput;
    @FindBy(name = "amount")
    public static WebElement amountInput;
    @FindBy(name = "taxId")
    public static WebElement taxTypeDropDown;
    @FindBy(name = "status")
    public static WebElement statusDropDown;
    @FindBy(xpath = "//button[@type='submit']")
    public static WebElement registrationFeesSaveButton;
    @FindBy(xpath = "//div[text()='Center Registrations created successfully']")
    public static WebElement registrationFeesSaveToaster;
    @FindBy(xpath = "//button[@aria-expanded='true']/following::ul[@class='dropdown-menu show']/li/button[text()='Add Centre Break']")
    public static WebElement addCentreBreakButton;
    @FindBy(xpath = "//button[@aria-expanded='true']/following::ul[@class='dropdown-menu show']/li/button[text()='Add Classroom']")
    public static WebElement addClassroomButton;
    @FindBy(xpath = "//button[@aria-expanded='true']/following::ul[@class='dropdown-menu show']/li/button[text()='Add Package']")
    public static WebElement addPackageButton;
    @FindBy(name = "breakName")
    public static WebElement breakNameInput;
    @FindBy(name = "fromDate")
    public static WebElement fromDateInput;
    @FindBy(name = "toDate")
    public static WebElement toDateInput;
    @FindBy(xpath = "//button[@type='submit']")
    public static WebElement centreBreakSaveButton;
    @FindBy(xpath = "//div[text()='Center Break created successfully']")
    public static WebElement centreBreakSaveToaster;
    @FindBy(name = "classRoomName")
    public static WebElement classRoomNameInput;
    @FindBy(name = "classRoomCode")
    public static WebElement classRoomCodeInput;
    @FindBy(name = "classRoomType")
    public static WebElement classRoomTypeDropDown;
    @FindBy(name = "capacity")
    public static WebElement capacityInput;
    @FindBy(name = "description")
    public static WebElement descriptionInput;
    @FindBy(xpath = "//button[@type='submit']")
    public static WebElement classRoomSaveButton;
    @FindBy(xpath = "//div[text()='Center Classroom created successfully']")
    public static WebElement classRoomSaveToaster;
    @FindBy(name = "packageName")
    public static WebElement packageNameInput;
    @FindBy(name = "noOfLesson")
    public static WebElement noOfLessonInput;
    @FindBy(xpath = "//button[@type='submit']")
    public static WebElement packageSaveButton;
    @FindBy(xpath = "//div[text()='Center package created successfully']")
    public static WebElement packageSaveToaster;
    @FindBy(name = "address")
    public static WebElement addressInput;
}
