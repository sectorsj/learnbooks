package ru.sectorsj.orailly.disignpatterns_les.simuduck.duck;

import ru.sectorsj.orailly.disignpatterns_les.simuduck.behavior.FlyNoWay;
import ru.sectorsj.orailly.disignpatterns_les.simuduck.behavior.Squeak;

public class RubberDuck extends Duck{
	
	public RubberDuck() {
		quackBehavior = new Squeak();
		flyBehavior = new FlyNoWay();
	}
	
	@Override
	public void display() {
		System.out.println("я резиновая уточка");
	}
}
