package scoring;

import java.util.ArrayList;

public class Chance extends Score {

	public Chance(ArrayList<Integer> rolledDiceValues) {
		for (Integer integer : rolledDiceValues) {
			this.points += integer;
		}
	}

}
