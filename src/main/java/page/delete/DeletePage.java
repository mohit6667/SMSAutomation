package page.delete;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeletePage {
    @FindBy(xpath = "//button[text()='Delete']")
    public static WebElement confirmDeleteButton;
    @FindBy(xpath = "//td[@class='text-center']/div/button[@class='btn btn-sm']")
    public static WebElement listDeleteButton;
    @FindBy(tagName = "td")
    public static List<WebElement> listingData;
}
