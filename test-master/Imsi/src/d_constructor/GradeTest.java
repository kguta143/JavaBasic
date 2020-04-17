package d_constructor;

import java.util.Scanner;

public class GradeTest {

	public static void main(String[] args) {
		
		//처리하려는 데이터의 개수를 표준 입력받는다.
		Scanner sc = new Scanner(System.in);
		System.out.println("데이터의 수를 입력하세요.");
		int su = sc.nextInt();
		
		//입력된 데이터 개수 크기의 원소를 갖는 int타입 배열을 생성한다.
		int [] jumsu = new int[su];
		
		//표준입력으로 데이터를 받아서 첫 번째 원소부터 마지막 원소까지 저장한다.
		
		for(int i=0; i<jumsu.length; i++) {
			jumsu[i] = sc.nextInt();	
		}
		GradeExpr ge = new GradeExpr(jumsu);
		//저장된 원소 값들을 하나의 행에, 기호로 분리하여 출력한다.
		System.out.print("점수:");
		for(int i=0; i<jumsu.length; i++) {
			if(i==jumsu.length-1) {
				System.out.print(ge.jumsu[i]+"\n");	
			}
			else {
				System.out.print(ge.jumsu[i]+",");
			}
		}
		//평균은 소수점이하 둘째자리까지 출력합니다.
		System.out.println("총점: " + ge.getTotal());
		System.out.println("평균: " + ge.getAverage());
		System.out.println("최고 점수: " + ge.getGoodScore());
		System.out.println("최저 점수: " + ge.getBadScore());
		/*앞에서 만들어진 배열을 전달하면서 GradeExpr 객체를 생성한 후에 총점과  
		 *평균을 구하는 메서드를 호출하여 그 수행 결과를 다음과 같은 형식으로 화면에
		 *표준 출력한다.
		 */
	}

}
