package pages.randomComponents;

import java.util.Random;

public class RandomHobbies {
    public static String [] Hobbies = {"Sports", "Reading", "Music"};
    public static Random random = new Random();
    public static int select = random.nextInt(Hobbies.length);
    public static String selectHobbies = Hobbies[select];
}
