package designPattern.behavioral.strategy.hf;

import designPattern.behavioral.strategy.hf.service.impl.FlyWithWings;
import designPattern.behavioral.strategy.hf.service.impl.Quack;

public class MallardDuck extends Duck {
	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	@Override
	public void display() {
		System.out.println("저는 물오리 입니다.");
		
	}
}
