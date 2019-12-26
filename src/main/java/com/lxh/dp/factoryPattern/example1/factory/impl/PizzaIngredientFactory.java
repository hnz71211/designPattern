package com.lxh.dp.factoryPattern.example1.factory.impl;

import com.lxh.dp.factoryPattern.example1.entity.ingredient.*;

public interface PizzaIngredientFactory {

  public Dough createDough();
  public Sauce createSauce();
  public Cheese createCheese();
  public Veggies[] createVeggies();
  public Pepperoni createPepperoni();
  public Clams createClam();

}
