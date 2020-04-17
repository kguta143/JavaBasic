package a_basic;

public class Student {
	
	//멤버변수 (member field)
	String name;
	int kor, eng, math;
	
	private int total;
	private double avg;	//private를 쓰면 외부에서 접근할 수 없다.
	
	//멤버함수 ( member method / member function )
	int calTotal() {
		total = kor + eng + math;
		return total;
	}
	
	double calAve() {
		avg = (double)total / 3;
		return avg;
	}
}
