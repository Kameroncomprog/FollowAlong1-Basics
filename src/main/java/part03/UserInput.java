package part03;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=2365s
//        starts at about 39:25 — stop at about 47:00, after "that is how scanners work"
// Guide: GUIDE.md in this folder, steps 5–11
//
// Part 03, topic 2 — reading what the user types (Scanner)
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this file.
//    His class is called Main. Yours is called UserInput.
//    Leave the "package part03;" line and the "public class UserInput" line alone.
//    He types an import line ABOVE the class. Type yours on the empty line
//    under "package part03;".
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. That includes the import line.

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        // Scanner variable named scanner gets assigned to new scanner. "what scanner does is creates and initializes a tool that allows your program to read input from the user
        Scanner scanner = new Scanner(System.in);
        // system outputs What is your name
        System.out.println("What is your name?");
        // scanner.nextLine() is assigned or equals String variable called name
        String name = scanner.nextLine();
        // system outputs Hello & string variable called name and moves to a new line , this works b/c str concadenation
        System.out.println("Hello " + name);
        // system outputs bro and moves to a new line
        System.out.println("bro");
        // system outputs Hello bro and moves to a new line
        System.out.println("Hello bro");
        // system outputs How old are you ?
        System.out.println("How old are you?");
        // we assign a class called scanner to a int variable called age that allows the user to type their age in the run box
        int age = scanner.nextInt();
        // we add another scanner.nextLine(); because there was enter still left in complier so adding another scanner scans it and then gets rid of it because we dont need it.
        scanner.nextLine();
        // system outputs "What is your favorite food" and moves to a new line
        System.out.println("What is your favorite food?");
        // we assign scanner.nextLine(); to a String variable called food
        String food = scanner.nextLine();
        // system outputs Hello Kameron
        System.out.println("Hello " + name);
        // system outputs You are 19 years old
        System.out.println("You are " + age + " years old");
        // system outputs you like pizza
        System.out.println("You like " + food);


    }
}
