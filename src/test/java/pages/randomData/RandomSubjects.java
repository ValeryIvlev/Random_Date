package pages.randomData;

import java.util.Random;

public class RandomSubjects {

        public static String [] Subjects = {"English", "Economics", "Arts", "History"};
        public static Random random = new Random();
        public static int select = random.nextInt(Subjects.length);
        public static String selectSubjects = Subjects[select];
    }
