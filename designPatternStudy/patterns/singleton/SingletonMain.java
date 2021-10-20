package designPatternStudy.patterns.singleton;

/**
 * �̱��� ����
 * -�̱��� ��� ���� 
 * �ν��Ͻ��� �Ѱ��� �����ϴ°� ������ ��
 *
 */
public class SingletonMain {

	public static void main(String[] args) {
		//�������� �ν��Ͻ� �����ڸ� private �� ����
		//Singleton singleton = new Singleton();
		Singleton singleton = Singleton.getInstance();//static
		Singleton singleton2 = Singleton.getInstance();
		
		if(singleton == singleton2) {
			System.out.println("ture");
		}
	}

}
