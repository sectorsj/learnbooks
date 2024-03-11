package ru.sectorsj.orailly.disignpatterns_les.simuduck.behavior;

public class FlyNoWay implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println("я не летаю");
	}
}
