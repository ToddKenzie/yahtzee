package scoring;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class ScoreTest {
	
	ArrayList<Integer> rolledDiceValues;
	
	@Before
	public void setUp() {
		rolledDiceValues = new ArrayList<>();
	}
	
	@Test
	public void validateScoreOfChance() {
		rolledDiceValues.add(1);
		rolledDiceValues.add(2);
		rolledDiceValues.add(3);
		rolledDiceValues.add(4);
		rolledDiceValues.add(5);
		Score underTest = new Chance(rolledDiceValues);
		int points = underTest.getPoints();
		assertThat(points, is(15));
	}

	
	@Test
	public void validateScoreOfOnesfor2onesIs2() {
		rolledDiceValues.add(1);
		rolledDiceValues.add(2);
		rolledDiceValues.add(3);
		rolledDiceValues.add(1);
		rolledDiceValues.add(5);
		Score underTest = new Ones(rolledDiceValues);
		int points = underTest.getPoints();
		assertThat(points, is(2));
	}
	
	@Test
	public void validateScoreOfTwosfor3twosIs6() {
		rolledDiceValues.add(1);
		rolledDiceValues.add(2);
		rolledDiceValues.add(3);
		rolledDiceValues.add(2);
		rolledDiceValues.add(2);
		Score underTest = new Twos(rolledDiceValues);
		int points = underTest.getPoints();
		assertThat(points, is(6));
	}

}
