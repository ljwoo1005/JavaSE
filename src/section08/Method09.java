package section08;
/*
 * VO(Value Object), DTO(Data Transfer Object)
 * 	값 오브젝트로 목적에 맞는 변수의 집합
 * 	예) DataBase 또는 네트워크 통신 값 운반용으로 사용
 * 	접근제한자 : private
 * 
 * 캡슐화(정보은닉) - 객체의 속성과 행위를 하나로 묶고 외부로부터 내부를 감싸 숨겨 은닉한다.
 */
public class Method09 {
	public static void main(String[] args) {
		MemberVO memberVO = new MemberVO();
//		memberVO.id = "025"; -> MemberVO 클래스의 속성의 접근제한자가 private로 설정되어있다. 일반적인 방법으로는 속성값을 불러오거나 변경할 수 없다.
//		memberVO.name = "피카츄";
		
		memberVO.setId("025"); // private 접근제한자의 속성값 변경
		memberVO.setName("피카츄");
		
		String id = memberVO.getId(); // private 접근제한자의 속성값 불러오기
		String name = memberVO.getName();
		
		System.out.println(id);
		System.out.println(name);
	}
}
