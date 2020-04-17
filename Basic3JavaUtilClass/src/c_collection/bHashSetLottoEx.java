package c_collection;
import java.util.*;

public class bHashSetLottoEx 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> lottos = new HashSet<Integer>();	//Set특성 중복되지 않는다.
		while(lottos.size()<6) {
			int num = (int)(Math.random()*45)+1;	/* 1~45 사이의 임의의 수를 지정*/
			lottos.add(num);
		}
//		System.out.println(lottos);	
		ArrayList<Integer> list = new ArrayList<Integer>(lottos);
		Collections.sort(list);
		System.out.println(list);
	}
}
