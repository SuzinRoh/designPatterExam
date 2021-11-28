package templateMethod;

public class Wolf extends Monster {
	
	public Wolf(char prefix) {
		super(prefix);
	}
	
	@Override
	public void attack(Character character) {
		
	}
	
	@Override
	public String getName() {
		return "wolf" + getPreffix();
	}
}
