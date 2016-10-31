package com.sohan.d.abstractfactorypattern.pizzaingredientfactory;

import com.sohan.d.abstractfactorypattern.cheese.Cheese;
import com.sohan.d.abstractfactorypattern.cheese.MozzarellaCheese;
import com.sohan.d.abstractfactorypattern.dough.Dough;
import com.sohan.d.abstractfactorypattern.dough.ThickCrustDough;
import com.sohan.d.abstractfactorypattern.pepperoni.Pepperoni;
import com.sohan.d.abstractfactorypattern.pepperoni.SimplePepperoni;
import com.sohan.d.abstractfactorypattern.sauce.Sauce;
import com.sohan.d.abstractfactorypattern.sauce.TomatoSauce;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}

	@Override
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	@Override
	public Sauce createSauce() {
		return new TomatoSauce();
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SimplePepperoni();
	}

}
