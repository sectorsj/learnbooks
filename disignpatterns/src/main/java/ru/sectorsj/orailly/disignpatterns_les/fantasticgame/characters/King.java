package ru.sectorsj.orailly.disignpatterns_les.fantasticgame.characters;

import ru.sectorsj.orailly.disignpatterns_les.fantasticgame.behavior.WeaponBehavior;
import ru.sectorsj.orailly.disignpatterns_les.fantasticgame.behavior.SwordBehavior;

public class King extends Character {
	
	
	public King(String name, WeaponBehavior weaponBehavior) {
		super(name, weaponBehavior);
		weaponBehavior = new SwordBehavior();
	}
	
	@Override
	public void fight() {
		System.out.println("Король ");
		weaponBehavior.useWeapon();
	}


}
