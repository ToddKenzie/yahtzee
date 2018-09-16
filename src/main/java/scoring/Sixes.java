package scoring;

import java.util.ArrayList;

public class Sixes extends Score {

	public Sixes(ArrayList<Integer> rolledDiceValues) {
		for (Integer integer : rolledDiceValues) {
			if (integer == 6) {
				this.points += integer;
			}
		}
	}
}
