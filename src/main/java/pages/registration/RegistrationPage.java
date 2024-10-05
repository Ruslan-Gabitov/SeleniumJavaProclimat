package pages.registration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.base.BasePage;

import java.util.Map;

import static pages.registration.FakeDataGeneration.getRegistrationData;

public class RegistrationPage extends BasePage {

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    private final By LOCATOR_INPUT_NAME = By.xpath(".//input[@id='input_NAME']");
    private final By LOCATOR_INPUT_EMAIL = By.xpath(".//input[@id='input_EMAIL']");
    private final By LOCATOR_INPUT_PHONE = By.xpath(".//input[@id='input_PERSONAL_PHONE']");
    private final By LOCATOR_INPUT_PASSWORD = By.xpath(".//input[@id='input_PASSWORD']");
    private final By LOCATOR_INPUT_CONFIRM_PASSWORD = By.xpath(".//input[@id='input_CONFIRM_PASSWORD']");
    private final By LOCATOR_CHECKBOX_PERSONAL_DATA = By.xpath(".//label[@for='licenses_register']//a");
    private final By LOCATOR_BUTTON_REGISTRATIONS = By.xpath(".//button[@class='btn btn-default short']");
    private final By LOCATOR_TAG_TITLE = By.xpath("//title");

    public RegistrationPage userRegistration() {
        Map<String, String> registrationData = getRegistrationData();
        driver.findElement(LOCATOR_INPUT_NAME).sendKeys(registrationData.get("fullName"));
        driver.findElement(LOCATOR_INPUT_EMAIL).sendKeys(registrationData.get("email"));
        driver.findElement(LOCATOR_INPUT_PHONE).sendKeys(registrationData.get("phoneNumber"));
        driver.findElement(LOCATOR_INPUT_PASSWORD).sendKeys(registrationData.get("password"));
        driver.findElement(LOCATOR_INPUT_CONFIRM_PASSWORD).sendKeys(registrationData.get("password"));

        waitElementAppearDOM(LOCATOR_CHECKBOX_PERSONAL_DATA);
        clickOffsetFromSelectedElement(driver.findElement(LOCATOR_CHECKBOX_PERSONAL_DATA), -200, 0);

        waitElementAppearDOM(LOCATOR_BUTTON_REGISTRATIONS);
        moveToElement(driver.findElement(LOCATOR_BUTTON_REGISTRATIONS)).click();

        String expectedTitle = "Климатическое оборудование купить в Перми, " +
                "ПроКлимат - ремонт и обслуживание кондиционеров, водонагревателей";

        waitElementAppearDOM(LOCATOR_TAG_TITLE);
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitle, "Titles do not match");
        return this;
    }
}
