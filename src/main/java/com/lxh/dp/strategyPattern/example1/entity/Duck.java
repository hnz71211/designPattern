package com.lxh.dp.strategyPattern.example1.entity;

import com.lxh.dp.strategyPattern.example1.behaviour.fly.FlyBehaviour;
import com.lxh.dp.strategyPattern.example1.behaviour.quack.QuackBehaviour;

/**
 * @ClassName: Duck
 * @Description:
 * @Author: hexli
 * @Date: 2019-10-22 
 **/
public abstract class Duck {

    /**
     * has-a关系，把下面每个行为当作"一族算法"
     * 将行为委托给代理
     * 可以在运行时动态改变行为，只要组合的行为为对象符合正确的接口标准即可
     */
    FlyBehaviour flyBehaviour;

    QuackBehaviour quackBehaviour;

    public Duck() {
    }

    public void swim() {
        System.out.println("swim...");
    }

    public abstract void display();

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public FlyBehaviour getFlyBehaviour() {
        return flyBehaviour;
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public QuackBehaviour getQuackBehaviour() {
        return quackBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
}
