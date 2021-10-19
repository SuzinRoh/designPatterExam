package designPatternStudy.patterns.factory.upper;

public interface Factory {
	Product createProduct(String kind, String owner, String use);
}
