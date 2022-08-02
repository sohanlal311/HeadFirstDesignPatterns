package com.sohan.f.statepattern.state;

import java.util.Random;

import com.sohan.f.statepattern.GumBallMachine;

public class HasQuarterState implements IState {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final transient GumBallMachine gumBallMachine;
	private final transient Random rand = new Random(System.currentTimeMillis());

	public HasQuarterState(GumBallMachine gumBallMachine) {
		this.gumBallMachine = gumBallMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You already have inserted a quarter.");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Quarter is ejected.");
		gumBallMachine.setState(gumBallMachine.getNoQuarterState());
	}

	@Override
	public boolean turnsCrank() {
		System.out.println("Crank is turned up.");
		int i = rand.nextInt(10);
		if (i == 0) {
			gumBallMachine.setState(gumBallMachine.getWinnerState());
		} else {
			gumBallMachine.setState(gumBallMachine.getSoldState());
		}
		return true;
	}

	@Override
	public void dispense() {
		System.out.println("Turn the crank to get a gum ball.");
	}

}
