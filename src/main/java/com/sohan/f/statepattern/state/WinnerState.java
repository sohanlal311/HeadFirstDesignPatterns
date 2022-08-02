package com.sohan.f.statepattern.state;

import com.sohan.f.statepattern.GumBallMachine;

import java.io.Serial;


public class WinnerState implements IState {

    @Serial
    private static final long serialVersionUID = 1L;
    private final transient GumBallMachine gumBallMachine;

    public WinnerState(GumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Wait, you are getting a gum ball.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You have already turned up the crank.");
    }

    @Override
    public boolean turnsCrank() {
        System.out
                .println("Turning the crank twice doesn't give you two gum balls.");
        return false;
    }

    @Override
    public void dispense() {
        System.out.println("A gum ball comes rolling out.");
        gumBallMachine.releaseBall();
        if (gumBallMachine.getCount() > 0) {
            System.out.println("Congrats, you are a WINNER. You are getting second ball free.");
            gumBallMachine.releaseBall();
            if (gumBallMachine.getCount() > 0) {
                gumBallMachine.setState(gumBallMachine.getNoQuarterState());
            } else {
                gumBallMachine.setState(gumBallMachine.getSoldOutState());
            }
        } else {
            gumBallMachine.setState(gumBallMachine.getSoldOutState());
        }
    }

}
