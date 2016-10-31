package com.sohan.a.strategypattern;

import com.sohan.a.strategypattern.fly.FlyRocketPowered;

public class MiniDuckSimulator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Duck mallardDuck = new MallardDuck();
		simulateDuck(mallardDuck);

		Duck woodenDuck = new WoodenDuck();
		simulateDuck(woodenDuck);

		woodenDuck.setFlyBehavior(new FlyRocketPowered());
		simulateDuck(woodenDuck);
	}

	private static void simulateDuck(Duck duck) {
		duck.display();
		duck.swim();
		duck.performFly();
		duck.performQuack();
	}

}
