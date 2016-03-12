package com.kws.adapterPattern.objectAdapter.examAdapterPattern;

/**
 * Created by jihoon on 2016. 3. 13..
 */
public class WildTurkey implements Turkey{

    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
