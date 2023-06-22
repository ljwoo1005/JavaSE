package section17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * List
 * 	컬렉션 프레임워크 중 하나인 인터페이스로 순서가 있는 데이터 모음을 다루는 객체
 * 	선형 배열 객체
 * 	가변 배열 객체
 * 	인덱스 값이 있다.
 */
public class Collection02 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		// 데이터 저장하기		// 인덱스번호
		list.add("피카츄");	// 0
		list.add("라이츄");	// 1
		list.add("파이리");	// 2
		list.add("꼬부기");	// 3
		list.add("버터플");	// 4
		list.add("야도란");	// 5
		list.add("피존투");	// 6
		list.add("또가스");	// 7
		
		// 저장된 데이터 특정 인덱스 값으로 얻어오기
		String str = list.get(6);
		System.out.println("list의 6번 인덱스 값 : " + str);
		
		// 지정된 데이터에서 특정 인덱스 내용 삭제하기
		list.remove(1);
		System.out.println("저장된 데이터 개수 : " + list.size());
		
		String str2 = list.get(1);
		System.out.println("list의 1번 인덱스 값 : " + str2);
		
		String str3 = list.get(6);
		System.out.println("list의 6번 인덱스 값 : " + str3);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println("list[" + i + "] : " + list.get(i));
		}
		
		System.out.println("=====================================");
		
		for(String name : list) {
			System.out.println("name : " + name);
		}
		
		// 얕은복사
		ArrayList list2 = (ArrayList)list;
		
		// 깊은복사
		List<String> list3 = (List<String>)list2.clone();
		
		List<String> linkedList = new LinkedList<>();
		linkedList.add("잠만보");
		linkedList.add("이브이");
		linkedList.add(1, "블래키");
		
		for(String name : linkedList) {
			System.out.println("LinkedList : " + name);
		}
		
	}
}
