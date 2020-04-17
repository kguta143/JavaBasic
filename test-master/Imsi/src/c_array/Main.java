package c_array;

import java.util.Scanner;

public class Main {

	/**
	 * 			배열을 이용해서 3명의 국영수 점수를 입력받아 총점과 평균을 구한다
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Student [] s = new Student[3];		
		// 학생 수 3은 배열의 갯수를 의미한다. //배열에 대한 new

		for(int i=0; i<s.length; i++) {
			s[i] = new Student();	//Student 클래스만의 new
		}

		// 각 학생의 이름과 국영수 점수를 입력받아 이름과 총점, 평균 출력
		for(int i=0; i<s.length; i++) {
			System.out.print("이름 : ");
			s[i].setName(in.next());
			System.out.print("국어점수 -> ");
			s[i].setKor(in.nextInt());
			System.out.print("영어점수 -> ");
			s[i].setEng(in.nextInt());
			System.out.print("수학점수 -> ");
			s[i].setMath(in.nextInt());
			System.out.println((i+1)+"번째 학생 " +"총점: " + s[i].calTotal() + "/" + "평균: " + s[i].calAverage());
		}
	}
}		

