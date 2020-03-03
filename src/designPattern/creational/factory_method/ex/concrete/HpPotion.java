package designPattern.creational.factory_method.ex.concrete;

import designPattern.creational.factory_method.ex.framework.Item;

public class HpPotion implements Item{

	@Override
	public void use() {
		System.out.println("체력 회복!");
		
	}

}
