package g_tabpane;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class VideoShop extends JFrame{

	VideoAdmin video;
	RentAdmin rent;
	CustomerAdmin customer;
	
	VideoShop(){
		video = new VideoAdmin();
		rent = new RentAdmin();
		customer = new CustomerAdmin();
	
		JTabbedPane pane = new JTabbedPane();
		pane.add("비디오관리",video);
		pane.add("대여관리",rent);
		pane.add("고객관리",customer);
		
		add(pane);
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
	
		new VideoShop();
		
	}

}
