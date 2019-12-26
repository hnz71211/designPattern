package com.lxh.dp.decoratorPattern.example1;

import com.lxh.dp.decoratorPattern.example1.decorator.Mocha;
import com.lxh.dp.decoratorPattern.example1.component.Beverage;
import com.lxh.dp.decoratorPattern.example1.component.Espresso;

/**
 * @ClassName: MainFunction
 * @Description:
 * @Author: hexli
 * @Date: 2019-11-16 
 **/
public class MainFunction {

  public static void main(String[] args) {
    Beverage beverage = new Espresso();
    System.out.println(beverage.getDescription() + " $" + beverage.cost());
    beverage = new Mocha(beverage);
    System.out.println(beverage.getDescription() + " $" + beverage.cost());
  }

}
