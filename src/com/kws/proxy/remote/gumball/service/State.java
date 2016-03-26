package com.kws.proxy.remote.gumball.service;

import java.io.Serializable;

// 상태를 나타내는 객체들이 구현할 인터페이스
public interface State extends Serializable{
  
  public void insertQuarter();

  public void ejectQuarter();

  public void turnCrank();

  public void dispense();
}
