package ru.sectorsj.orailly.disignpatterns_les.simuduck.duck;

import ru.sectorsj.orailly.disignpatterns_les.simuduck.behavior.FlyNoWay;
import ru.sectorsj.orailly.disignpatterns_les.simuduck.behavior.Quack;

public class ModelDuck extends Duck{
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("я утка приманка");
	}
}
