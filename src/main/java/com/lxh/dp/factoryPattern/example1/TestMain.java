package com.lxh.dp.factoryPattern.example1;

import com.lxh.dp.factoryPattern.example1.entity.store.NYPizzaStore;
import com.lxh.dp.factoryPattern.example1.entity.store.PizzaStore;
import com.lxh.dp.factoryPattern.example1.factory.NYPizzaIngredientFactory;

/**
 * @ClassName: TestMain
 * @Description:
 * @Author: hexli
 * @Date: 2019-11-18 
 **/
public class TestMain {


  public static void main(String[] args) {
    PizzaStore store = new NYPizzaStore();
    store.orderPizza("cheese");

  }


}
