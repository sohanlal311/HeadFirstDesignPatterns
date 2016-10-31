package com.sohan.e.commandpattern.command;

import com.sohan.e.commandpattern.appliances.Stereo;

public class StereoOffCommand implements ICommand {

	private final Stereo stereo;

	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.off();
	}

	@Override
	public void undo() {
		stereo.on();
		stereo.setCd();
		stereo.setVolumne(11);
	}

}
