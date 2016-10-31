package com.sohan.e.commandpattern.appliances;

public class GarageDoor {

	private final String description;

	public GarageDoor(String desc) {
		description = desc;
	}

	public void up() {
		System.out.println(description + " GarageDoor up.");
	}

	public void down() {
		System.out.println(description + " GarageDoor down.");
	}

	public void stop() {
		System.out.println(description + " GarageDoor stop.");
	}

	public void lightOn() {
		System.out.println(description + " GarageDoor light on.");
	}

	public void lightOff() {
		System.out.println(description + " GarageDoor light off.");
	}

}
