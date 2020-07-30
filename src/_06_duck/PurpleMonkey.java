package _06_duck;

import javax.swing.JOptionPane;

public class PurpleMonkey {
	
	public String favoriteCountry;
	public int numberOfPurpleBananas;
	
	PurpleMonkey(String favoriteCountry, int numberOfPurpleBananas) {
		
		JOptionPane.showMessageDialog(null, "Your purple monkey's favorite country is " + favoriteCountry + " and they have " + numberOfPurpleBananas + " purple bananas to eat.");
      	this.favoriteCountry = favoriteCountry;
      	this.numberOfPurpleBananas = numberOfPurpleBananas;

	}
	
	void eatBananas() {
		
		JOptionPane.showMessageDialog(null, "I just ate " + numberOfPurpleBananas + " purple bananas I feel sick...");
	}
		
	void screech() {
			
		JOptionPane.showMessageDialog(null, "RRRREEEEEEEEEEEEEEEEEEE");
	}
}
