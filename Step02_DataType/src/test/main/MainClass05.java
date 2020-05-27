package test.main;

/*
 * [JAVA 데이터 타입]
 * 
 * String type
 * 	- 문자열을 다룰 때 사용하는 데이터 type이다.
 */
public class MainClass05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main 메소드가 시작되었습니다.");
		
		//"김구라" 정보를 담고 있는 참조 값(id값) 이 변수에 들어간다.
		String name = "김구라";
		String tmp = name;	//참조 값 복사
		name = "원숭이";		//새로운 참조 값으로 대입
		name = null; 		//name 변수를 empty(빈)상태로 만들기;
		
	}

}
