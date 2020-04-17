package f_numbergame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumbergameTest {
	public static void main(String[] args) {
		NumberGame game = new NumberGame();	//객체생성
		game.initChar();
		game.showAnswer();
	}
}

class NumberGame extends JFrame implements ActionListener{
	int getsu = 4;

	// 1. 멤버변수 선언
	JButton [][] b = new JButton[getsu][getsu];

	// 2. 버튼위에 지정할 문자 변수
	char[][] answers = new char[getsu][getsu];	// char '\u0000'

	// 5. 첫번째 버튼에 대한 저장
	JButton firstClick;
	int firstRow, firstCol;


	NumberGame(){	//생성자 함수
		// 2. 객체 생성
		// 3. 화면 구성
		setLayout(new GridLayout(4,4));

		for(int row=0; row<b.length; row++) {
			for(int col=0; col<b[row].length; col++) {
				b[row][col] = new JButton(row + ":" + col);
				add(b[row][col]);

				// 문자 배열을 0으로 초기화
				answers[row][col]='0';

				// 이벤트 연결
				b[row][col].addActionListener(this);
			}
		}

		//화면 출력
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	//임의의 알파벳을 임의의 위치에 지정
	void initChar() {
		char alpha = '0';
		BACK:
			for(int i=0; i<getsu*getsu; ) 
			{
				// 임의의 알파벳 만들기
				if( i%2 == 0 ) {
					alpha =(char)('A'+(int)(Math.random()*26));

					// 기존에 이미 이 알파벳이 있는지 확인
					for(int r=0; r<getsu; r++) {
						for(int c=0; c<getsu; c++) {
							if(answers[r][c] == alpha) continue BACK;
						}
					}
				}

				// 임의의 위치 선정하기
				boolean ok = false;
				do {
					int row = (int)(Math.random()*getsu);	//0,1,2,3 아무거나
					int col = (int)(Math.random()*getsu);

					if( answers[row][col] == '0') {
						answers[row][col] = alpha;
						i++;
						ok = true;
					}
				}while(!ok);

			}

	}

	//일반 메서드 생성
	void showAnswer() {
		// 답을 보여주기
		for(int row=0; row<getsu; row++) {
			for(int col=0; col<getsu; col++) {
				b[row][col].setText(String.valueOf(answers[row][col]));
			}
		}

		// 1분 후에 답 가리기
		try {
			Thread.sleep(6000);	//1초가 멈추겠다
		} catch (InterruptedException e) {

		}	//try ~ catch문을 사용해서 예외처리

		for(int s=0; s<b.length; s++) {
			for(int k=0; k<b[s].length; k++) {
				b[s][k].setText(null);
			}

		}

	}

	public void actionPerformed(ActionEvent e) {

		JButton evt = (JButton)e.getSource();

		for(int r=0; r<getsu; r++) {
			for(int c=0; c<getsu; c++) {
				if(b[r][c] == evt) {
					// 첫번째 선택인가
					if(firstClick == null) {
						firstClick = evt;
						firstRow = r;
						firstCol = c;
						evt.setBackground(Color.CYAN);
						evt.removeActionListener(this);

					}else {	// 두번째 선택인 경우라면

						// 두 개의 문자가 같다면
						if(answers[firstRow][firstCol] == answers[r][c]) {
							firstClick.setBackground(Color.RED);
							evt.setBackground(Color.RED);
						}else {
							firstClick.setBackground(null);

						}

						firstClick.addActionListener(this);
						firstClick = null;
					}


				}
			}
		}

	}

}
