package page.courseManagement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LevelPage {
    @FindBy(xpath = "//span[text()='Course Management']")
    public static WebElement courseManagementMenu;
    @FindBy(xpath = "//span[text()='Level']")
    public static WebElement levelMenu;
    @FindBy(xpath = "//button[text()='Add ']")
    public static WebElement levelAddButton;
    @FindBy(xpath = "//select[@name='subjectId']")
    public static WebElement subjectDropDown;
    @FindBy(name = "status")
    public static WebElement subjectStatusDropDown;
    @FindBy(name = "level")
    public static WebElement levelNameInput;
    @FindBy(name = "levelCode")
    public static WebElement levelCodeInput;
    @FindBy(xpath = "//button[text()='Submit']")
    public static WebElement levelDialogSubmitButton;
    @FindBy(xpath = "//div[text()='Course Level created successfully']")
    public static WebElement levelAddToaster;

}
