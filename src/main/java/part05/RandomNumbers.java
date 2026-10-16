package part05;
import java.util.Random;
// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3850s
//        random numbers start at about 64:10 — stop at about 68:28
// Guide: GUIDE.md in this folder, steps 11–16
//
// Part 05 — random numbers: nextInt, nextDouble, nextBoolean
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called RandomNumbers.
//    (Do NOT name it Random. Java already has a class called Random.)
//    Leave the "package part05;" line and the "public class RandomNumbers" line alone.
//    The import line goes BETWEEN them (the guide shows where).
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does.

public class RandomNumbers {
    // the start of the program
    public static void main(String[] args) {
        // we assign new Random to Random varaible called random
        Random random = new Random();
        // we assign random.nextInt which is a random number
        int x = random.nextInt();
        // system outputs x
        System.out.println(x);
        // we assign random.nextDouble to Double variable called y
        double y = random.nextDouble();
        // system outputs y
        System.out.println(y);
        // we assign random.nextBoolean to boolean variable called z
        boolean z = random.nextBoolean();
        // system outputs z
        System.out.println(z);









    }
}
