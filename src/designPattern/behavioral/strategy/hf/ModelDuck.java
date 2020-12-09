package designPattern.behavioral.strategy.hf;

import designPattern.behavioral.strategy.hf.service.impl.FlyNoWay;
import designPattern.behavioral.strategy.hf.service.impl.Quack;

public class ModelDuck extends Duck{
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	@Override
	public void display() {
		System.out.println("저는 모형 오리입니다.");
		
	}

}
