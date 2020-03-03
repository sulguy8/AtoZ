package designPattern.behavioral.strategy.ex;

public class GameCharacter {
	
	// 추상적인 접근점을 만들어서
	private Weapon weapon;
	
	// 접근점에서 서로 교환 가능하도록 하는 패턴! 이것이 "Strategy"패턴이다.
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	// Delegate
	public void attack() {
		if (weapon == null) {
			System.out.println("맨손 공격");
		}else {
			weapon.attack();
		}
		
	}
}
