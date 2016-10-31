package com.sohan.e.commandpattern.command;

import com.sohan.e.commandpattern.appliances.CeilingFan;

public class CeilingFanOffCommand implements ICommand {

	private final CeilingFan ceilingFan;
	private int prevSpeed;

	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.off();
	}

	@Override
	public void undo() {
		ceilingFan.setSpeed(prevSpeed);
	}

}
