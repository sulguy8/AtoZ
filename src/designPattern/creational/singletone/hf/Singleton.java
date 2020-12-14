package designPattern.creational.singletone.hf;

public class Singleton {
	private volatile static Singleton uniqueInstance;
	
	private Singleton() {

	}
	
	public static Singleton getInstance() {
		if(uniqueInstance == null) {
			synchronized (Singleton.class) {
				if (uniqueInstance == null) {			// DCL(Double-Checking-Locking)
					uniqueInstance = new Singleton();
				}
			}
		}
		return uniqueInstance;
	}

}
