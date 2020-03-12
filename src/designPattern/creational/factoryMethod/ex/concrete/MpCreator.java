package designPattern.creational.factoryMethod.ex.concrete;

import java.util.Date;

import designPattern.creational.factoryMethod.ex.framework.Item;
import designPattern.creational.factoryMethod.ex.framework.ItemCreator;

public class MpCreator extends ItemCreator{

	@Override
	protected void requestItemsInfo() {
		System.out.println("데이터베이스에서 마나 물약의 정보를 가져옵니다.");		
	}

	@Override
	protected void createItemLog() {
		System.out.println("마나 물약을 새로 생성 했습니다. " + new Date());		
	}

	@Override
	protected Item createItem() {
		return new MpPotion();
	}

}
