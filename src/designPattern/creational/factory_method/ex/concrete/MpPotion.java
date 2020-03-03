package designPattern.creational.factory_method.ex.concrete;

import designPattern.creational.factory_method.ex.framework.Item;

public class MpPotion implements Item {

	@Override
	public void use() {
		System.out.println("마나 회복 물약을 사용했다!");
		
	}

}
