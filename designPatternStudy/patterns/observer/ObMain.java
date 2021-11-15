package observer;

public class ObMain {

	public static void main(String[] args) {
		RamdomGenerator randomgenerator = new RamdomGenerator();
		
		Observer ob1 = new DigitObserver();
		Observer ob2 = new GraphicObserver();
		//익명 클래스로 필요한 클래스 1회성 생성
		Observer ob3 = number -> {
				for (int i = 0; i < number; i++) {
					System.out.print("+");
				}
				System.out.println();
			};
			
			randomgenerator.addObserver(ob1);
			randomgenerator.addObserver(ob2);
			randomgenerator.addObserver(ob3);
			
			randomgenerator.execute();
	}
}
