package h_jtable;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

public class JTableTest extends JFrame{
	//멤버번수 선언
	JTable table;	//화면만 관리함
	JButton btn;
	MyTableModel myTM;
	
	//생성자함수 생성
	public JTableTest() {
		//객체 생성
		myTM = new MyTableModel();	//JTable의 데이터와 컬럼명(Model) 담당
		table = new JTable(myTM);	//JTable의 View 담당
		btn = new JButton("확인");
		
		//화면 구성
		add(new JScrollPane(table), BorderLayout.CENTER);
		add(btn, BorderLayout.NORTH);
		
		//화면 출력
		setBounds(100, 100, 500, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//이벤트처리
		btn.addActionListener(new ActionListener() {	//INNER CLASS (이름없음)
			public void actionPerformed(ActionEvent e) {
				change();
			}
		});
		
		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {	//클릭시 몇번쨰 열, 행의 값이 나오는지 확인
				int row = table.getSelectedRow();
				int col = table.getSelectedColumn();
				System.out.println(row + ":" + col + " 이벤트 발생");
			}
		});
		
	}
	
	void change() {
		ArrayList data = new ArrayList();
		for(int i=0; i<5; i++) {		//row
			ArrayList temp =  new ArrayList();
			for(int j=0; j<4; j++) {	//col
				if(j==0) temp.add(new Boolean(false));
				else temp.add(new Integer(j+1));	//int -> Integer로 자동변환
			}
			data.add(temp);
		}
		
		myTM.data = data;
		table.setModel(myTM);
		myTM.fireTableDataChanged();//model(모델)측에서 화면(뷰)한테 내용변경됨을 알려줘야 함
		
	}
	
	class MyTableModel extends AbstractTableModel{ //추상메소드가 있음
		//내용관리
		//column명을 문자열로 배열
		String [] columnName = {"하나","둘","삼","사"};
		ArrayList data = new ArrayList();	//요 data에 myTM.data를 넣는다
		
		public int getColumnCount() {
			return columnName.length;	
		}

		public int getRowCount() {	//데이터갯수
			return data.size();
		}

		public Object getValueAt(int rowIndex, int columnIndex) { //몇번째 행에 몇번째 열에 해당하는 값을 리턴하는 함수
			ArrayList temp = (ArrayList)data.get(rowIndex);
			return temp.get(columnIndex);
		}	

		public String getColumnName(int c) {
			return columnName[c];	//JTable이 부름	데이터만 부름
		}
		
		public Class getColumnClass(int c){
			return getValueAt(0, c).getClass();
		}
		//2보다 작은 값은 편집모드로 바뀔수있다 대신 저장은 안됨
		public boolean isCellEditable(int row, int col) {
			if(col < 2) return true;
			else return false;
		}
		//값을 바꾸고 저장할 수 있게 하는 것
		public void setValueAt(Object value, int row, int col) {
			ArrayList temp = (ArrayList)data.get(row);
			temp.set(col, value);
			fireTableCellUpdated(row, col);
		}
	}
	
	public static void main(String[] args) {
		JTableTest jt = new JTableTest();
	}

}
