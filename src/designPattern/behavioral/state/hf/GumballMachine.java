package designPattern.behavioral.state.hf;

import designPattern.behavioral.state.hf.state.State;
import designPattern.behavioral.state.hf.state.impl.HasQuarterState;
import designPattern.behavioral.state.hf.state.impl.NoQuarterState;
import designPattern.behavioral.state.hf.state.impl.SoldOutState;
import designPattern.behavioral.state.hf.state.impl.SoldState;

public class GumballMachine {
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
		this.count = numberGumballs;
		if(numberGumballs > 0) {
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
		this.hasQuarterState = state;
	}
	public void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if(count != 0) {
			count = count - 1;
		}
	}

	public State getHasQuarterState() {
		// TODO Auto-generated method stub
		return null;
	}

	public State getSoldState() {
		// TODO Auto-generated method stub
		return null;
	}

	public State getNoQuarterState() {
		// TODO Auto-generated method stub
		return null;
	}

	public State getSoldOutState() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	public State getWinnerState() {
		// TODO Auto-generated method stub
		return null;
	}
}

