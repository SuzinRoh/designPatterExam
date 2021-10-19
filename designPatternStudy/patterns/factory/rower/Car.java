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
		System.out.println("���� ���� : " + kind + "\n" 
				+ "���� ������ : " + owner + "\n"
				+ "������ : " + use);
	}
}
