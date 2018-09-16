package scoring;

import java.util.ArrayList;

public class Fives extends Score {

	public Fives(ArrayList<Integer> rolledDiceValues) {
		for (Integer integer : rolledDiceValues) {
			if (integer == 5) {
				this.points += integer;
			}
		}
	}
}
