package designPatternStudy.patterns.singleton;

/**
 * 싱글톤 예제
 * -싱글톤 사용 이유 
 * 인스턴스가 한개만 존재하는게 보증이 됨
 *
 */
public class SingletonMain {

	public static void main(String[] args) {
		//막기위에 인스턴스 생성자를 private 로 지정
		//Singleton singleton = new Singleton();
		Singleton singleton = Singleton.getInstance();//static
		Singleton singleton2 = Singleton.getInstance();
		
		if(singleton == singleton2) {
			System.out.println("ture");
		}
	}

}
