package ru.sectorsj.orailly.disignpatterns_les.fantasticgame.characters;

import ru.sectorsj.orailly.disignpatterns_les.fantasticgame.behavior.WeaponBehavior;
import ru.sectorsj.orailly.disignpatterns_les.fantasticgame.behavior.BowAndArrowBehavior;

public class Knight extends Character {
	
	public Knight(String name, WeaponBehavior weaponBehavior) {
		super(name, weaponBehavior);
		weaponBehavior = new BowAndArrowBehavior();
	}
	
	@Override
	public void fight() {
		weaponBehavior.useWeapon();
	}

    @Override
    public String toString() {
        return "Knight{weaponBehavior=%s}".formatted(weaponBehavior.useWeapon());
    }
}
