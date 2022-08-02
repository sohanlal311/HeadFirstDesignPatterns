package com.sohan.d.factorypattern.pizzastore;

import com.sohan.d.abstractfactorypattern.pizzaingredientfactory.NyPizzaIngredientFactory;
import com.sohan.d.abstractfactorypattern.pizzaingredientfactory.PizzaIngredientFactory;
import com.sohan.d.factorypattern.pizza.CheesePizza;
import com.sohan.d.factorypattern.pizza.ClamPizza;
import com.sohan.d.factorypattern.pizza.PepperoniPizza;
import com.sohan.d.factorypattern.pizza.Pizza;
import com.sohan.d.factorypattern.pizza.PizzaType;
import com.sohan.d.factorypattern.pizza.VegPizza;

public class NYPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(PizzaType type) {
		Pizza pizza = null;
		PizzaIngredientFactory pizzaIngredeintFactory = new NyPizzaIngredientFactory();
		if (type == PizzaType.CHEESE) {
			pizza = new CheesePizza(pizzaIngredeintFactory);
		} else if (type == PizzaType.VEG) {
			pizza = new VegPizza(pizzaIngredeintFactory);
		} else if (type == PizzaType.CLAM) {
			pizza = new ClamPizza(pizzaIngredeintFactory);
		} else if (type == PizzaType.PEPPERONI) {
			pizza = new PepperoniPizza(pizzaIngredeintFactory);
		}
		return pizza;
	}
}
