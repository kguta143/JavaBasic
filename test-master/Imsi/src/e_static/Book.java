package e_static;

public class Book {
	
	private static int count; //단 하나로 공유하기 위해
	
	public Book(){ //new가 n번있으면 n번만큼 불러줌
		count++;
		System.out.println("책 한개 생성");
	}
	
	public static int getCount() {	//클래스명 접근이 하고싶어서
		return count;
	
	}
	
}
