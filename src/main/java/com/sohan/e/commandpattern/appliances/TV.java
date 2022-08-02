package com.sohan.e.commandpattern.appliances;

public class TV {
	private final String description;
	private int channel;
	private int volume;

	public TV(String desc) {
		description = desc;
	}

	public void on() {
		System.out.println(description + " TV is on.");
	}

	public void off() {
		System.out.println(description + " TV is off.");
	}

	public void setInputChannel(int channelNumber) {
		channel = channelNumber;
		System.out.println(description + " TV channel is set to " + channel);
	}

	public void setVolumne(int volume) {
		this.volume = volume;
		System.out.println(description + " TV volume is set to " + this.volume);
	}

	public int getVolume() {
		return volume;
	}

}
