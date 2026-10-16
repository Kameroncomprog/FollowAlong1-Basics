package part05;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3518s
//        Math class starts at about 58:38 — stop at about 61:29, "here's a project"
// Guide: GUIDE.md in this folder, steps 1–6
//
// Part 05 — the Math class: max, min, abs, sqrt, round, ceil, floor
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called MathMethods.
//    Leave the "package part05;" line and the "public class MathMethods" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class MathMethods {
    //start of the program
    public static void main(String[] args) {
        // we assign 3.14 to a double variable called x
        double x = 3.14;
        // we assign -10 to a double variable called y
        double y = -10;
        //Math.max looks at both variables and whats stored in them and whatever one is bigger is the one we assign to z
        double z = Math.max(x,y);
        //system outputs z
        System.out.println(z);
        // we assign the lowest number between to x & y to z
        z = Math.min(x,y);
        //system outputs z
        System.out.println(z);
        //we assign the absolute value of y to z
        z = Math.abs(y);
        //system outputs 10 and not -10 because its an absolute value
        System.out.println(z);
        // we assign the square root of y to z
        z= Math.sqrt(y);
        // system outputs the square root of z
        System.out.println(z);
        // we assign 3.16 to y
        y = 3.16;
        // we assign the square root of y to z
        z = Math.sqrt(y);
        // system outputs z
        System.out.println(z);
        // the rounded value of x is assigned to z
        z = Math.round(x);
        // system outputs z
        System.out.println(z);
        // we assign the highest point of x to z
        z = Math.ceil(x);
        // system outputs z
        System.out.println(z);
        // we assign the lowest point of x to z
        z = Math.floor(x);
        // system outputs z
        System.out.println(z);






    }
}
