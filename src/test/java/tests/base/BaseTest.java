package tests.base;

import common.CommonActions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import pages.base.BasePage;
import pages.main.MainPage;
import pages.registration.RegistrationPage;

public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected MainPage mainPage = new MainPage(driver);
    protected RegistrationPage  registrationPage = new RegistrationPage(driver);


    @AfterSuite(alwaysRun = true)
    public void quite() {
        driver.quit();
    }

}
