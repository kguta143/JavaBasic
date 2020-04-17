package e_static;

/**
 *	단 하나로 공유 : static
 * 
 * 	- 객체 명이 아닌 클래스 명의 접근이 가능
 */

public class Main {

	public static void main(String[] args) {	
		
//		Book b1 = new Book();
//		Book b2 = new Book();
//		Book b3 = new Book();
		
		System.out.println("총 갯수:" + Book.getCount());
//		System.out.println("총 갯수:" + b1.count);
//		System.out.println("총 갯수:" + b2.count);
//		System.out.println("총 갯수:" + b3.count);
		
	}

}
