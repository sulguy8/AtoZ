package designPattern.behavioral.strategy.hf.exercise;

import designPattern.behavioral.strategy.hf.exercise.weapons.impl.Axe;

public class Client {
	public static void main(String[] args) {
		Character thief = new Thief();
		thief.display();
		thief.getWeapon();
		thief.goAttack();
		
		Character warrior = new Warrior();
		warrior.display();
		warrior.getWeapon();
		warrior.goAttack();
		
		warrior.setWeapon(new Axe());
		warrior.display();
		warrior.getWeapon();
		warrior.goAttack();
		
	}
}
