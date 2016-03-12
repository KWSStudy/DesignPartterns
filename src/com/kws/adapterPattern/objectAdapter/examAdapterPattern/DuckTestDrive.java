package com.kws.adapterPattern.objectAdapter.examAdapterPattern;

/**
 * Created by jihoon on 2016. 3. 13..
 */
public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck(); //물오리 객체생성

        WildTurkey turkey = new WildTurkey(); //야생칠면조 객체생성

        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(duck);//오리객체를 파라미터로

        System.out.println("\n The TurkeyAdapter says...");
        testDuck(turkeyAdapter);//칠면조 apdapter객체를

    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
