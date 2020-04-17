package C_info;

import javax.swing.*;
import java.awt.*;

public class InfoTest extends JFrame {

	// 1. 멤버변수 선언
	JTextArea ta;
	JButton bAdd, bShow, bSearch, bDelete, bCancel, bExit;
	JTextField tfName, tfId, tfTel, tfSex, tfAge, tfHome;
	
	//생성자
	InfoTest(){
		// 2. 객체 생성
		ta = new JTextArea();
		bAdd = new JButton("Add", new ImageIcon("src/c_info/Imgs/캡처.PNG"));
		bAdd.setVerticalTextPosition(JButton.BOTTOM);	//텍스트가 수직으로 봤을때는 밑에
		bAdd.setHorizontalTextPosition(JButton.CENTER);	//텍스트가 수평에서는 중간에
		bAdd.setPressedIcon(new ImageIcon("src/c_info/Imgs/캡처1.PNG"));		//클릭했을 때 이미지 변경
		bAdd.setRolloverIcon(new ImageIcon("src/c_info/Imgs/캡처2.PNG"));	//마우스만 올렸을 때 이미지 변경
		bAdd.setToolTipText("사용자 정보를 입력합니다.");	//마우스 커서를 가져다대면 설명 나옴
		bAdd.setMnemonic('i'); // Alt+i
		
		bShow = new JButton("Show", new ImageIcon("src/c_info/Imgs/캡처1.PNG"));
		bShow.setVerticalTextPosition(JButton.BOTTOM);
		bShow.setHorizontalTextPosition(JButton.CENTER);
		
		bSearch = new JButton("Search", new ImageIcon("src/c_info/Imgs/캡처2.PNG"));
		bSearch.setVerticalTextPosition(JButton.BOTTOM);
		bSearch.setHorizontalTextPosition(JButton.CENTER);
		
		bDelete = new JButton("Delete", new ImageIcon("src/c_info/Imgs/캡처3.PNG"));
		bDelete.setVerticalTextPosition(JButton.BOTTOM);
		bDelete.setHorizontalTextPosition(JButton.CENTER);
		
		bCancel = new JButton("Cancel", new ImageIcon("src/c_info/Imgs/캡처4.PNG"));
		bCancel.setVerticalTextPosition(JButton.BOTTOM);
		bCancel.setHorizontalTextPosition(JButton.CENTER);
		
		bExit = new JButton("Exit", new ImageIcon("src/c_info/Imgs/캡처5.PNG"));
		bExit.setVerticalTextPosition(JButton.BOTTOM);
		bExit.setHorizontalTextPosition(JButton.CENTER);
		
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
		p.add(new JLabel("Name", new ImageIcon("src/c_info/Imgs/캡처6.PNG"),JLabel.CENTER));
		//이미지 첨부 new ImageIcon("파일 위치"),
		p.add(tfName);
		p.add(new JLabel("Id", new ImageIcon("src/c_info/Imgs/캡처7.PNG"),JLabel.CENTER));
		p.add(tfId);
		p.add(new JLabel("Tel", new ImageIcon("src/c_info/Imgs/캡처8.PNG"),JLabel.CENTER));
		p.add(tfTel);
		p.add(new JLabel("Sex", new ImageIcon("src/c_info/Imgs/캡처9.PNG"),JLabel.CENTER));
		p.add(tfSex);
		p.add(new JLabel("Age", new ImageIcon("src/c_info/Imgs/캡처1.PNG"),JLabel.CENTER));
		p.add(tfAge);
		p.add(new JLabel("Home", new ImageIcon("src/c_info/Imgs/캡처2.PNG"),JLabel.CENTER));
		p.add(tfHome);
		add(p, BorderLayout.WEST);
		
		//SOUTH 영역
		JPanel p1 = new JPanel(new GridLayout(1, 6)); //1 ->행  / 6열
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

		InfoTest t = new InfoTest();
		t.display();
	}

}
