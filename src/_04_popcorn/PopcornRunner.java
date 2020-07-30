package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornRunner {

	public static void main(String[] args) {
		
		Microwave y = new Microwave();
		String flavor = JOptionPane.showInputDialog("What flavor of popcorn do you want?");
		String cookTime = JOptionPane.showInputDialog("How many minutes do you want to cook your popcorn for? (Enter input as an int)");
		int cookTimeInt = Integer.parseInt(cookTime);
		Popcorn x = new Popcorn(flavor);
		y.putInMicrowave(x);
		y.setTime(cookTimeInt);
		y.startMicrowave();
	}
}
