package scoring;

import java.util.ArrayList;

public class Ones extends Score {

	public Ones(ArrayList<Integer> rolledDiceValues) {
		for (Integer integer : rolledDiceValues) {
			if (integer == 1) {
				this.points += integer;
			}
		}
	}

}
