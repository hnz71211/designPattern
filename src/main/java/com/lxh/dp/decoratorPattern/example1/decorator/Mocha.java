package com.lxh.dp.decoratorPattern.example1.decorator;

import com.lxh.dp.decoratorPattern.example1.component.Beverage;

/**
 * @ClassName: Mocha
 * @Description:
 * @Author: hexli
 * @Date: 2019-11-16 
 **/
public class Mocha extends CondimentDecoration {
  Beverage beverage;

  public Mocha(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Mocha";
  }

  @Override
  public double cost() {
    return 0.20 + beverage.cost();
  }
}
