package templateMethod;

public class templateMain {

	public static void main(String[] args) {
		Hero hero = new Hero ("���");
		Monster monster = new Slime('A');
		
		SuperHero superHero = new SuperHero("���۸�");
		superHero.attack(monster);
		superHero.setFlying(true);
		superHero.setFlying(false);
		
		monster.attack(superHero);
		
		hero.attack(monster);
	}

}
