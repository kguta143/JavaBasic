package e_event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// (1) 이벤트 핸들러
public class TestB extends JFrame implements ActionListener {
	
	JButton b;
	JTextField f;
	
	public TestB(){

		b = new JButton("확인");
		f = new JTextField(10);
		
		setLayout(new FlowLayout());
		add(b);
		add(f);
	}
	
	void display() {

		setSize(500,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	void eventProc() {
		// (3) 이벤트 연결
		b.addActionListener(this);	//this 자기 자신을 지칭
		f.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		Object evt = e.getSource();
		if(evt == b) {
			String msg = b.getText();
			JOptionPane.showMessageDialog(null, msg + "버튼 이벤트발생1");
		}else if(evt == f) {
			String msg = f.getText();
			JOptionPane.showMessageDialog(null, msg + "를 입력하셨습니다.");
		}
	}
	
	public static void main(String[] args) {
		// (2) 이벤트 핸들러 객체 생성
		TestB b = new TestB();
		b.display();
		b.eventProc();
	}
}