/* SKU CoE ITE - ParkSooYoung */
/* Grade 2 , Semester 2 , Chapter 13 , Number 4 */

import java.io.*;

public class FileInputStreamEx
{
	public static void main(String[] args)
	{
		byte b[] = new byte [6]; // ��� �ִ� byte �迭
		
		try
		{
			// "c:\\Users\\user\\eclipse-workspace\\2-2-13\\test.out" ������ �о� �迭 b�� ����
			FileInputStream fin = new FileInputStream("c:\\\\Users\\\\user\\\\eclipse-workspace\\\\2-2-13\\\\test.out");
			int n=0, c;
			while((c = fin.read()) != -1) // -1�� ���� ��(EOF)
			{
				b[n] = (byte)c; // ���� ����Ʈ�� �迭�� ����
				n++;
			}
			// �迭 b�� ����Ʈ ���� ��� ȭ�鿡 ���
			System.out.println("c:\\\\Users\\\\user\\\\eclipse-workspace\\\\2-2-13\\\\test.out���� ���� �迭�� ����մϴ�.");
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
