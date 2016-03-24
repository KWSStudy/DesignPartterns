package com.kws.state.pattern;

public class NoQuarterState implements State {
  GumballMachine gumballMachine;

  public NoQuarterState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public void insertQuarter() {
    System.out.println("동전을 넣으셨습니다.");
    gumballMachine.setState(gumballMachine.getHasQuarterState()); // 기계의 상태를 전환
  }

  @Override
  public void ejectQuarter() {
    System.out.println("동전을 넣어주세요.");
  }

  @Override
  public void turnCrank() {
    System.out.println("동전을 넣어주세요.");
  }

  @Override
  public void dispense() {
    System.out.println("동전을 넣어주세요.");
  }
}
