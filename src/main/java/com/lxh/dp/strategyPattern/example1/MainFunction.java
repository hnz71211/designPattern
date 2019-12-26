package com.lxh.dp.strategyPattern.example1;

import com.lxh.dp.strategyPattern.example1.behaviour.fly.impl.FlyWithWings;
import com.lxh.dp.strategyPattern.example1.behaviour.quack.impl.Quack;
import com.lxh.dp.strategyPattern.example1.entity.Duck;
import com.lxh.dp.strategyPattern.example1.entity.MallardDuck;

/**
 * @ClassName: MainFunction
 * @Description:
 * @Author: hexli
 * @Date: 2019-10-23 
 **/
public class MainFunction {

    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.setFlyBehaviour(new FlyWithWings());
        duck.setQuackBehaviour(new Quack());
        duck.performFly();
        duck.performQuack();
    }

}
