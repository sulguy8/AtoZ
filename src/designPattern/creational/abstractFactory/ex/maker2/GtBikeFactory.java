package designPattern.creational.abstractFactory.ex.maker2;

import designPattern.creational.abstractFactory.ex.abst.BikeFactory;
import designPattern.creational.abstractFactory.ex.abst.Body;
import designPattern.creational.abstractFactory.ex.abst.Wheel;

public class GtBikeFactory implements BikeFactory {

	@Override
	public Body createBody() {
		// TODO Auto-generated method stub
		return new GtBody();
	}

	@Override
	public Wheel creatWheel() {
		// TODO Auto-generated method stub
		return new GtWheel();
	}

}
