package com.lxh.dp.factoryPattern.example1.entity.pizza;

import com.lxh.dp.factoryPattern.example1.factory.impl.PizzaIngredientFactory;

/**
 * @ClassName: ClamPizza
 * @Description:
 * @Author: hexli
 * @Date: 2019-11-18 
 **/
public class ClamPizza extends Pizza {
  PizzaIngredientFactory ingredientFactory;

  public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
    this.ingredientFactory = pizzaIngredientFactory;
  }

  @Override
  public void prepared() {
    System.out.println("Preparing " + name);
    dough = ingredientFactory.createDough();
    sauce = ingredientFactory.createSauce();
    cheese = ingredientFactory.createCheese();
    clams = ingredientFactory.createClam();
  }
}
