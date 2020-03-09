package designPattern.creational.abstractFactory.ex2;

import designPattern.creational.abstractFactory.ex2.concrete.FactoryInstance;

public class Main {
	public static void main(String[] args) {
		GuiFactory fac = FactoryInstance.getGuiFactory();
	
		Button button = fac.createButton();
		TextArea area = fac.createTextArea();
		
		button.click();
		System.out.println(area.getText());
	}
}
