package com.lxh.dp.factoryPattern.example1.entity.store;

import com.lxh.dp.factoryPattern.example1.entity.pizza.CheesePizza;
import com.lxh.dp.factoryPattern.example1.entity.pizza.ClamPizza;
import com.lxh.dp.factoryPattern.example1.entity.pizza.Pizza;
import com.lxh.dp.factoryPattern.example1.entity.pizza.VeggiePizza;
import com.lxh.dp.factoryPattern.example1.factory.NYPizzaIngredientFactory;
import com.lxh.dp.factoryPattern.example1.factory.impl.PizzaIngredientFactory;

/**
 * @ClassName: NYPizzaStore
 * @Description:
 * @Author: hexli
 * @Date: 2019-11-18 
 **/
public class NYPizzaStore extends PizzaStore {

  @Override
  public Pizza createPizza(String type) {
    Pizza pizza = null;
    PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

    if ("cheese".equals(type)) {
      pizza = new CheesePizza(ingredientFactory);
      pizza.setName("New York Style Cheese Pizza");
    }else if ("veggie".equals(type)) {
      pizza = new VeggiePizza(ingredientFactory);
      pizza.setName("New York Style Veggie Pizza");
    }else if ("clam".equals(type)) {
      pizza = new ClamPizza(ingredientFactory);
      pizza.setName("New York Style Clam Pizza");
    }else if ("perperoni".equals(type)) {

    }

    return pizza;
  }
}
