package b_encapsulation;

public class Main {

	public static void main(String[] args) {

		Student s = new Student();
//		s.kor = 70;
//		s.eng = 88;
//		s.math = 99;
		s.setKor(70);
		s.setEng(88);
		s.setMath(99);
		
		//이름을 저장하여 출력하기
		s.setName("홍길동");
		System.out.println(s.getName());
		
		System.out.println(s.getKor()+ "/"+s.getEng() + "/" + s.getMath());
		System.out.println("총점: " + s.calTotal());
		System.out.println("평균: " + s.calAverage());
		
	}
	/*
	 * [ 결론내기 ] 캡슐화란??? 
	 */
}
