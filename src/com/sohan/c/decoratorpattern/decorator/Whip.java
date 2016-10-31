package com.sohan.c.decoratorpattern.decorator;

import com.sohan.c.decoratorpattern.beverage.Beverage;

public class Whip extends CondimentDecorator {

	public Whip(Beverage beverage) {
		bvg = beverage;
	}

	@Override
	public String getDescription() {
		return "Mocha, " + bvg.getDescription();
	}

	@Override
	public double cost() {
		return 0.20 + bvg.cost();
	}

}
