package CentreManagement;

import base.BaseClass;
import base.SMSEnvironmentDetailsFile;
import commonMethods.centreManagement.CentreManagementCommonMethods;
import constants.centreManagement.CentreManagementConstants;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;

public class CentreManagementTest extends BaseClass {
    @BeforeTest
    public void openingDashboard() throws InterruptedException {
        BaseClass.openChrome(SMSEnvironmentDetailsFile.reportPathForCentre);
        BaseClass.reportMethod("Login Test", "Mohit");
        String pageTitle = BaseClass.login();
        try {
            Assert.assertEquals("Arty Learning", pageTitle);
            test.pass("Login Successful");
        } catch (Exception e) {
            test.pass("Login Failed");
        }
    }

    @Test(priority = 1, description = "Admin/User adding a centre inside centre management")
    public static void centreAddCheck() throws AWTException, InterruptedException {
        BaseClass.reportMethod("Centre Add Check", "Mohit");
        String centreSaveMessage = CentreManagementCommonMethods.centreAdd();
        try {
            Assert.assertEquals(CentreManagementConstants.centreAddToasterMessage, centreSaveMessage);
            if (CentreManagementConstants.centreAddToasterMessage.equals(centreSaveMessage)) {
                test.pass("Centre Added Successfully");
            }
        } catch (Exception e) {
            test.fail(e);
        }
    }

    @Test(priority = 2, description = "Admin/user editing the added centre")
    public static void centreEditCheck() throws InterruptedException {
        BaseClass.reportMethod("Centre Edit Check", "Mohit");
        String centreUpdateToasterMessage = CentreManagementCommonMethods.centreEdit();
        try {
            Assert.assertEquals(CentreManagementConstants.centreEditToasterMessage, centreUpdateToasterMessage);
            if (CentreManagementConstants.centreEditToasterMessage.equals(centreUpdateToasterMessage)) {
                test.pass("Centre Edited Successfully");
            }
        } catch (Exception e) {
            test.fail(e);
        }
    }

    @Test(priority = 3, description = "Admin/user deleting the added centre")
    public static void centreDeleteCheck() throws InterruptedException {
        BaseClass.reportMethod("Centre Delete Check", "Mohit");
        String centreDeleteToasterMessage = CentreManagementCommonMethods.centreDelete();
        try {
            Assert.assertEquals(CentreManagementConstants.centreDeleteToasterMessage, centreDeleteToasterMessage);
            if (CentreManagementConstants.centreDeleteToasterMessage.equals(centreDeleteToasterMessage)) {
                test.pass("Centre Deleted Successfully");
            }
        } catch (Exception e) {
            test.fail(e);
        }
    }

    @AfterTest
    public static void closingChrome() {
        report.flush();
        driver.close();
    }
}