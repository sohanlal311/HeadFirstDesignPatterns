package com.sohan.a.strategypattern;

import com.sohan.a.strategypattern.fly.FlyBehavior;
import com.sohan.a.strategypattern.quack.QuackBehavior;

public abstract class Duck {
	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;

	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}

	public void setFlyBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}

	public void performFly() {
		flyBehavior.fly();
	}

	public void performQuack() {
		quackBehavior.quack();
	}

	public void swim() {
		System.out.println("Every duck can swim.");
	}

	public abstract void display();
}
