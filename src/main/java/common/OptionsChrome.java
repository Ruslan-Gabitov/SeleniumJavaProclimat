package common;

import org.openqa.selenium.chrome.ChromeOptions;

import static common.Config.PAGE_LOAD_STRATEGY;

public class OptionsChrome {
    protected static ChromeOptions chromeOptions() {
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PAGE_LOAD_STRATEGY);
        options.addArguments("--start-maximized");

        return options;
    }
}
