import base.BaseClass;
import base.SMSEnvironmentDetailsFile;
import constants.staffing.StaffConstants;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Sample extends BaseClass {
    public static JavascriptExecutor js;
    public static LocalDateTime sysDate = LocalDateTime.now();
    public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public static Select selector;

    @BeforeTest
    public void openingDashboard() throws InterruptedException {
        BaseClass.openChrome(SMSEnvironmentDetailsFile.reportPathForSMSAdmin);
        BaseClass.reportMethod("Login Test", "Mohit");
        String pageTitle = BaseClass.login();
        try {
            Assert.assertEquals("Arty Learning", pageTitle);
            test.pass("Login Successful");
        } catch (Exception e) {
            test.pass("Login Failed");
        }
    }

    @Test
    public void screenshotMethod() throws IOException {
        TakesScreenshot screenshot = ((TakesScreenshot) driver); //initalization
        File sourceFile = screenshot.getScreenshotAs(OutputType.FILE); //orginal screenshot
        File destination = new File("src/main/java/report/loginScreenshot.png"); // just empty file as png will be created
        FileUtils.copyFile(sourceFile,destination);
    }
}
