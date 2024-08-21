package SMSAdmin;

import CentreManagement.CentreManagementTest;
import base.BaseClass;
import base.SMSEnvironmentDetailsFile;
import commonMethods.centreManagement.CentreManagementCommonMethods;
import commonMethods.courseManagement.ClassCommonMethods;
import commonMethods.courseManagement.CourseCommonMethods;
import commonMethods.courseManagement.LevelCommonMethods;
import commonMethods.courseManagement.SubjectCommonMethods;
import commonMethods.leadManagement.LeadCommonMethods;
import commonMethods.staffing.TeacherCommonMethods;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import java.awt.*;

public class SMSAdminTest extends BaseClass {
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

    @Test(priority = 1, description = "Admin/User adding a centre,subject,level,class& course inside course management")
    public void centreAndCourseManagement() throws InterruptedException, AWTException {
        CentreManagementTest.centreAddCheck();

        // registration fees add

        boolean registrationFeesToaster = CentreManagementCommonMethods.registrationFeesAdd();
        try {
            Assert.assertTrue(registrationFeesToaster);
            if (registrationFeesToaster) {
                test.pass("Centre Registration Fees Added Successfully");
            }
        } catch (Exception e) {
            test.fail(e);
        }

        // centre break add

        boolean centreBreakToaster = CentreManagementCommonMethods.centreBreakAdd();
        try {
            Assert.assertTrue(centreBreakToaster);
            if (centreBreakToaster) {
                test.pass("Centre Break Added Successfully");
            }
        } catch (Exception e) {
            test.fail(e);
        }

        // classroom add

        boolean classRoomToaster = CentreManagementCommonMethods.classRoomAdd();
        try {
            Assert.assertTrue(classRoomToaster);
            if (classRoomToaster) {
                test.pass("Classroom Added Successfully");
            }
        } catch (Exception e) {
            test.fail(e);
        }

        //package add

        boolean packageToaster = CentreManagementCommonMethods.packageAdd();
        try {
            Assert.assertTrue(packageToaster);
            if (packageToaster) {
                test.pass("Package Added Successfully");
            }
        } catch (Exception e) {
            test.fail(e);
        }

        //course management

        BaseClass.reportMethod("Course Management", "Mohit");
        boolean subjectAddToaster = SubjectCommonMethods.subjectAdd();
        try {
            Assert.assertTrue(subjectAddToaster);
            if (subjectAddToaster) {
                test.pass("Subject Added Successfully");
            }
        } catch (Exception e) {
            test.fail(e);
        }
        boolean levelAddToaster = LevelCommonMethods.levelAdd();
        try {
            Assert.assertTrue(levelAddToaster);
            if (levelAddToaster) {
                test.pass("Level Added Successfully");
            }
        } catch (Exception e) {
            test.fail(e);
        }
        boolean courseAddToaster = CourseCommonMethods.courseAdd();
        try {
            Assert.assertTrue(courseAddToaster);
            if (courseAddToaster) {
                test.pass("Course Added Successfully");
            }
        } catch (Exception e) {
            test.fail(e);
        }
        boolean classAddToaster = ClassCommonMethods.classAdd();
        try {
            Assert.assertTrue(classAddToaster);
            if (classAddToaster) {
                test.pass("Class Added Successfully");
            }
        } catch (Exception e) {
            test.fail(e);
        }
    }

    @Test(priority = 2)
    public void leadManagement() throws InterruptedException {
        BaseClass.reportMethod("Lead Management", "Mohit");
        boolean leadAddToaster = LeadCommonMethods.leadAdd();
        try {
            Assert.assertTrue(leadAddToaster);
            if (leadAddToaster) {
                test.pass("Lead Added Successfully");
            }
        } catch (Exception e) {
            test.fail(e);
        }
        boolean arrangeAssessmentToaster = LeadCommonMethods.arrangingAssesment();
        try {
            Assert.assertTrue(arrangeAssessmentToaster);
            if (arrangeAssessmentToaster) {
                test.pass("Arrange Assessment Done Successfully");
            }
        } catch (Exception e) {
            test.fail(e);
        }
        BaseClass.waitForTwoSecond();
        boolean doAssessmentToaster = LeadCommonMethods.doAssessment();
        try {
            Assert.assertTrue(doAssessmentToaster);
            if (doAssessmentToaster) {
                test.pass("Do Assessment Done Successfully");
            }
        } catch (Exception e) {
            test.fail(e);
        }
    }

    @Test(priority = 3)
    public void staffingTeacher() throws InterruptedException, AWTException {
        BaseClass.reportMethod("Adding Teacher", "Mohit");
        boolean teacherAddToaster = TeacherCommonMethods.teacherAdd();
    }

    @AfterTest
    public void close() {
        report.flush();
        //driver.close();
    }
}


