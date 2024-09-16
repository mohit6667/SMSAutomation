package page.staffing;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.logging.XMLFormatter;

public class TeacherPage {

    @FindBy(xpath = "//span[text()='Staffing']")
    public static WebElement staffingMenu;
    @FindBy(xpath = "//span[text()='Teacher']")
    public static WebElement teacherMenu;
    @FindBy(xpath = "//button[text()='Add ']")
    public static WebElement addTeacherButton;
    @FindBy(name = "teacherName")
    public static WebElement teacherName;
    @FindBy(name = "dateOfBirth")
    public static WebElement teacherDateOfBirth;
    @FindBy(xpath = "//select[@name='idTypeId']")
    public static WebElement teacherIdType;
    @FindBy(name = "idNo")
    public static WebElement teacherIdNo;
    @FindBy(name = "citizenship")
    public static WebElement teacherCitizenship;
    @FindBy(name = "file")
    public static WebElement teacherProfileImage;
    @FindBy(xpath = "//input[@name='email']")
    public static WebElement teacherEmailId;
    @FindBy(xpath = "//input[@name='password']")
    public static WebElement teacherEmailIdPassword;
    @FindBy(xpath = "//input[@name='confirmPassword']")
    public static WebElement teacherEmailIdConfirmPwd;
    @FindBy(xpath = "//input[@id='female']")
    public static WebElement teacherGenderFemale;
    @FindBy(name = "shortIntroduction")
    public static WebElement teacherShortIntroduction;
    @FindBy(xpath = "//button[text()=' Save And Next']")
    public static WebElement saveAndNextButton;
    @FindBy(name = "startDate")
    public static WebElement startDateOfWorking;
    @FindBy(name = "teacherId")
    public static WebElement teacherIdInput;
    @FindBy(xpath = "//select[@name='teacherType' and option[text()='Temporary']]")
    public static WebElement teacherTypeDropDown;
    @FindBy(xpath = "//select[@name='shgTypeId' and option[text()='Less than 5000']]")
    public static WebElement shgTypeDropDown;
    @FindBy(xpath = "//input[@value='Yes']")
    public static WebElement yesApproval;
    @FindBy(xpath = "//input[@id='myCheckbox1']")
    public static WebElement workingDaysCheckbox;
    @FindBy(name = "contactNumber")
    public static WebElement contactNumberInput;
    @FindBy(xpath = "//textarea[@name='address']")
    public static WebElement addressInput;
    @FindBy(name = "postalCode")
    public static WebElement postalCodeInput;
    @FindBy(xpath = "//input[@name='salary']")
    public static WebElement salary;
    @FindBy(xpath = "//input[@name='effectiveDate']")
    public static WebElement salaryEffectiveDate;
    @FindBy(xpath = "//select[@name='salaryTypeId']")
    public static WebElement salaryType;
    @FindBy(xpath = "//input[@name='year']")
    public static WebElement yearInput;
    @FindBy(name = "annualLeave")
    public static WebElement annualLeaveInput;
    @FindBy(name = "medicalLeave")
    public static WebElement medicalLeaveInput;
    @FindBy(name = "otherLeave")
    public static WebElement otherLeaveInput;
    @FindBy(name = "carryForwardLeave")
    public static WebElement carryForwardLeave;
    @FindBy(xpath = "//select[@name='employer'] | option[text()='Centre_Add']")
    public static WebElement employerInput;
    @FindBy(xpath = "//input[@name='uen']")
    public static WebElement uenInput;
    @FindBy(xpath = "//input[@name='addressOfEmployment']")
    public static WebElement addressOfEmployment;
    @FindBy(xpath = "//input[@name='nric']")
    public static WebElement nricOfEmployee;
    @FindBy(xpath = "//input[@name='jobTitle']")
    public static WebElement jobTitle;
    @FindBy(xpath = "//input[@name='mainDuties']")
    public static WebElement mainDuties;
    @FindBy(xpath = "//input[@name='training']")
    public static WebElement training;
    @FindBy(xpath = "//input[@name='allowance']")
    public static WebElement allowance;
    @FindBy(xpath = "//input[@name='userContractEndDate']")
    public static WebElement employeeContractEndDate;
    @FindBy(xpath = "//input[@name='probation']")
    public static WebElement probation;
    @FindBy(xpath = "//input[@name='payNow']")
    public static WebElement payNowDetails;
    @FindBy(xpath = "//input[@name='internetBanking']")
    public static WebElement internetBanking;
    @FindBy(xpath = "//input[@name='terminationNotice']")
    public static WebElement terminationNotice;
    @FindBy(xpath = "//button[text()='Submit']")
    public static WebElement submitTeacherButton;
}
