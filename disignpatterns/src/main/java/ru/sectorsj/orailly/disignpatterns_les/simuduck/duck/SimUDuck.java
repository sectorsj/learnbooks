package ru.sectorsj.orailly.disignpatterns_les.simuduck.duck;

import ru.sectorsj.orailly.disignpatterns_les.simuduck.behavior.FlyRocketPowered;

public class SimUDuck {
	
	public static void main(String[] args) {
		Duck mallardDuck = new MallardDuck();
		mallardDuck.performeQuack();
		mallardDuck.performeFly();
		
		Duck modelDuck = new ModelDuck();
		
		/**
		 * Первый вызов performFly() передается реализации,
		 * заданной в конструкторе ModelDuck — то есть экземпляру FlyNoWay.
		 */
		modelDuck.performeFly();
		
		/**
		 * Вызываем setметод унаследованный классом ModelDuck и...
		 * утка приманка вдруг взлетает на реактивном двигателе!
		 */
		modelDuck.setFlyBehavior(new FlyRocketPowered());
		
		/**
		 * Способность утки-приманки к полету переключается динамически!
		 * Если бы реализация находилась в иерархии Duck, ТАКОЕ было бы невозможно.
		 *
		 */
		modelDuck.performeFly();
		
		Duck redHeadDuck = new RedHeadDuck();
		redHeadDuck.performeQuack();
		redHeadDuck.performeFly();
		
		Duck rubberDuck = new RubberDuck();
		rubberDuck.performeQuack();
		rubberDuck.performeFly();
		
		Duck decoyDuck = new DecoyDuck();
		decoyDuck.performeQuack();
		decoyDuck.performeFly();
	}
}
