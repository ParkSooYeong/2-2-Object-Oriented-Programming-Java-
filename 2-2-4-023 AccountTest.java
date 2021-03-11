/* SKU CoE ITE : Object-Oriented Programming 3���� ���� - 20170910 �ڼ��� */

package third; //��Ű�� �̸� third

import java.util.Scanner; //Scanner Ŭ���� ȣ��

public class AccountTest //������� �׽�Ʈ Ŭ���� AccountTest ����
{
	public static void main(String args[]) //���� �޼ҵ� ����
	{
		Scanner scanner = new Scanner(System.in); //Scanner�� ��ü scanner ����

		System.out.print("�����Ͻ� ���¹�ȣ�� �Է��ϼ���. : "); //������ ���¹�ȣ �Է� ���� �޽��� ���
		String name = scanner.nextLine(); //�Է¹��� ���¹�ȣ�� ���ڿ� �ʵ� name�� ����
		System.out.println("���¹�ȣ " + name + " �����Ǿ����ϴ�."); //���¹�ȣ�� ������ ���� �Ϸ� �޽��� ���
		System.out.println(""); //���ü��� ���� ���� ����
		
		Account account = new Account(name); //Account�� ��ü account ���� �� ���¹�ȣ�� �Ű� ������ ���
			
		System.out.print("������ �ݾ��� �Է��ϼ���. : "); //�Ա� �Է� ���� �޽��� ���
		int input = scanner.nextInt(); //�Է¹��� �Աݾ��� ������ �ʵ� input�� ����
		int money = account.bank(input); //account�� �Ա� �޼ҵ� bank ȣ�� �� �Աݾ� input�� �Ű� ������ ���,
										 //�Աݾ��� �Ʒ��� ��� ���������� ���ӵ� �� �ֵ��� ������ �ʵ� money�� ����
		System.out.println(money + "���� �ԱݵǾ����ϴ�."); //�Աݾ��� ������ �Ա� �Ϸ� �޽��� ���
		System.out.println("�ܾ��� " + money + "�� �Դϴ�."); //�ܾ� �޽��� ���
		System.out.println(""); //���ü��� ���� ���� ����
			
		System.out.print("�߰� ������ �ݾ��� �Է��ϼ���. : "); //�߰� �Ա� �Է� ���� �޽��� ���
		int add = scanner.nextInt(); //�Է¹��� �߰��ݾ��� ������ �ʵ� add�� ����
		int additional = account.deposit(add); //account�� ���� �޼ҵ� deposit ȣ�� �� �߰��ݾ� add�� �Ű� ������ ���,
											   //��� ������� ������ �ʵ� additional�� ���� 
		System.out.println(add + "���� �ԱݵǾ����ϴ�."); //�߰��ݾ��� ������ �߰� �Ա� �Ϸ� �޽��� ���
		System.out.println("�ܾ��� " + additional + "�� �Դϴ�."); //�߰� �ݾ��� ������ �ܾ� �޽��� ���
		System.out.println(""); //���ü��� ���� ���� ����
		
		System.out.print("����� �ݾ��� �Է��ϼ���. : "); //��� �Է� ���� �޽��� ���
		int output = scanner.nextInt(); //�Է¹��� ��ݾ��� ������ �ʵ� output�� ����
		int result = account.withdraw(output); //account�� ���� �޼ҵ� withdraw ȣ�� �� ��ݾ� output�� �Ű� ������ ���,
											   //��� ������� ������ �ʵ� result�� ����
		System.out.println(output + "���� ��ݵǾ����ϴ�."); //��ݾ��� ������ ��� �Ϸ� �޽��� ���
		System.out.println("�ܾ��� " + result + "�� �Դϴ�."); //��ݾ��� ���ҵ� �ܾ� �޽��� ���

		scanner.close(); //scanner ��Ʈ�� �ݱ�
	}
}
