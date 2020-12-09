package designPattern.behavioral.strategy.hf.exercise;

import designPattern.behavioral.strategy.hf.exercise.weapons.Weapons;

public abstract class Character {
	Weapons weapon;
	
	public abstract void display();
	
	public void getWeapon() {
		weapon.equipment();
	}
	
	public void goAttack() {
		weapon.attack();
	}
	
	public void setWeapon(Weapons sw) {
		weapon = sw;
	}
	
}
