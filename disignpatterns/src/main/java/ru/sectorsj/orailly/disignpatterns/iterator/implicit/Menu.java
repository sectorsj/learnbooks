package ru.sectorsj.orailly.disignpatterns.iterator.implicit;

import java.util.Iterator;

public interface Menu {
	public Iterator<MenuItem> createIterator();
}
