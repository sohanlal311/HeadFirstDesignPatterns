package com.sohan.c.decoratorpattern.decorator;

import com.sohan.c.decoratorpattern.beverage.Beverage;

public class Mocha extends CondimentDecorator {

	public Mocha(Beverage beverage) {
		bvg = beverage;
	}

	@Override
	public String getDescription() {
		return "Mocha, " + bvg.getDescription();
	}

	@Override
	public double cost() {
		return 0.10 + bvg.cost();
	}

}
