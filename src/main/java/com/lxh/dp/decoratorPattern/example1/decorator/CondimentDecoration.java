package com.lxh.dp.decoratorPattern.example1.decorator;

import com.lxh.dp.decoratorPattern.example1.component.Beverage;

/**
 * @ClassName: CondimentDecration
 * @Description:
 * @Author: hexli
 * @Date: 2019-11-16 
 **/
public abstract class CondimentDecoration extends Beverage {

  public abstract String getDescription();

}
