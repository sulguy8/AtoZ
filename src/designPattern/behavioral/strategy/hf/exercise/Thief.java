package designPattern.behavioral.strategy.hf.exercise;

import designPattern.behavioral.strategy.hf.exercise.weapons.impl.Dagger;

public class Thief extends Character{
	Thief(){
		weapon = new Dagger();
	}
	
	@Override
	public void display() {
		System.out.println("나는 도적입니다.");
		
	}

}
