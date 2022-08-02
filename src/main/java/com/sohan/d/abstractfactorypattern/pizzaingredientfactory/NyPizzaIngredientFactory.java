package com.sohan.d.abstractfactorypattern.pizzaingredientfactory;

import com.sohan.d.abstractfactorypattern.cheese.Cheese;
import com.sohan.d.abstractfactorypattern.cheese.GoatCheese;
import com.sohan.d.abstractfactorypattern.dough.Dough;
import com.sohan.d.abstractfactorypattern.dough.ThinCrustDough;
import com.sohan.d.abstractfactorypattern.pepperoni.Pepperoni;
import com.sohan.d.abstractfactorypattern.pepperoni.SimplePepperoni;
import com.sohan.d.abstractfactorypattern.sauce.Sauce;
import com.sohan.d.abstractfactorypattern.sauce.TomatoChlliSauce;

public class NyPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Cheese createCheese() {
		return new GoatCheese();
	}

	@Override
	public Sauce createSauce() {
		return new TomatoChlliSauce();
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SimplePepperoni();
	}

}
