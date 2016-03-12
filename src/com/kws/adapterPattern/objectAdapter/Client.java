package com.kws.adapterPattern.objectAdapter;


/**
 * Created by jihoon on 2016. 3. 12..
 */
public class Client {
    public static void main(String[] args) {
        Target target = new Adapter();

        target.request();
    }
}

