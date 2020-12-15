package designPattern.behavioral.iterator.hf.menu;

import java.util.ArrayList;
import java.util.Iterator;

import designPattern.behavioral.iterator.hf.MenuItem;

public class PancakeHouseMenu {
	ArrayList menuItems;
	
	public PancakeHouseMenu() {
		menuItems = new ArrayList();
		
		addItem("팬케이크 세트", "스크램블드 에그와 토스트가 곁들여진 팬케이크", true, 2.99);
		
	}
	
	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}
	
	public ArrayList getMenuItems() {
		return menuItems;
	}
	
	public Iterator createIterator() {
		return menuItems.iterator();
	}
}
