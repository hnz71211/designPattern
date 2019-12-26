package com.lxh.dp.observerPattern.example1.subject;

import com.lxh.dp.observerPattern.example1.observer.Observer;

/**
 * @ClassName: Subject
 * @Description: 主题接口
 * @Author: hexli
 * @Date: 2019-10-23 
 **/
public interface Subject {

    /**
     * 观察者注册方法
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 观察者移除方法
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 当主题状态改变时，这个方法会被调用，以通知所有观察者
     */
    void notifyObservers();

}
