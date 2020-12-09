package designPattern.behavioral.strategy.hf.exercise;

import designPattern.behavioral.strategy.hf.exercise.weapons.impl.Staff;

public class Wizard extends Character{
	Wizard(){
		weapon = new Staff();
	}
	
	@Override
	public void display() {
		System.out.println("���� �������Դϴ�.");
		
	}

}
