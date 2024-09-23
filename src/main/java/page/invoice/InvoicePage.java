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
    @FindBy(xpath = "//span[text()='Invoice and Payment']")
    public static WebElement invoiceAndPaymentMenu;
    @FindBy(xpath = "//button[text()='Add ']")
    public static WebElement invoiceAddButton;
    @FindBy(name = "center")
    public static WebElement centreDropDown;
    @FindBy(name = "student")
    public static WebElement studentDropDown;
    @FindBy(xpath = "//input[@name='invoiceDate']")
    public static WebElement invoiceDateInput;
    @FindBy(xpath = "//input[@name='dueDate']")
    public static WebElement dueDateInput;
    @FindBy(xpath = "//input[@name='invoicePeriodFrom']")
    public static WebElement invoicePeriodFromInput;
    @FindBy(xpath = "//input[@name='invoicePeriodTo']")
    public static WebElement invoicePeriodToInput;
    @FindBy(name="receiptAmount")
    public static WebElement receiptAmountInput;
    @FindBy(xpath = "//button[text()='Add Row']")
    public static WebElement invoiceAddRowButton;
    @FindBy(xpath = "//button[@type='submit']")
    public static WebElement invoiceGenerateButton;
    @FindBy(xpath = "//div[text()='Invoice Generated successfully']")
    public static WebElement invoiceGenerateToaster;
}
