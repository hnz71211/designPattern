package com.lxh.dp.factoryPattern.example1.factory;

import com.lxh.dp.factoryPattern.example1.entity.ingredient.*;
import com.lxh.dp.factoryPattern.example1.factory.impl.PizzaIngredientFactory;

/**
 * @ClassName: ChicagoPizzaIngredientFactory
 * @Description:
 * @Author: hexli
 * @Date: 2019-11-18 
 **/
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
  @Override
  public Dough createDough() {
    return null;
  }

  @Override
  public Sauce createSauce() {
    return null;
  }

  @Override
  public Cheese createCheese() {
    return null;
  }

  @Override
  public Veggies[] createVeggies() {
    return new Veggies[0];
  }

  @Override
  public Pepperoni createPepperoni() {
    return null;
  }

  @Override
  public Clams createClam() {
    return null;
  }
}
