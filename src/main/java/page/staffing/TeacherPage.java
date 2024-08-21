package page.staffing;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TeacherPage {
    @FindBy(xpath = "//span[text()='Staffing']")
    public static WebElement staffingMenu;
    @FindBy(xpath = "//span[text()='Teacher']")
    public static WebElement teacherMenu;
    @FindBy(xpath = "//button[text()='Add ']")
    public static WebElement addTeacherButton;
    @FindBy(name = "teacherName")
    public static WebElement teacherNameInput;
    @FindBy(name = "dateOfBirth")
    public static WebElement dateOfBirthInput;
    @FindBy(xpath = "//select[@name='idType']")
    public static WebElement idTypeDropDown;
    @FindBy(name = "idNo")
    public static WebElement idNoInput;
    @FindBy(name = "citizenship")
    public static WebElement citizenshipDropDown;
    @FindBy(xpath = "//input[@id='male']")
    public static WebElement maleGender;
    @FindBy(name = "file")
    public static WebElement teacherProfileImage;
    @FindBy(xpath = "//button[text()=' Save And Next']")
    public static WebElement saveAndNextButton;
    @FindBy(name = "startDate")
    public static WebElement startDateInput;
    @FindBy(name = "teacherId")
    public static WebElement teacherIdInput;
    @FindBy(name = "teacherType")
    public static WebElement teacherTypeDropDown;
    @FindBy(name = "shgType")
    public static WebElement shgTypeDropDown;
    @FindBy(name = "shgAmount")
    public static WebElement shgAmountInput;
    @FindBy(xpath = "//input[@name='approvelContentRequired' and @value ='Yes']")
    public static WebElement yesApprovalContentRequired;
    @FindBy(xpath = "//input[@name='workingDays' and @value='MONDAY']")
    public static WebElement workingDaysCheckbox;
    @FindBy(name = "email")
    public static WebElement emailInput;
    @FindBy(name = "contactNumber")
    public static WebElement contactNumberInput;
    @FindBy(name = "address")
    public static WebElement addressInput;
    @FindBy(name = "postalCode")
    public static WebElement postalCodeInput;
    @FindBy(name = "password")
    public static WebElement passwordInput;
    @FindBy(name = "confirmPassword")
    public static WebElement confirmPasswordInput;
    @FindBy(name = "year")
    public static WebElement yearInput;
    @FindBy(name = "annualLeave")
    public static WebElement annualLeaveInput;
    @FindBy(name = "medicalLeave")
    public static WebElement medicalLeaveInput;
    @FindBy(name = "otherLeave")
    public static WebElement otherLeaveInput;
    @FindBy(name = "carryForwardLeave")
    public static WebElement carryForwardLeave;
    @FindBy(name = "employer")
    public static WebElement employerInput;
    @FindBy(name = "uen")
    public static WebElement uenInput;
    @FindBy(name = "addressOfEmployment")
    public static WebElement addressOfEmploymentInput;
    @FindBy(name = "nric")
    public static WebElement nricInput;
    @FindBy(name = "jobTitle")
    public static WebElement jobTitleInput;
}
