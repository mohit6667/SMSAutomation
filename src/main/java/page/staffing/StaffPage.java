package page.staffing;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StaffPage {
    @FindBy(xpath = "//span[text()='Staffing']")
    public static WebElement staffingMenu;
    @FindBy(xpath = "//span[text()='Staff']")
    public static WebElement staffMenu;
    @FindBy(xpath = "//button[text()='Add ']")
    public static WebElement addStudentButton;
    @FindBy(xpath = "//input[@type='text']")
    public static WebElement staffName;
    @FindBy(xpath = "//input[@type='date']")
    public static WebElement dob;
    @FindBy(xpath = "//select[@name='idTypeId']")
    public static WebElement idType;
    @FindBy(xpath = "//input[@type='text' and @name='idNo']")
    public static WebElement idNumber;
    @FindBy(xpath = "//select[@name='citizenship']")
    public static WebElement citizenship;
    @FindBy(xpath = "//input[@name='file']")
    public static WebElement photoUpload;
    @FindBy(xpath = "//select[@name='role']")
    public static WebElement role;
    @FindBy(xpath = "//input[@name='email']")
    public static WebElement email;
    @FindBy(xpath = "//input[@name='password']")
    public static WebElement password;
    @FindBy(xpath = "//input[@name='confirmPassword']")
    public static WebElement confirmPassword;
    @FindBy(xpath = "//input[@id='female']")
    public static WebElement gender;
    @FindBy(xpath = "//textarea[@name='shortIntroduction']")
    public static WebElement staffIntro;
    @FindBy(xpath = "//button[@type='submit']")
    public static WebElement saveButton;
    @FindBy(xpath = "//input[@name='startDate']")
    public static WebElement startDate;
    @FindBy(xpath = "//div[@class='dropdown-heading']")
    public static WebElement centre;
    @FindBy(xpath = "//input[@name='teacherId']")
    public static WebElement staffID;
    @FindBy(name="teacherType")
    public static WebElement staffType;
    @FindBy(xpath = "//select[@name='shgTypeId']")
    public static WebElement shgType;
    @FindBy(xpath = "//input[@id='No']")
    public static WebElement approvalRequired;
    @FindBy(xpath = "//input[@id='myCheckbox1']")
    public static WebElement workingDayBox1;
    @FindBy(xpath = "//input[@id='myCheckbox2']")
    public static WebElement workingDayBox2;
    @FindBy(xpath = "//input[@id='myCheckbox3']")
    public static WebElement workingDayBox3;
    @FindBy(xpath = "//input[@name='contactNumber']")
    public static WebElement contactNumber;
    @FindBy(xpath = "//textarea[@name='address']")
    public static WebElement address;
    @FindBy(xpath = "//input[@name='postalCode']")
    public static WebElement postalCode;
    @FindBy(xpath = "//input[@name='salary']")
    public static WebElement salary;
    @FindBy(xpath = "//input[@name='effectiveDate']")
    public static WebElement effectiveDate;
    @FindBy(xpath = "//select[@name='salaryTypeId']")
    public static WebElement salaryType;
    @FindBy(xpath = "//input[@name='year']")
    public static WebElement year;
    @FindBy(xpath = "//input[@name='annualLeave']")
    public static WebElement annualLeave;
    @FindBy(xpath = "//input[@name='medicalLeave']")
    public static WebElement medicalLeave;
    @FindBy(xpath = "//input[@name='otherLeave']")
    public static WebElement otherLeave;
    @FindBy(xpath = "//input[@name='carryForwardLeave']")
    public static WebElement carryForwardLeave;
    @FindBy(xpath = "//select[@name='employer']")
    public static WebElement employer;
    @FindBy(xpath = "//input[@name='uen']")
    public static WebElement uen;
    @FindBy(xpath = "//input[@name='addressOfEmployment']")
    public static WebElement employmentAddress;
    @FindBy(xpath = "//input[@name='nric']")
    public static WebElement nric;
    @FindBy(xpath = "//input[@name='jobTitle']")
    public static WebElement jobTitle;
    @FindBy(xpath = "//input[@name='mainDuties']")
    public static WebElement mainDuties;
    @FindBy(xpath = "//input[@name='training']")
    public static WebElement training;
    @FindBy(xpath = "//input[@name='allowance']")
    public static WebElement allowance;
    @FindBy(xpath = "//input[@name='userContractEndDate']")
    public static WebElement contractEndDate;
    @FindBy(xpath = "//input[@name='probation']")
    public static WebElement probationPeriod;
    @FindBy(xpath = "//input[@name='payNow']")
    public static WebElement paynowNumber;
    @FindBy(xpath = "//input[@name='internetBanking']")
    public static WebElement internetBankingNUmber;
    @FindBy(xpath = "//input[@name='terminationNotice']")
    public static WebElement terminationPeriod;
}
