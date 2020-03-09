package designPattern.creational.abstractFactory.ex.maker1;

import designPattern.creational.abstractFactory.ex.abst.BikeFactory;
import designPattern.creational.abstractFactory.ex.abst.Body;
import designPattern.creational.abstractFactory.ex.abst.Wheel;

public class SamFactory implements BikeFactory {

	@Override
	public Body createBody() {
		// TODO Auto-generated method stub
		return new SamBody() ;
	}

	@Override
	public Wheel creatWheel() {
		// TODO Auto-generated method stub
		return new SamWheel();
	}

}
