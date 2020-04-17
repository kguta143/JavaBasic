
public class Main {

	public static void main(String[] args) {
		//소문자 main은 메소드 명이고 대문자 Main은 클래스명
		String name = "홍길자";
		int age = 24;
		double height = 190.99;
		
		
		method(name, age, height);
		
	}
	static void method(String name, int age, double height) {
		//출력
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
	}
}
