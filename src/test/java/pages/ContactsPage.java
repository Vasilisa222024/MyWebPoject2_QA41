package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class ContactsPage extends BasePage {
    @FindBy(xpath = "//button[contains(text(), 'Sign')]")
    WebElement signOutButton;
    public ContactsPage(WebDriver driver) {
            setDriver(driver);
            PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
        }

    }
