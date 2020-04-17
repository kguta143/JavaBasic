
// 동적인 배열 : ArrayList

package c_collection;
import java.util.ArrayList;

class aArrayListEx
{
	public static void main(String[] args) 
	{
		ArrayList data = dataSet();
		for(int i=0; i<data.size(); i++) {
			System.out.println(data.get(i));
		}
		// dataSet() 안의 변수 값들을 여기서 출력한다면??
		
	}

	static ArrayList dataSet()
	{
		String	name = "김태희";
		int		age = 31;
		double	height = 162.3;

		ArrayList data = new ArrayList(2);
		data.add(name);
		data.add(age);
		data.add(height);	//데이터 갯수를 자동으로 알아서 늘려준다.
							//갯수를 명확하게 알고있을 때는 배열을 쓰고 갯수를 정확하게 모를 때 ArrayList를 사용
		return data;

	}
}
