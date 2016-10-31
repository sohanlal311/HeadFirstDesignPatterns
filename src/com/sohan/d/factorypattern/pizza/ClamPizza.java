package com.sohan.d.factorypattern.pizza;

import com.sohan.d.abstractfactorypattern.pizzaingredientfactory.PizzaIngredientFactory;

public class ClamPizza extends Pizza {

	public ClamPizza(PizzaIngredientFactory pizzaIngredeintFactory) {
		this.pizzaIngredeintFactory = pizzaIngredeintFactory;
	}

}
