package designPatternStudy.patterns.builder;
/**
 * ���� html�±� ����� ����  
 * @author sujin
 *
 */
public class Tags {
	private String tags;
	
	@Override
	public String toString() {
		return tags;
	}
	
	public static class Builder {
		
		private String title;
		private String contents;
		private String[] list;
		
		public Builder setTitle(String title) {
			this.title = title;
			return this;
		}
		public Builder setContents(String contents) {
			this.contents = contents;
			return this;
		}
		public Builder setList(String...list ) {
			this.list = list;
			return this;
		}
		
		public Tags build() {
			Tags tags = new Tags();
			
			StringBuilder sb = new StringBuilder();
			//�����±�	
			sb.append("<html>").append("\n")
				.append(" ").append("<body>").append("\n")
				.append(" ").append(contents).append("\n")
				.append("  ").append("<ul>").append("\n");
			//����Ʈ
			for (String item : list) {
				sb.append("   ").append("<li>").append(item).append("</li>").append("\n");
			}
			//�ݴ��±�
			sb.append("  ").append("</ul>").append("\n")
				.append(" ").append("</body>").append("\n")
				.append("</html>").append("\n");
			
			tags.tags = sb.toString();
			
			return tags;
		}
	}
}
