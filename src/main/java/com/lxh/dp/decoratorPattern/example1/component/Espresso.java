package com.lxh.dp.decoratorPattern.example1.component;

/**
 * @ClassName: Espresso
 * @Description:
 * @Author: hexli
 * @Date: 2019-11-16 
 **/
public class Espresso extends Beverage {

  public Espresso() {
    description = "Espresso";
  }

  @Override
  public double cost() {
    return 1.99;
  }
}
