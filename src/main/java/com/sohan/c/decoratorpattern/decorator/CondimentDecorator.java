package com.sohan.c.decoratorpattern.decorator;

import com.sohan.c.decoratorpattern.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {

	Beverage bvg;

	public abstract String getDescription();

}
