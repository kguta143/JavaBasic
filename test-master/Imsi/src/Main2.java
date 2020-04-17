
public class Main2 {

	public static void main(String[] args) {

		Person p = method();
		//출력
		System.out.println("이름 : " + p.getName());
		System.out.println("나이 : " + p.getAge());
		System.out.println("키 : " + p.getHeight());
	}

	static Person method() {

		String name = "홍길자";
		int age = 24;
		double height = 190.99;

		Person p = new Person();
		p.setName("홍길자");
		p.setAge(24);
		p.setHeight(190.99);
		
		return p;
	}

}

class Person {
	
	private String name;
	private int age;
	private double height;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	
}