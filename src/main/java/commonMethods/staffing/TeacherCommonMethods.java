package commonMethods.staffing;

import base.BaseClass;
import constants.centreManagement.CentreManagementConstants;
import constants.staffing.TeacherConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import page.staffing.StaffPage;
import page.staffing.TeacherPage;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.UUID;

public class TeacherCommonMethods extends BaseClass {
    public static Select select;

    public static boolean teacherAdd() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        TeacherPage.staffingMenu.click();
        BaseClass.waitForOneSecond();
        TeacherPage.teacherMenu.click();
        TeacherPage.addTeacherButton.click();
        TeacherPage.teacherName.sendKeys(TeacherConstants.teacherName);
        TeacherPage.teacherDateOfBirth.sendKeys(TeacherConstants.teacherDateOfBirth);
        BaseClass.waitForTwoSecond();
        Select selectTeacherIdType = new Select(TeacherPage.teacherIdType);
        selectTeacherIdType.selectByValue(TeacherConstants.teacherIdType);
        UUID uuid = UUID.randomUUID();
        String uuidString = uuid.toString();
        String teacherID = uuidString.substring(0, 8);
        TeacherPage.teacherIdNo.sendKeys(teacherID);
        Select selectTeacherCitizenship = new Select(TeacherPage.teacherCitizenship);
        selectTeacherCitizenship.selectByValue(TeacherConstants.teacherCitizenship);
        String filePath = System.getProperty("user.dir") + TeacherConstants.teacherProfileImage;
        TeacherPage.teacherProfileImage.sendKeys(filePath);
        scroll.executeScript("window.scrollTo(0, document.documentElement.scrollHeight);");
        String uniqueID = UUID.randomUUID().toString().substring(0, 8);
        String uniqueEmail = uniqueID + "@gmail.com";
        BaseClass.waitForOneSecond();
        TeacherPage.teacherEmailId.sendKeys(uniqueEmail);
        TeacherPage.teacherEmailIdPassword.sendKeys(TeacherConstants.teacherEmailIdPassword);
        TeacherPage.teacherEmailIdConfirmPwd.sendKeys(TeacherConstants.teacherEmailIdConfirmPwd);
        TeacherPage.teacherGenderFemale.click();
        TeacherPage.teacherShortIntroduction.sendKeys(TeacherConstants.teacherShortIntroduction);
        scroll.executeScript("arguments[0].scrollIntoView(true);", TeacherPage.teacherShortIntroduction);
        BaseClass.waitForTwoSecond();
        TeacherPage.saveAndNextButton.click();
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dateString = currentDate.format(formatter);
        TeacherPage.startDateOfWorking.sendKeys(dateString);
        BaseClass.waitForOneSecond();
        driver.findElement(By.xpath("//div[@class='dropdown-heading']")).click();
        List<WebElement> optionsData = driver.findElements(By.xpath("//div[@class='dropdown-content']/div/div/ul/li/label/div/span"));
        for (WebElement option : optionsData) {
            if (option.getText().equals(CentreManagementConstants.centreName)) {
                option.click();
                break;
            }
        }
        TeacherPage.teacherIdInput.sendKeys(TeacherConstants.teacherIdInput);
        Select selectTeacherTypeDropDown = new Select(TeacherPage.teacherTypeDropDown);
        selectTeacherTypeDropDown.selectByValue(TeacherConstants.teacherTypeDropDown);
        Select selectShgTypeDropDown = new Select(TeacherPage.shgTypeDropDown);
        selectShgTypeDropDown.selectByValue(TeacherConstants.shgTypeDropDown);
        scroll.executeScript("window.scrollTo(0, document.documentElement.scrollHeight);");
        BaseClass.waitForOneSecond();
        TeacherPage.yesApproval.click();
        TeacherPage.workingDaysCheckbox.click();
        TeacherPage.saveAndNextButton.click();
        TeacherPage.contactNumberInput.sendKeys(TeacherConstants.contactNumberInput);
        TeacherPage.addressInput.sendKeys(TeacherConstants.addressInput);
        TeacherPage.postalCodeInput.sendKeys(TeacherConstants.postalCodeInput);
        TeacherPage.saveAndNextButton.click();
        BaseClass.waitForOneSecond();
        TeacherPage.saveAndNextButton.click();
        TeacherPage.salary.sendKeys(TeacherConstants.salary);
        TeacherPage.salaryEffectiveDate.sendKeys(dateString);
        Select selectSalaryTypeDropDown = new Select(TeacherPage.salaryType);
        selectSalaryTypeDropDown.selectByValue(TeacherConstants.salaryType);
        TeacherPage.saveAndNextButton.click();
        int currentYear = LocalDate.now().getYear();
        String yearString = Integer.toString(currentYear);
        TeacherPage.yearInput.sendKeys(yearString);
        TeacherPage.annualLeaveInput.sendKeys(TeacherConstants.annualLeaveInput);
        TeacherPage.medicalLeaveInput.sendKeys(TeacherConstants.medicalLeaveInput);
        TeacherPage.otherLeaveInput.sendKeys(TeacherConstants.otherLeaveInput);
        TeacherPage.carryForwardLeave.sendKeys(TeacherConstants.carryForwardLeave);
        TeacherPage.saveAndNextButton.click();
        Select selectEmployerTypeDropDown = new Select(TeacherPage.employerInput);
        selectEmployerTypeDropDown.selectByVisibleText(CentreManagementConstants.centreName);
        TeacherPage.nricOfEmployee.sendKeys(TeacherConstants.nricOfEmployee);
        BaseClass.waitForOneSecond();
        scroll.executeScript("arguments[0].scrollIntoView(true);", TeacherPage.nricOfEmployee);
        BaseClass.waitForOneSecond();
        TeacherPage.jobTitle.sendKeys(TeacherConstants.jobTitle);
        TeacherPage.mainDuties.sendKeys(TeacherConstants.mainDuties);
        TeacherPage.training.sendKeys(TeacherConstants.training);
        TeacherPage.allowance.sendKeys(TeacherConstants.allowance);
        LocalDate lastDay = LocalDate.of(currentYear, 12, 31);
        String yearEnd = lastDay.format(formatter);
        TeacherPage.employeeContractEndDate.sendKeys(yearEnd);
        BaseClass.waitForOneSecond();
        scroll.executeScript("arguments[0].scrollIntoView(true);", TeacherPage.employeeContractEndDate);
        BaseClass.waitForOneSecond();
        TeacherPage.probation.sendKeys(TeacherConstants.probation);
        TeacherPage.payNowDetails.sendKeys(TeacherConstants.payNowDetails);
        TeacherPage.internetBanking.sendKeys(TeacherConstants.internetBanking);
        TeacherPage.terminationNotice.sendKeys(TeacherConstants.terminationNotice);
        BaseClass.waitForOneSecond();
        scroll.executeScript("arguments[0].scrollIntoView(true);", TeacherPage.terminationNotice);
        BaseClass.waitForOneSecond();
        TeacherPage.submitTeacherButton.click();
        return TeacherPage.submitTeacherButton.isDisplayed();
    }
}