package scoring;

import java.util.ArrayList;

public class Twos extends Score {

	public Twos(ArrayList<Integer> rolledDiceValues) {
		for (Integer integer : rolledDiceValues) {
			if (integer == 2) {
				this.points += integer;
			}
		}
	}

}
