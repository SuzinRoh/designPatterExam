package designPatternStudy.patterns.builder;

public class BuilderMain {

	public static void main(String [] args) {
		//System.out.println("hello world");
		
		Text text = new Text.Builder()
					.setTitle("제목")
					.setContents("내용")
					.setItems("항목1", "항목2")
					.build();
		
		System.out.println(text);
		/**
		 * 실제 출력 
		 * 
		 * 타이틀 : 제목
		 * 내용 : 내용
		 * 항목 : 
		 *   - 항목1
		 *   - 항목2
		 * 
		 * 
		 * Builder 의 메리트
		 * 
		 * 코드 읽기/유지보수가 편함
		 * 객체 생성을 깔끔하게 할 수 있음. => 모든조합의 출력(ex) 메서드를 만들어야함
		 */
		
		Tags tags = new Tags.Builder()
				.setTitle("html 만들기")
				.setContents("to-do list")
				.setList("밥먹기", "씻기", "회사가기...")
				.build();
		
		System.out.println(tags);
	}
}
