package designPatternStudy.patterns.singleton;

public class Singleton {
	
	private static final Singleton sInstance = new Singleton();
	private Singleton() {}; //생성자 생성 불가능하게 막음
	
	//싱글톤 클래스 인스턴스 생성 메소드 ^위에서 생성된 객체 리턴
	public static Singleton getInstance() {
		return sInstance;
	}
}
