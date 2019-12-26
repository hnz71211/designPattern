package com.lxh.dp.decoratorPattern.example1.component;

/**
 * @ClassName: HouseBlend
 * @Description:
 * @Author: hexli
 * @Date: 2019-11-16 
 **/
public class HouseBlend extends Beverage {

  public HouseBlend() {
    description = "House Blend";
  }

  @Override
  public double cost() {
    return 0.99;
  }
}
