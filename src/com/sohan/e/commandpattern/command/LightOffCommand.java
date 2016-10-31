package com.sohan.e.commandpattern.command;

import com.sohan.e.commandpattern.appliances.Light;

public class LightOffCommand implements ICommand {

	private final Light light;

	public LightOffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.off();
	}

	@Override
	public void undo() {
		light.on();
	}

}
