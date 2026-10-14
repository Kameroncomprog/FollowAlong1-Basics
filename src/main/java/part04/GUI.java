package part04;
import javax.swing.JOptionPane;
// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3191s
//        starts at about 53:11 — stop at about 58:10, at "in conclusion ladies and gentlemen"
// Guide: GUIDE.md in this folder, steps 7–11
//
// Part 04, topic 2 — pop-up windows with JOptionPane
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this file.
//    His class is called Main. Yours is called GUI.
//    Leave the "package part04;" line and the "public class GUI" line alone.
//    He types an import line ABOVE the class. Type yours on the empty line
//    under "package part04;".
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. That includes the import line.

public class GUI {
    // psvm is where the start of the program is
    public static void main(String[] args) {
        // a box shows up outside of intelli J and ask the user a question to enter your name
        String name = JOptionPane.showInputDialog("Enter your name");
        // a new box pops up after the user enters their name and then says Hello and then whatever the user name put in the box previous
        JOptionPane.showMessageDialog(null,"hello " + name );
        // a new box pops up and says Hello bro and the user responds
        JOptionPane.showInputDialog("Hello bro");
        // a new box pops up and asks the user to enter their age
        String age = JOptionPane.showInputDialog("Enter your age");
        // the user enter their age in the previous box, a new box pops up and says You are whatever age the user entered years old
        JOptionPane.showMessageDialog(null,"You are "+ age+" years old");
        // a new box pops up and says Enter your height notice the Dounle in this line of code we put a double b/c height can only be a double
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        // in the previous box the user entered their height, a new box pops up and says You are whatever height the user entered cm tall
        JOptionPane.showMessageDialog(null,"You are "+ height +" cm tall");

    }
}
