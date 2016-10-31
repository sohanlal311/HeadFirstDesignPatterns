package com.sohan.d.factorypattern.pizza;

import com.sohan.d.abstractfactorypattern.cheese.Cheese;
import com.sohan.d.abstractfactorypattern.dough.Dough;
import com.sohan.d.abstractfactorypattern.pepperoni.Pepperoni;
import com.sohan.d.abstractfactorypattern.pizzaingredientfactory.PizzaIngredientFactory;
import com.sohan.d.abstractfactorypattern.sauce.Sauce;

public abstract class Pizza {
	Dough dough;
	Cheese cheese;
	Sauce sauce;
	Pepperoni pepperoni;
	PizzaIngredientFactory pizzaIngredeintFactory;

	public void prepare() {
		dough = pizzaIngredeintFactory.createDough();
		cheese = pizzaIngredeintFactory.createCheese();
		sauce = pizzaIngredeintFactory.createSauce();
		pepperoni = pizzaIngredeintFactory.createPepperoni();
		System.out.println("Preparing " + this.getClass().getName()
				+ " pizza...\nadding " + dough.getClass().getName()
				+ "...\nadding " + cheese.getClass().getName() + "...\nadding "
				+ sauce.getClass().getName() + "...\nadding "
				+ pepperoni.getClass().getName());
	}

	public void bake() {
		System.out.println("Baking...");
	}

	public void cut() {
		System.out.println("Cutting diagonal shapes...");
	}

	public void box() {
		System.out.println("Boxing in official boxes...");
	}
}
