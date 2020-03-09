package designPattern.creational.builder.ex2;

public class ComputerBuilder {
	
	private Computer computer;
	private ComputerBuilder() {
		computer = new Computer("default","default","default");
	}
	
	public static ComputerBuilder start() {
		return new ComputerBuilder();
	}
	
	public static ComputerBuilder startWithCpu(String cpu) {
		ComputerBuilder builder = new ComputerBuilder();
		builder.computer.setCpu(cpu);
		return builder;
	}
	
	public ComputerBuilder setCpu(String string) {
		computer.setCpu(string);
		return this;
	}
	
	public ComputerBuilder setRam(String string) {
		computer.setRam(string);
		return this;
		
	}
	
	public ComputerBuilder setStorage(String storage) {
		computer.setStorage(storage);
		return this;
	}
	
	public Computer build() {
		return this.computer;
	}
}
