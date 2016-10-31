package com.sohan.e.commandpattern.command;

public class MacroCommand implements ICommand {

	private final ICommand[] commands;

	public MacroCommand(ICommand[] commands) {
		this.commands = commands;
	}

	@Override
	public void execute() {
		for (ICommand command : commands) {
			command.execute();
		}
	}

	@Override
	public void undo() {
		for (ICommand command : commands) {
			command.undo();
		}
	}

}
