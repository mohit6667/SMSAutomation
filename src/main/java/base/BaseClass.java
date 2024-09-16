package base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import page.centreManagement.CentreManagementPage;
import page.courseManagement.ClassPage;
import page.courseManagement.CoursePage;
import page.courseManagement.LevelPage;
import page.courseManagement.SubjectPage;
import page.leadManagement.LeadPage;
import page.loginPage.LoginPage;
import page.staffing.StaffPage;
import page.staffing.TeacherPage;

import java.time.Duration;

public class BaseClass {
    public static WebDriver driver;
    public static ExtentHtmlReporter htmlReporter;
    public static ExtentReports report;
    public static ExtentTest test;

    public static void openChrome(String filePathForReport) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        PageFactory.initElements(driver, LoginPage.class);
        PageFactory.initElements(driver, CentreManagementPage.class);
        PageFactory.initElements(driver, SubjectPage.class);
        PageFactory.initElements(driver, LevelPage.class);
        PageFactory.initElements(driver, CoursePage.class);
        PageFactory.initElements(driver, ClassPage.class);
        PageFactory.initElements(driver, LeadPage.class);
        PageFactory.initElements(driver, TeacherPage.class);
        PageFactory.initElements(driver, StaffPage.class);

        // Extent report initialize
        htmlReporter = new ExtentHtmlReporter(filePathForReport);
        report = new ExtentReports();
        report.attachReporter(htmlReporter);
    }
    public static String login() throws InterruptedException {
        driver.navigate().to(SMSEnvironmentDetailsFile.smsLoginUrl);
        LoginPage.loginEmailInput.sendKeys(SMSEnvironmentDetailsFile.smsLoginMail);
        LoginPage.passwordInput.sendKeys(SMSEnvironmentDetailsFile.smsLoginPassword);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.documentElement.scrollHeight);");
        BaseClass.waitForOneSecond();
        WebElement submitButton = LoginPage.loginButton;
        submitButton.click();
        BaseClass.waitForTwoSecond();
        return driver.getTitle();
    }
    public static void waitForOneSecond() throws InterruptedException {
        Thread.sleep(1000);
    }

    public static void waitForTwoSecond() throws InterruptedException {
        Thread.sleep(2000);
    }

    public static void waitForFourSecond() throws InterruptedException {
        Thread.sleep(4000);
    }

    public static void waitForThreeSecond() throws InterruptedException {
        Thread.sleep(3000);
    }

    public static void waitForSixSecond() throws InterruptedException {
        Thread.sleep(6000);
    }

    public static void waitForTenSecond() throws InterruptedException {
        Thread.sleep(10000);
    }
    public static void reportMethod(String testCaseName, String authorName) {
        test = report.createTest(testCaseName);
        test.assignAuthor(authorName);
    }
}
