/* SKU CoE ITE : Object-Oriented Programming ���� 1 - 20170910 �ڼ��� */

import java.util.Scanner; //Scanner Ŭ������ ��θ��� java.util.Scanner

public class addition
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in); //Scanner ��ü ����
		
		System.out.print("ù��° ������ �Է����ּ���. : "); //ù��° ���� �Է� ����
		int a = scanner.nextInt(); //ù��° ������ �Է¹ް� ������ ���� a�� ����
		
		System.out.print("�ι�° ������ �Է����ּ���. : "); //�ι�° ���� �Է� ����
		int b = scanner.nextInt(); //�ι�° ������ �Է¹ް� ������ ���� b�� ����
		
		int result; //��� ��� ������ ���� result
		
		result = a + b; //���� ����
		System.out.println(a + "+" + b + "=" + result); //���� ��� ���
		
		result = a - b; //���� ����
		System.out.println(a + "-" + b + "=" + result); //���� ��� ���
		
		result = a * b; //���� ����
		System.out.println(a + "*" + b + "=" + result); //���� ��� ���
		
		result = a / b; //������ ����
		System.out.println(a + "/" + b + "=" + result); //������ ��� ���
		
		scanner.close(); //scanner ��Ʈ�� �ݱ�
	}
}
