package page.courseManagement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CoursePage {
    @FindBy(xpath = "//span[text()='Course Management']")
    public static WebElement courseManagementMenu;
    @FindBy(xpath = "//span[text()='Course']")
    public static WebElement courseMenu;
    @FindBy(xpath = "//button[text()='Add ']")
    public static WebElement courseAddButton;
    @FindBy(name = "centerId")
    public static WebElement centreNameDropDown;
    @FindBy(name = "subjectId")
    public static WebElement subjectNameDropDown;
    @FindBy(name = "levelId")
    public static WebElement levelNameDropDown;
    @FindBy(name = "courseName")
    public static WebElement courseNameInput;
    @FindBy(name = "courseCode")
    public static WebElement courseCodeInput;
    @FindBy(name = "maxClassSize")
    public static WebElement maxClassSizeInput;
    @FindBy(name = "minClassSize")
    public static WebElement minClassSizeInput;
    @FindBy(id = "inlineRadio1")
    public static WebElement courseTypeNormalRadioButton;
    @FindBy(name = "durationInMins")
    public static WebElement durationInMinsDropDown;
    @FindBy(name = "durationInHrs")
    public static WebElement durationInHrsDropDown;
    @FindBy(name = "status")
    public static WebElement statusDropDown;
    @FindBy(xpath = "//input[@value='Yes']")
    public static WebElement yesClassReplacementRadioButton;
    @FindBy(xpath = "//button[text()='Save']")
    public static WebElement courseSaveButton;
    @FindBy(xpath = "//div[text()='Course created successfully']")
    public static WebElement courseAddToaster;
}
