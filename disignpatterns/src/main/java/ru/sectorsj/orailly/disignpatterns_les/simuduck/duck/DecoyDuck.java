package ru.sectorsj.orailly.disignpatterns_les.simuduck.duck;


import ru.sectorsj.orailly.disignpatterns_les.simuduck.behavior.FlyNoWay;
import ru.sectorsj.orailly.disignpatterns_les.simuduck.behavior.MuteQuack;

public class DecoyDuck extends Duck {
	public DecoyDuck() {
		quackBehavior = new MuteQuack();
		flyBehavior = new FlyNoWay();
	}
	
	@Override
	public void display() {
		System.out.println("я деревянная уточка");
	}
}
