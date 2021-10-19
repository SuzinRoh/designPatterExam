package designPatternStudy.patterns.factory;

import designPatternStudy.patterns.factory.rower.CarFactory;
import designPatternStudy.patterns.factory.upper.Factory;
import designPatternStudy.patterns.factory.upper.Product;

public class FactoryMain {

	public static void main(String[] args) {
		Factory factory = new CarFactory();
		Product car = factory.createProduct("ĳ����", "����", "���� Ÿ�� ������ ���ϴ�.");
		
		car.usingProduct();
	}

}
