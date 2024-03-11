package ru.sectorsj.orailly.disignpatterns.builder.house;

public class HouseDirector {

/**
 * Fluent Interface pattern (return the builder each time so we can string the calls together)
 * Builder pattern (we have two different builders so the "same construction process can create
 * different representations").
 * Builder is a solution to the telescoping constructor anti-pattern, where we have multiple,
 * complex constructor methods with various args for all various combinations of options
 * in construction options.
 *
 * Шаблон Fluent Interface (каждый раз возвращайте сборщик, чтобы мы могли связать вызовы вместе).
 * Шаблон построителя (у нас есть два разных построителя,
 * поэтому «один и тот же процесс построения может создать различные представления»).
 *
 * Builder — это решение анти-шаблона телескопического конструктора, где у нас есть несколько,
 *           сложные методы конструктора с различными аргументами для всех различных комбинаций параметров
 *           в вариантах конструкции.
 *
 */
	
	// in this example main() is the construct() method
	public static void main(String[] args) {
		// The Director calls the methods in the correct order to build a house. 
		// Could make this a lot more complicated to allow number of walls, windows, to be passed in.
		
		HouseBuilder woodHouseBuilder = new WoodHouseBuilder();
		House woodHouse = woodHouseBuilder.addWalls().addWindows().addRoof().build();
		System.out.println(woodHouse);
		
        // HouseBuilder clayHouseBuilder = new ClayHouseBuilder();
        // House clayHouse = clayHouseBuilder.addWalls().addWindows().addRoof().build();
        // System.out.println(clayHouse);

        HouseBuilder stoneHouseBuilder = new StoneHouseBuilder();
		House stoneHouse = stoneHouseBuilder.addWalls().addWindows().addRoof().build();
		System.out.println(stoneHouse);
		
		HouseBuilder gingerbreadHouseBuilder = new GingerbreadHouseBuilder();
		House gingerbreadHouse = gingerbreadHouseBuilder.addWalls().addWindows().addRoof().build();
		System.out.println(gingerbreadHouse);
		
		// Builder has similarities to Abstract Factory.
		// But difference is that Builder provides a step by step API for building a product;
		//   the client is responsible for calling the steps, and those can vary in order, etc.
		//   With Builder, the client must have more knowledge of the details of the product being built.
		// Product implementations can be swapped for others; clients don't change because the use the abstract API.
	}
}
