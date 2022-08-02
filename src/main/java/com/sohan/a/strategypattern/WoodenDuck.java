package com.sohan.a.strategypattern;

import com.sohan.a.strategypattern.fly.FlyNoWay;
import com.sohan.a.strategypattern.quack.Squeak;

public class WoodenDuck extends Duck {

	WoodenDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}

	@Override
	public void display() {
		System.out.println(WoodenDuck.class);
	}

}
