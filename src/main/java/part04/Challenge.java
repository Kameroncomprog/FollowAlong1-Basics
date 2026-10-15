package part04;
import javax.swing.JOptionPane;
// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3191s
//        rewatch 53:11–58:10 for JOptionPane, and 48:08–52:25 for the math
// Guide: GUIDE.md in this folder
//
// SECTION D — Challenge. A tip calculator with pop-up windows. The README lists the rules.
//
// There is no main method here yet. Typing it is part of the challenge.
/*Kameron Randolph
This program calculates the tip, total meal cost,
and how much each person needs to pay.
 */
public class Challenge {
    public static void main(String[] args) {
        String mealInput = JOptionPane.showInputDialog("Enter the meal cost:");
        String tipInput = JOptionPane.showInputDialog("Enter the tip percentage:");
        String peopleInput = JOptionPane.showInputDialog("Enter the number of people:");
        double mealCost = Double.parseDouble(mealInput);
        int tipPercent = Integer.parseInt(tipInput);
        int people = Integer.parseInt(peopleInput);
        double tip = mealCost * tipPercent / 100;
        double total = mealCost + tip;
        double eachPerson = total / people;
        int wholeDollars = (int) eachPerson;
        int remaining = (int) total % people;
        JOptionPane.showMessageDialog(null,
                "Tip: $" + tip + "\nTotal: $" + total);
        JOptionPane.showMessageDialog(null,
                "Each person pays: $" + eachPerson +
                        "\nWhole dollars each: $" + wholeDollars +
                        "\nRemaining dollars: $" + remaining);









    }
}
