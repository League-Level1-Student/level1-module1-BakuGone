package _06_duck;

import javax.swing.JOptionPane;

public class PurpleMonkeyRunner {

	public static void main(String[] args) {
		
		String favoritePlace = JOptionPane.showInputDialog("What's your monkey's favorite place?");
		String numberOfBananasString = JOptionPane.showInputDialog("How many of bananas are you giving them?");
		
		int numberOfBananasInt = Integer.parseInt(numberOfBananasString);
		PurpleMonkey bob = new PurpleMonkey(favoritePlace, numberOfBananasInt);
		
		String action = JOptionPane.showInputDialog("What would you like to do (either eat or screech)?");
		
		if(action.equalsIgnoreCase("eat")) {
			bob.eatBananas();

		}
		else if(action.equalsIgnoreCase("screech"))  {
			bob.screech();
			
		}
	}
}
