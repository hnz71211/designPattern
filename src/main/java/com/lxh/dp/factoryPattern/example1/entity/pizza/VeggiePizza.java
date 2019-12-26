package com.lxh.dp.factoryPattern.example1.entity.pizza;

import com.lxh.dp.factoryPattern.example1.factory.impl.PizzaIngredientFactory;

/**
 * @ClassName: VeggiePizza
 * @Description:
 * @Author: hexli
 * @Date: 2019-11-18 
 **/
public class VeggiePizza extends Pizza {
  PizzaIngredientFactory ingredientFactory;

  public VeggiePizza(PizzaIngredientFactory pizzaIngredientFactory) {
    this.ingredientFactory = pizzaIngredientFactory;
  }

  @Override
  public void prepared() {

  }
}
