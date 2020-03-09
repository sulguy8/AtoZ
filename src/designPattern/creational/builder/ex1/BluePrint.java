package designPattern.creational.builder.ex1;

public abstract class BluePrint {
	abstract public void setCpu();
	abstract public void setRam();
	abstract public void setStorage();
	
	abstract public Computer getComputer();
}
