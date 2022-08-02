package com.sohan.e.commandpattern.remotecontrol;

import java.util.Calendar;

import com.sohan.e.commandpattern.appliances.CeilingFan;
import com.sohan.e.commandpattern.appliances.GarageDoor;
import com.sohan.e.commandpattern.appliances.Light;
import com.sohan.e.commandpattern.appliances.Stereo;
import com.sohan.e.commandpattern.command.CeilingFanOffCommand;
import com.sohan.e.commandpattern.command.CeilingFanOnCommand;
import com.sohan.e.commandpattern.command.GarageDoorCloseCommand;
import com.sohan.e.commandpattern.command.GarageDoorOpenCommand;
import com.sohan.e.commandpattern.command.ICommand;
import com.sohan.e.commandpattern.command.LightOffCommand;
import com.sohan.e.commandpattern.command.LightOnCommand;
import com.sohan.e.commandpattern.command.MacroCommand;
import com.sohan.e.commandpattern.command.StereoOffCommand;
import com.sohan.e.commandpattern.command.StereoOnWithCDCommand;

public class RemoteControlTest {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(1356668075643L);
		System.out.println(cal.getTime());
	}
	
	public static void main1(String[] args) {
		RemoteControl remoteControl = new RemoteControl();

		Light roomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		GarageDoor garageDoor = new GarageDoor("");
		Stereo stereo = new Stereo("Living Room");

		LightOnCommand livingRoomLightOnCommand = new LightOnCommand(roomLight);
		LightOnCommand kitchenRoomLightOnCommand = new LightOnCommand(
				kitchenLight);
		CeilingFanOnCommand ceilingFanOnCommand = new CeilingFanOnCommand(
				ceilingFan);
		GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(
				garageDoor);
		StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(
				stereo);

		LightOffCommand livingRoomLightOffCommand = new LightOffCommand(
				roomLight);
		LightOffCommand kitchenRoomLightOffCommand = new LightOffCommand(
				kitchenLight);
		CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(
				ceilingFan);
		GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(
				garageDoor);
		StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

		// remoteControl.setCommand(0, livingRoomLightOnCommand,
		// livingRoomLightOffCommand);
		// remoteControl.setCommand(1, kitchenRoomLightOnCommand,
		// kitchenRoomLightOffCommand);
		// remoteControl.setCommand(2, ceilingFanOnCommand,
		// ceilingFanOffCommand);
		// remoteControl.setCommand(3, garageDoorOpenCommand,
		// garageDoorCloseCommand);
		// remoteControl.setCommand(4, stereoOnWithCDCommand, stereoOffCommand);

		// System.out.println(remoteControl);
		// remoteControl.onButtonWasPressed(0);
		// remoteControl.offButtonWasPressed(0);
		//
		// System.out.println(remoteControl);
		// remoteControl.undoButtonWasPressed(0);
		// remoteControl.offButtonWasPressed(0);
		// remoteControl.onButtonWasPressed(0);
		//
		// System.out.println(remoteControl);
		// remoteControl.undoButtonWasPressed(0);

		// remoteControl.onButtonWasPressed(1);
		// remoteControl.offButtonWasPressed(1);
		// remoteControl.onButtonWasPressed(2);
		// remoteControl.offButtonWasPressed(2);
		// remoteControl.onButtonWasPressed(3);
		// remoteControl.offButtonWasPressed(3);
		// remoteControl.onButtonWasPressed(4);
		// remoteControl.offButtonWasPressed(4);
		// remoteControl.onButtonWasPressed(5);
		// remoteControl.offButtonWasPressed(5);
		ICommand[] partyOnCommands = { livingRoomLightOnCommand,
				ceilingFanOnCommand, stereoOnWithCDCommand };
		ICommand[] partyOffCommands = { livingRoomLightOffCommand,
				ceilingFanOffCommand, stereoOffCommand };
		MacroCommand partyOnCommand = new MacroCommand(partyOnCommands);
		MacroCommand partyOffCommand = new MacroCommand(partyOffCommands);

		remoteControl.setCommand(0, partyOnCommand, partyOffCommand);

		System.out.println(remoteControl);
		remoteControl.onButtonWasPressed(0);
		remoteControl.offButtonWasPressed(0);

		System.out.println(remoteControl);
		remoteControl.undoButtonWasPressed(0);
		remoteControl.offButtonWasPressed(0);
		remoteControl.onButtonWasPressed(0);
		
		System.out.println(remoteControl);
	}

}
