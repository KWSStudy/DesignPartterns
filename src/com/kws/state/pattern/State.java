package com.kws.state.pattern;

// 상태를 나타내는 객체들이 구현할 인터페이스
public interface State {
  
  void insertQuarter();

  void ejectQuarter();

  void turnCrank();

  void dispense();
}
