package b_encapsulation;

public class CalculatorExpr {
	//	-는 private / +는 public
	private int num1;
	private int num2;
	
	public int getAddition() {
		return num1 + num2;
	}
	public int getSubtraction() {
		return num1 - num2;
	}
	public int getMultiplication() {
		return num1 * num2;
	}
	public double getDivision() {
		return (double)num1 / num2;
	}
	
	//모든 멤버 변수에 대한 setter 와 getter
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	
}
