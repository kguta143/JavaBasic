package view;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.Border;

public class ItemView extends JPanel{
	//멤버변수 선언
	JButton [] btn = new JButton[20];
	JButton alldelete= new JButton();
	JButton order = new JButton();
	JLabel won;
	JLabel jumun;
	JTextArea ta;
	//화면
	void display() {
		JButton [] btn= new JButton[20];
		for( int i =0; i< btn.length;i++) {
			btn[i]=new JButton();
		}
	//붙이기
		//왼쪽
		JPanel p_left = new JPanel(new BorderLayout());
		p_left.setLayout(new GridLayout(4,5));
		p_left.add(btn[20],BorderLayout.CENTER);
		
		JPanel p_right = new JPanel(new BorderLayout());
		p_right.setLayout(new GridLayout(2,1));
		//오른쪽 위
		
		
		JPanel p_right_up = new JPanel();
		p_right_up.setLayout(new GridLayout(2,1));
		p_right_up.add(new JLabel("주문목록"));
		//라벨(주문목록,요금,원) / 버튼(전체삭제,주문)
//		JPanel p_right_down = new JPanel();
//		p_right_down.add
		
		
		setLayout(new GridLayout(1,2));
		add(p_left);
		add(p_right);
	}
	
}
