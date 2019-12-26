package com.lxh.dp.observerPattern.example2.display;

/**
 * @ClassName: DisplayElement
 * @Description: 为布告板建立一个共同的接口
 * @Author: hexli
 * @Date: 2019-10-23 
 **/
public interface DisplayElement {

    /**
     * 当布告板需要显示时，调用这个方法
     */
    void display();

}
