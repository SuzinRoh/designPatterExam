package designPatternStudy.patterns.adapter;

public class ObjAdapter implements Student{
	
	private ObjectEx obj ;
	
	public ObjAdapter(ObjectEx obj) {
		this.obj = obj;
	}
	
	@Override
	public String showName() {
		return obj.getObjNm();
	}

	@Override
	public int showAge() {
		return obj.getObjNum();
	}
	
}
