package com.sohan.e.commandpattern.command;


public class NoCommand implements ICommand {

	@Override
	public void execute() {
		// Do nothing
	}

	@Override
	public void undo() {
		// Do nothing
	}

}
