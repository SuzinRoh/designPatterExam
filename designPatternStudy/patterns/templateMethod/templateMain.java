package templateMethod;

public class templateMain {

	public static void main(String[] args) {
		Hero hero = new Hero ("용사");
		Monster monster = new Slime('A');
		
		SuperHero superHero = new SuperHero("수퍼맨");
		superHero.attack(monster);
		superHero.setFlying(true);
		superHero.setFlying(false);
		
		monster.attack(superHero);
		
		hero.attack(monster);
	}

}
