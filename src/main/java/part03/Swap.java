package part03;
import java.util.Scanner;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=2140s
//        starts at about 35:40 — stop at about 38:50, at "your assignment for today"
// Guide: GUIDE.md in this folder, steps 1–4
//
// Part 03, topic 1 — swapping two variables
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called Swap.
//    Leave the "package part03;" line and the "public class Swap" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class Swap {
    // psvm is the start of the program and allows you to access eveything in it at the beginning of the program
    public static void main(String[] args) {
        // String variable named x gets assigned to "water"
        String x = "water";
        // String varibale named y gets assigned to "kool-Aid"
        String y = "Kool-Aid";
        // system outputs x:water
        System.out.println("x:"+ x);
        // system outputs y:Kool-Aid
        System.out.println("y:"+ y);
        //String variable named temp
        String temp;
        // variable x gets assigned to to temp which is water that is stored in x is now temp.
        temp = x;
        // variable y is now assigned to x Kool-Aid is now stored in y
        x = y;
        // water is now stored in y
        y = temp;
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
