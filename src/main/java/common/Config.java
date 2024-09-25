package common;

import java.time.Duration;
import org.openqa.selenium.PageLoadStrategy;

public class Config {
    public static final Duration IMPLICIT_WAIT = Duration.ofSeconds(10L);
    public static final PageLoadStrategy PAGE_LOAD_STRATEGY = PageLoadStrategy.EAGER;


}
