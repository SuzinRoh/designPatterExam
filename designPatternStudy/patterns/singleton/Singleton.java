package designPatternStudy.patterns.singleton;

public class Singleton {
	
	private static final Singleton sInstance = new Singleton();
	private Singleton() {}; //������ ���� �Ұ����ϰ� ����
	
	//�̱��� Ŭ���� �ν��Ͻ� ���� �޼ҵ� ^������ ������ ��ü ����
	public static Singleton getInstance() {
		return sInstance;
	}
}
