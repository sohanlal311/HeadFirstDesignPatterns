package com.sohan.f.statepattern.state;

import com.sohan.f.statepattern.GumBallMachine;

import java.io.Serial;


public class SoldOutState implements IState {

	@Serial
	private static final long serialVersionUID = 1L;
	private final transient GumBallMachine gumBallMachine;

	public SoldOutState(GumBallMachine gumBallMachine) {
		this.gumBallMachine = gumBallMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("GumBall machine is empty.");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("You haven't inserted a quarter.");
	}

	@Override
	public boolean turnsCrank() {
		System.out
				.println("Crank is turned up but you haven't inserted a quarter.");
		return false;
	}

	@Override
	public void dispense() {
		System.out.println("You haven't inserted a quarter.");
	}

}
