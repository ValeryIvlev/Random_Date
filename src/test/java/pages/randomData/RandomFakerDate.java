package pages.randomData;

import com.github.javafaker.Faker;

import java.util.Locale;

public class RandomFakerDate {
    public static Faker fakerRU = new Faker(new Locale("ru"));
    public static Faker fakerUS = new Faker(new Locale("en-US"));
    public static String firstName = fakerRU.name().firstName();
    public static String lastName = fakerRU.name().lastName();
    public static String userEmail = fakerUS.internet().emailAddress();
    public static String userNumber = fakerRU.phoneNumber().subscriberNumber(10);
    public static String currentAddress = fakerUS.address().fullAddress();
    public static String day = String.format("%02d", fakerUS.number().numberBetween(1,28));
    public static String year = String.valueOf(fakerUS.number().numberBetween(1965,2012));

}
