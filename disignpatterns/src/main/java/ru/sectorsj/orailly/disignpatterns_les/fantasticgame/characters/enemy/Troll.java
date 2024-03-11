package ru.sectorsj.orailly.disignpatterns_les.fantasticgame.characters.enemy;

import ru.sectorsj.orailly.disignpatterns_les.fantasticgame.characters.Character;
import ru.sectorsj.orailly.disignpatterns_les.fantasticgame.behavior.WeaponBehavior;
import ru.sectorsj.orailly.disignpatterns_les.fantasticgame.behavior.AxeBehavior;

public class Troll extends Character {
	
	public Troll(String name, WeaponBehavior wb) {
		super(name, wb);
		weaponBehavior = new AxeBehavior();
	}
	
	@Override
	public void fight() {
		weaponBehavior.useWeapon();
	}
}
