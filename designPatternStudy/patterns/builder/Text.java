package designPatternStudy.patterns.builder;

/**
 * 텍스트 클래스  
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
	 * text 의 내용을 구현해줄 builder exam
	 */
	public static class Builder {
		
		private String title;
		private String contents;
		private String[] items;
		
		//create setter 
		//값 세팅 후 자기 자신 return
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
		
		//빌더 구현
		public Text build() {
			Text text = new Text();
			
			StringBuilder sb = new StringBuilder();
			
			sb.append("타이틀 : ").append(title).append("\n")
				.append("내용 : ").append(contents).append("\n")
				.append("항목 : ").append("\n");
			
			for (String item : items) {
				sb.append(" - ").append(item).append("\n");
			}
			
			text.text = sb.toString();
			
			return text;
		}
	}
}
