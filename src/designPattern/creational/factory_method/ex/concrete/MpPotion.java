package designPattern.creational.factory_method.ex.concrete;

import designPattern.creational.factory_method.ex.framework.Item;

public class MpPotion implements Item {

	@Override
	public void use() {
		System.out.println("마력 회복!");
		
	}

}
