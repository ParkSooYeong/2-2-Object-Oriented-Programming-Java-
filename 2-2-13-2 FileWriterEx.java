/* SKU CoE ITE - ParkSooYoung */
/* Grade 2 , Semester 2 , Chapter 13 , Number 2 */

import java.io.*;

public class FileWriterEx
{
	public static void main(String[] args)
	{
		InputStreamReader in = new InputStreamReader(System.in); // Ű����κ��� �д� ���� �Է� ��Ʈ�� ����
		
		FileWriter fout = null;
		int c;
		try
		{
			fout = new FileWriter("c:\\Users\\user\\eclipse-workspace\\2-2-13\\test.txt"); // ���ϰ� ����� ��� ���� ��Ʈ�� ����
			while((c = in.read()) != -1)
			{
				fout.write(c); // Ű����κ��� �Է¹��� ���ڸ� ���Ͽ� ����
			}
			in.close();
			fout.close();
		}
		catch(IOException e)
		{
			System.out.println("����� ����");
		}
	}
}
