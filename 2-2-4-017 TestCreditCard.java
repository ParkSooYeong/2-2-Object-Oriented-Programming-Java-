/* SKU CoE ITE : Object-Oriented Programming 3���� �ǽ�3 - 20170910 �ڼ��� */

package third; //��Ű�� �̸� third

public class TestCreditCard //Ŭ���� TestCreditCard ����
{
	public static void main(String args[])
	{
		CreditCard card = new CreditCard(33345, "SooYoung Park", 0);
		
		System.out.println("ī�� ��ȣ : " + card.number);
		System.out.println("�̸� : " + card.name);
		System.out.println("����Ʈ : " + card.point);
		
		card.addPoint(300000);
		
		System.out.println("����Ʈ : " + card.point);
	}
}
