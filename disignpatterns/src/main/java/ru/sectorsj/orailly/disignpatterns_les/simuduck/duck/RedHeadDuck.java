package ru.sectorsj.orailly.disignpatterns_les.simuduck.duck;

import ru.sectorsj.orailly.disignpatterns_les.simuduck.behavior.FlyWithWings;
import ru.sectorsj.orailly.disignpatterns_les.simuduck.behavior.Quack;

public class RedHeadDuck extends Duck {
	
	public RedHeadDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	@Override
	public void display() {
		System.out.println("я рыжая утка");
	}
}
