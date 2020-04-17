package j_final;

class Parent{
	final String field = "부모님꺼";
	final public void jib (){
		System.out.println("부모님이 만드신거");
	}
} 
class Child extends Parent{

	Child(){	//변수 수정
		//		super.field = "내꺼"; //부모에 final을 붙이면 수정 불가
	}
//	public void jib () {	//메소드 수정  / final을 붙이면 메소드도 수정 불가
//		System.out.println("물려받아서 탕진함");
//	}
}

public class Test {
	public static void main(String[] args) {
		Child p = new Child();
		System.out.println(p.field);
		p.jib();
	}
}
