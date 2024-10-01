package pages.registration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class RegistrationPage extends BasePage {

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }
    private final By LOCATOR_INPUT_NAME = By.xpath(".//input[@id='input_NAME']");
    private final By LOCATOR_INPUT_EMAIL = By.xpath(".//input[@id='input_EMAIL']");
    private final By LOCATOR_INPUT_PHONE = By.xpath(".//input[@id='input_PERSONAL_PHONE']");
    private final By LOCATOR_INPUT_PASSWORD = By.xpath(".//input[@id='input_PASSWORD']");
    private final By LOCATOR_INPUT_CONFIRM_PASSWORD = By.xpath(".//input[@id='input_CONFIRM_PASSWORD']");


}
