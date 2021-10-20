package designPatternStudy.patterns.builder;

/**
 * �ؽ�Ʈ Ŭ����  
 * 
 * @author sujin
 * @since 2021.10.18 PM22:54
 */
public class Text {
	private String text;

	@Override
	public String toString() {
		return text;
	}
	
	/**
	 * text �� ������ �������� builder exam
	 */
	public static class Builder {
		
		private String title;
		private String contents;
		private String[] items;
		
		//create setter 
		//�� ���� �� �ڱ� �ڽ� return
		public Builder setTitle(String title) { 
			this.title = title;
			return this;
		}
		public Builder setContents(String contents) {
			this.contents = contents;
			return this;
		}
		public Builder setItems(String...items) {
			this.items = items;
			return this; 
		}
		
		//���� ����
		public Text build() {
			Text text = new Text();
			
			StringBuilder sb = new StringBuilder();
			
			sb.append("Ÿ��Ʋ : ").append(title).append("\n")
				.append("���� : ").append(contents).append("\n")
				.append("�׸� : ").append("\n");
			
			for (String item : items) {
				sb.append(" - ").append(item).append("\n");
			}
			
			text.text = sb.toString();
			
			return text;
		}
	}
}