package com.lxh.dp.factoryPattern.example1.factory;

import com.lxh.dp.factoryPattern.example1.entity.ingredient.*;
import com.lxh.dp.factoryPattern.example1.factory.impl.PizzaIngredientFactory;

/**
 * @ClassName: NYPizzaIngredientFactory
 * @Description:
 * @Author: hexli
 * @Date: 2019-11-18 
 **/
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
  @Override
  public Dough createDough() {
    return new ThinCrustDough();
  }

  @Override
  public Sauce createSauce() {
    return new MarinaraSauce();
  }

  @Override
  public Cheese createCheese() {
    return new ReggianoCheese();
  }

  @Override
  public Veggies[] createVeggies() {
    Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
    return veggies;
  }

  @Override
  public Pepperoni createPepperoni() {
    return new SlicedPepperoni();
  }

  @Override
  public Clams createClam() {
    return new FreshClam();
  }
}
