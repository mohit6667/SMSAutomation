package commonMethods.courseManagement;

import base.BaseClass;
import constants.centreManagement.CentreManagementConstants;
import constants.courseManagement.CourseConstants;
import constants.courseManagement.LevelConstants;
import constants.courseManagement.SubjectConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.courseManagement.CoursePage;

import java.time.Duration;
import java.util.List;

public class CourseCommonMethods extends BaseClass {
    public static Select select;
    public static JavascriptExecutor js;
    public static boolean courseAdd() throws InterruptedException {
        CoursePage.courseMenu.click();
        CoursePage.courseAddButton.click();
        BaseClass.waitForTwoSecond();

        driver.findElement(By.xpath("//div[@class='dropdown-heading']")).click();
        List<WebElement> optionsData = driver.findElements(By.xpath("//div[@class='dropdown-content']/div/div/ul/li/label/div/span"));
        for (WebElement option : optionsData) {
            if (option.getText().equals(CentreManagementConstants.centreName)) {
                option.click();
                break;
            }
        }
        driver.findElement(By.xpath("//div[@class='dropdown-heading']")).click();

        select = new Select(CoursePage.subjectNameDropDown);
        select.selectByVisibleText(SubjectConstants.subjectName);
        select = new Select(CoursePage.levelNameDropDown);
        select.selectByVisibleText(LevelConstants.levelName);
        //js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        CoursePage.courseNameInput.sendKeys(CourseConstants.courseName);
        CoursePage.courseCodeInput.sendKeys(CourseConstants.courseCode);
        CoursePage.maxClassSizeInput.sendKeys(CourseConstants.maxClassSize);
        BaseClass.waitForOneSecond();
        js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        BaseClass.waitForOneSecond();
        CoursePage.minClassSizeInput.sendKeys(CourseConstants.minClassSize);
        CoursePage.courseTypeNormalRadioButton.click();
        select = new Select(CoursePage.durationInHrsDropDown);
        select.selectByValue("02");
        select = new Select(CoursePage.durationInMinsDropDown);
        select.selectByValue("15");
        select = new Select(CoursePage.statusDropDown);
        select.selectByValue("Active");
        CoursePage.yesClassReplacementRadioButton.click();
       // BaseClass.waitForOneSecond();
        js.executeScript("window.scrollTo(0,0)");
        BaseClass.waitForOneSecond();
        CoursePage.courseSaveButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement toasterForAdd = wait.until(ExpectedConditions.visibilityOf(CoursePage.courseAddToaster));
        return toasterForAdd.isDisplayed();
    }
}
