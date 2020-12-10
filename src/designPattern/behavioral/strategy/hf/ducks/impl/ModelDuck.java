package designPattern.behavioral.strategy.hf.ducks.impl;

import designPattern.behavioral.strategy.hf.behavior.impl.FlyNoWay;
import designPattern.behavioral.strategy.hf.behavior.impl.Quack;
import designPattern.behavioral.strategy.hf.ducks.Duck;

public class ModelDuck extends Duck{
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	@Override
	public void display() {
		System.out.println("���� ���� �����Դϴ�.");
		
	}

}
