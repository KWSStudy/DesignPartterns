package com.kws.adapterPattern.objectAdapter.examAdapterPattern;

/**
 * Created by jihoon on 2016. 3. 13..
 */
public class TurkeyAdapter implements Duck{
    Turkey turkey;
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for(int i=0; i <5; i++){
            turkey.fly();
        }
    }



}
