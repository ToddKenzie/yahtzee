package scoring;

import java.util.ArrayList;

public class Threes extends Score {

	public Threes(ArrayList<Integer> rolledDiceValues) {
		for (Integer integer : rolledDiceValues) {
			if (integer == 3) {
				this.points += integer;
			}
		}
	}
}
