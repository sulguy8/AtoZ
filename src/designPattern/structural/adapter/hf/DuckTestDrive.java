package designPattern.structural.adapter.hf;


import designPattern.structural.adapter.hf.duck.Duck;
import designPattern.structural.adapter.hf.duck.impl.MallardDuck;
import designPattern.structural.adapter.hf.duck.impl.adapter.TurkeyAdapter;
import designPattern.structural.adapter.hf.turkey.impl.WildTurkey;

public class DuckTestDrive {
	public static void main(String[] args) {
	MallardDuck duck = new MallardDuck();
	WildTurkey turkey = new WildTurkey();
	
	Duck turkeyAdapter = new TurkeyAdapter(turkey); // adapter
	
	System.out.println("The Turkey says...");
	turkey.gobble();
	turkey.fly();
	
	System.out.println("The Duck Says...");
	testDuck(duck);
	
	System.out.println("The TurkeyAdapter Says...");
	testDuck(turkeyAdapter);

	}
	
	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
}
