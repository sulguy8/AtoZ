package designPattern.behavioral.strategy.ex;

public class Client {
	public static void main(String[] args) {
		GameCharacter character = new GameCharacter();
		
		character.attack();
		
		character.setWeapon(new Knife());
		character.attack();
		
		character.setWeapon(new Sword());
		character.attack();
		
		character.setWeapon(new Axe());
		character.attack();
		
	}
}
