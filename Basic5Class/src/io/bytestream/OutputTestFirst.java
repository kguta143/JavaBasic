package io.bytestream;

/*
	===========================================================
	OuputStream을 구현한 FileOutputStream을 이용한 예제
	===========================================================
	
	@ write( int )
		` 0-255 사이의 정수를 인자로 받아 해당하는 바이트를 출력스트림에 쓴다
		` 인자로 정수형을 받지만, 실제로는 부호없는 바이트로 전송
		  ( 자바에서 정수형은 32bit이지만 그 중 8bit만 사용 )
	
	
	
*/

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputTestFirst
{
	public static void main( String args[] ) 
	{
		try
		{
			FileOutputStream fos = new FileOutputStream("a.txt");	
			//파일을 Byte형태로 내보내는 가상통로fos를 만들어  가상통로를 통해 a.txt에 write해주면 a.txt에 자동으로 파일을 만듬

			for( int ch = 'A'; ch <='Z'; ch++)
			{
				fos.write(ch);
			}
				
			fos.close();	//통로를 사용한 후 반드시 닫아줘야 함
			
		}catch( IOException ex ){
			System.out.println("파일전송실패 :" + ex.toString() );
		}
	}	
}

/****************************************************
	a.txt 를 노트패드와 워드패드로 읽어보기
*/