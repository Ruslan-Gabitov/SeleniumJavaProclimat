package pages.registration;

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


}
