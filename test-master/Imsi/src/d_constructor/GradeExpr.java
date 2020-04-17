package d_constructor;

public class GradeExpr {
	int [] jumsu;
	
	public GradeExpr(int[]jumsu) {
			this.jumsu = jumsu;
	}
	public int getTotal() {
		int total = 0;
		for(int i=0; i<jumsu.length; i++) {
			total += jumsu[i];
		}
		return total;
	}
	public double getAverage() {
		double avg = 0;
		return (double)getTotal()/jumsu.length;
	}
	public int getGoodScore() {
		int max = jumsu[0];
		for(int i=0; i<jumsu.length; i++) {
			if(max < jumsu[i]) {
				max = jumsu[i];
			}
		}
		return max;
	}
	public int getBadScore() {
		int min=jumsu[0];
		for(int i=1; i<jumsu.length; i++) {
			if(min > jumsu[i]) {
				min = jumsu[i];
			}
		}
		return min;				
	}
	
}
