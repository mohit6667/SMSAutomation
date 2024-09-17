package SMSAdmin;

import base.BaseClass;
import base.SMSEnvironmentDetailsFile;
import commonMethods.centreManagement.CentreManagementCommonMethods;
import commonMethods.courseManagement.ClassCommonMethods;
import commonMethods.courseManagement.CourseCommonMethods;
import commonMethods.courseManagement.LevelCommonMethods;
import commonMethods.courseManagement.SubjectCommonMethods;
import commonMethods.schedule.ScheduleCommonMethods;
import commonMethods.staffing.TeacherCommonMethods;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import java.awt.*;

public class SMSAdminTest extends BaseClass {
    @BeforeTest
    public void openingDashboard() {
        BaseClass.openChrome(SMSEnvironmentDetailsFile.reportPathForSMSAdmin);
        BaseClass.reportMethod("Login Test", "Mohit");
        try {
            String pageTitle = BaseClass.login();
            Assert.assertEquals("Arty Learning", pageTitle);
            test.pass("Login Successful");
        } catch (Exception e) {
            test.pass("Login Failed");
        }
    }

    @Test(priority = 1, description = "Admin/User adding a centre,subject,level,class& course inside course management")
    public void centreAdd() throws InterruptedException, AWTException {
        CentreManagementCommonMethods.centreAdd();
    }

    @Test(priority = 2)
    public void centreFeesAdd() {
        try {
            boolean registrationFeesToaster = CentreManagementCommonMethods.registrationFeesAdd();
            Assert.assertTrue(registrationFeesToaster);
            if (registrationFeesToaster) {
                test.pass("Centre Registration Fees Added Successfully");
            }
        } catch (Exception e) {
            test.fail(e);
        }
    }

    @Test(priority = 3)
    public void centreClassroomAdd() {
        try {
            boolean classRoomToaster = CentreManagementCommonMethods.classRoomAdd();
            Assert.assertTrue(classRoomToaster);
            if (classRoomToaster) {
                test.pass("Classroom Added Successfully");
            }
        } catch (
                Exception e) {
            test.fail(e);
        }
    }

    @Test(priority = 4)
    public void centrePackageAdd() {
        try {
            boolean packageToaster = CentreManagementCommonMethods.packageAdd();
            Assert.assertTrue(packageToaster);
            if (packageToaster) {
                test.pass("Package Added Successfully");
            }
        } catch (
                Exception e) {
            test.fail(e);
        }
    }

    @Test(priority = 5)
    public void subjectAdd() {
        try {
            boolean subjectAddToaster = SubjectCommonMethods.subjectAdd();
            Assert.assertTrue(subjectAddToaster);
            if (subjectAddToaster) {
                test.pass("Subject Added Successfully");
            }
        } catch (Exception e) {
            test.fail(e);
        }
    }

    @Test(priority = 6)
    public void levelAdd() throws InterruptedException {
        boolean levelAddToaster = LevelCommonMethods.levelAdd();
        try {
            Assert.assertTrue(levelAddToaster);
            if (levelAddToaster) {
                test.pass("Level Added Successfully");
            }
        } catch (Exception e) {
            test.fail(e);
        }
    }

    @Test(priority = 7)
    public void courseAdd() throws InterruptedException {
        boolean courseAddToaster = CourseCommonMethods.courseAdd();
        try {

            Assert.assertTrue(courseAddToaster);
            if (courseAddToaster) {
                test.pass("Course Added Successfully");
            }
        } catch (Exception e) {
            test.fail(e);
        }
    }

    @Test(priority = 8)
    public void classAdd() {
        try {
            boolean classAddToaster = ClassCommonMethods.classAdd();
            Assert.assertTrue(classAddToaster);
            if (classAddToaster) {
                test.pass("Class Added Successfully");
            }
        } catch (Exception e) {
            test.fail(e);
        }
    }
    @Test(priority = 9, description = "Adding a teacher")
    public static void teacherAdd() {
        try {
            boolean bookingOutput = TeacherCommonMethods.teacherAdd();
            Assert.assertTrue(bookingOutput, "The teacher details were not added successfully.");
            if (bookingOutput) {
                test.pass("Teacher Personal Information Added Successfully");
            }
        } catch (Exception e) {
            test.fail("Test failed due to an exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
    @Test(priority = 10, description = "Admin/User adding a schedule inside Schedule")
    public void scheduleAddCheck() {
        BaseClass.reportMethod("Schedule Add Check", "Mohit");
        try {
            boolean scheduleAddToaster = ScheduleCommonMethods.scheduleAdd();
            Assert.assertTrue(scheduleAddToaster);
            if (scheduleAddToaster) {
                test.pass("Schedule Added Successfully");
            }
        } catch (Exception e) {
            test.fail(e);
        }
    }
/*
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
    }*/

    @AfterTest
    public void close() {
        report.flush();
        //driver.close();
    }
}


