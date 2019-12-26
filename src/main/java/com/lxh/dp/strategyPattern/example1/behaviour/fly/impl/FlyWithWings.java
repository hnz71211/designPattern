package com.lxh.dp.strategyPattern.example1.behaviour.fly.impl;

import com.lxh.dp.strategyPattern.example1.behaviour.fly.FlyBehaviour;

/**
 * @ClassName: FlyWithWings
 * @Description:
 * @Author: hexli
 * @Date: 2019-10-23 
 **/
public class FlyWithWings implements FlyBehaviour {
    public void fly() {
        System.out.println("fly...");
    }
}
