package designPattern.behavioral.strategy.hf;

import designPattern.behavioral.strategy.hf.behavior.impl.FlyRockeyPowered;
import designPattern.behavioral.strategy.hf.ducks.Duck;
import designPattern.behavioral.strategy.hf.ducks.impl.MallardDuck;
import designPattern.behavioral.strategy.hf.ducks.impl.ModelDuck;

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
