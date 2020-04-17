package Test;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		for(int i=1; i<10; i++) {
			System.out.println(a+" * "+i+" = "+a*i);
		}
		for(int j=1; j<10; j++) {
			System.out.println(b+" * "+j+" = "+b*j);
		}
	}
}
