package com.sohan.e.commandpattern.appliances;

public class CeilingFan {

	private final String description;
	private SPEED speed;

	public CeilingFan(String desc) {
		speed = SPEED.OFF;
		description = desc;
	}

	public void high() {
		speed = SPEED.HIGH;
		System.out.println(toString());
	}

	public void medium() {
		speed = SPEED.MEDIUM;
		System.out.println(toString());
	}

	public void low() {
		speed = SPEED.LOW;
		System.out.println(toString());
	}

	public void off() {
		speed = SPEED.OFF;
		System.out.println(toString());
	}

	public void setSpeed(int speed) {
		this.speed = SPEED.valueOf(speed);
		System.out.println(toString());
	}

	public int getSpeed() {
		return speed.getSpeed();
	}

	public String toString() {
		return description + " CeilingFan is " + speed.name();
	}

}