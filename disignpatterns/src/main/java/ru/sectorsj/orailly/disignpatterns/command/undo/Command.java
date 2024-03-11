package ru.sectorsj.orailly.disignpatterns.command.undo;

public interface Command {
	public void execute();
	public void undo();
}
