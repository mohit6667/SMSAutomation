package commonMethods.centreManagement;

import base.BaseClass;
import constants.centreManagement.CentreManagementConstants;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.centreManagement.CentreManagementPage;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

public class CentreManagementCommonMethods extends BaseClass {
    public static JavascriptExecutor js;
    public static int centreAddLoopCount;

    public static String centreAdd() throws AWTException, InterruptedException {
        js = (JavascriptExecutor) driver;

        // traversing to centre index page
        CentreManagementPage.centreManagementMenu.click();
        CentreManagementPage.centreListingMenu.click();
        CentreManagementPage.centreAddButton.click();
        // entering values in inputs of center add
        CentreManagementPage.centreNameInput.sendKeys(CentreManagementConstants.centreName);
        CentreManagementPage.centreCodeInput.sendKeys(CentreManagementConstants.centreCode);
        //center manager dropdown handle
        WebElement centreManagerDropDown = CentreManagementPage.centerManagerInput;
        Select selector = new Select(centreManagerDropDown);
        selector.selectByValue("351");
        // entering values in inputs of center add
        CentreManagementPage.zipCodeInput.sendKeys(CentreManagementConstants.zipCode);
        CentreManagementPage.mobileInput.sendKeys(CentreManagementConstants.mobile);
        CentreManagementPage.emailInput.sendKeys(CentreManagementConstants.email);
        js.executeScript("window.scrollTo(0, document.documentElement.scrollHeight);");
        BaseClass.waitForOneSecond();
        CentreManagementPage.gstRadioButton.click();
        CentreManagementPage.uenNumberInput.sendKeys(CentreManagementConstants.uenNumber);
        CentreManagementPage.taxRegistrationNumberInput.sendKeys(CentreManagementConstants.taxRegistrationNumber);
        BaseClass.waitForTwoSecond();
        CentreManagementPage.openingDateInput.click();
        CentreManagementPage.openingDateInput.click();
        CentreManagementPage.openingDateInput.sendKeys(CentreManagementConstants.openingDate);
        CentreManagementPage.bankNameInput.sendKeys(CentreManagementConstants.bankName);
        CentreManagementPage.bankAccountNumberInput.sendKeys(CentreManagementConstants.bankAccountNumber);
        CentreManagementPage.bankAccountNameInput.sendKeys(CentreManagementConstants.bankAccountName);
        CentreManagementPage.bankBranchInput.sendKeys(CentreManagementConstants.bankBranch);
        // uploading qr code
        WebElement qrUpload = CentreManagementPage.qrCodeInput;
        Actions actions = new Actions(driver);
        Robot robot = new Robot();
        String filePath = System.getProperty("user.dir") + CentreManagementConstants.qrCodeFilePath;
        StringSelection stringSelection = new StringSelection(filePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
        actions.click(qrUpload).build().perform();
        BaseClass.waitForTwoSecond();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        //save and toaster check
        js.executeScript("window.scrollTo(0, 0)");
        Thread.sleep(2000);
        CentreManagementPage.centreSaveButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement centreSaveToaster = wait.until(ExpectedConditions.visibilityOf(CentreManagementPage.centreAddToaster));
        //boolean centreSaveToasterDisplay = centreSaveToaster.isDisplayed();
        //Assert.assertTrue(centreSaveToasterDisplay);
        return centreSaveToaster.getText();
    }

    public static String centreEdit() throws InterruptedException {
        List<WebElement> centreListingColumnData = CentreManagementPage.centreListingColumn;
        centreAddLoopCount = 0;
        for (WebElement centreListing : centreListingColumnData) {
            String centreNameData = centreListing.getText();
            centreAddLoopCount = centreAddLoopCount + 1;
            if (centreNameData.equals(CentreManagementConstants.centreName)) {
                CentreManagementPage.centreListingEditButton.click();
                break;
            }
        }
        BaseClass.waitForTwoSecond();
        CentreManagementPage.centreCodeInput.sendKeys(CentreManagementConstants.centreUpdatedName);
        WebElement updateButton = CentreManagementPage.centreSaveButton;
        updateButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement centreUpdateToaster = wait.until(ExpectedConditions.visibilityOf(CentreManagementPage.centreEditToaster));
        return centreUpdateToaster.getText();
    }

    public static String centreDelete() throws InterruptedException {
        List<WebElement> centreListingColumnData = CentreManagementPage.centreListingColumn;
        for (WebElement centreListing : centreListingColumnData) {
            String centreNameData = centreListing.getText();
            if (centreNameData.equals(CentreManagementConstants.centreName)) {
                Thread.sleep(1000);
                CentreManagementPage.centreListingDeleteButton.click();
                break;
            }
        }
        CentreManagementPage.centreDeleteButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement centreDeleteToaster = wait.until(ExpectedConditions.visibilityOf(CentreManagementPage.centreDeleteToaster));
        return centreDeleteToaster.getText();
    }

    public static boolean registrationFeesAdd() {
        List<WebElement> centreListingColumnData = CentreManagementPage.centreListingColumn;
        for (WebElement centreListing : centreListingColumnData) {
            String centreNameData = centreListing.getText();
            if (centreNameData.equals(CentreManagementConstants.centreName)) {
                CentreManagementPage.centreDropDownAddButton.click();
                break;
            }
        }
        CentreManagementPage.addRegistrationButton.click();
        CentreManagementPage.effectiveDateInput.sendKeys(CentreManagementConstants.effectiveDate);
        CentreManagementPage.amountInput.sendKeys(CentreManagementConstants.amount);
        Select taxTypeDropDown = new Select(CentreManagementPage.taxTypeDropDown);
        taxTypeDropDown.selectByIndex(2);
        Select statusDropDown = new Select(CentreManagementPage.statusDropDown);
        statusDropDown.selectByValue("Active");
        CentreManagementPage.registrationFeesSaveButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement registrationFeesSaveToaster = wait.until(ExpectedConditions.visibilityOf(CentreManagementPage.registrationFeesSaveToaster));
        return registrationFeesSaveToaster.isDisplayed();
    }

    public static boolean centreBreakAdd() {
        List<WebElement> centreListingColumnData = CentreManagementPage.centreListingColumn;
        for (WebElement centreListing : centreListingColumnData) {
            String centreNameData = centreListing.getText();
            if (centreNameData.equals(CentreManagementConstants.centreName)) {
                CentreManagementPage.centreDropDownAddButton.click();
                break;
            }
        }
        CentreManagementPage.addCentreBreakButton.click();
        CentreManagementPage.breakNameInput.sendKeys(CentreManagementConstants.centreBreakName);
        CentreManagementPage.fromDateInput.sendKeys(CentreManagementConstants.fromDate);
        CentreManagementPage.toDateInput.sendKeys(CentreManagementConstants.toDate);
        CentreManagementPage.centreBreakSaveButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement centreBreakAddToaster = wait.until(ExpectedConditions.visibilityOf(CentreManagementPage.centreBreakSaveToaster));
        return centreBreakAddToaster.isDisplayed();
    }

    public static boolean classRoomAdd() {
        List<WebElement> centreListingColumnData = CentreManagementPage.centreListingColumn;
        for (WebElement centreListing : centreListingColumnData) {
            String centreNameData = centreListing.getText();
            if (centreNameData.equals(CentreManagementConstants.centreName)) {
                CentreManagementPage.centreDropDownAddButton.click();
                break;
            }
        }
        CentreManagementPage.addClassroomButton.click();
        CentreManagementPage.classRoomNameInput.sendKeys(CentreManagementConstants.classRoomName);
        CentreManagementPage.classRoomCodeInput.sendKeys(CentreManagementConstants.classRoomCode);
        Select select = new Select(CentreManagementPage.classRoomTypeDropDown);
        select.selectByValue("Medium");
        CentreManagementPage.capacityInput.sendKeys(CentreManagementConstants.capacity);
        //CentreManagementPage.descriptionInput.sendKeys(CentreManagementConstants.classRoomDescription);
        CentreManagementPage.classRoomSaveButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement classRoomAddToaster = wait.until(ExpectedConditions.visibilityOf(CentreManagementPage.classRoomSaveToaster));
        return classRoomAddToaster.isDisplayed();
    }
    public static boolean packageAdd() {
        List<WebElement> centreListingColumnData = CentreManagementPage.centreListingColumn;
        for (WebElement centreListing : centreListingColumnData) {
            String centreNameData = centreListing.getText();
            if (centreNameData.equals(CentreManagementConstants.centreName)) {
                CentreManagementPage.centreDropDownAddButton.click();
                break;
            }
        }
        CentreManagementPage.addPackageButton.click();
        CentreManagementPage.packageNameInput.sendKeys(CentreManagementConstants.packageName);
        CentreManagementPage.noOfLessonInput.sendKeys(CentreManagementConstants.noOfLesson);
        CentreManagementPage.packageSaveButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement packageAddToaster = wait.until(ExpectedConditions.visibilityOf(CentreManagementPage.packageSaveToaster));
        return packageAddToaster.isDisplayed();
    }
}

