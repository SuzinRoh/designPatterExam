package designPatternStudy.patterns.builder;

public class BuilderMain {

	public static void main(String [] args) {
		//System.out.println("hello world");
		
		Text text = new Text.Builder()
					.setTitle("����")
					.setContents("����")
					.setItems("�׸�1", "�׸�2")
					.build();
		
		System.out.println(text);
		/**
		 * ���� ��� 
		 * 
		 * Ÿ��Ʋ : ����
		 * ���� : ����
		 * �׸� : 
		 *   - �׸�1
		 *   - �׸�2
		 * 
		 * 
		 * Builder �� �޸�Ʈ
		 * 
		 * �ڵ� �б�/���������� ����
		 * ��ü ������ ����ϰ� �� �� ����. => ��������� ���(ex) �޼��带 ��������
		 */
	}
}
