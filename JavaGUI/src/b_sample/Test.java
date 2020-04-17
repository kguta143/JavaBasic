package b_sample;

// AWT -> Swing

import java.awt.*;	//옛날거
import javax.swing.*;	//업그레이드

public class Test {
	
	// 멤버변수 선언
	JFrame f; //null값만 들어가있음
	JButton b; 
	JLabel l;
	JTextField tf;
	JTextArea ta;
	JCheckBox cb, cb2;
	JList lst;
	
	public Test() {
		// 객체 생성
		f = new JFrame("나의 창");
		b = new JButton("OK"); //Frame에 기본 Layout은 BorderLayout임
		l = new JLabel("NAME");
		tf = new JTextField("이름은 5자 미만입니다.", 40);
		ta = new JTextArea();
		cb = new JCheckBox("Male", true);
		cb2 = new JCheckBox("Female");
		String [] data = {"Mercury","Venus","Earth","JavaSoft","Mars"};
		lst = new JList(data);
		
		
		// 붙이기 (화면을 띄우기 전에 버튼을 붙여야 한다)
		//Layout : 붙이는 방식을 지정
//		f.setLayout(new FlowLayout());
//		f.setLayout(new GridLayout(3, 2));
		f.setLayout(new BorderLayout());
		f.add(b, BorderLayout.WEST);
		f.add(l, BorderLayout.EAST);
			JPanel p2 = new JPanel();
			p2.add(tf);
			p2.add(lst);
		f.add(p2, BorderLayout.NORTH);
		
		f.add(ta, BorderLayout.CENTER);
		//f.add(lst, BorderLayout.NORTH);
			JPanel p = new JPanel();	//판때기를 만든다?
			//p.setLayout(new GridLayout(2, 2));
			p.add(cb);	//cb,cb2를 Panel에 붙인다
			p.add(cb2);
			
		f.add(p, BorderLayout.SOUTH);
		
		// 화면 출력
		f.setSize(500, 400);	//화면 출력전에 크기를 지정
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프로그램 종료
	}
	
	public static void main(String[] args) {

		Test t = new Test();	//new 하는 순간 제어권 5번으로 넘어감(생성자 함수)
		
	}

}
