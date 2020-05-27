package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		//국어점수
		int kor = 95;
		//영어점수
		int eng = 100;
		
		//국어 점수와 영어 점수의 평균을 구해서 변수에 담고 그 결과를 출력해보세요
		
		double avg = (double)(kor + eng)/2; //int type과 double type을 연산하면 결과는 double type이다.
		System.out.println("평균 : "+ avg);
		
		
		
	}
}
