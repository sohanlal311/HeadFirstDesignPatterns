package com.sohan.e.commandpattern.appliances;

public class Stereo {

	private final String description;
	private int volume;

	public Stereo(String desc) {
		description = desc;
	}

	public void on() {
		System.out.println(description + " stereo is on.");
	}

	public void off() {
		System.out.println(description + " stereo is off.");
	}

	public void setCd() {
		System.out.println(description + " stereo cd is set");
	}

	public void setRadio() {
		System.out.println(description + " stereo radio is set");
	}

	public void setVolumne(int volume) {
		this.volume = volume;
		System.out.println(description + " stereo volume is set to "
				+ this.volume);
	}

	public int getVolume() {
		return volume;
	}

}
