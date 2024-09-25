package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static common.Config.IMPLICIT_WAIT;

public class CommonActions {
    private static WebDriver driver = null;

    public CommonActions() {
    }

    public static WebDriver createDriver(){
        if (driver == null) {
            driver = new ChromeDriver(OptionsChrome.chromeOptions());
        }

        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT);

        return driver;

    }
}
