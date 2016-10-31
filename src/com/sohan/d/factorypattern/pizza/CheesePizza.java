package com.sohan.d.factorypattern.pizza;

import com.sohan.d.abstractfactorypattern.pizzaingredientfactory.PizzaIngredientFactory;

public class CheesePizza extends Pizza {

	public CheesePizza(PizzaIngredientFactory pizzaIngredeintFactory) {
		this.pizzaIngredeintFactory = pizzaIngredeintFactory;
	}

}
