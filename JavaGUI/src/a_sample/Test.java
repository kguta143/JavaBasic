package a_sample;

import java.awt.*;

//------------- has-a 방식

public class Test {
	
	// 멤버변수 선언
	Frame f; //null값만 들어가있음
	Button b; 
	Label l;
	TextField tf;
	TextArea ta;
	Checkbox cb, cb2;
	List lst;
	
	public Test() {
		// 객체 생성
		f = new Frame("나의 창");
		b = new Button("OK"); //Frame에 기본 Layout은 BorderLayout임
		l = new Label("NAME");
		tf = new TextField("이름은 5자 미만입니다.", 40);
		ta = new TextArea();
		cb = new Checkbox("Male", true);
		cb2 = new Checkbox("Female");
		lst = new List();
		lst.add("Mercury");
		lst.add("Venus");
		lst.add("Earth");
		lst.add("JavaSoft");
		lst.add("Mars");
		
		// 붙이기 (화면을 띄우기 전에 버튼을 붙여야 한다)
		//Layout : 붙이는 방식을 지정
//		f.setLayout(new FlowLayout());
//		f.setLayout(new GridLayout(4, 2));
		f.setLayout(new BorderLayout());
		f.add(b, BorderLayout.WEST);
		f.add(l, BorderLayout.EAST);
		f.add(tf, BorderLayout.NORTH);
		f.add(ta, BorderLayout.CENTER);
			Panel p = new Panel();	//판때기를 만든다?
			//p.setLayout(new GridLayout(2, 1));
			p.add(cb);	//cb,cb2를 Panel에 붙인다
			p.add(cb2);
		f.add(p, BorderLayout.SOUTH);
		//f.add(lst);
		
		// 화면 출력
		f.setSize(500, 400);	//화면 출력전에 크기를 지정
		f.setVisible(true);
		
	}
	
	public static void main(String[] args) {

		Test t = new Test();	//new 하는 순간 제어권 5번으로 넘어감(생성자 함수)
		
	}

}
