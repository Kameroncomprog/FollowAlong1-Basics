package part03;
import java.util.Scanner;
// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=2365s
//        rewatch 39:25–47:00 for Scanner, and 43:34 for the nextInt trap
// Guide: GUIDE.md in this folder, steps 5–11
//
// SECTION D — Challenge. Mad Libs. The README lists the rules.
//
// There is no main method here yet. Typing it is part of the challenge.

public class Challenge {
    public static void main(String[] args) {
        /*Kameron Randolph
        The Boul From Phily
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name a hero:");
        String name = scanner.nextLine();
        System.out.println("Name a villian:");
        String bad = scanner.nextLine();
        System.out.println("Pick a number:");
        int num = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Name a place:");
        String place = scanner.nextLine();
        System.out.println(name+" swung into the "+ place );
        System.out.println("The "+bad+" reigned terrior on the bity destroy "+num+ " skyscrappers down market street.");
        System.out.println(name+" saved the bity from "+bad+" he even repaird the skyscrappers with his webs!");





    }
}
