package _05_vault;

class Vault {
	
	private int secretCode;
	public boolean codeGuessedTrueFalse = false;
	
	Vault() {
		
		System.out.println("Vault made!");
	}
	
	public void tryCode(int guess) {
		
		if (guess == secretCode) {
			
			codeGuessedTrueFalse = true;
		}
		
		else {
			
			codeGuessedTrueFalse = false;
		}
	}
	
	public class JamesBond {
		
		public void findCode(Vault) {
			
			
		}
	}
}