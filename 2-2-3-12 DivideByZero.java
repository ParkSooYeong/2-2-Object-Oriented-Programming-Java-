/* SKU CoE ITE - ParkSooYoung */
/* Grade 2 , Semester 2 , Chapter 3 , Number 12 */

import java.util.Scanner;

public class DivideByZero
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int dividend; // ������
		int divisor; // ������
		
		System.out.print("�������� �Է����ּ���.:");
		dividend = scanner.nextInt(); // ������ �Է�
		System.out.print("�������� �Է����ּ���.:");
		divisor = scanner.nextInt(); // ������ �Է�
		System.out.println(dividend + "�� " + divisor + "�� ������ ���� " + dividend/divisor + "�Դϴ�.");
	}
}
