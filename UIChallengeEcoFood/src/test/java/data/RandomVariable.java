package Data;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class RandomVariable {


    public static String getRandomString(int size) {
        return RandomStringUtils.randomAlphabetic(size);
    }
    public static long getRandomNumbersLong(int size) {
        long result = Long.parseLong(RandomStringUtils.randomNumeric(size));
        return result;
    }
    public static int getRandomNumbersInt(int size) {
        int result = Integer.parseInt(RandomStringUtils.randomNumeric(size));
        return result;
    }
    public static boolean getRandomBoolean() {
        Random random = new Random();
        return random.nextBoolean();
    }
}

