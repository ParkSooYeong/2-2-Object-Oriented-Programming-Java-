/* SKU CoE ITE - ParkSooYoung */
/* Grade 2 , Semester 2 , Chapter 13 , Number 6 */

import java.io.*;

public class TextCopy
{
	public static void main(String[] args)
	{
		File src = new File("c:\\windows\\system.ini"); // ���� ���� ��θ�
		File dest = new File("c:\\Users\\user\\eclipse-workspace\\2-2-13\\system.txt"); // ���� ���� ��θ�
		
		int c;
		try
		{
			FileReader fr = new FileReader(src); // ���� �Է� ���� ��Ʈ�� ����
			FileWriter fw = new FileWriter(dest); // ���� ��� ���� ��Ʈ�� ����
			while((c = fr.read()) != -1) // ���� �ϳ� �а�
			{
				fw.write((char)c); // ���� �ϳ� ����
			}
			fr.close();
			fw.close();
			System.out.println(src.getPath() + "�� " + dest.getPath() + "�� �����Ͽ����ϴ�.");
		}
		catch(IOException e)
		{
			System.out.println("���� ���� ����");
		}
	}
}
