package diceRolls;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class RolledDiceTest {

	RolledDice underTest; 
	ArrayList<Die> testDice; 
	ArrayList<Integer> diceToReroll;
	
	@Before
	public void setUp() {
		underTest = new RolledDice();
		testDice = underTest.getDiceRolls();
		diceToReroll = new ArrayList<>();
	}
	
	@Test
	public void prove5DiceHaveBeenRolled() {
		assertThat(testDice.size(), is(5));
	}
	
	@Test
	public void checkValueOfFirstDieIsBetween1to6() {
		int dieRoll = testDice.get(0).getDieValue();
		assertTrue(1 <= dieRoll && dieRoll <= 6);
	}
	
	@Test
	public void checkAllValuesOfDiceAreBetween1to6() {
		int dieRoll1 = testDice.get(0).getDieValue();
		int dieRoll2 = testDice.get(1).getDieValue();
		int dieRoll3 = testDice.get(2).getDieValue();
		int dieRoll4 = testDice.get(3).getDieValue();
		int dieRoll5 = testDice.get(4).getDieValue();
		assertTrue(1 <= dieRoll1 && dieRoll1 <= 6);
		assertTrue(1 <= dieRoll2 && dieRoll2 <= 6);
		assertTrue(1 <= dieRoll3 && dieRoll3 <= 6);
		assertTrue(1 <= dieRoll4 && dieRoll4 <= 6);
		assertTrue(1 <= dieRoll5 && dieRoll5 <= 6);
	}
	
	@Test
	public void checkOnly2ndDieIsChangedOnCall() {
		Die die1a = testDice.get(0);
		Die die2a = testDice.get(1);
		Die die3a = testDice.get(2);
		Die die4a = testDice.get(3);
		Die die5a = testDice.get(4);
		diceToReroll.add(2);
		underTest.reRoll(diceToReroll);
		Die die2b = testDice.get(1);
		ArrayList<Die> reRolls = underTest.getDiceRolls();
		assertThat(reRolls.size(), is(5));
		assertThat(reRolls, not(contains(die2a)));
		assertThat(reRolls, containsInAnyOrder(die1a, die2b, die3a, die4a, die5a));
	}

	@Test
	public void check2ndAnd4thDieIsChangedOnCall() {
		Die die1a = testDice.get(0);
		Die die2a = testDice.get(1);
		Die die3a = testDice.get(2);
		Die die4a = testDice.get(3);
		Die die5a = testDice.get(4);
		diceToReroll.add(2);
		diceToReroll.add(4);
		underTest.reRoll(diceToReroll);
		Die die2b = testDice.get(1);
		Die die4b = testDice.get(3);
		ArrayList<Die> reRolls = underTest.getDiceRolls();
		assertThat(reRolls.size(), is(5));
		assertThat(reRolls, not(contains(die2a, die4a)));
		assertThat(reRolls, containsInAnyOrder(die1a, die2b, die3a, die4b, die5a));
	}


}
