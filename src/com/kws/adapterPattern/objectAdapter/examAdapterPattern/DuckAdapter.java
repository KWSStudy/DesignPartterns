package com.kws.adapterPattern.objectAdapter.examAdapterPattern;

import java.util.Random;

/**
 * Created by jihoon on 2016. 3. 13..
 */
public class DuckAdapter implements Turkey{
    private Duck duck;
    private Random rand;
    public DuckAdapter(Duck duck){
        this.duck = duck;
        rand = new Random();
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        System.out.println(rand.nextInt(5));
        if(rand.nextInt(5) == 0){
            duck.fly();
        }
    }
}
