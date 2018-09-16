package diceRolls;

import java.util.ArrayList;

public class RolledDice {

	private ArrayList<Die> diceRolls;
	
	public ArrayList<Die> getDiceRolls() {
		return diceRolls;
	}
	
	public RolledDice() {
		diceRolls = new ArrayList<>();
		diceRolls.add(new Die());
		diceRolls.add(new Die());
		diceRolls.add(new Die());
		diceRolls.add(new Die());
		diceRolls.add(new Die());
	}
	
	public void reRoll(ArrayList<Integer> diceToReroll) {
		for (Integer dieToReroll : diceToReroll) {
			diceRolls.remove(dieToReroll - 1);
			diceRolls.add(dieToReroll - 1, new Die());
		}
	}

}
