package designPatternStudy.patterns.adapter;

public class ObjectEx {
	private String objNm;
	private int objNum;
	
	
	public ObjectEx(String objNm, int objNum) {
		this.objNm = objNm;
		this.objNum = objNum;
	}
	
	public String getObjNm() {
		return objNm;
	}
	public void setObjNm(String objNm) {
		this.objNm = objNm;
	}
	public int getObjNum() {
		return objNum;
	}
	public void setObjNum(int objNum) {
		this.objNum = objNum;
	}
	
	
}
