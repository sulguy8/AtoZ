package designPattern.behavioral.strategy.hf.ducks.impl;

import designPattern.behavioral.strategy.hf.behavior.impl.FlyWithWings;
import designPattern.behavioral.strategy.hf.behavior.impl.Quack;
import designPattern.behavioral.strategy.hf.ducks.Duck;

public class MallardDuck extends Duck {
	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	@Override
	public void display() {
		System.out.println("���� ������ �Դϴ�.");
		
	}
}
