package com.sohan.f.statepattern;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import com.sohan.f.statepattern.state.HasQuarterState;
import com.sohan.f.statepattern.state.IState;
import com.sohan.f.statepattern.state.NoQuarterState;
import com.sohan.f.statepattern.state.SoldOutState;
import com.sohan.f.statepattern.state.SoldState;
import com.sohan.f.statepattern.state.WinnerState;
import com.sohan.g.proxypattern.remoteproxy.IGumBallMachineRemote;

public class GumBallMachine extends UnicastRemoteObject implements
		IGumBallMachineRemote {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final IState noQuarterState;
	private final IState hasQuarterState;
	private final IState soldState;
	private final IState winnerState;
	private final IState soldOutState;

	private int count;
	private IState currentState;

	public GumBallMachine(int count) throws RemoteException {
		this.count = count;
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		winnerState = new WinnerState(this);
		soldOutState = new SoldOutState(this);
		if (count > 0) {
			currentState = noQuarterState;
		} else {
			currentState = soldOutState;
		}
	}

	public void insertQuarter() {
		currentState.insertQuarter();
	}

	public void ejectQuarter() {
		currentState.ejectQuarter();
	}

	public void turnsCrank() {
		if (currentState.turnsCrank()) {
			currentState.dispense();
		}
	}

	public void dispense() {
		currentState.dispense();
	}

	public void setState(IState state) {
		currentState = state;
	}

	public IState getNoQuarterState() {
		return noQuarterState;
	}

	public IState getHasQuarterState() {
		return hasQuarterState;
	}

	public IState getSoldState() {
		return soldState;
	}

	public IState getWinnerState() {
		return winnerState;
	}

	public IState getSoldOutState() {
		return soldOutState;
	}

	public IState getCurrentState() {
		return currentState;
	}

	public void releaseBall() {
		count -= 1;
	}

	public int getCount() {
		return count;
	}

	public String toString() {
		return "Count: " + getCount() + "\nCurrent State: "
				+ currentState.getClass().getName();
	}

}
