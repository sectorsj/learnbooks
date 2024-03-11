package ru.sectorsj.orailly.disignpatterns_les.fantasticgame.behavior;

public class BowAndArrowBehavior implements WeaponBehavior {
    // String weapon;

    // public AxeBehavior(String weapon){
    //     this.weapon = weapon;
    // }

	@Override
	public Object useWeapon() {
		System.out.println("выстрелил из лука");
        return null;
    }
}
