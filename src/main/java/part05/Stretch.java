package part05;
import java.util.Scanner;
import java.util.Random;


// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3546s
//        rewatch 59:06–61:29 for the Math methods, 64:54–68:28 for Random
// Guide: GUIDE.md in this folder, steps 2–6 and 12–16
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.

public class Stretch {
    // start pf the program
    public static void main(String[] args) {
        // system outputs 7 because its the largest number
        System.out.println(Math.max(7, -3));
        // system outputs 2.5 because its the smallest number
        System.out.println(Math.min(2.5, 9));
        // system outputs 8 because math.abs means absolute value and that means just the number itself no negative sign
        System.out.println(Math.abs(-8));
        // system outputs 7.0 because that is the square root of 49
        System.out.println(Math.sqrt(49));
        // system outputs 3 because when the number after the decimal point is 5 or higher than 5 it is rounded to the nearest whole number which is 3 in this case
        System.out.println(Math.round(2.5));
        // system outputs 2 because when u round a number and the number after the decimal point is less than five its floored to just the whle number which is 2
        System.out.println(Math.round(2.4));
        //  system outputs 3.0 because the ceiling of 2.1 or the next number after that is 3.0
        System.out.println(Math.ceil(2.1));
        //  system outputs -3.0 because the floor of -2.1 or the next number after that is -3.0 its basically the opposite of ceiling
        System.out.println(Math.floor(-2.1));

        //B1.
        Random rand = new Random();
        int roll = rand.nextInt(6) + 1;
        System.out.println("You rolled a " + roll);

        //B2.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius:");
        double radius = scanner.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("Area: " + area);
        System.out.println("Rounded area: " + Math.round(area));


        //B3.
        double distance = Math.sqrt((4 - 1) * (4 - 1) + (6 - 2) * (6 - 2));
        System.out.println("Distance: " + distance);


    }
}
