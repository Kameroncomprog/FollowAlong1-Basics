package part04;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=2915s
//        rewatch 48:35–52:25 for + - * / % ++ -- and casting
// Guide: GUIDE.md in this folder, steps 1–6
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.

public class Stretch {
    // Strecth A
    //psvm starting point of the program
    public static void main(String[] args) {
        // 10 equals a int variable call n
        int n =10;
        // system outputs 2 because this is floor division
        System.out.println(n/4);
       // system outputs 2 because 4 can only go into 10 2 and has a remainder of 2
        System.out.println(n%4);
        // system outputs 2.5 because 4.0 is a double instead of int
        System.out.println(n/4.0);
        // n = 10 so it would 10 + 1 =
        n++;
        //system outputs 11 because ++ equals +1
        System.out.println(n);
        // n = 10 so 10 -1
        n--;
        // n = 10 so 10 -1
        n--;
        // system outputs 9
        System.out.println(n);
        // system outputs 3.5 because there is a double in () before the equation 7/2
        System.out.println((double)7/2);
        // system outputs 7 because 7/2 is 3 * 2 = 6 this is no double in () so we treat this as inter divison.
        System.out.println(7/2*2);

        //Stretch B
        //B1.
        int people = 4;
        double money = 50;
        double div = money/people;
        System.out.println("Each person pays $"+ div);

        //B2.
        int secs = 500;
        int min = secs/60;
        int remainsecs = secs%60;
        System.out.println(secs+" seconds is "+ min +" and "+ remainsecs+" seconds");

        //B3.
        int T1 = 90;
        int T2 = 85;
        int T3 = 78;
        int add = T1+T2+T3;
        int avg =add/3;
        //int is different than double because the keyword in orange tells the complier that this a int and not a double so its essentially floor divison
        System.out.println("int average: "+avg);
        int T4 = 90;
        int T5 = 85;
        int T6 = 78;
        double addd = T4+T5+T6;
        double avgg =addd/3;
        //double is different than int because it tells the complier to  acount for the decimal place so every number counts after the decimal so no floor divison like int
        System.out.println("double average: "+avgg);




    }



}
