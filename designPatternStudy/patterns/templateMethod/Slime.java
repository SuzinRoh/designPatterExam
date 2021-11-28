package templateMethod;

public class Slime extends Monster {
	public Slime(char prefix) {
		super(prefix);
	}
	
	@Override
	public String getName() {
		return "슬라임" + getPreffix();
	}
	 
	@Override
	public void attack(Character character) {
		System.out.println(getName() + "는(은)" + character.getName() + "를 공격했다.");
		
	}
}
