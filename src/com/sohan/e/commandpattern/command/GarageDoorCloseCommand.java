package com.sohan.e.commandpattern.command;

import com.sohan.e.commandpattern.appliances.GarageDoor;

public class GarageDoorCloseCommand implements ICommand {

	private final GarageDoor garageDoor;

	public GarageDoorCloseCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		garageDoor.down();
	}

	@Override
	public void undo() {
		garageDoor.up();
	}

}
