package page.invoice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InvoicePage {
    @FindBy(xpath = "//span[text()='Invoice and Payment']")
    public static WebElement invoiceMenu;
    @FindBy(xpath = "//span[text()='Invoice']")
    public static WebElement invoiceListingMenu;
    @FindBy(xpath = "//td[@class='text-center']/div/button[@class='btn btn-sm']")
    public static WebElement invoiceDeleteButton;
}
