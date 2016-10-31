package com.sohan.a.strategypattern;

import com.sohan.a.strategypattern.fly.FlyWithWings;
import com.sohan.a.strategypattern.quack.Quack;

public class MallardDuck extends Duck {

	MallardDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println(MallardDuck.class);
	}

}
