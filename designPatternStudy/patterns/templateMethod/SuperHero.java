package templateMethod;

public class SuperHero extends Hero {
	private boolean isFlying = false;

	 public SuperHero(String name) {
		 super(name);
	 }
	
	public boolean isFlying() {
		return isFlying;
	}

	public void setFlying(boolean isFlying) {
		this.isFlying = isFlying;
	}
	
	@Override
	public void attack(Character character) {
		System.out.println(getName() + "��(��)" + character.getName() + "�� �����ߴ�.");
		
	}
			
}
