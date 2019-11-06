package section4;

import javax.swing.JOptionPane;

public class YouWin {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "YOU WIN!!!!");
        for (; true;) {
            JOptionPane.showMessageDialog(null, "AND YOU WIN!!!!");
        }
    }
}