package config;
import com.github.javafaker.Faker;

public class UserConfig {
    private static final Faker faker = new Faker();

    public static String generateFirstName() {
        return faker.name().firstName();
    }

    public static String generateLastName() {
        return faker.name().lastName();
    }

    public static String generateEmail() {
        return faker.internet().emailAddress();
    }

    public static final String FIST_NAME = generateFirstName();
    public static final String LAST_NAME = generateLastName();
    public static final String EMAIL = generateEmail();
    public static final String PASSWD = "Qwerty123!!*!";
    public static final String CONFIRM_PASSWD = "Qwerty123!!*!";
}
