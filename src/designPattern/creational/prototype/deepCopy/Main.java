package designPattern.creational.prototype.deepCopy;

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		Cat navi = new Cat();
		navi.setName("Navi");
		navi.setAge(new Age(2012,3));
		
		Cat yo = navi.copy();	// 깊은 수준의 복사
		yo.setName("yo");
		yo.getAge().setYear(2013);	// Age에서는 깊은 복사가 이루어지지 않음. 따라서 Cat의 copy메소드에다가 *
		yo.getAge().setValue(2);
		
		System.out.println(navi.getName());
		System.out.println(yo.getName());
		
		System.out.println(navi.getAge().getYear());
		System.out.println(yo.getAge().getYear());
		
		System.out.println(navi.getAge().getValue());
		System.out.println(yo.getAge().getValue());
	}
}
