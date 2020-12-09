package designPattern.behavioral.strategy.hf.exercise.weapons.impl;

import designPattern.behavioral.strategy.hf.exercise.weapons.Weapons;

public class Axe implements Weapons {

	@Override
	public void equipment() {
		System.out.println("µµ³¢ ÀåÂø!");

	}

	@Override
	public void attack() {
		System.out.println("ÈĞÈÄ¾îÈÄ¾îÇë!");

	}

}
