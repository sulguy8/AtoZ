package designPattern.structural.bridge.ex;

import designPattern.structural.bridge.ex.abstraction.implementor.concreteImplementor.FlashMorseCodeFunction;
import designPattern.structural.bridge.ex.abstraction.refinedAbstraciton.PrintMorseCode;

public class Main {
	public static void main(String[] args) {
		PrintMorseCode code = new PrintMorseCode(new FlashMorseCodeFunction()); // 어느 자원을 쓰고싶은지 여기서 편하게 선택만해도 됨! 
	
//		code.g();code.a();code.r();code.a();code.m();
		code.g().a().r().a().m(); // 가독성을 높이기 위한 chaining 기법
	}
}