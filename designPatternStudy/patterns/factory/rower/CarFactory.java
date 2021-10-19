package designPatternStudy.patterns.factory.rower;

import designPatternStudy.patterns.factory.upper.Factory;
import designPatternStudy.patterns.factory.upper.Product;

public class CarFactory implements Factory{

	@Override
	public Product createProduct(String kind, String owner, String use) {
		return new Car(kind, owner, use);
	}

}
