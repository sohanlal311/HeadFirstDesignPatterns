package com.sohan.d.factorypattern.pizzastore;

import com.sohan.d.factorypattern.pizza.Pizza;
import com.sohan.d.factorypattern.pizza.PizzaType;

public abstract class PizzaStore {

	public void orderPizza(PizzaType type) {
		Pizza pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
	}

	public abstract Pizza createPizza(PizzaType type);

}