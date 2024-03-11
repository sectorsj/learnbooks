package ru.sectorsj.orailly.disignpatterns_les.fantasticgame.characters;

import ru.sectorsj.orailly.disignpatterns_les.fantasticgame.behavior.WeaponBehavior;

public abstract class Character {
	private String name;
	protected WeaponBehavior weaponBehavior;

	public Character() {}
	public Character(String n) {
        name = n;
    }
	public Character(String n, WeaponBehavior wb) {
		name = n;
		weaponBehavior = wb;
	}
	
	public void fight() {
		weaponBehavior.useWeapon();
	}
	
	void showCharacterName() {
		System.out.println(name);
	}
	
	public void setWeaponBehavior(WeaponBehavior wb) {
		weaponBehavior = wb;
	}
}
