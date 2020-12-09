package designPattern.behavioral.strategy.hf.service.impl;

import designPattern.behavioral.strategy.hf.service.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("���� �� ���ƿ�");

	}

}
