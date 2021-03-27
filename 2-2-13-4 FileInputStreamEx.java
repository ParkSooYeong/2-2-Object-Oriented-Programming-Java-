/* SKU CoE ITE - ParkSooYoung */
/* Grade 2 , Semester 2 , Chapter 13 , Number 4 */

import java.io.*;

public class FileInputStreamEx
{
	public static void main(String[] args)
	{
		byte b[] = new byte [6]; // 비어 있는 byte 배열
		
		try
		{
			// "c:\\Users\\user\\eclipse-workspace\\2-2-13\\test.out" 파일을 읽어 배열 b에 저장
			FileInputStream fin = new FileInputStream("c:\\\\Users\\\\user\\\\eclipse-workspace\\\\2-2-13\\\\test.out");
			int n=0, c;
			while((c = fin.read()) != -1) // -1은 파일 끝(EOF)
			{
				b[n] = (byte)c; // 읽은 바이트를 배열에 저장
				n++;
			}
			// 배열 b의 바이트 값을 모두 화면에 출력
			System.out.println("c:\\\\Users\\\\user\\\\eclipse-workspace\\\\2-2-13\\\\test.out에서 읽은 배열을 출력합니다.");
			for(int i=0; i<b.length; i++)
			{
				System.out.print(b[i] + " ");
			}
			System.out.println();
			
			fin.close();
		}
		catch(IOException e)
		{
			
		}
	}
}
