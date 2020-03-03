package designPattern.behavioral.strategy;

public class Main {
	// 기능에 대한 "통로" 
	public static void main(String[] args) {
		A_Interface a = new A_InterfaceImpl();
		
		Delegate aObj = new Delegate();
		aObj.funcAA();
	}
}
