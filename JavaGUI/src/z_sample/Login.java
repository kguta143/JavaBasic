package z_sample;

import java.awt.BorderLayout;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame{

	JButton b;
	JTextField tf, tf1;

	public Login(){

		b = new JButton("로그인");
		tf = new JTextField(15);
		tf1 = new JTextField(15);

	}
	void display() {
		//화면 출력
		setLayout(new BorderLayout());

		JPanel p = new JPanel(new GridLayout(2,2));
		p.add(new JLabel("아이디"));
		p.add(tf);
		p.add(new JLabel("비밀번호"));
		p.add(tf1);
		add(p, BorderLayout.CENTER);
		add(b, BorderLayout.EAST);

		setSize(500,400);
		setVisible(true);		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		Login login = new Login();

		login.display();

	}
}
