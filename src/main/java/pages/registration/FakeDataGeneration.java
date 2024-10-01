package pages.registration;

import com.github.javafaker.Faker;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

public class FakeDataGeneration {

    private static String getRandomString() {
        String SALTCHARS = "abcdefghijklmnopqrstuvwxyzZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        return salt.toString();


    }

    public static Map<String, String> getRegistrationData(){
        Faker faker = new Faker(Locale.of("ru"));

        Map<String, String> registrationData = new HashMap<>();
        registrationData.put("fullName", faker.name().fullName());
        registrationData.put("phoneNumber", faker.phoneNumber().phoneNumber());
        registrationData.put("email", getRandomString() + "@qamail.ru");
        registrationData.put("password", "12345678");

        return registrationData;

    }


}
