package com.sohan.d.factorypattern.pizza;

import com.sohan.d.abstractfactorypattern.pizzaingredientfactory.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza {

	public PepperoniPizza(PizzaIngredientFactory pizzaIngredeintFactory) {
		this.pizzaIngredeintFactory = pizzaIngredeintFactory;
	}

}
