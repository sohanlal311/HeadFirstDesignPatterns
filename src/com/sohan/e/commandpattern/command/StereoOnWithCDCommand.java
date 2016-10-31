package com.sohan.e.commandpattern.command;

import com.sohan.e.commandpattern.appliances.Stereo;

public class StereoOnWithCDCommand implements ICommand {

	private final Stereo stereo;

	public StereoOnWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.on();
		stereo.setCd();
		stereo.setVolumne(11);
	}

	@Override
	public void undo() {
		stereo.off();
	}

}
