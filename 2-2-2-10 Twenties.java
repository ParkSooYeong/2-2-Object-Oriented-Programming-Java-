/* SKU oE ITE - ParkSooYoung */
/* Grade 2 , Semester 2 , Chapter 2 , Number 10 */

import java.util.Scanner;

public class Twenties
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���̸� �Է����ּ���. : ");
		int age = scanner.nextInt(); // ���� �Է�
		if((age>=20) && (age<30)) // age�� 20 ~ 29 �������� �˻�
		{
			System.out.print("20���Դϴ�.");
			System.out.println("20��� �ູ(?)�մϴ�!(??)");
		}
		else
		{
			System.out.println("20�밡 �ƴմϴ�.");
		}
		
		scanner.close();
	}
}
