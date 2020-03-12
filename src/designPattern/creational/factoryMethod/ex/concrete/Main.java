package designPattern.creational.factoryMethod.ex.concrete;

import designPattern.creational.factoryMethod.ex.framework.Item;
import designPattern.creational.factoryMethod.ex.framework.ItemCreator;

public class Main {
	public static void main(String[] args) {
		ItemCreator creator;
		Item item;
		
		creator = new HpCreator(); // ItemCreator에 HpCreator가 extends된 상태
		item = creator.create(); // ItemCreator의 create()가 팩토리 메서드(템플릿 메서드)		
		item.use();	// 12번째 라인에서 item 데이터타입으로 리턴해줬기때문에 use()메서드를 사용할 수 있다.
		
		creator = new MpCreator();
		item = creator.create();
		item.use();
	}
}
