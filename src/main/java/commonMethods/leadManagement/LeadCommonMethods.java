package commonMethods.leadManagement;

import base.BaseClass;
import constants.centreManagement.CentreManagementConstants;
import constants.courseManagement.SubjectConstants;
import constants.leadManagement.LeadConstants;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.leadManagement.LeadPage;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class LeadCommonMethods extends BaseClass {
    public static Select select;
    public static WebDriverWait wait;
    public static JavascriptExecutor js;

    public static boolean leadAdd() throws InterruptedException {
        LeadPage.leadManagementMenu.click();
        BaseClass.waitForOneSecond();
        LeadPage.leadListingMenu.click();
        LeadPage.leadAddButton.click();
        LeadPage.studentNameInput.sendKeys(LeadConstants.childName);
        select = new Select(LeadPage.subjectDropDown);
        select.selectByVisibleText(SubjectConstants.subjectName);
        LeadPage.maleGenderRadioButton.click();
        LeadPage.dateOfBirthInput.sendKeys(LeadConstants.dateOfBirth);
        LeadPage.medicalConditionInput.sendKeys(LeadConstants.medicalCondition);
        js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        BaseClass.waitForOneSecond();
        select = new Select(LeadPage.ethnicGroupDropDown);
        select.selectByValue("Australian");
        LeadPage.kinderGardenSchoolTypeRadioButton.click();
        LeadPage.nameOfSchoolInput.sendKeys(LeadConstants.schoolName);
        select = new Select(LeadPage.centerNameDropDown);
        select.selectByVisibleText(CentreManagementConstants.centreName);
        LeadPage.saveAndNextButton.click();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement stepperOneToaster = wait.until(ExpectedConditions.visibilityOf(LeadPage.studentInformationToaster));

        // Second form
        select = new Select(LeadPage.pencilGripDropDown);
        select.selectByValue("Steady");
        select = new Select(LeadPage.pencilGripDropDown);
        select.selectByValue("Steady");
        select = new Select(LeadPage.writingDropDown);
        select.selectByValue("Straight & Firm Lines");
        select = new Select(LeadPage.recognizeAToZDropDown);
        select.selectByValue("Uppercase");
        LeadPage.yesWriteLowerAToZRadio.click();
        LeadPage.yesWriteUpperAToZRadio.click();
        LeadPage.yesSoundOfAToZRadio.click();
        LeadPage.yesCanReadSimpleSentenceRadio.click();
        LeadPage.saveAndNextButton.click();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement stepperTwoToaster = wait.until(ExpectedConditions.visibilityOf(LeadPage.studentInformationToaster));

        //3rd form
        LeadPage.mothersFullNameInput.sendKeys(LeadConstants.mothersFullName);
        LeadPage.mothersOccupationInput.sendKeys(LeadConstants.mothersOccupation);
        LeadPage.motherPrimaryRadioButton.click();
        LeadPage.mothersDateOfBirthInput.sendKeys(LeadConstants.mothersDateOfBirth);
        LeadPage.mothersMobileNumberInput.sendKeys(LeadConstants.mothersMobileNumber);
        LeadPage.mothersEmailAddressInput.sendKeys(LeadConstants.mothersEmail);
        select = new Select(LeadPage.monthlyIncomeOfMotherDropDown);
        select.selectByValue("$1001_$2000");
        js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        BaseClass.waitForOneSecond();
        LeadPage.fathersFullNameInput.sendKeys(LeadConstants.fathersFullName);
        LeadPage.fathersOccupationInput.sendKeys(LeadConstants.fathersOccupation);
        LeadPage.fathersDateOfBirthInput.sendKeys(LeadConstants.fathersDateOfBirth);
        LeadPage.fathersMobileNumberInput.sendKeys(LeadConstants.fathersMobileNumber);
        LeadPage.fathersEmailAddressInput.sendKeys(LeadConstants.fathersEmail);
        select = new Select(LeadPage.monthlyIncomeOfFatherDropDown);
        select.selectByValue("$1001_$2000");
        LeadPage.saveAndNextButton.click();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement stepperThreeToaster = wait.until(ExpectedConditions.visibilityOf(LeadPage.studentInformationToaster));

        //4th form
        LeadPage.addressInput.sendKeys(LeadConstants.address);
        LeadPage.postalCodeInput.sendKeys(LeadConstants.postalCode);
        LeadPage.nameOfEmergencyInput.sendKeys(LeadConstants.emergencyContactName);
        LeadPage.emergencyNricInput.sendKeys(LeadConstants.emergencyContactNric);
        LeadPage.emergencyContactInput.sendKeys(LeadConstants.emergencyContactNumber);
        LeadPage.auntyRelationRadio.click();
        //solution need to be implemented
        LeadPage.saveAndNextButton.click();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement stepperFourToaster = wait.until(ExpectedConditions.visibilityOf(LeadPage.studentInformationToaster));

        //5th form
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement tuesdayCheckBox = wait.until(ExpectedConditions.elementToBeClickable(LeadPage.tuesdayCheckBox));
        LeadPage.wednesdayCheckBox.click();
        LeadPage.thursdayCheckBox.click();
        LeadPage.fridayCheckBox.click();
        LeadPage.sundayCheckBox.click();
        LeadPage.preferredTimeSlotCheckboxOne.click();
        LeadPage.preferredTimeSlotCheckboxTwo.click();
        LeadPage.preferredTimeSlotCheckboxThree.click();
        LeadPage.preferredTimeSlotCheckboxFour.click();
        LeadPage.preferredTimeSlotCheckboxFive.click();
        LeadPage.enquiryDateInput.sendKeys(LeadConstants.enquiryDate);
        LeadPage.saveAndNextButton.click();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement stepperFiveToaster = wait.until(ExpectedConditions.visibilityOf(LeadPage.studentInformationToaster));

        //6th form
        LeadPage.agreeConditionOneCheckBox.click();
        LeadPage.agreeConditionTwoCheckBox.click();
        LeadPage.agreeConditionThreeCheckBox.click();
        LeadPage.lastSubmitButton.click();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement stepperSixToaster = wait.until(ExpectedConditions.visibilityOf(LeadPage.studentInformationToaster));
        return stepperSixToaster.isDisplayed();
    }

    public static boolean arrangingAssesment() {
        List<WebElement> leadListingColumnData = LeadPage.leadListingColumn;
        for (WebElement leadLisitng : leadListingColumnData) {
            String leadNameData = leadLisitng.getText();
            if (leadNameData.equals(LeadConstants.childName)) {
                LeadPage.newOrWaitListStatusButton.click();
                LeadPage.arrangingAssesmentButton.click();
                break;
            }
        }
        String currentDate = LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        LeadPage.assessmentDateInput.sendKeys(currentDate);
        LeadPage.arrangeAssessmentSaveButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement arrangeAssessmentToaster = wait.until(ExpectedConditions.visibilityOf(LeadPage.arrangeAssessmentToaster));
        return arrangeAssessmentToaster.isDisplayed();
    }

    public static boolean doAssessment() throws InterruptedException {
        List<WebElement> leadColumnData = LeadPage.leadListingColumn;
        for (WebElement leadListing : leadColumnData) {
            String leadNameData = leadListing.getText();
            if (leadNameData.equals(LeadConstants.childName)) {
                LeadPage.viewButtonLeadTable.click();
                // LeadPage.arrangeAssesmentTableButton.click();
                //LeadPage.doAssesmentPopupButton.click();
                break;
            }
        }
        LeadPage.doAssessmentPageButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(LeadPage.artyDreamerRadio));
        LeadPage.artyDreamerRadio.click();
        BaseClass.waitForOneSecond();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        BaseClass.waitForOneSecond();
        boolean isSelected = LeadPage.artyDreamerRadio.isSelected();
        if (!isSelected) {
            LeadPage.artyDreamerRadio.click();
        }
        BaseClass.waitForOneSecond();
        LeadPage.saveAndNextButton.click();
        BaseClass.waitForOneSecond();
        wait.until(ExpectedConditions.elementToBeClickable(LeadPage.fistedPencilGrip));
        Actions actions = new Actions(driver);
        actions.click(LeadPage.fistedPencilGrip).build().perform();
        actions.click(LeadPage.steadyOption).build().perform();
        //LeadPage.fistedPencilGrip.click();
        // LeadPage.steadyOption.click();
        BaseClass.waitForOneSecond();
        boolean steadySelected = LeadPage.steadyOption.isSelected();
        if (!steadySelected) {
            actions.click(LeadPage.steadyOption).build().perform();
        }
        LeadPage.saveAndNextButton.click();
        //wait.until(ExpectedConditions.visibilityOf(LeadPage.yesComprehensionOfInstructions));
        LeadPage.yesComprehensionOfInstructions.click();
        LeadPage.artyRemarksInputs.sendKeys("TEST_REMARKS");
        LeadPage.singleWordRadio.click();
        LeadPage.fleetingRadio.click();
        LeadPage.saveAndNextButton.click();
        LeadPage.upperCaseA.click();
        LeadPage.uppercaseB.click();
        LeadPage.uppercaseC.click();
        LeadPage.uppercaseD.click();
        LeadPage.uppercaseE.click();
        LeadPage.uppercaseF.click();
        LeadPage.uppercaseG.click();
        LeadPage.uppercaseH.click();
        BaseClass.waitForOneSecond();
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        BaseClass.waitForOneSecond();
        LeadPage.saveAndNextButton.click();
        LeadPage.hBrothersSighWordsNilCheckbox.click();
        JavascriptExecutor scrollExecutor = (JavascriptExecutor) driver;
        scrollExecutor.executeScript("window.scrollTo(0, 0);");
        BaseClass.waitForOneSecond();
        LeadPage.sighWordsNilCheckbox.click();
        BaseClass.waitForOneSecond();
        JavascriptExecutor scrollExecutor2 = (JavascriptExecutor) driver;
        scrollExecutor2.executeScript("arguments[0].scrollIntoView(true);", LeadPage.submitButton);
        BaseClass.waitForOneSecond();
        LeadPage.submitButton.click();
        WebDriverWait waitToaster = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement doAssessmentToaster = waitToaster.until(ExpectedConditions.visibilityOf(LeadPage.doAssessmentArtyPursuersToaster));
        return doAssessmentToaster.isDisplayed();
    }
    public static boolean enrollLead() {
        List<WebElement> leadColumnData = LeadPage.leadListingColumn;
        for (WebElement leadListing : leadColumnData) {
            String leadNameData = leadListing.getText();
            if (leadNameData.equals(LeadConstants.childName)) {
                LeadPage.assessmentDoneButton.click();
                LeadPage.enrollLeadButton.click();
                break;
            }
        }
        return true;
    }
}
