package designPattern.structural.Bridge.ex;

import designPattern.structural.Bridge.ex.abstraction.RefinedAbstraction.PrintMorseCode;
import designPattern.structural.Bridge.ex.implementor.concreteImplementor.FlashMorseCodeFunction;

public class Main {
	public static void main(String[] args) {
		PrintMorseCode code = new PrintMorseCode(new FlashMorseCodeFunction()); // 어느 자원을 쓰고싶은지 여기서 편하게 선택만해도 됨! 
	
//		code.g();code.a();code.r();code.a();code.m();
		code.g().a().r().a().m(); // 가독성을 높이기 위한 chaining 기법
	}
}
