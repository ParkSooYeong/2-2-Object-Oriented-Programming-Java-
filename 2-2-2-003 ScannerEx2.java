/* SKU CoE ITE : Object-Oriented Programming �ǽ� 1 - 20170910 �ڼ��� */

package scannerEx; //��Ű�� �̸� scannerEx

import java.util.Scanner; //Scanner Ŭ������ ��θ��� java.util.Scanner

public class ScannerEx2 //Ŭ���� �̸� ScannerEx2
{
	public static void main(String[] args) //���� �Լ� ����
	{
		Scanner scan = new Scanner(System.in); //Scanner ��ü scan ����
		
		System.out.print("�̸� : "); //�̸� �Է� ���� �޽��� ���
		String name = scan.next(); //�̸��� �Է¹޾� ���ڿ� name�� ����
		
		System.out.print("Java : "); //����1 �Է� ���� �޽ý� ���
		int java = scan.nextInt(); //����1�� �Է¹޾� ������ ���� java�� ����
		
		System.out.print("��ǻ����� : "); //����2 �Է� ���� �޽��� ���
		int comm = scan.nextInt(); //����2�� �Է¹޾� ������ ���� comm�� ����
		
		System.out.print("����ȸ�μ��� : "); //����3 �Է� ���� �޽��� ���
		int elec = scan.nextInt(); //����3�� �Է¹޾� ������ ���� elec�� ����
		
		int sum = java + comm + elec; //�������� ���Ͽ� �հ踦 ������ ���� sum�� ����
		double avg = sum / 3.0; //�հ踦 ���� �� ��ŭ ����� ����� �Ǽ��� ���� avg�� ����
		
		System.out.println(name + " ���� ������ ������ �����ϴ�."); //�̸��� ������ �ȳ� �޽��� ���
		System.out.println("���� : " + sum); //���� �޽��� ���
		System.out.println("��� : " + avg); //��� �޽��� ���
		
		scan.close(); //scanner ��Ʈ�� �ݱ�
	}
}
