package commonMethods.courseManagement;

import base.BaseClass;
import constants.courseManagement.LevelConstants;
import constants.courseManagement.SubjectConstants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.courseManagement.LevelPage;

import java.time.Duration;

public class LevelCommonMethods extends BaseClass {
    public static boolean levelAdd() throws InterruptedException {
        LevelPage.levelMenu.click();
        LevelPage.levelAddButton.click();
        //Thread.sleep(2000);
        Select subjectDropDown = new Select(LevelPage.subjectDropDown);
        subjectDropDown.selectByVisibleText(SubjectConstants.subjectName);
        Select subjectStatusDropDown = new Select(LevelPage.subjectStatusDropDown);
        subjectStatusDropDown.selectByValue("Active");
        LevelPage.levelNameInput.sendKeys(LevelConstants.levelName);
        LevelPage.levelCodeInput.sendKeys(LevelConstants.levelCode);
        LevelPage.levelDialogSubmitButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement levelAddToaster = wait.until(ExpectedConditions.visibilityOf(LevelPage.levelAddToaster));
        return levelAddToaster.isDisplayed();
    }
}
