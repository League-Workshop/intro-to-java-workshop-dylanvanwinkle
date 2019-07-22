package section3;

import javax.swing.JOptionPane;

public class addittionCaculater {

    public static void main(String[] args) {
        for (; true;) {
            caclulater();
        }
    }

    public static void caclulater() {
        int number1 = 0;
        int number2 = 0;
        int answer = 0;

        JOptionPane.showMessageDialog(null,
                "this is a adittion caclulater you will type in two numbers and get a answer ");
        String input1 = JOptionPane.showInputDialog(null, "type in your first number");

        number1 = Integer.valueOf(input1);

        String input2 = JOptionPane.showInputDialog(null, "type in your second number");

        number2 = Integer.valueOf(input2);

        answer = number1 + number2;

        JOptionPane.showMessageDialog(null, "the answer is " + answer);

    }
}