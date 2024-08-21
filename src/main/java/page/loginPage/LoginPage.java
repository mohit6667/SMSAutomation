package page.loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    @FindBy(name = "email")
    public static WebElement loginEmailInput;
    @FindBy(name = "password")
    public static WebElement passwordInput;
    @FindBy(xpath = "//button[@type='submit']")
    public static WebElement loginButton;
}
