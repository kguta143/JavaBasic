package b_encapsulation;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {

		CalculatorExpr ca = new CalculatorExpr();
		String result = "";
		do { //do~while문으로 반복하고싶은 코딩을 감싸준다.
			Scanner sc = new Scanner(System.in);
			System.out.println("두 정수를 입력하세요.");
			//		int first = sc.nextInt();
			//		int second = sc.nextInt();

			//입력값들을 멤버변수에 저장하기
			//		ca.setNum1(first);
			//		ca.setNum2(second);
			ca.setNum1(sc.nextInt()); //sc.nextInt()를 사용하여 바로 받을 수있음
			ca.setNum2(sc.nextInt());
			//사칙연산 메소드 호출하여서 출력
			System.out.println("덧셈 : " + ca.getAddition());
			System.out.println("뺄셈 : " + ca.getSubtraction());
			System.out.println("곱셈 : " + ca.getMultiplication());
			System.out.println("나눗셈 : " + ca.getDivision());

			// Y or N 반복
			System.out.println("계속 반복 하겠습니까?");
			result = sc.next();
			if(result.equals("N") || result.equals("n")) break;
		}while(result.equals("Y") || result.equals("y"));
	}

}
