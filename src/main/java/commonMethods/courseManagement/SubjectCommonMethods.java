package commonMethods.courseManagement;

import base.BaseClass;
import constants.courseManagement.SubjectConstants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.courseManagement.SubjectPage;

import java.time.Duration;
import java.util.List;

public class SubjectCommonMethods extends BaseClass {

    public static boolean subjectAdd() {
        SubjectPage.courseManagementMenu.click();
        SubjectPage.subjectMenu.click();
        SubjectPage.subjectSaveButton.click();
        SubjectPage.subjectNameInput.sendKeys(SubjectConstants.subjectName);
        SubjectPage.subjectCodeInput.sendKeys(SubjectConstants.subjectCode);
        Select statusDropDown = new Select(SubjectPage.subjectStatusDropDown);
        statusDropDown.selectByValue("Active");
        SubjectPage.subjectSubmitButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement SubjectAddToaster = wait.until(ExpectedConditions.visibilityOf(SubjectPage.subjectAddToaster));
        return SubjectAddToaster.isDisplayed();
    }

    public static String subjectEdit() throws InterruptedException {
        List<WebElement> subjectTablesData = SubjectPage.subjectColumn;
        for (WebElement subjectTable : subjectTablesData) {
            String subjectNameData = subjectTable.getText();
            if (subjectNameData.equals(SubjectConstants.subjectName)) {
                SubjectPage.subjectEditButton.click();
                break;
            }
        }
        BaseClass.waitForOneSecond();
        SubjectPage.subjectCodeInput.sendKeys(SubjectConstants.subjectCode);
        SubjectPage.subjectDialogUpdateButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement subjectEditToaster = wait.until(ExpectedConditions.visibilityOf(SubjectPage.subjectEditToaster));
        return subjectEditToaster.getText();
    }

    public static String subjectDelete() throws InterruptedException {
        List<WebElement> subjectTablesData = SubjectPage.subjectColumn;
        for (WebElement subjectTable : subjectTablesData) {
            String subjectNameData = subjectTable.getText();
            if (subjectNameData.equals(SubjectConstants.subjectName)) {
                BaseClass.waitForOneSecond();
                SubjectPage.subjectDeleteButton.click();
                break;
            }
        }
        SubjectPage.subjectDialogDeleteButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement subjectDeleteToaster = wait.until(ExpectedConditions.visibilityOf(SubjectPage.subjectDeleteToaster));
        return subjectDeleteToaster.getText();
    }
}
