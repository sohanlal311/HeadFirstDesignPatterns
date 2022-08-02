package com.sohan.e.commandpattern.appliances;

import java.util.HashMap;
import java.util.Map;

public enum SPEED {
	HIGH(3), MEDIUM(2), LOW(1), OFF(0);
	private static Map<Integer, SPEED> values = new HashMap<Integer, SPEED>();

	static {
		for (SPEED speed : values()) {
			values.put(speed.getSpeed(), speed);
		}
	}

	final int speed;

	private SPEED(int speed) {
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public static SPEED valueOf(int speed) {
		return values.get(speed);
	}
}
