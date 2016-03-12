package com.kws.adapterPattern.objectAdapter.examAdapterPattern;

/**
 * Created by jihoon on 2016. 3. 13..
 */
public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck(); //물오리 객체생성

        WildTurkey turkey = new WildTurkey(); //야생칠면조 객체생성

        Duck turkeyAdapter = new TurkeyAdapter(turkey);//칠면조를 오리로 변환하는 어댑터
        Turkey duckAdapter = new DuckAdapter(duck);       //오리를 칠면조로 변환하는 어댑터

        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe duck says...");
        testDuck(duck);//오리객체를 파라미터로

        System.out.println("\n The TurkeyAdapter says...");
        testDuck(turkeyAdapter);    //가장 중요한 부분! 오리대신 칠면조를 넘긴다.



        System.out.println("\n The DuckAdapter says...");
        testTurkey(duckAdapter);    //가장 중요한 부분! 칠면조대신 오리를 넘긴다.

    }

   private static void testDuck(Duck duck) {//Duck Type
        duck.quack();
        duck.fly();
    }
    private static void testTurkey(Turkey turkey){
        turkey.gobble();
        turkey.fly();
    }
}
