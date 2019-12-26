package com.lxh.dp.factoryPattern.example1.entity.store;

import com.lxh.dp.factoryPattern.example1.entity.pizza.Pizza;

/**
 * @ClassName: PizzaStore
 * @Description:
 * @Author: hexli
 * @Date: 2019-11-18 
 **/
public abstract class PizzaStore {

  public Pizza orderPizza(String type) {
    Pizza pizza;

    pizza = createPizza(type);
    pizza.prepared();
    pizza.bake();
    pizza.cut();
    pizza.box();

    return pizza;
  }

  public abstract Pizza createPizza(String type);

}
