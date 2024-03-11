package ru.sectorsj.orailly.disignpatterns_les.fantasticgame.characters;

import ru.sectorsj.orailly.disignpatterns_les.fantasticgame.behavior.WeaponBehavior;
import ru.sectorsj.orailly.disignpatterns_les.fantasticgame.behavior.KnifeBehavior;

public class Queen extends Character {
	
	public Queen(String name, WeaponBehavior weaponBehavior) {
		super(name, weaponBehavior);
		weaponBehavior = new KnifeBehavior();
	}
	
	@Override
	public void fight() {
		weaponBehavior.useWeapon();
	}
}
