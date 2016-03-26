package com.kws.proxy.remote.gumball.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import com.kws.proxy.remote.gumball.service.GumballMachineRemote;
import com.kws.proxy.remote.gumball.service.HasQuarterState;
import com.kws.proxy.remote.gumball.service.NoQuarterState;
import com.kws.proxy.remote.gumball.service.SoldOutState;
import com.kws.proxy.remote.gumball.service.SoldState;
import com.kws.proxy.remote.gumball.service.State;
import com.kws.proxy.remote.gumball.service.WinnerState;

// 상태를 나타내는 객체를 이용하는 뽑기 기계 클래스
public class GumballMachine extends UnicastRemoteObject implements
		GumballMachineRemote {
	// 기계의 모든 가능한 상태를 객체로 선언
	private String location;
	private State soldOutState;
	private State noQuarterState;
	private State hasQuarterState;
	private State soldState;
	private State winnerState;

	private State state = soldOutState;
	int count = 0;

	public GumballMachine(String location, int numberGumballs)
			throws RemoteException {
		this.location = location;
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

	public void setState(State state) {
		this.state = state;
	}

	public void releaseBall() {
		System.out.println("알맹이가 나가고 있습니다.");
		if (count != 0) {
			count = count - 1;
		}
	}

	@Override
	public String getLocation() {
		return location;
	}

	@Override
	public int getCount() {
		return count;
	}

	@Override
	public State getState() throws RemoteException {
		// TODO Auto-generated method stub
		return state;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}

	public State getWinnerState() {
		return winnerState;
	}

	@Override
	public String toString() {
		return String.format("\n>> 뽑기 기계 <<\n남은 개수: %d\n", this.count);
	}

}
