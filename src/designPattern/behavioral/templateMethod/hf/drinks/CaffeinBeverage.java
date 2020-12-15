package designPattern.behavioral.templateMethod.hf.drinks;

public abstract class CaffeinBeverage {
	public final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if(customerWantsCondiments()) {
			addCondiments();	
		}
	}
	
	public abstract void brew();
	public abstract void addCondiments();
	
	public void boilWater() {
		System.out.println("물 끓이는 중");
	}
	
	public void pourInCup() {
		System.out.println("컵에 따르는 중");
	}
	public boolean customerWantsCondiments() {		// Hook 메소드

		return true;
	}
}
