package designPattern.behavioral.strategy.hf.ducks;

import designPattern.behavioral.strategy.hf.behavior.FlyBehavior;
import designPattern.behavioral.strategy.hf.behavior.QuackBehavior;

public abstract class Duck {
	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;
	
	public Duck() {
		
	}
	
	public abstract void display();
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}
	
	public void swim() {
		System.out.println("��� ������ ���� ��ϴ�. ��¥ ������ ����");
	}
}
