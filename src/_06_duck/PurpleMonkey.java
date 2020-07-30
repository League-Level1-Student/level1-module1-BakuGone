package _06_duck;

public class PurpleMonkey {
	
	public String favoriteCountry;
	public int numberOfPurpleBananas;
	
	PurpleMonkey(String favoriteCountry, int numberOfPurpleBananas) {
		
		System.out.println("Your purple monkey's favorite country is " + favoriteCountry + " and they have " + numberOfPurpleBananas + " purple bananas to eat.");
      	this.favoriteCountry = favoriteCountry;
      	this.numberOfPurpleBananas = numberOfPurpleBananas;

	}
	
	void eatBananas() {
		
		System.out.println("I just ate " + numberOfPurpleBananas + " purple bananas I feel sick...");
	}
		
	void screech() {
			
		System.out.println("RRRREEEEEEEEEEEEEEEEEEE");
	}
}
