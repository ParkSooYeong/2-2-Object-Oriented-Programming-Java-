/* SKU CoE ITE - ParkSooYoung */
/* Grade 2 , Semester 2 , Chapter 13 , Number 8 */

import java.io.*;

public class BlockBinaryCopy
{
	public static void main(String[] args)
	{
		File src = new File("c:\\temp\\img.jpg"); // ���� ���� ��θ�
		File dest = new File("c:\\Users\\user\\eclipse-workspace\\2-2-13\\back.jpg"); // ���� ���� ��θ�
		try
		{
			FileInputStream fi = new FileInputStream(src); // ���� �Է� ����Ʈ ��Ʈ�� ����
			FileOutputStream fo = new FileOutputStream(dest); // ���� ��� ����Ʈ ��Ʈ�� ����
			byte [] buf = new byte [1024*10]; // 10KB ����
			while(true)
			{
				int n = fi.read(buf); // ���� ũ�⸸ŭ �б�, n�� ���� ���� ����Ʈ
				fo.write(buf, 0, n); // buf[0]���� n ����Ʈ ����
				if(n < buf.length)
				{
					break; // ���� ũ�⺸�� �۰� �о��� ������ ���� ���� ����, ���� ����
				}
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
