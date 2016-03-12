package com.kws.adapterPattern.objectAdapter;

/**
 * Created by jihoon on 2016. 3. 12..
 */
public class Adapter implements Target {
    Adaptee adaptee = new Adaptee(); // 객체를 만들고

    public void request() {
        adaptee.specificRequest();	// 객체를 연결한다.
    }
}
