/* SKU CoE ITE : Object-Oriented Programming 3���� �ǽ�2 - 20170910 �ڼ��� */

package third; //��Ű�� �̸� third

public class ConstrExample2 //Ŭ���� ConstrExample2 ����
{
	public static void main(String args[]) //���� �޼ҵ� ����
	{
		SubscriberInfo obj1, obj2; //SubscriberInfo�� �ʵ� obj1,2 ����
		
		obj1 = new SubscriberInfo("�ڼ���", "SKT T1", "1234abc"); //�ʵ� obj1 ��ü ����
		obj2 = new SubscriberInfo("�̻���", "FAKER", "xyz6789"); //�ʵ� obj2 ��ü ����
		
		printSubscriberInfo(obj1);
		printSubscriberInfo(obj2);
	}
	
	static void printSubscriberInfo(SubscriberInfo obj)
	{
		System.out.println("�̸� : " + obj.name); //�̸� �޽��� ���
		System.out.println("���̵� : " + obj.id); //���̵� �޽��� ���
		System.out.println("�н����� : " + obj.password); //�н����� �޽��� ���
		System.out.println("��ȭ��ȣ : " + obj.phoneNo); //��ȭ��ȣ �޽��� ���
		System.out.println("�ּ� : " + obj.address); //�ּ� �޽��� ���
		System.out.println();
	}
}
