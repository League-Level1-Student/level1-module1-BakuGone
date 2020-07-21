package _02_cat;

public class CatRunner {

	public static void main(String[] args) {
		
		Cat x = new Cat("Jeff");
		
		x.meow();
		
		System.out.println("i have " + x.getLives() + " lives.");
		
		x.kill();
	}
}
