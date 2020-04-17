package g_tabpane;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class VideoAdmin extends JPanel{
	
	JButton b;
	
	VideoAdmin(){
		setBackground(Color.BLUE);	//백그라운드를 블루로 바꿈
	
		b = new JButton("확인");
		add(b);
	}
}
