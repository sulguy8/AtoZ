package designPattern.creational.builder.ex1;

public class ComputerFactory {
	
	private BluePrint print;
	
	public void setBluePrint(BluePrint print) {
		this.print = print;
	}
	
	public void make() {
		print.setRam();
		print.setCpu();
		print.setStorage();
	}
	
	public Computer getComputer() {
		return print.getComputer();
	}
	
}
