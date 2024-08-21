package CourseManagement;

import base.BaseClass;
import base.SMSEnvironmentDetailsFile;
import commonMethods.courseManagement.LevelCommonMethods;
import commonMethods.courseManagement.SubjectCommonMethods;
import constants.courseManagement.SubjectConstants;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SubjectTest extends BaseClass {
    @BeforeTest
    public static void openingDashboard() throws InterruptedException {
        BaseClass.openChrome(SMSEnvironmentDetailsFile.reportPathForSubject);
        BaseClass.reportMethod("Login Test", "Mohit");
        String pageTitle = BaseClass.login();
        try {
            Assert.assertEquals("Arty Learning", pageTitle);
            test.pass("Login Successful");
        } catch (Exception e) {
            test.pass("Login Failed");
        }
    }

    @Test(priority = 1, description = "Admin/User adding a subject inside course management")
    public static void subjectAddCheck() {
        BaseClass.reportMethod("Subject Add Check", "Mohit");
        boolean addToaster = SubjectCommonMethods.subjectAdd();
        try {
            Assert.assertTrue(addToaster);
            if (addToaster) {
                test.pass("Subject Added Successfully");
            }
        } catch (Exception e) {
            test.fail(e);
        }
    }

    @Test(priority = 2)
    public static void subjectEditCheck() throws InterruptedException {
        BaseClass.reportMethod("Subject Edit Check", "Mohit");
        String editToaster = SubjectCommonMethods.subjectEdit();
        try {
            Assert.assertEquals(SubjectConstants.subjectEditToasterMessage, editToaster);
            if (SubjectConstants.subjectEditToasterMessage.equals(editToaster)) {
                test.pass("Subject Edited Successfully");
            }
        } catch (Exception e) {
            test.fail(e);
        }
    }

    @Test(priority = 3, description = "Admin/user deleting the added subject")
    public static void subjectDeleteCheck() throws InterruptedException {
        BaseClass.reportMethod("Subject Delete Check", "Mohit");
        String subjectDeleteToasterMessage = SubjectCommonMethods.subjectDelete();
        try {
            Assert.assertEquals(SubjectConstants.subjectDeleteToasterMessage, subjectDeleteToasterMessage);
            if (SubjectConstants.subjectEditToasterMessage.equals(subjectDeleteToasterMessage)) {
                test.pass("Centre Deleted Successfully");
            }
        } catch (Exception e) {
            test.fail(e);
        }
    }

    @AfterTest
    public void close() {
        report.flush();
        driver.close();
    }
}

