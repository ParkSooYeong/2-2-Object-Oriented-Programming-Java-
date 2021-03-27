/* SKU CoE ITE - ParkSooYoung */
/* Grade 2 , Semester 2 , Chapter 13 , Number 7 */

import java.io.*;

public class BinaryCopy
{
	public static void main(String[] args)
	{
		File src = new File("c:\\temp\\img.jpg"); // ���� ���� ��θ�
		File dest = new File("c:\\Users\\user\\eclipse-workspace\\2-2-13\\back.jpg"); // ���� ���� ��θ�
		
		int c;
		try
		{
			FileInputStream fi = new FileInputStream(src); // ���� �Է� ����Ʈ ��Ʈ�� ����
			FileOutputStream fo = new FileOutputStream(dest); // ���� ��� ����Ʈ ��Ʈ�� ����
			while((c = fi.read()) != -1)
			{
				fo.write((byte)c);
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath() + "�� " + dest.getPath() + "�� �����Ͽ����ϴ�.");
		}
		catch(IOException e)
		{
			System.out.println("���� ���� ����");
		}
	}
}
