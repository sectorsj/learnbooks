package ru.sectorsj.orailly.disignpatterns_les.simuduck.behavior;

public class Squeak implements QuackBehavior {
	@Override
	public void quack() {
		System.out.println("писк-писк");
	}
}
