package ru.sectorsj.orailly.disignpatterns_les.fantasticgame;

import ru.sectorsj.orailly.disignpatterns_les.fantasticgame.characters.Character;
import ru.sectorsj.orailly.disignpatterns_les.fantasticgame.characters.King;
import ru.sectorsj.orailly.disignpatterns_les.fantasticgame.characters.Knight;
import ru.sectorsj.orailly.disignpatterns_les.fantasticgame.characters.Queen;
import ru.sectorsj.orailly.disignpatterns_les.fantasticgame.behavior.AxeBehavior;
import ru.sectorsj.orailly.disignpatterns_les.fantasticgame.behavior.KnifeBehavior;
import ru.sectorsj.orailly.disignpatterns_les.fantasticgame.behavior.SwordBehavior;
import ru.sectorsj.orailly.disignpatterns_les.fantasticgame.characters.enemy.Troll;

public class TrainingBattle {
	
	public static void main(String[] args) {
		Character knight = new Knight("Lancelot", new SwordBehavior());
		Character king = new King("Artur", new SwordBehavior());
		Character queen = new Queen("Елена", new KnifeBehavior());
		Character troll = new Troll("Длинный нос", new AxeBehavior());

		knight.fight();
		king.fight();
		queen.fight();
		troll.fight();
	}
}
