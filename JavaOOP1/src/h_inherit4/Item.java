package h_inherit4;

public abstract class Item {
	
	protected String  number;
	protected String  title;

	public Item(){
		System.out.println("기본 생성자");
	}
	public Item(String number,String title){
		this.number=number;
		this.title=title;
		System.out.println("Item 인자 생성자");

	}
	//private < default < protected < public
//	public void output() {}; //아무런 일도없어 라고 ~구현함
	public abstract void output(); //추상메소드는 반드시 overriding 해야함
//		System.out.print(number);
//		System.out.print(","+title);
//	}
	
}
