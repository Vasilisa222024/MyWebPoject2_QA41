package tests;

import config.BaseTest;
import helpers.TopMenuItem;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;

public class PhoneBookTest extends BaseTest {

    @Test
    @Parameters("browser")
    public void phoneBookTest_001(String browser) throws InterruptedException {
        MainPage mainPage = new MainPage(getDriver());
        LoginPage loginPage = mainPage.openTopMenu(TopMenuItem.LOGIN.toString());
       //loginPage.fillEmailField("myemail@mail.com").clickByRegistartionBUtton();
        //Thread.sleep(5000);

    }
}