package ru.sectorsj.orailly.disignpatterns_les.fantasticgame.behavior;

public class SwordBehavior implements WeaponBehavior {
//	String weapon;
//
//	public SwordBehavior(String weapon) {
//		this.weapon = weapon;
//	}
	
	@Override
	public Object useWeapon() {
		System.out.println("ударил мечом");
        return null;
    }
}
