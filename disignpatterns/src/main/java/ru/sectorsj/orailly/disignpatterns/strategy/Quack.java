package ru.sectorsj.orailly.disignpatterns.strategy;

public class Quack implements QuackBehavior {
	public void quack() {
		System.out.println("Quack");
	}
}
