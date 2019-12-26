package com.lxh.dp.strategyPattern.example1.behaviour.quack.impl;

import com.lxh.dp.strategyPattern.example1.behaviour.quack.QuackBehaviour;

/**
 * @ClassName: MuteQuack
 * @Description:
 * @Author: hexli
 * @Date: 2019-10-22 
 **/
public class MuteQuack implements QuackBehaviour {
    public void quack() {
        System.out.println("muteQuack...");
    }
}
