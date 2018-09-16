package scoring;

import java.util.ArrayList;

public class Fours extends Score {

	public Fours(ArrayList<Integer> rolledDiceValues) {
		for (Integer integer : rolledDiceValues) {
			if (integer == 4) {
				this.points += integer;
			}
		}
	}
}
