/* SKU CoE ITE : Object-Oriented Programming 3���� �ǽ�3 - 20170910 �ڼ��� */

package third; //��Ű�� �̸� third

public class CreditCard //Ŭ���� CreditCard ����
{
	int number;
	String name;
	int point;
	
	CreditCard(int number, String name, int point)
	{
		this.number = number;
		this.name = name;
		this.point = point;
	}
	
	void addPoint(int amount)
	{
		point += amount * 0.01;
	}
}
