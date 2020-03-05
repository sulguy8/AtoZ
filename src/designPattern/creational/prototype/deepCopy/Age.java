package designPattern.creational.prototype.deepCopy;

public class Age {
	int year;
	int value;

	public Age(int year, int value) {
		super();
		this.year = year;
		this.value = value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getYear() {
		return year;
	}
	public int getValue() {
		return value;
	}
}
