package part01;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=750s
//        rewatch 12:30–17:30 if you forget how print, \n, \t, \" or \\ work
// Guide: GUIDE.md in this folder, steps 3–10
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.

// Public template defined Stretch
public class Stretch {
    // psvm is the start of the program and allows us to use excute the program
    public static void main(String[] args) {
        // system outputs A
        System.out.print("A");
        // system outputs B and moves to a new line
        System.out.println("B");
        // system outputs C
        System.out.print("C\n");
        // system outputs D but tabbed in and a \ at the end of the letter and moves to a new line
        System.out.println("\tD\\");
        // system outputs \E\ and moves to a new line
        // my guess was wrong because i ignored the "" that should let me know to treat the string literal
        System.out.println("\"E\"");
        // system outputs nothing because F is commented
        // System.out.println("F");
        //system outputs G and moves to a new line
        System.out.println("G");
        // system outputs a blank line and moves to a new line
        System.out.println();

    }
}

