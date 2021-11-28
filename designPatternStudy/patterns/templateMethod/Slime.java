package templateMethod;

public class Slime extends Monster {
	public Slime(char prefix) {
		super(prefix);
	}
	
	@Override
	public String getName() {
		return "������" + getPreffix();
	}
	 
	@Override
	public void attack(Character character) {
		System.out.println(getName() + "��(��)" + character.getName() + "�� �����ߴ�.");
		
	}
}
