package section4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

final class AttackDef {
    String attackName = "No Attack";
    int attackDamage = 10;
    int defense = 5;
}

public class YouLost {

    public static void main(String[] args) {

        
        String Dylan = "My name is Dylan";
        
        AttackDef shout = new AttackDef();
        shout.attackName = "Shout";
        shout.attackDamage = 50;

        AttackDef yell = new AttackDef();
        shout.attackName = "Yell";
        shout.attackDamage = 15;
        shout.defense = 20;
        
        String msg = "Attack '" + shout.attackName + "' does " + shout.attackDamage + " damage";
        JOptionPane.showMessageDialog(null, msg);

        JOptionPane.showMessageDialog(null, "you lost");
        for (; true;) {
            JOptionPane.showMessageDialog(null, "and you lost");
        }
    }
}