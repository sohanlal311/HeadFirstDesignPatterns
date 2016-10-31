package com.sohan.c.decoratorpattern.decorator;

import com.sohan.c.decoratorpattern.beverage.Beverage;

public class Milk extends CondimentDecorator {

	public Milk(Beverage beverage) {
		bvg = beverage;
	}

	@Override
	public String getDescription() {
		return "Milk, " + bvg.getDescription();
	}

	@Override
	public double cost() {
		return 0.10 + bvg.cost();
	}

}
