package pages.randomData;

import java.util.Random;

public class RandomMonth {
    public static String [] Month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    public static Random random = new Random();
    public static int select = random.nextInt(Month.length);
    public static String selectMonth = Month[select];
}
