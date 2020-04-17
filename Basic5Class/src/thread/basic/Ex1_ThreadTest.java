package thread.basic;

public class Ex1_ThreadTest {

	public static void main(String[] args) {
		
		MakeCar1 work1 = new MakeCar1("차틀만들기");
		work1.start();
		
		MakeCar1 work2 = new MakeCar1("엔진부착");
		work2.start();
	}

}

class MakeCar1 extends Thread {	//Thread 상속
	String work;
	
	MakeCar1(String _work) {
		work = _work;
	}
	
	public void run() {	//Thread에 대한 overriding
		for(int i=0; i<5; i++) {
			System.out.println(work+"작업중");
			try {
				Thread.sleep(500);	//0.5초 동안~
			} catch (InterruptedException e) {
			}
		}
	}
}