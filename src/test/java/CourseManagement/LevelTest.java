package CourseManagement;

import base.BaseClass;
import base.SMSEnvironmentDetailsFile;
import commonMethods.courseManagement.LevelCommonMethods;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.courseManagement.LevelPage;

public class LevelTest extends BaseClass {
    @BeforeTest
    public void openingDashboard() throws InterruptedException {
        BaseClass.openChrome(SMSEnvironmentDetailsFile.reportPathForLevel);
        BaseClass.reportMethod("Login Test", "Mohit");
        String pageTitle = BaseClass.login();
        try {
            Assert.assertEquals("Arty Learning", pageTitle);
            test.pass("Login Successful");
        } catch (Exception e) {
            test.pass("Login Failed");
        }
    }

    @Test(priority = 1, description = "Admin/User adding a level inside course management")
    public static void levelAddCheck() throws InterruptedException {
        BaseClass.reportMethod("Level Add Check", "Mohit");
        LevelPage.courseManagementMenu.click();
        boolean addToaster = LevelCommonMethods.levelAdd();
        try {
            Assert.assertTrue(addToaster);
            if (addToaster) {
                test.pass("Level Added Successfully");
            }
        } catch (Exception e) {
            test.fail(e);
        }
    }


    @AfterTest
    public void close() {
        report.flush();
       // driver.close();
    }
}
