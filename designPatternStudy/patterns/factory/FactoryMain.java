package designPatternStudy.patterns.factory;

import designPatternStudy.patterns.factory.rower.CarFactory;
import designPatternStudy.patterns.factory.upper.Factory;
import designPatternStudy.patterns.factory.upper.Product;

public class FactoryMain {

	public static void main(String[] args) {
		Factory factory = new CarFactory();
		Product car = factory.createProduct("캐스퍼", "수진", "차를 타고 여행을 갑니다.");
		
		car.usingProduct();
	}

}
