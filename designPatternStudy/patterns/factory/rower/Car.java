package designPatternStudy.patterns.factory.rower;

import designPatternStudy.patterns.factory.upper.Product;

public class Car implements Product {

	private String kind;
	private String owner;
	private String use;
	
	public Car(String kind, String owner, String use) {
		this.kind = kind;
		this.owner = owner;
		this.use = use;
	}
	
	@Override
	public void usingProduct() {
		System.out.println("차의 종류 : " + kind + "\n" 
				+ "차의 소유자 : " + owner + "\n"
				+ "사용목적 : " + use);
	}
}
