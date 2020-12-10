package designPattern.creational.abstractFactory.ex;

import designPattern.creational.abstractFactory.ex.abst.BikeFactory;
import designPattern.creational.abstractFactory.ex.abst.Body;
import designPattern.creational.abstractFactory.ex.abst.Wheel;
import designPattern.creational.abstractFactory.ex.maker1.SamFactory;

public class Main {
	public static void main(String[] args) {
		BikeFactory factory = new SamFactory();
//		BikeFactory factory = new GtBikeFactory();
		Body body = factory.createBody();
		Wheel wheel = factory.creatWheel();
		
		System.out.println(body.getClass());
		System.out.println(wheel.getClass());
	}
}
