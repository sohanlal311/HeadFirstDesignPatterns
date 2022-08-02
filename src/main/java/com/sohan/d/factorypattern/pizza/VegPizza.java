package com.sohan.d.factorypattern.pizza;

import com.sohan.d.abstractfactorypattern.pizzaingredientfactory.PizzaIngredientFactory;

public class VegPizza extends Pizza {

	public VegPizza(PizzaIngredientFactory pizzaIngredeintFactory) {
		this.pizzaIngredeintFactory = pizzaIngredeintFactory;
	}

}
