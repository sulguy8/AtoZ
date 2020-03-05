package designPattern.creational.prototype.shallowCopy;

public class Main {
	public static void main(String[] args) {
		Cat navi = new Cat();
		navi.setName("Navi");
		
		Cat yo = navi;	// 얕은 수준의 복사
		yo.setName("yo");
		
		System.out.println(navi.getName());
		System.out.println(yo.getName());
	}
}
