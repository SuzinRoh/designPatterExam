package observer;

public class ObMain {

	public static void main(String[] args) {
		RamdomGenerator randomgenerator = new RamdomGenerator();
		
		Observer ob1 = new DigitObserver();
		Observer ob2 = new GraphicObserver();
		//�͸� Ŭ������ �ʿ��� Ŭ���� 1ȸ�� ����
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
