package designPattern.behavioral.strategy.hf.service.impl;

import designPattern.behavioral.strategy.hf.service.FlyBehavior;

public class FlyRockeyPowered implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("로켓 추진으로 날아갑니다.");

	}

}
