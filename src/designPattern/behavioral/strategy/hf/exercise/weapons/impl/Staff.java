package designPattern.behavioral.strategy.hf.exercise.weapons.impl;

import designPattern.behavioral.strategy.hf.exercise.weapons.Weapons;

public class Staff implements Weapons {

	@Override
	public void equipment() {
		System.out.println("������ ����!");

	}

	@Override
	public void attack() {
		System.out.println("������..");

	}

}
