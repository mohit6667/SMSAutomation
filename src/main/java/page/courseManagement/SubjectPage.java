package page.courseManagement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SubjectPage {
    @FindBy(xpath = "//span[text()='Course Management']")
    public static WebElement courseManagementMenu;
    @FindBy(xpath = "//span[text()='Subject']")
    public static WebElement subjectMenu;
    @FindBy(xpath = "//button[text()='Add ']")
    public static WebElement subjectSaveButton;
    @FindBy(name = "subject")
    public static WebElement subjectNameInput;
    @FindBy(name = "code")
    public static WebElement subjectCodeInput;
    @FindBy(name = "status")
    public static WebElement subjectStatusDropDown;
    @FindBy(xpath = "//button[text()='Submit']")
    public static WebElement subjectSubmitButton;
    @FindBy(xpath = "//div[text()='Course Subject created successfully']")
    public static WebElement subjectAddToaster;
    @FindBy(xpath = "//div[@class='d-flex']/button[@class='btn btn-sm'][1]")
    public static WebElement subjectEditButton;
    @FindBy(xpath = "//div[@class='d-flex']/button[@class='btn btn-sm'][2]")
    public static WebElement subjectDeleteButton;
    @FindBy(tagName = "td")
    public static List<WebElement> subjectColumn;
    @FindBy(xpath = "//*[@id=\"3\"]/div[1]")
    public static WebElement subjectEditToaster;
    @FindBy(xpath = "//div[text()='Course Subject deleted successfully']")
    public static WebElement subjectDeleteToaster;
    @FindBy(xpath = "//button[text()='Update']")
    public static WebElement subjectDialogUpdateButton;
    @FindBy(xpath = "//button[text()='Delete']")
    public static WebElement subjectDialogDeleteButton;
}


