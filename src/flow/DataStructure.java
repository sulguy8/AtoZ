package flow;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class DataStructure {
	public static void main(String[] args) {
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		// #1 배열
		
		int array[] = new int[5];	// 배열 인스턴스 생성
		array[0] = 1;				// 값 추가(방번호 0~5중 지정된 곳만 추가)
		array[4] = 2;
		
		// 배열 조회
		System.out.println("#1-1 : " + array[0]);
		// 배열 전체 조회
		for(int i=0; i<array.length; i++) {	
			System.out.println("#1-2 : " + array[i]);	
		}
		
		// 모든방은 선언된 데이터타입을 따라가야 함.
		// 만약에 0~5개방보다 더 넣고싶을때나 빼고싶을때 귀찮게 따로 추가하거나 제거해야함.(나중에 책보고 어떻게하는지 이해하고 넘어가)
		// 그래서 자동으로 방을 만들어주고 없애주고 각 방마다 다른 데이터타입을 넣는 것이 가능한 List가 나온것.
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		// #2 리스트
		
		List<Object> list = new ArrayList<Object>(); // 리스트 인스턴스 생성
		list.add(1);	// 값추가(방번호 0부터 순서대로 추가) 
		list.add(2);
		
		// 리스트 조회
		System.out.println("#2-1 : " + list.get(0));
		// 리스트 전체 조회
		System.out.println("#2-2 : " + list); 				
		// 만약에 처음보는코드인 상황에서 리스트의 마지막까지 방까지 출력하고 싶다면? for문을 활용해야 함. 
		for(int i=0; i<list.size(); i++) {
			System.out.println("#2-3 : " + list.get(i));
		}
		
		// List는 ArrayList말고 딴것도 있거든?(LinkedList) 외우진 못하더라도 책보고 꼭 이해하고 넘어가야해.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		// #3 맵
		
		Map<String, Object> map = new HashMap<String, Object>();
		List<Object> testList = new ArrayList<Object>();
		map.put("a", testList);
		map.put("b", "안녕하세요");
		map.put("c", 123);	// 위의 3가지가 전부 가능한 것처럼 Object는 모든 데이터타입 추가 가능
		//그렇다면 내가 만든 class도 Object안에 넣을 수 있지 않을까?? 그래서 니가 많이 봤던 VO(Value Object합성어)라는 클래스들이 대표적으로 이렇게 쓰임
		StudentsVO svo = new StudentsVO(); // 스크롤 쭉내려서 맨아래 StudentsVO 선언된거 확인해봐. 겟터셋터 메서드로 구성된 StudentsVO대한 인스턴스 생성
		svo.setName("조용수");	// 밑에 선언한 VO에 값을 추가해줌.
		svo.setAddr("인천");
		svo.setAge("31");
		map.put("d", svo); 	// 웹에서 이런식으로 사용함.
		
		// 맵 조회
		System.out.println("#3-1 : " + map.get("d"));
		// 맵 전체 조회
		System.out.println("#3-2 : " + map);
		// 만약에 처음보는코드인 상황에서 맵의 마지막까지 모든 키와 밸류를 출력하고 싶다면? while문을 사용해야 함.(List랑 비교해보고 왜이렇게 써야하는지 생각해봐봐)
		// 여기서 List(for문 활용), Map(while문 활용)의 차이점은? for문은 내가 끝을 아는 상황(size()메서드로), while문은 내가 언제 끝날지 모르는 상황. 상황에 맞게 사용해야 함. 
		Iterator<String> it = map.keySet().iterator();	// 책보면 Iterator에 대한 메서드들이 잘 설명되어있음. 외우진 못하더라도 이해하고 넘어가.
		while(it.hasNext())  {  // hasNext() : 다음꺼 가지고 있어? 끝날때까지 있는 내용들 다 털어옴. 
			Object key = it.next(); //	it.next(); // 그래서 뭐가 뭔지 모르는 한명을 빼옴. *중요! 순서가 없어서 랜덤으로 값을 가져옴.
			System.out.println("#3-3 : " + "나는 Key : " + key); // 키를 알수 있는건 뭐야? 밸류를 알수 있다는 거지.
			Object value = map.get(key);
			System.out.println("#3-4 : " + "나는 value :" + value); // 밸류값 출력
		}
		
		// 자바 관련된 책에서 자료구조론(Collection Flamework) 쭉 읽어보고 이해하기 힘들면 유튜브에 관련된 영상 많으니까 꼭 찾아봐봐. 이거 이해못하면 실무에서 일하기 힘듬.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		
		// #4 []로 묶인다면 리스트, {}로 묶인다면 맵
		
		// 만약 리스트에 맵을 넣는다면?
		List<Map<String,Object>> list2 = new ArrayList<Map<String,Object>>(); // Object도 가능하겠지? 	
		list2.add(map);	// 위에서 선언된 map 가져온거임
		System.out.println("#4-1 : " + list2); // [{}] 이렇게 출력, [{b(key)=안녕하세요(value)}]
		
		// 만약 맵에 리스트를 넣는다면?
		Map<String, List<Map<String,Object>>> map2 = new HashMap<String, List<Map<String,Object>>>();
		map2.put("예시", list2);
		System.out.println("#4-2 : " + map2); // {[]} 이렇게 출력, {예시(key)=[](value)}
	
	}
}


// VO는 겟터셋터메서드로 구성되어있구나. 
// 클래스 이름(StudentsVO)을 Map이나 List에 넣으면 웹에서 데이터들을 가져올때 귀찮게 여러줄 코딩안하고 한방에 갖고올 수 있구나.
class StudentsVO {
	String name;
	String age;
	String addr;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "StudentVO [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}	
}
