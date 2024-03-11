package ru.sectorsj.orailly.disignpatterns_les.simuduck.behavior;

public class Quack implements QuackBehavior {
	
	@Override
	public void quack() {
		System.out.println("кря-кря");
	}
}
