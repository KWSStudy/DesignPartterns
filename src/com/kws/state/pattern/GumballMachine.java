package com.kws.state.pattern;

// 상태를 나타내는 객체를 이용하는 뽑기 기계 클래스
public class GumballMachine {
  // 기계의 모든 가능한 상태를 객체로 선언
  State soldOutState;
  State noQuarterState;
  State hasQuarterState;
  State soldState;
  State winnerState;

  State state = soldOutState;
  int count = 0;

  public GumballMachine(int numberGumballs) {
    soldOutState = new SoldOutState(this);
    noQuarterState = new NoQuarterState(this);
    hasQuarterState = new HasQuarterState(this);
    soldState = new SoldState(this);
    winnerState = new WinnerState(this);

    this.count = numberGumballs;
    if (numberGumballs > 0) {
      state = noQuarterState;
    }
  }

  public void insertQuarter() {
    state.insertQuarter();
  }

  public void ejectQuarter() {
    state.ejectQuarter();
  }

  public void turnCrank() {
    state.turnCrank();
    state.dispense();
  }

  void setState(State state) {
    this.state = state;
  }

  void releaseBall() {
    System.out.println("알맹이가 나가고 있습니다.");
    if (count != 0) {
      count = count - 1;
    }
  }

  State getSoldOutState() {
    return soldOutState;
  }

  State getNoQuarterState() {
    return noQuarterState;
  }

  State getHasQuarterState() {
    return hasQuarterState;
  }

  State getSoldState() {
    return soldState;
  }

  State getWinnerState() {
    return winnerState;
  }

  public int getCount() {
    return count;
  }

  @Override
  public String toString() {
    return String.format("\n>> 뽑기 기계 <<\n남은 개수: %d\n", this.count);
  }
}
