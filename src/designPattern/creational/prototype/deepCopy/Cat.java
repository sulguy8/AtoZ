package designPattern.creational.prototype.deepCopy;

public class Cat implements Cloneable{
	private String name;
	private Age age;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public Age getAge() {
		return age;
	}
	
	public void setAge(Age age) {
		this.age = age;
	}
	
	public Cat copy() throws CloneNotSupportedException {
		
		Cat ret = (Cat)this.clone();
		ret.setAge(new Age(this.age.getYear(), this.age.getValue())); // * 이 구문을 추가하면 된다.
		
		return ret;
	}
}
