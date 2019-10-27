package section4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {

	// 1. Put all of the game code inside the main method (below)
	public static void main(String[] args) {
		displaySplash();
		boolean quit = false;
		while (quit == false) {
			runGame();
			quit = askUserToPlayAgain();
		}
	}

	public static void displaySplash() {
		ImageIcon dragon = new ImageIcon("src/section4/dragonPictureSmall.jpg");
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);
	}

	public static boolean askUserToPlayAgain() {
		String input = JOptionPane.showInputDialog("Do you want to play again? (Yes/No)");
		if (input.equalsIgnoreCase("Yes")) {
			return false;
		} else {
			return true;
		}
	}

	public static void runGame() {
		game();
	}

	public static void game() {
		int playerHealthStart = 110;
		int dragonHealthStart = 180;

		// 2. Create a variable called "playerHealth" to store your health (set it equal
		// to 100)
		int playerHealth = playerHealthStart;
		// 3. Create a variable called "dragonHealth" to store the dragon's health (set
		// it equal to 100)
		int dragonHealth = dragonHealthStart;

		// 4. Create a variable to hold the damage the player's attack does each round
		int playerAttack = 0;
		// 5. Create a variable to hold the damage the dragon's attack does each round
		int dragonAttack = 0;

		JOptionPane.showMessageDialog(null, "player health is " + playerHealth + " dragon health is " + dragonHealth);
		// 6. Delete the slashes at the beginning of the next line. v

		Boolean playerUsedHealthBoost = false;

		while (playerHealth > 0 && dragonHealth > 0) { // this line of code keeps the battle going until someone's
														// health reaches 0

			// 7. Add a closing mustache at the very bottom of this program (since we just
			// added an opening mustache on the previous step).

			// 8. Ask the player in a pop-up if they want to attack the dragon with a yell
			// or a kick
			playerAttack = 0;
			String input = "";
			while (!input.equals("yell") && !input.equals("kick") && !input.equals("health boost") && !input.equals("sword")) {
				String message = "Whould you like to (1) attack with sword,(2) attack with kick, (3) attack with yell or (4) heal with Health Boost";
				if(playerUsedHealthBoost){
					message ="Whould you like to (1) attack with sword,(2) attack with kick or (3) attack with yell";
				}
				input = JOptionPane
						.showInputDialog(message);
				if (input == null) {
					return;
				}
				input = input.toLowerCase();
			}

			if (input.equals("health boost") && playerUsedHealthBoost == false) {
				playerUsedHealthBoost = true;
				Random HealthBoost = new Random();
				playerHealth = playerHealth + HealthBoost.nextInt(25) + 130;
				dragonHealth = dragonHealth - playerAttack;

				//if (input.equals("armor")) {
				//	Random armor = new Random();
				//	playerHealth = playerHealth + armor.nextInt(50);
				//	dragonHealth = dragonHealth - playerAttack;
			}

			if (input.equals("sword")) {
				Random sword = new Random();
				playerAttack = sword.nextInt(55);
				dragonHealth = dragonHealth - playerAttack;
			}
			// 9. If they typed in "yell":
			if (input.equals("yell")) {
				// -- Find a random number betw+en 0 and 10 and store it in dragonDamage
				playerAttack = 15;
				// -- Subtract that number from the dragon's health variable
				dragonHealth = dragonHealth - playerAttack;
			}

			// 10. If they typed in "kick":
			if (input.equals("kick")) {
				Random kick = new Random();
				playerAttack = kick.nextInt(5) + 35;
				dragonHealth = dragonHealth - playerAttack;
				// -- Subtract that number from the dragon's health variable

			}

			// 11. Find a random

			//

			// number between 0 and 35 and store it in playerDamage
			Random fireball = new Random();
			dragonAttack = fireball.nextInt(25) + 35;
			playerHealth = playerHealth - dragonAttack;
			// 12. Subtract this number from the player's health

			// 13. If the user's health is less than or equal to 0
			if (playerHealth <= 0 && dragonHealth <= 0) {
				JOptionPane.showMessageDialog(null,
						"playerHealth is " + playerHealth + " and player took " + dragonAttack + " damage "
								+ "dragonHeath is " + dragonHealth + " and dragon took " + playerAttack + " damage");
				JOptionPane.showMessageDialog(null, "Since you both lost, restart and try again!");
				playerHealth = playerHealthStart;
				dragonHealth = dragonHealthStart;
				playerUsedHealthBoost = false;
			}
			else if (playerHealth <= 0) {
				// -- Tell the user that they lost
				JOptionPane.showMessageDialog(null, "You lost");
				JOptionPane.showMessageDialog(null,
						"playerHealth is " + playerHealth + " and player took " + dragonAttack + " damage "
								+ "dragonHeath is " + dragonHealth + " and dragon took " + playerAttack + " damage");
			}
			// 14. Else if the dragon's health is less than or equal to 0
			else if (dragonHealth <= 0) {
				JOptionPane.showMessageDialog(null, "The dragon is dead and you took a ton of gold");
				JOptionPane.showMessageDialog(null,
						"player health is " + playerHealth + " and player took " + dragonAttack + " damage "
								+ "dragon health is " + dragonHealth + " and dragon took " + playerAttack + " damage");
			} else {
				// -- Tell the user that the dragon is dead and they took a ton of gold!
				// 15. Else
				JOptionPane.showMessageDialog(null,
						"player health is " + playerHealth + " and player took " + dragonAttack + " damage "
								+ "dragon health is " + dragonHealth + " and dragon took " + playerAttack + " damage");
				// -- Pop up a message that tells the their current health and the dragon's
				// currently health (Bonus: Also display the amount of health that was lost for
				// each player this round)
			}

		}
	}
}
