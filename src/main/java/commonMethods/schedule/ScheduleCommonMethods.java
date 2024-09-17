package commonMethods.schedule;

import base.BaseClass;
import constants.centreManagement.CentreManagementConstants;
import constants.courseManagement.ClassConstants;
import constants.courseManagement.CourseConstants;
import constants.staffing.TeacherConstants;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.schedule.SchedulePage;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;

public class ScheduleCommonMethods extends BaseClass {
    public static JavascriptExecutor js;
    public static Select select;

    public static boolean scheduleAdd() throws InterruptedException {
        BaseClass.waitForOneSecond();
        SchedulePage.scheduleMenu.click();
        SchedulePage.timeScheduleMenu.click();
        SchedulePage.scheduleAddButton.click();
        BaseClass.waitForFourSecond();
        select = new Select(SchedulePage.scheduleCentreDropDown);
        select.selectByVisibleText(CentreManagementConstants.centreName);
        select = new Select(SchedulePage.scheduleCourseDropDown);
        select.selectByVisibleText(CourseConstants.courseName);
        select = new Select(SchedulePage.scheduleClassDropDown);
        select.selectByVisibleText(ClassConstants.className);
        select = new Select(SchedulePage.scheduleDaysDropDown);
        select.selectByVisibleText("TUESDAY");
        select = new Select(SchedulePage.scheduleTeacherDropDown);
        select.selectByVisibleText(TeacherConstants.teacherName);
        select = new Select(SchedulePage.scheduleClassroomDropDown);
        select.selectByVisibleText(CentreManagementConstants.classRoomName);

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("dd:MM:yyyy");
        String formattedStartDate = formatter.format(calendar.getTime());
        SchedulePage.scheduleStartDateInput.sendKeys(formattedStartDate);
        calendar.add(Calendar.DAY_OF_MONTH, 30);
        String formattedEndDate = formatter.format(calendar.getTime());
        SchedulePage.scheduleEndDateInput.sendKeys(formattedEndDate);
        BaseClass.waitForTwoSecond();
        SchedulePage.scheduleSubmitButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement ScheduleAddToaster = wait.until(ExpectedConditions.visibilityOf(SchedulePage.scheduleAddToaster));
        return ScheduleAddToaster.isDisplayed();
    }
}

