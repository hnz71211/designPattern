package com.lxh.dp.decoratorPattern.example1.component;

/**
 * @ClassName: Beverage
 * @Description:
 * @Author: hexli
 * @Date: 2019-11-16 
 **/
public abstract class Beverage {

  String description = "unknown beverage";

  public String getDescription() {
    return description;
  }

  public abstract double cost();

}
