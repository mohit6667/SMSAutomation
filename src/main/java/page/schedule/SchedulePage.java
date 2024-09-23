package page.schedule;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SchedulePage {
    @FindBy(xpath = "//span[text()='Schedule']")
    public static WebElement scheduleMenu;
    @FindBy(xpath = "//span[text()='Time Schedule']")
    public static WebElement timeScheduleMenu;
    @FindBy(xpath = "//button[@class='btn btn-button btn-sm']")
    public static WebElement scheduleAddButton;
    @FindBy(xpath = "//select[@name='centerId']")
    public static WebElement scheduleCentreDropDown;
    @FindBy(xpath = "//select[@name='courseId']")
    public static WebElement scheduleCourseDropDown;
    @FindBy(xpath = "//select[@name='classId']")
    public static WebElement scheduleClassDropDown;
    @FindBy(xpath = "//select[@name='days']")
    public static WebElement scheduleDaysDropDown;
    @FindBy(xpath = "//select[@name='userId']")
    public static WebElement scheduleTeacherDropDown;
    @FindBy(xpath = "//select[@name='classRoom']")
    public static WebElement scheduleClassroomDropDown;
    @FindBy(xpath = "//input[@name='startDate']")
    public static WebElement scheduleStartDateInput;
    @FindBy(xpath = "//input[@name='endDate']")
    public static WebElement scheduleEndDateInput;
    @FindBy(xpath = "//button[@type='submit']")
    public static WebElement scheduleSubmitButton;
    @FindBy(xpath = "//div[text()='Schedule Teacher with multiple batches created successfully']")
    public static WebElement scheduleAddToaster;
    @FindBy(xpath = "//div[@class='d-flex justify-content-center align-items-center']/div/button[@class='btn btn-sm']")
    public static WebElement scheduleDeleteButton;

}
