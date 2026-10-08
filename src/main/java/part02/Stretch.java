package part02;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=1743s
//        rewatch 29:00–35:00 if you forget how to make a variable of each type
// Guide: GUIDE.md in this folder, steps 4–10
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.

// Section A
public class Stretch {
    public static void main(String[] args) {
        int a = 7;
        double b = 7;
        // * My Guess system outputs 7 because its assign to the varibale a which is classified as int
        System.out.println(a);
        // * My Guess system outputs 7.0 because the number 7 is assigned to double b a double can convert a int to a double so it works !
        System.out.println(b);
        // * My Guess system outputs string ab because put a "" before a and after b make it a string and not int that we assigned it to and + means string concadenation
        System.out.println("a + b");
        // * My Guess system outputs  a colan with a space after and then  + = string concadenation so that would just be 7 after the space
        System.out.println("a: " + a);
        // * My Guess system outputs an empty string or just a empty space + equals  str concadenation  so that would be 7 that will repeat 1 more time
        System.out.println("" + a + a);
        // * My Guess system outputs 7 + 7 = 14  + str concadenation  which means the ! will be after the 7 .
        System.out.println(a + a + "!");
        char c = 'A';
        // * My Guess system outputs the char A nummerical number which is 95
        // I was wrong because this is a str if there was int before 'A" then i would have been right
        System.out.println(c);
        boolean on = true;
        // * My Guess system will output true because on is the variable assigned to true
        System.out.println(on);


 // Section B
        //B1.
        String name = "Kam";
        int Age = 19;
        double Gpa = 3.1;
        boolean Commuter = false;
        System.out.println(name);
        System.out.println(Age);
        System.out.println(Gpa);
        System.out.println(Commuter);

        // B2.
        char hey = 'K';
        int by = 19;
        double ok = 3.14;
        boolean gk = true;
        String aw = "Delaware State Univeristy";
        System.out.println(hey +  " goes to "  + aw +  " he is "  + by +  " years of age. "  + hey +  " also has a "  + ok +  " gpa and thats "  + gk);


        // B3.
        //  the s in string has to be capitalized = String
        String city = "Dover";
        // with the reserved word  long you have to add a l at the end of the number
        long people = 4000000000l;
        // when using reserved word char the string quotes have to be single and not double
        char grade = 'B';
        // a float cant hold 72.5 but a double can
        double temp = 72.5;
        // system prints outs Dover str concadentation "" equals a space 4000000000 B 72.5
        System.out.println(city + " " + people + " " + grade + " " + temp);



    }
}
