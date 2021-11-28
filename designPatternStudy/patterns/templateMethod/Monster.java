package templateMethod;

public abstract class Monster implements Character {
	private char preffix;
	private int hp;
	
	
	public Monster(char preffix) {
		this.preffix = preffix;
		hp = 50;
	}
	
	
	
	public char getPreffix() {
		return preffix;
	}
	
	public int getHp() {
		return hp;
	}
}
