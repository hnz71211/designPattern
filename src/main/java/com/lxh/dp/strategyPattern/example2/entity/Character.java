package com.lxh.dp.strategyPattern.example2.entity;

import com.lxh.dp.strategyPattern.example2.behaviour.weapon.WeaponBehaviour;

/**
 * @ClassName: Character
 * @Description:
 * @Author: hexli
 * @Date: 2019-10-23 
 **/
public abstract class Character {

    private WeaponBehaviour weaponBehaviour;

    public abstract void flight();

    public WeaponBehaviour getWeaponBehaviour() {
        return weaponBehaviour;
    }

    public void setWeaponBehaviour(WeaponBehaviour weaponBehaviour) {
        this.weaponBehaviour = weaponBehaviour;
    }
}
