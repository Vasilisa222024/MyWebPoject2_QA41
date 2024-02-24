package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;


    public class LoginPage extends BasePage{
        @FindBy(xpath = "//input[@name='email']")
        WebElement emailField;

        @FindBy(xpath = "//button[@name='registration']")
        WebElement registrationButton;

        public LoginPage(WebDriver driver){
            setDriver(driver);
            PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
        }
    }

