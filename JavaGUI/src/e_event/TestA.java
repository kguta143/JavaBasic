package e_event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestA extends JFrame {
	
	JButton b;
	JTextField f;
	
	public TestA(){

		b = new JButton("확인");
		f = new JTextField(10);
		
		setLayout(new FlowLayout());
		add(b);
		add(f);
	}
	
	public void display() {
		
		setSize(500,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void eventProc() {
		// (2) 이벤트 핸들러 객체 생성
		MyEvent me = new MyEvent();
		
		// (3) 이벤트 연결
		b.addActionListener(me);
		f.addActionListener(me);
	}
	
	// (1) 이벤트 핸들러
	class MyEvent implements ActionListener{
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
	}
	
	public static void main(String[] args) {
	 TestA a = new TestA();
	 a.display();
	 a.eventProc();
	}
}