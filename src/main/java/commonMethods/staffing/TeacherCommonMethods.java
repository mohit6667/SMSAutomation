package commonMethods.staffing;

import base.BaseClass;
import constants.centreManagement.CentreManagementConstants;
import constants.staffing.TeacherConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.staffing.TeacherPage;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

public class TeacherCommonMethods extends BaseClass {
    public static Select select;
    public static JavascriptExecutor js;

    public static boolean teacherAdd() throws AWTException, InterruptedException {
        TeacherPage.staffingMenu.click();
        TeacherPage.teacherMenu.click();
        TeacherPage.addTeacherButton.click();
        TeacherPage.teacherNameInput.sendKeys(TeacherConstants.teacherName);
        BaseClass.waitForTwoSecond();
        Actions actions2 = new Actions(driver);
        actions2.sendKeys(TeacherPage.dateOfBirthInput, TeacherConstants.teacherDateOfBirth).build().perform();
        //TeacherPage.dateOfBirthInput.sendKeys(TeacherConstants.teacherDateOfBirth);

        select = new Select(TeacherPage.idTypeDropDown);
        select.selectByValue("INSTAGRAM");
        TeacherPage.idNoInput.sendKeys(TeacherConstants.teacherIdNumber);
        select = new Select(TeacherPage.citizenshipDropDown);
        select.selectByIndex(1);
        // upload image

        WebElement teacherProfileImage = TeacherPage.teacherProfileImage;
        Actions actions = new Actions(driver);
        Robot robot = new Robot();
        String filePath = System.getProperty("user.dir") + TeacherConstants.teacherImageFile;
        StringSelection stringSelection = new StringSelection(filePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
        //teacherProfileImage.click();
        actions.click(teacherProfileImage).build().perform();
        BaseClass.waitForOneSecond();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        TeacherPage.maleGender.click();
        BaseClass.waitForOneSecond();
        js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        BaseClass.waitForOneSecond();
        boolean genderRadioButton = TeacherPage.maleGender.isSelected();
        if (!genderRadioButton) {
            TeacherPage.maleGender.click();
        }
        TeacherPage.saveAndNextButton.click();

        //2nd form
        BaseClass.waitForFourSecond();
        driver.findElement(By.xpath("//div[@class='dropdown-heading']")).click();
        List<WebElement> optionsData = driver.findElements(By.xpath("//div[@class='dropdown-content']/div/div/ul/li/label/div/span"));
        for (WebElement option : optionsData) {
            if (option.getText().equals(CentreManagementConstants.centreName)) {
                option.click();
                break;
            }
        }
        driver.findElement(By.xpath("//div[@class='dropdown-heading']")).click();
        TeacherPage.workingDaysCheckbox.click();
        TeacherPage.yesApprovalContentRequired.click();
        TeacherPage.teacherIdInput.sendKeys(TeacherConstants.teacherIdNumber);
        Select select = new Select(TeacherPage.teacherTypeDropDown);
        select.selectByValue("Permanent");
        TeacherPage.startDateInput.sendKeys(TeacherConstants.startDate);
        TeacherPage.saveAndNextButton.click();

        // 2nd form

        TeacherPage.emailInput.sendKeys(TeacherConstants.teacherEmail);
        TeacherPage.contactNumberInput.sendKeys(TeacherConstants.contactNumber);
        TeacherPage.addressInput.sendKeys(TeacherConstants.address);
        TeacherPage.postalCodeInput.sendKeys(TeacherConstants.pinCode);
        TeacherPage.saveAndNextButton.click();

        // 3rd form

        TeacherPage.passwordInput.sendKeys(TeacherConstants.password);
        TeacherPage.confirmPasswordInput.sendKeys(TeacherConstants.password);
        TeacherPage.saveAndNextButton.click();

        //4th form
        //BaseClass.waitForSixSecond();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("educationCertificate"))));
        TeacherPage.saveAndNextButton.click();

        //5th form
        WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(20));
        wait1.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("salary"))));
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        BaseClass.waitForTwoSecond();
        TeacherPage.saveAndNextButton.click();

        //6th form
        wait1.until(ExpectedConditions.visibilityOf(TeacherPage.carryForwardLeave));
        BaseClass.waitForFourSecond();
        JavascriptExecutor jsScroll = (JavascriptExecutor) driver;
        jsScroll.executeScript("arguments[0].scrollIntoView(true);", TeacherPage.yearInput);

        TeacherPage.carryForwardLeave.sendKeys(TeacherConstants.carryForwardLeave);
        TeacherPage.annualLeaveInput.sendKeys(TeacherConstants.annualLeave);
        TeacherPage.medicalLeaveInput.sendKeys(TeacherConstants.medicalLeave);
        TeacherPage.otherLeaveInput.sendKeys(TeacherConstants.otherLeave);
        BaseClass.waitForFourSecond();
        //Actions actions1 = new Actions(driver);

        TeacherPage.yearInput.clear();
        TeacherPage.yearInput.click();
        TeacherPage.yearInput.sendKeys(TeacherConstants.year);
        BaseClass.waitForFourSecond();
        scroll.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        BaseClass.waitForTwoSecond();
        TeacherPage.saveAndNextButton.click();
        return false;
    }
}
