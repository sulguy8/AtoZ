package designPattern.behavioral.strategy.hf;

import designPattern.behavioral.strategy.hf.service.impl.FlyRockeyPowered;

public class MiniDuckSimulator {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		mallard.display();
		Duck model = new ModelDuck();
		model.setFlyBehavior(new FlyRockeyPowered());
		model.performFly();
	}	
}
