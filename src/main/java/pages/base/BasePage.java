package pages.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;

import static common.Config.EXPLICIT_WAIT;

public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage(String url) {
        driver.get(url);
    }

    public WebElement waitElementIsVisible(WebElement element) {
        new WebDriverWait(driver, EXPLICIT_WAIT)
                .until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    public void waitElementAppearDOM(By locator) {
        new WebDriverWait(driver, EXPLICIT_WAIT)
                .until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public void clickOffsetFromSelectedElement(WebElement element, int x, int y){
        new Actions(driver).moveToElement(element)
                .moveByOffset(x, y)
                .click()
                .build()
                .perform();
    }

    public WebElement moveToElement(WebElement element){
        new Actions(driver).moveToElement(element);
        return element;
    }

}
