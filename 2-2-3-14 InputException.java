/* SKU CoE ITE - ParkSooYoung */
/* Grade 2 , Semester 2 , Chapter 3 , Number 14 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class InputException
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� 3���� �Է����ּ���.");
		int sum = 0, n = 0;
		for(int i=0; i<3; i++)
		{
			System.out.print(i+">>");
			try
			{
				n = scanner.nextInt(); // ���� �Է�
			}
			catch(InputMismatchException e)
			{
				System.out.println("������ �ƴϿ���. �ٽ� �Է����ּ���.");
				scanner.next(); // �Է� ��Ʈ���� �ִ� ������ �ƴ� ��ū�� ������.
				i--; // �ε����� �������� �ʵ��� �̸� ����
				continue; // ���� ����
			}
			sum += n; // ���ϱ�
		}
		System.out.println("���� " + sum);
		scanner.close();
	}
}
