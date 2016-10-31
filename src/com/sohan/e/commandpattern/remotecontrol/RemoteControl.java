package com.sohan.e.commandpattern.remotecontrol;

import com.sohan.e.commandpattern.command.ICommand;
import com.sohan.e.commandpattern.command.NoCommand;

public class RemoteControl {

	private int noOfSlots = 7;
	private ICommand[] onCommands;
	private ICommand[] offCommands;
	private ICommand undoCommand;

	RemoteControl() {
		onCommands = new ICommand[noOfSlots];
		offCommands = new ICommand[noOfSlots];

		ICommand noCommand = new NoCommand();
		for (int i = 0; i < noOfSlots; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		undoCommand = noCommand;
	}

	public void setCommand(int slot, ICommand onCommand, ICommand offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}

	public void onButtonWasPressed(int slot) {
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}

	public void offButtonWasPressed(int slot) {
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}

	public void undoButtonWasPressed(int slot) {
		undoCommand.undo();
	}

	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("\nRemote Control...........");
		for (int i = 0; i < noOfSlots; i++) {
			buffer.append("\nSlot[" + i + "]\t"
					+ onCommands[i].getClass().getName() + "\t"
					+ offCommands[i].getClass().getName());
		}
		buffer.append("\nUndo Command\t" + undoCommand.getClass().getName());
		return buffer.toString();
	}
}
