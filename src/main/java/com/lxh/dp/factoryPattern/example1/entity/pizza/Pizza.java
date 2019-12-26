package com.lxh.dp.factoryPattern.example1.entity.pizza;

import com.lxh.dp.factoryPattern.example1.entity.ingredient.*;

import java.util.Arrays;

/**
 * @ClassName: Pizza
 * @Description:
 * @Author: hexli
 * @Date: 2019-11-18 
 **/
public abstract class Pizza {

  String name;
  Dough dough;
  Sauce sauce;
  Cheese cheese;
  Veggies[] veggies;
  Pepperoni pepperoni;
  Clams clams;

  public abstract void prepared();

  public void bake() {
    System.out.println("bake...");
  }

  public void cut() {
    System.out.println("cut...");
  }

  public void box() {
    System.out.println("box...");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override public String toString() {
    return "Pizza{" + "name='" + name + '\'' + ", dough=" + dough + ", sauce=" + sauce + ", cheese=" + cheese
            + ", veggies=" + Arrays.toString(veggies) + ", pepperoni=" + pepperoni + ", clams=" + clams + '}';
  }
}
