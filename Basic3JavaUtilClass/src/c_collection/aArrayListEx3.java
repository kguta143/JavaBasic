package c_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class aArrayListEx3 {

	public static void main(String[] args) {
	
		ArrayList<Student> list = method();
		//여기서 출력
		
		//original for문
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//		for(int i=0; i<list.size(); i++) {
//			Student data = (Student)list.get(i);
//			System.out.println(data);			
//		}
		
		//향상된 for문 -> generics까지 써야 자료형 
		for(Student data : list ) {
			System.out.println(data);
		}
	}

	static ArrayList<Student> method() {
		//세명의 학생 정보를 저장 : ArrayList 이용
		Student a = new Student("홍길동", 25);
		Student b = new Student("홍길순", 35);
		Student c = new Student("홍길자", 15);
		
		ArrayList<Student> data = new ArrayList<Student>();
		 	data.add(a);
		 	data.add(b);
		 	data.add(c);
		 	
		 	return data;
			
	}
}

//----------------------------------------------------------
class Student{
	String name;
	int age;
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return name +"학생은 " +  age + "세 입니다.";
	}
}
