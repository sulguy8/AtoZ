package designPattern.behavioral.strategy;

public class Delegate {
	// 어떤 객체를 구현할때 그 "책임"을 다른 객체에 떠넘기는 것.
	// 그것을 우리는 위임(Delegate)한다라고 함.	
	
	A_Interface a;
	
	public Delegate() {
		A_Interface a = new A_InterfaceImpl();
	}

	public void funcAA(){	
		A_Interface a = new A_InterfaceImpl();
		a.funcA();
		a.funcA();		
	}
}
