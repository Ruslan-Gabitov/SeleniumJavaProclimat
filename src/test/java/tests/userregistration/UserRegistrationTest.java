package tests.userregistration;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class UserRegistrationTest extends BaseTest {

    @Test
    public void checkUserRegistration() {
        basePage.openPage("https://www.proklimat.com/");

        mainPage
                .openPageRegistration();

        registrationPage
                .userRegistration();
    }
}
