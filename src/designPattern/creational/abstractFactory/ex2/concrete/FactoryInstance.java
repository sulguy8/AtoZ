package designPattern.creational.abstractFactory.ex2.concrete;

import designPattern.creational.abstractFactory.ex2.Button;
import designPattern.creational.abstractFactory.ex2.GuiFactory;
import designPattern.creational.abstractFactory.ex2.TextArea;

public class FactoryInstance {
	
	public static GuiFactory getGuiFactory() {
		switch (getOsCode()) {
		case 0 : return new MacGuiFactory();
		case 1 : return new LinuxGuiFactory();
		case 2 : return new WinGuiFactory();
		}
		
		return null;
	}
	
	private static int getOsCode() {
		System.out.println(System.getProperty("os.name"));
		if(System.getProperty("os.name").equals("Windows 10")) {
			return 2;
		}
		return 1;
	}	
}

class LinuxGuiFactory implements GuiFactory {

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new LinuxButton();
	}

	@Override
	public TextArea createTextArea() {
		// TODO Auto-generated method stub
		return new LinuxTextArea();
	}
}

class LinuxButton implements Button {

	@Override
	public void click() {
		System.out.println("리눅스 버튼");
		
	}

}

class LinuxTextArea implements TextArea {

	@Override
	public String getText() {
		return "리눅스 TextArea";
	}

}

class MacGuiFactory implements GuiFactory {

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new MacButton();
	}

	@Override
	public TextArea createTextArea() {
		// TODO Auto-generated method stub
		return new MacTextArea();
	}

}

class MacButton implements Button{

	@Override
	public void click() {
		System.out.println("Mac Click!");
		
	}

}

class MacTextArea implements TextArea{

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return "Mac getText!";
	}

}

class WinGuiFactory implements GuiFactory {

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new WinButton();
	}

	@Override
	public TextArea createTextArea() {
		// TODO Auto-generated method stub
		return new WinTextArea();
	}

}

class WinButton implements Button{

	@Override
	public void click() {
		System.out.println("Win Click!");
		
	}

}

class WinTextArea implements TextArea{

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return "Win getText!";
	}

}
