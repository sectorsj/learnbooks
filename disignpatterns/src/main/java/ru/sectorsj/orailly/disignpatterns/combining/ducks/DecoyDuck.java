package ru.sectorsj.orailly.disignpatterns.combining.ducks;

public class DecoyDuck implements Quackable {
	public void quack() {
		System.out.println("<< Silence >>");
	}
}
