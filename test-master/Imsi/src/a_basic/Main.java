package a_basic;

public class Main {

	public static void main(String[] args) {
		//변수 선언
		//Student s;	//각각 만들어도 되지만 합쳐서 사용가능
		// 객체 생성( 메모리에 확보 )
		//s = new Student();
		Student s = new Student();
		s.kor = 70;
		s.eng = 88;
		s.math = 99;
		System.out.println("총점: " + s.calTotal());
		
		//s.total = 100;
		System.out.println("평균: " + s.calAve());
	}

}
