package C_info;

import javax.swing.*;
import java.awt.*;

public class InfoTest3 extends JFrame {

	// 1. 멤버변수 선언
	JTextArea ta;
	JButton bAdd, bShow, bSearch, bDelete, bCancel, bExit;
	JTextField tfName, tfId, tfTel, tfSex, tfAge, tfHome;
	
	InfoTest3(){
		// 2. 객체 생성
		ta = new JTextArea();
		bAdd = new JButton("Add", new ImageIcon("src/c_info/Imgs/캡처.PNG"));
		bShow = new JButton("Show", new ImageIcon("src/c_info/Imgs/캡처1.PNG"));
		bSearch = new JButton("Search", new ImageIcon("src/c_info/Imgs/캡처2.PNG"));
		bDelete = new JButton("Delete", new ImageIcon("src/c_info/Imgs/캡처3.PNG"));
		bCancel = new JButton("Cancel", new ImageIcon("src/c_info/Imgs/캡처4.PNG"));
		bExit = new JButton("Exit", new ImageIcon("src/c_info/Imgs/캡처5.PNG"));
		tfName = new JTextField(15);
		tfId = new JTextField(15);
		tfTel = new JTextField(15);
		tfSex = new JTextField(15);
		tfAge = new JTextField(15);
		tfHome = new JTextField(15);
	}
	
	void display() {
		// 3. 화면 구성 및 출력
		setLayout(new BorderLayout());
		
		//WEST 영역
		JPanel p = new JPanel(new GridLayout(6, 2));
		p.add(new JLabel("Name"));
		p.add(tfName);
		p.add(new JLabel("Id"));
		p.add(tfId);
		p.add(new JLabel("Tel"));
		p.add(tfTel);
		p.add(new JLabel("Sex"));
		p.add(tfSex);
		p.add(new JLabel("Age"));
		p.add(tfAge);
		p.add(new JLabel("Home"));
		p.add(tfHome);
		add(p, BorderLayout.WEST);
		
		//SOUTH 영역
		JPanel p1 = new JPanel(new GridLayout(1, 6));
		p1.add(bAdd);
		p1.add(bShow);
		p1.add(bSearch);
		p1.add(bDelete);
		p1.add(bCancel);
		p1.add(bExit);
		add(p1, BorderLayout.SOUTH);
		
		add(ta, BorderLayout.CENTER);
		
		setLocation(200, 100);
		setSize(700, 560);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		
	public static void main(String[] args) {

		InfoTest3 t = new InfoTest3();
		t.display();
	}

}
