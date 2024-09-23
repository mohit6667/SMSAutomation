package page.studentManagement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StudentPage {
    @FindBy(xpath = "//span[text()='Student Management']")
    public static WebElement studentMenu;
    @FindBy(xpath = "//span[text()='Student Listing']")
    public static WebElement studentListingMenu;
}
