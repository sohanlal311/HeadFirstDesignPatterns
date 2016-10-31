package com.sohan.e.commandpattern.command;

import com.sohan.e.commandpattern.appliances.CeilingFan;

public class CeilingFanOnCommand implements ICommand {

	private final CeilingFan ceilingFan;
	private int prevSpeed;

	public CeilingFanOnCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.high();
	}

	@Override
	public void undo() {
		ceilingFan.setSpeed(prevSpeed);
	}

}
