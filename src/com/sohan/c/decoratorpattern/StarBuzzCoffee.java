package com.sohan.c.decoratorpattern;

import com.sohan.c.decoratorpattern.beverage.Beverage;
import com.sohan.c.decoratorpattern.beverage.DarkRoast;
import com.sohan.c.decoratorpattern.beverage.Espresso;
import com.sohan.c.decoratorpattern.beverage.HouseBlend;
import com.sohan.c.decoratorpattern.decorator.Milk;
import com.sohan.c.decoratorpattern.decorator.Mocha;
import com.sohan.c.decoratorpattern.decorator.Whip;

public class StarBuzzCoffee {

	public static void main(String[] args) {
		Beverage bvg = new DarkRoast();
		System.out.println(bvg.getDescription() + " $" + bvg.cost());

		bvg = new Espresso();
		bvg = new Milk(bvg);
		bvg = new Mocha(bvg);
		bvg = new Whip(bvg);
		System.out.println(bvg.getDescription() + " $" + bvg.cost());

		bvg = new HouseBlend();
		bvg = new Mocha(bvg);
		bvg = new Mocha(bvg);
		bvg = new Whip(bvg);
		System.out.println(bvg.getDescription() + " $" + bvg.cost());
	}

}
