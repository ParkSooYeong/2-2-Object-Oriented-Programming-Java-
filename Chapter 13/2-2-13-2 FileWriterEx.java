/* SKU CoE ITE - ParkSooYoung */
/* Grade 2 , Semester 2 , Chapter 13 , Number 2 */

import java.io.*;

public class FileWriterEx
{
	public static void main(String[] args)
	{
		InputStreamReader in = new InputStreamReader(System.in); // 키보드로부터 읽는 문자 입력 스트림 생성
		
		FileWriter fout = null;
		int c;
		try
		{
			fout = new FileWriter("c:\\Users\\user\\eclipse-workspace\\2-2-13\\test.txt"); // 파일과 연결된 출력 문자 스트림 생성
			while((c = in.read()) != -1)
			{
				fout.write(c); // 키보드로부터 입력받은 문자를 파일에 저장
			}
			in.close();
			fout.close();
		}
		catch(IOException e)
		{
			System.out.println("입출력 오류");
		}
	}
}
