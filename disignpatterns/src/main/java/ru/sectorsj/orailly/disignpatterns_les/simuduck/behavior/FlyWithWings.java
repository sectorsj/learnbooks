package ru.sectorsj.orailly.disignpatterns_les.simuduck.behavior;

public class FlyWithWings implements FlyBehavior {
	
	@Override
	public void fly() {
		System.out.println("я лечу");
	}
}
