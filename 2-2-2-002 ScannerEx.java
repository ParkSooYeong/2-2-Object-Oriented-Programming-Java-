/* SKU CoE ITE : Object-Oriented Programming ���� 2-4 - 20170910 �ڼ��� */

package scannerEx; //��Ű�� �̸� scannerEx

import java.util.Scanner; //Scanner Ŭ������ ��θ��� java.util.Scanner

public class ScannerEx //Ŭ���� �̸� ScannerEx
{
	public static void main(String args[]) //���� �Լ� ����
	{
		System.out.println("�̸�, ���ֵ���, ����, ü���� ��ĭ���� �и��Ͽ� �Է��ϼ���."); //�Է� ���� �޽��� ���
		Scanner scanner = new Scanner(System.in); //Scanner ��ü ����
		
		String name = scanner.next(); //���ڿ� name�� �̸� ����
		String city = scanner.next(); //���ڿ� city�� ���ֵ��� ����
		int age = scanner.nextInt(); //������ ���� age�� ���� ����
		double weight = scanner.nextDouble(); //�Ǽ��� ���� weight�� ü�� ����
		
		System.out.println("����� �̸��� " + name + "�Դϴ�."); //�Է¹��� �̸� ���
		System.out.println("����� ��� ���ô� " + city + "�Դϴ�."); //�Է¹��� ���ֵ��� ���
		System.out.println("����� ���̴� " + age + "���Դϴ�."); //�Է¹��� ���� ���
		System.out.println("����� ü���� " + weight + "kg�Դϴ�."); //�Է¹��� ü�� ���
		
		scanner.close(); //scanner ��Ʈ�� �ݱ�
	}
}
