package designPattern.behavioral.strategy.hf.exercise.weapons.impl;

import designPattern.behavioral.strategy.hf.exercise.weapons.Weapons;

public class Sword implements Weapons {

	@Override
	public void equipment() {
		System.out.println("Į ����!");

	}

	@Override
	public void attack() {
		System.out.println("����!");
		
	}

}
