package section08;
/*
 * VO(Value Object), DTO(Data Transfer Object)
 * 	값 오브젝트로 목적에 맞는 변수의 집합
 * 	예) DataBase 또는 네트워크 통신 값 운반용으로 사용
 * 
 * 캡슐화(정보은닉) - 객체의 속성과 행위를 하나로 묶고 외부로부터 내부를 감싸 숨겨 은닉한다.
 */
public class Method09 {
	public static void main(String[] args) {
		MemberVO memberVO = new MemberVO();
//		memberVO.id = "025";
//		memberVO.name = "피카츄";
		
		memberVO.setId("025");
		memberVO.setName("피카츄");
		
		String id = memberVO.getId();
		String name = memberVO.getName();
		
		System.out.println(id);
		System.out.println(name);
	}
}
