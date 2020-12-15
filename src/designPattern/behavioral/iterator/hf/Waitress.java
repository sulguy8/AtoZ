package designPattern.behavioral.iterator.hf;


import java.util.Iterator;

import designPattern.behavioral.iterator.hf.menu.DinerMenu;
import designPattern.behavioral.iterator.hf.menu.PancakeHouseMenu;

public class Waitress {
	PancakeHouseMenu pancakeHouseMenu;
	DinerMenu dinerMenu;
	
	public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}
	
	public void printMenu() {
		/* Custom Iterator */
//		Iterator dinerIterator = dinerMenu.createIterator();
//		System.out.println("메뉴\n----\n아침 메뉴");
//		printMenu(dinerIterator);
		
		/* Java Util Iterator */
		Iterator pancakeIterator = pancakeHouseMenu.createIterator();
		System.out.println("메뉴\n----\n아침 메뉴");
		printMenu(pancakeIterator);
	}
	
	private void printMenu(Iterator iterator) {
		while(iterator.hasNext()) {
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.println(menuItem.getName() + ", ");
			System.out.println(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}
}
