package pages.randomComponents;

import java.util.Random;



public class RandomGender {
     public static String [] Gender = {"Male", "Female", "Other"};
     public static Random random = new Random();
     public static int select = random.nextInt(Gender.length);
     public static String selectGender = Gender[select];
}

