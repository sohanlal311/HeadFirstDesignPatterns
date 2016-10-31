package com.sohan.d.factorypattern;

import com.sohan.d.factorypattern.pizza.PizzaType;
import com.sohan.d.factorypattern.pizzastore.ChicagoPizzaStore;
import com.sohan.d.factorypattern.pizzastore.NYPizzaStore;
import com.sohan.d.factorypattern.pizzastore.PizzaStore;

public class TestPizza {

	public static void main(String[] args) {
		PizzaStore pizzaStore = new NYPizzaStore();
		pizzaStore.orderPizza(PizzaType.CHEESE);

		pizzaStore = new ChicagoPizzaStore();
		pizzaStore.orderPizza(PizzaType.VEG);
	}

}
