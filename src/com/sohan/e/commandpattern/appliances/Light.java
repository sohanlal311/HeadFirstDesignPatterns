package com.sohan.e.commandpattern.appliances;

public class Light {

	private final String description;

	public Light(String desc) {
		description = desc;
	}

	public void on() {
		System.out.println(description + " light is on.");
	}

	public void off() {
		System.out.println(description + " light is off.");
	}

}
