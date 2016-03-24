package com.kws.state.pattern;

// 테스트용 코드
@SuppressWarnings("ALL")
public class GumballMachineTestDrive {

  public static void main(String[] args) {
    // 알맹이를 5개 넣고 인스턴스 화
    GumballMachine gumballMachine = new GumballMachine(5);

    System.out.println(gumballMachine); // 기계의 상태 출력


    gumballMachine.insertQuarter();
    gumballMachine.turnCrank();

    System.out.println(gumballMachine);

    gumballMachine.insertQuarter();
    gumballMachine.ejectQuarter();
    gumballMachine.turnCrank();

    System.out.println(gumballMachine);

    gumballMachine.insertQuarter();
    gumballMachine.turnCrank();
    gumballMachine.insertQuarter();
    gumballMachine.turnCrank();
    gumballMachine.ejectQuarter();

    System.out.println(gumballMachine);

    gumballMachine.insertQuarter();
    gumballMachine.insertQuarter();
    gumballMachine.turnCrank();
    gumballMachine.insertQuarter();
    gumballMachine.turnCrank();
    gumballMachine.insertQuarter();
    gumballMachine.turnCrank();

    System.out.println(gumballMachine);
  }
}
