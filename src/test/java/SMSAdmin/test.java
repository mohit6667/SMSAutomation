package SMSAdmin;

import base.BaseClass;
import base.SMSEnvironmentDetailsFile;
import commonMethods.staffing.TeacherCommonMethods;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;

public class test extends BaseClass {

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

    @Test(priority = 1)
    public void staffingTeacher() throws InterruptedException, AWTException {
        BaseClass.reportMethod("Adding Teacher", "Mohit");
        boolean teacherAddToaster = TeacherCommonMethods.teacherAdd();
    }

    @AfterTest
    public void close() {
        report.flush();
       // driver.close();
    }
}


