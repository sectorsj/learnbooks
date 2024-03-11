package ru.sectorsj.orailly.disignpatterns_les.fantasticgame.behavior;

public class KnifeBehavior implements WeaponBehavior {
//	String weapon;
//
//    public KnifeBehavior(String weapon){
//        this.weapon = weapon;
//    }

	@Override
	public Object useWeapon() {
		System.out.println("ударил ножем");
        return null;
    }
}
