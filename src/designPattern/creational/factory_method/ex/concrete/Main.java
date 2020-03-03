package designPattern.creational.factory_method.ex.concrete;

import designPattern.creational.factory_method.ex.framework.Item;
import designPattern.creational.factory_method.ex.framework.ItemCreator;

public class Main {
	public static void main(String[] args) {
		ItemCreator creator;
		Item item;
		
		creator = new HpCreator();
		item = creator.create();		
		item.use();
		
		creator = new MpCreator();
		item = creator.create();
		item.use();
		
		System.out.println("안녕?");
		System.out.println("ㅋㅋㅋ");
	}
}
