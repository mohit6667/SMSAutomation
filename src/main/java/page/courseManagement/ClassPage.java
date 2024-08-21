package page.courseManagement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClassPage {
    @FindBy(xpath = "//span[text()='Course Management']")
    public static WebElement courseManagementMenu;
    @FindBy(xpath = "//span[text()='Class']")
    public static WebElement classMenu;
    @FindBy(xpath = "//button[text()='Add ']")
    public static WebElement classAddButton;
    @FindBy(name = "centerId")
    public static WebElement centreNameDropDown;
    @FindBy(name = "courseId")
    public static WebElement courseNameDropDown;
    @FindBy(id = "inlineRadio1")
    public static WebElement groupClassTypeRadioButton;
    @FindBy(name = "className")
    public static WebElement classNameInput;
    @FindBy(name = "durationInHrs")
    public static WebElement durationInHrsDropDown;
    @FindBy(xpath = "//button[text()='Save']")
    public static WebElement classSaveButton;
    @FindBy(xpath = "//div[text()='Course Class Listing created successfully']")
    public static WebElement classAddToaster;
}
