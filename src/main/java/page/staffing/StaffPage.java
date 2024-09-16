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

    //Form1
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

    //Form2
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
    /*@FindBy(xpath = "//input[@name='endDate']")
    public static WebElement endDate;*/
    @FindBy(xpath = "//input[@id='No']")
    public static WebElement approvalRequired;
    @FindBy(xpath = "//input[@id='myCheckbox1']")
    public static WebElement workingDayBox1;
    @FindBy(xpath = "//input[@id='myCheckbox2']")
    public static WebElement workingDayBox2;
    @FindBy(xpath = "//input[@id='myCheckbox3']")
    public static WebElement workingDayBox3;
}
