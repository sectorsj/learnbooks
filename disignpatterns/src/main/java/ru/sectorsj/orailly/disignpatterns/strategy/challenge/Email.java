package ru.sectorsj.orailly.disignpatterns.strategy.challenge;

public class Email implements ShareStrategy {
	public void share() {
		System.out.println("I'm emailing the photo");
	}
}
