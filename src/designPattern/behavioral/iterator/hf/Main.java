package designPattern.behavioral.iterator.hf;

import designPattern.behavioral.iterator.hf.menu.DinerMenu;
import designPattern.behavioral.iterator.hf.menu.PancakeHouseMenu;

public class Main {
	public static void main(String args[]) {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		
		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
		
		waitress.printMenu();
	}
}
