package a_sample;

import java.awt.*;
import javax.swing.*;

// is-a 방식

public class Test2 extends JFrame {
	// 멤버변수 선언	부모-자식간 상속을 하면 변수선언,객체선언 할 필요가 없다.
	// "남자" 라디오버튼 / "여자" 라디오버튼
	// "성인" 라디오버튼 / "미성년" 라디오버튼
	
	JRadioButton rb_male = new JRadioButton("남자", true);
	JRadioButton rb_female = new JRadioButton("여자");
	JRadioButton rb_adult = new JRadioButton("성인");
	JRadioButton rb_child = new JRadioButton("미성년", true);
	
	public Test2() {

		super("나의 창2"); //super함수를 쓰면 부모의 기본생성자를 불러옴 대신 첫라인에 써야 된다.

		// 객체 생성
		ButtonGroup bg1 = new ButtonGroup();
		bg1.add(rb_male);
		bg1.add(rb_female);

		ButtonGroup bg2 = new ButtonGroup();
		bg2.add(rb_adult);
		bg2.add(rb_child);

		// 붙이기
		setLayout(new FlowLayout());
		add(rb_male);
		add(rb_female);
		add(rb_adult);
		add(rb_child);

		// 화면 출력
		setSize(500, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		Test2 t = new Test2();

	}

}
