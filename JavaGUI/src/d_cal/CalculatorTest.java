package d_cal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorTest extends JFrame implements ActionListener{
	// 1. 멤버변수 선언
	JTextField tf;
	JButton b [] = new JButton[15];

	int prev;	// 이전값
	String op;	// 연산자

	// 2. 객체 생성
	public CalculatorTest() {
		tf = new JTextField();

		for(int i=0; i<9; i++) {
			b[i] = new JButton(String.valueOf(i+1));
		}
		b[9] = new JButton("0");
		b[10] =new JButton("+");
		b[10].setToolTipText("더하기");
		b[11] =new JButton("=");
		b[11].setToolTipText("계산하기");
		b[12] =new JButton("-");
		b[12].setToolTipText("빼기");
		b[13] =new JButton("*");
		b[13].setToolTipText("곱하기");
		b[14] =new JButton("/");
		b[14].setToolTipText("나누기");
	}

	// 3. 화면 구성 및 출력하기
	public void display() {

		JPanel p = new JPanel();
		p.setLayout(new GridLayout(5, 3));
		for(int i=0; i<15; i++) {
			p.add(b[i]);
		}

		add(p, BorderLayout.CENTER);
		add(tf, BorderLayout.NORTH);

		setTitle("유치원계산기");
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	//이벤트 연결
	public void eventProc() {
		for(int i=0; i<b.length; i++) {
			b[i].addActionListener(this);
		}
	}

	public void actionPerformed(ActionEvent e) {	
		JButton evt = (JButton)e.getSource();

		// 숫자가 눌렸을 때
		for(int i=0; i<10; i++) {
			if(evt == b[i]) {
				String su = tf.getText(); //tf에 적힌값을 가져온다
				su += b[i].getText(); // su에 값에 버튼1 추가시킴
				tf.setText(su);	//tf에 대입한 값을 su에 저장한다.
			}
		}

		// 연산자가 눌렸을 때
		if(evt == b[10]) {
			prev = Integer.parseInt(tf.getText());	//tf에서 가져온 문자를 int형으로 형변환하여(Integer형태) prev에 저장한다.
			tf.setText(null);	//tf를 비워주기 위해 null값을 대입
			op = evt.getText();	//op에 b[10]의 값을 가져온다.
		}else if(evt == b[12]) {
			prev = Integer.parseInt(tf.getText());
			tf.setText(null);
			op = evt.getText();
		}else if(evt == b[13]) {
			prev = Integer.parseInt(tf.getText());
			tf.setText(null);
			op = evt.getText();
		}else if(evt == b[14]) {
			prev = Integer.parseInt(tf.getText());
			tf.setText(null);
			op = evt.getText();
		}

		// '=' 버튼이 눌렸을 때
		if(evt == b[11]) {
			switch(op) {
			case "+" :
				int second = Integer.parseInt(tf.getText());
				int result = prev + second;
				tf.setText(String.valueOf(result));
				break;
			case "-" :
				int second1 = Integer.parseInt(tf.getText());
				int result1 = prev - second1;
				tf.setText(String.valueOf(result1));
				break;
			case "*" :
				int second2 = Integer.parseInt(tf.getText());
				int result2 = prev * second2;
				tf.setText(String.valueOf(result2));
				break;
			case "/" :
				int second3 = Integer.parseInt(tf.getText());
				double result3 = (double)prev / second3;
				tf.setText(String.valueOf((double)result3));
				break;		
				
				
					
						}
					}
				}
	public static void main(String[] args) {
		CalculatorTest t = new CalculatorTest();
		t.display();
		t.eventProc();
	}
}
