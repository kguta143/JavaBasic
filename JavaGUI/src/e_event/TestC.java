package e_event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestC extends JFrame {
	
	JButton b;
	JTextField f;
	
	public TestC(){

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
		// MyEvent me = new MyEvent();
		// b.addActionListener(me);	30,31번 라인 오리지날
		// (1) 이벤트 핸들러 구현 ActionListener을 구현한 이름없는 클래스를 구현하면서 객체생성
		// (2) 이벤트 핸들러 객체 생성
		// (3) 이벤트 연결
		//b.addActionListener(new MyEvent());	//객체 생성과 동시에 이벤트 연결을 하겠다.
		b.addActionListener(new ActionListener() 	//이벤트 1~3번을 한번에 구현
		{
			public void actionPerformed(ActionEvent e) {
					String msg = b.getText();
					JOptionPane.showMessageDialog(null, msg + "버튼 이벤트발생1");
			}
		});
		
		f.addActionListener(new ActionListener() 	//이벤트 1~3번을 한번에 구현
		{
			public void actionPerformed(ActionEvent e) {
					String msg = f.getText();
					JOptionPane.showMessageDialog(null, msg + "를 입력하였습니다.");
			}
		});
	}
	
	// (1) 이벤트 핸들러 (버튼전용 이벤트 핸들러)
//	class MyEvent implements ActionListener{
//		public void actionPerformed(ActionEvent e) {
//				String msg = b.getText();
//				JOptionPane.showMessageDialog(null, msg + "버튼 이벤트발생1");
//		}
//	}
	
	public static void main(String[] args) {
	 TestC a = new TestC();
	 a.display();
	 a.eventProc();
	}
}