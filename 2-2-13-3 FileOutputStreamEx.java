/* SKU CoE ITE - ParkSooYoung */
/* Grade 2 , Semester 2 , Chapter 13 , Number 3 */

import java.io.*;

public class FileOutputStreamEx
{
	public static void main(String[] args)
	{
		byte b[] = {7,51,3,4,-1,24};
		
		try
		{
			FileOutputStream fout = new FileOutputStream("c:\\Users\\user\\eclipse-workspace\\2-2-13\\test.out");
			for(int i=0; i<b.length; i++)
			{
				fout.write(b[i]); // �迭 b�� ���̳ʸ��� �״�� ���
			}
			fout.close();
		}
		catch(IOException e)
		{
			System.out.println("����� ����");
		}
	}
}
