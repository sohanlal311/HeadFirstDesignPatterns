package com.sohan.f.statepattern.state;

import com.sohan.f.statepattern.GumBallMachine;

import java.io.Serial;


public class NoQuarterState implements IState {

	@Serial
	private static final long serialVersionUID = 1L;
	private final transient GumBallMachine gumBallMachine;

	public NoQuarterState(GumBallMachine gumBallMachine) {
		this.gumBallMachine = gumBallMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You inserted a quarter.");
		gumBallMachine.setState(gumBallMachine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		System.out.println("You hasvn't inserted a quarter yet.");
	}

	@Override
	public boolean turnsCrank() {
		System.out
				.println("Crank is turned up but you haven't inserted a quarter.");
		return false;
	}

	@Override
	public void dispense() {
		System.out.println("Please insert a quarter first.");
	}

}
