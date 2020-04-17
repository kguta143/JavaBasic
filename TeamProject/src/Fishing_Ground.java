import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;


import view.ItemView;
import view.MainView;
import view.RecordView;
public class Fishing_Ground extends JFrame{
	//멤버변수 선언
	MainView main;
	ItemView item;
	RecordView record;

	//메인화면구성
	public Fishing_Ground() {
		super("실내낚시터");
		// 각각의 화면을 관리하는 클래스 객체 생성
		main = new MainView();
		item = new ItemView();
		record = new RecordView();
		
		// 각 탭부여
		JTabbedPane pane = new JTabbedPane();
		pane.add("메인",main);
		pane.add("매출기록", record);
		pane.add("판매",item);

		pane.setSelectedIndex(2);
		
		// 화면출력
		setLayout(new BorderLayout());

		// CENTER에 탭화면
		add(pane,BorderLayout.CENTER);
		
		// 화면사이즈
		setSize(900,700);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


	public static void main(String[] args) {
		new Fishing_Ground();

	}

}
