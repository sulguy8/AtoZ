package designPattern.behavioral.strategy.hf.exercise;

import designPattern.behavioral.strategy.hf.exercise.weapons.impl.Sword;

public class Warrior extends Character{
	Warrior(){
		weapon = new Sword();
	}
	
	@Override
	public void display() {
		System.out.println("나는 전사입니다.");
		
	}

}
