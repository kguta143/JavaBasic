package c_collection;

import java.util.ArrayList;
import java.util.Collections;

public class aArrayListEx2 {
	public static void main(String[] args) 
	{
		ArrayList <String> list = new ArrayList<String>(4); 
		list.add("rabbit");  
		list.add("zebra");
		list.add("squirrel");
		list.add("fox");
		list.add("lion");
		list.add("elephant");
		// 노랜표시 없애려면 generics 지정
		// ArrayList <>안에 자료형을 명확하게 하기위해 지정 
		
		//향상된 for문( 자료구조의 generics까지 있어야 사용가능 )
		for(String data : list) {
			System.out.println(data);
		}
		//오리지날 for문
		for(int i=0; i<list.size(); i++) {
			String data = (String)list.get(i);	//get형은 무슨형을 리턴할지 모르기 때문에 ()안에 가져오고싶은 자료형을 넣어준다.
			System.out.println(data);
		}
	}
}
