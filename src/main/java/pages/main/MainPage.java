package pages.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.base.BasePage;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    private final By LOCATOR_MY_OFFICE = By.xpath(".//div[@class='personal_wrap']//a");
    private final By LOCATOR_USER_LOGIN_POPUP = By.xpath(".//input[@id='USER_LOGIN_POPUP']");
    private final By LOCATOR_USER_PASSWORD_POPUP = By.xpath(".//input[@id='USER_PASSWORD_POPUP']");
    private final By LOCATOR_REGISTRATION_BUTTON = By.xpath(".//div[@class='inner-table-block']//a");
    private final By LOCATOR_TAG_TITLE = By.xpath("//title");

    public MainPage openPageRegistration() {
        waitElementIsVisible(driver.findElement(LOCATOR_MY_OFFICE)).click();
        waitElementIsVisible(driver.findElement(LOCATOR_REGISTRATION_BUTTON)).click();
        waitElementAppearDOM(LOCATOR_TAG_TITLE);
        String actualTitle = driver.getTitle();
        String expectedTitle = "Регистрация";
        Assert.assertEquals(actualTitle, expectedTitle, "Titles do not match");
        return this;
    }
}
