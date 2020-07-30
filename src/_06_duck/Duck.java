package _06_duck;

public class Duck {
	
	public int numberOfFriends;
	public String favoriteFood;
	
	
	Duck(String favoriteFood, int numberOfFriends) {
		
		System.out.println("Your ducks favorite food is " + favoriteFood + " and they have " + numberOfFriends + " friends.");
      	this.favoriteFood = favoriteFood;
      	this.numberOfFriends = numberOfFriends;
      	
      	
	}	
		
	void quack() {
			
		System.out.println("Quack quack!");
	}
		
	void waddle() {
			
		System.out.println("Waddle waddle!");
	}
	
}
