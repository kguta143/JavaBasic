/*
 * 자료형 관련 클래스 : Wrapper class
 *  Byte / Short
 *  Character
 *  Integer / Long
 *  Float / Double
 *  
 *  형변환 관련하여 ...
 *  
 *  **** String -> int 형 변환
 *  	Integer.parseInt()
 *  
 *  **** int 형 -> String
 *  	"" + 10 -> "10" 아무것도 없는 문자열을 만들어 숫자 10을 더하면 문자열 10이 된다.
 *  					C에서 넣어온 사람들이 편법으로 자주 씀
 *  	String.valueOf(10) -> "10" //문자열 10으로 나옴
 */
package c_collection;
import java.util.ArrayList;

class aArrayListEx0
{
	public static void main(String[] args) 
	{
		Object [] data = dataSet();
		
		// dataSet() 안의 변수 값들을 여기서 출력한다면??
		for(int i=0; i<data.length; i++) {
			System.out.println(data[i]);
		}
	}

	static Object [] dataSet()
	{
		String	name = "김태희";
		int		age = 31;
		double	height = 162.3;

		Object [] data = new Object[3];	//가장 큰 문제 배열[]갯수 몇개 잡을지 쓰는거...
		data[0] = name; // data[0] = new String(name);
		data[1] = age; //data[1] = new Integer(age); 정상적인 코딩  int -> Integer
		data[2] = height; //data[2] = new Double(height); 기본형 double -> 클래스 Double 변환
		
		return data;
	}
}
