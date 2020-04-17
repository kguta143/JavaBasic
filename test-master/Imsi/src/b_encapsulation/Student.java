package b_encapsulation;

/******* 캡슐화  데이타를 한번 더 보호하기 위하여 만든다
 
B.	private / public 	-> private 멤버 변수 만든 후 main 에서 에러 확인
							-> public 멤버 메소드를 만들지 않아도 에러는 발생하진 않지만 명확하게 public 지정
		* private : 다른 클래스에서의 접근을 차단
		* public : 모든 클래스에서의 접글을 허용
C.	setter / getter
D.	 this 
		

 */
public class Student {
	
	// 1. 멤버변수는 private / 멤버 메소드는 public
	private String name;	//다른 클래스의 접근방지
	private int kor, eng, math;
	private int total;
	private double avg;
	
	public int calTotal()		{  //어디서든지 접근허용
		total = kor + eng + math;  
		return total;
	}
	public double calAverage() 	{  
		avg = (double)total / 3;   
		return avg;
	}
	
	
	// 2. 필요한 것만 setter / getter 만든다 
	//	     마우스 우클릭-> Source -> Generate Getter and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor; //멤버지정하기 위해 this를 붙임
						//this.kor = 멤버변수 kor을 찾아가게 함
						//s.setKor()의 점수를 kor에 저장
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}

	
	
	
	
	
	
	
	
	
	
	

	
}
