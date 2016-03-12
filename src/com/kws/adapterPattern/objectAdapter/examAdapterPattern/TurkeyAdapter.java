package com.kws.adapterPattern.objectAdapter.examAdapterPattern;

/**
 * Created by jihoon on 2016. 3. 13..
 */
public class TurkeyAdapter implements Duck{
    //Duck 객체가 모자라서 Turkey 객체를 대신 사용해야하는 상황
    //인터페이스가 다르기 때문에 Turkey 객체를 바로 사용할 수 없다
    Turkey turkey;
    public TurkeyAdapter(Turkey turkey){
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
