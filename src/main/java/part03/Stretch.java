package part03;
import java.util.Scanner;
// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=2140s
//        rewatch 35:40–38:50 for swapping, 39:25–47:00 for Scanner
// Guide: GUIDE.md in this folder
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.
// You will also need the Scanner import line, above the class.

public class Stretch {
    // psvm is the starting point of the program and allows us to use all elements at the point
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // int variable a = 1
        int a = 1;
        // int variable b = 2
        int b = 2;
        // a now equals b which is 2
        a = b;
        // b still equals 2 because we just assigned a = b and b was already at 2 so b stays the same
        b = a ;
        // system outputs 2 space which is the  " " 2 again this is str concadentation there is no adding number together we are adding string together
        System.out.println(a+ " " + b);
        // int variable c = 1
        int c = 1;
        // int variable d = 2
        int d = 2;
        // int variable temp = c
        int temp = c;
        // c equals d which means we store whatever is in d now into c
        c = d;
        // d equals temp which means we store whatever is in temp now into d
        d = temp;
        // system outputs 2 space which is " " and then another 2 this str concadenation
        // * after reading the readme i realized where i made a mistake temp saves 1 in it before it turned into 2 making it 2   1
        System.out.println(c +" " + d);

    //B1.
        // system outputs What is your name
         System.out.println("What is your name");
         // we assign scanner.nextLine() to String variable Name this allows the user to input a name
         String Name = scanner.nextLine();
         // system outputs Hi, Kameron! this works because we use str concadenation.add strings together
        System.out.println("Hi, " + Name + "!");


    //B2.
        String first = "red";
        String second = "green";
        String third = "blue";
        System.out.print(""+first);
        System.out.print(" "+second);
        System.out.println(" "+third);
        String tempp = second;
        System.out.println(tempp+" "+third+" "+first);


    //B3.
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        System.out.println("What city do you live in?");
        // the reason I put another scanner.nextLine is so that the scanner could clear if i dont put this here "enter would still be in the complier"
        scanner.nextLine();
        String city = scanner.nextLine();
        System.out.println(age+" years old, living in "+city);














    }
}
