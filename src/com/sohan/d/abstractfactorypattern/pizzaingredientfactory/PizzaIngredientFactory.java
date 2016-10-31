package com.sohan.d.abstractfactorypattern.pizzaingredientfactory;

import com.sohan.d.abstractfactorypattern.cheese.Cheese;
import com.sohan.d.abstractfactorypattern.dough.Dough;
import com.sohan.d.abstractfactorypattern.pepperoni.Pepperoni;
import com.sohan.d.abstractfactorypattern.sauce.Sauce;

public interface PizzaIngredientFactory {
	Dough createDough();

	Cheese createCheese();

	Sauce createSauce();

	Pepperoni createPepperoni();
}
