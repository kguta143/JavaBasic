package c_collection;
import java.util.TreeSet;

public class bTreeSetEx 
{
	public static void main(String[] args) 
	{
		TreeSet  set = new TreeSet();	
		//Tree구조는 작으면 왼쪽 크면 오른쪽으로 자동정렬
		set.add("elephant");
		set.add("tiger");
		set.add("lion");	//1
		set.add("cat");
		set.add("dog");
		set.add("ant");
		set.add("snake");
		set.add("zebra");
		set.add("bee");
		set.add("lion");	//2(중복)
		
		System.out.println( set );
		

	}
}
