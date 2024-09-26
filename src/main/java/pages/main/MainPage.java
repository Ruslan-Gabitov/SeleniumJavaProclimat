package pages.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    private final By MY_OFFICE = By.xpath(".//div[@class='personal_wrap']//a");
    private final By USER_LOGIN_POPUP = By.xpath(".//input[@id='USER_LOGIN_POPUP']");
    private final By USER_PASSWORD_POPUP = By.xpath(".//input[@id='USER_PASSWORD_POPUP']");
    private final By REGISTRATION_BUTTON = By.xpath(".//div[@class='inner-table-block']//a");

}
