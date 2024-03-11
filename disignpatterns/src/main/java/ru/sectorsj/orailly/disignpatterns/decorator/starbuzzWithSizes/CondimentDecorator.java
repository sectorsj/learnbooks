package ru.sectorsj.orailly.disignpatterns.decorator.starbuzzWithSizes;

public abstract class CondimentDecorator extends Beverage {
	public Beverage beverage;
	public abstract String getDescription();
	
	public Size getSize() {
		return beverage.getSize();
	}
}
