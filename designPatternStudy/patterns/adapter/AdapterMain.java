package designPatternStudy.patterns.adapter;

public class AdapterMain {

	public static void main(String[] args) {
		ObjectEx objEx = new ObjectEx("°´Ã¼1", 1);
		ObjAdapter adapter = new ObjAdapter(objEx);
		System.out.print(adapter.showName());
		
	}

}
