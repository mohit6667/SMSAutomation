package commonMethods.courseManagement;

import base.BaseClass;
import constants.centreManagement.CentreManagementConstants;
import constants.courseManagement.ClassConstants;
import constants.courseManagement.CourseConstants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.courseManagement.ClassPage;

import java.time.Duration;

public class ClassCommonMethods extends BaseClass {
    public static Select select;
    public static boolean classAdd(){
        ClassPage.classMenu.click();
        ClassPage.classAddButton.click();
        select = new Select(ClassPage.centreNameDropDown);
        select.selectByVisibleText(CentreManagementConstants.centreName);
        select = new Select(ClassPage.courseNameDropDown);
        select.selectByVisibleText(CourseConstants.courseName);
        ClassPage.classNameInput.sendKeys(ClassConstants.className);
        ClassPage.groupClassTypeRadioButton.click();
        select = new Select(ClassPage.durationInHrsDropDown);
        select.selectByValue("1.00");
        ClassPage.classSaveButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement classAddToaster = wait.until(ExpectedConditions.visibilityOf(ClassPage.classAddToaster));
        return classAddToaster.isDisplayed();
    }
}
