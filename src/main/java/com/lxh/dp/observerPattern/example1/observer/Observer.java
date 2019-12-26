package com.lxh.dp.observerPattern.example1.observer;

/**
 * @ClassName: Subject
 * @Description: 观察者接口，所有气象组件都实现此接口；这样主题在通知观察者时，有了一个共同的接口
 * @Author: hexli
 * @Date: 2019-10-23
 **/
public interface Observer {

    /**
     * 所有观察者都必须实现update方法，以实习观察者接口
     * @param temp
     * @param humidity
     * @param pressure
     */
    void update(float temp, float humidity, float pressure);

}
