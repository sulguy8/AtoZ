package designPattern.behavioral.strategy.hf.exercise.weapons.impl;

import designPattern.behavioral.strategy.hf.exercise.weapons.Weapons;

public class Dagger implements Weapons {

	@Override
	public void equipment() {
		System.out.println("´Ü°Ë ÀåÂø!");

	}

	@Override
	public void attack() {
		System.out.println("¼î¼î¼î¼ô!");

	}

}
