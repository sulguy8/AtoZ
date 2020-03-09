package designPattern.creational.builder.ex2;

public class Main {
	public static void main(String[] args) {
//		Computer computer = new Computer("256g ssd","i7","8g");
		Computer computer = ComputerBuilder
				.startWithCpu("i7")
//				.setCpu("i7")
				.setRam("8g")
				.setStorage("128g ssd")
				.build();
		
		System.out.println(computer.toString());
	}
}
