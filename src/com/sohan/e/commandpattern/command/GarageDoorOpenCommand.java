package com.sohan.e.commandpattern.command;

import com.sohan.e.commandpattern.appliances.GarageDoor;

public class GarageDoorOpenCommand implements ICommand {

	private final GarageDoor garageDoor;

	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		garageDoor.up();
	}

	@Override
	public void undo() {
		garageDoor.down();
	}

}
