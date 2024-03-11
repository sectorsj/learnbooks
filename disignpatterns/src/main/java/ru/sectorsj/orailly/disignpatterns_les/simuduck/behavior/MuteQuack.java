package ru.sectorsj.orailly.disignpatterns_les.simuduck.behavior;

public class MuteQuack implements QuackBehavior {
	@Override
	public void quack() {
		System.out.println("...");
	}
}
