package diceRolls;

public class Die {

	private int dieValue;

	public int getDieValue() {
		return dieValue;
	}
	
	public Die() {
		dieValue = (int)(Math.random() * 6 + 1);
	}
	
}
