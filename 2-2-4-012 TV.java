/* SKU CoE ITE : Object-Oriented Programming 3���� �ǽ� - 20170910 �ڼ��� */

package third; //��Ű�� �̸� third

public class TV //Ŭ���� TV ����
{
	String maker; //���ڿ� �ʵ� maker ����
	int year, size; //������ �ʵ� year, size ����
	
	public TV(String maker, int year, int size) //������ TV ����
	{
		this.maker = maker; //�Ű� ���ڿ� maker�� ���� ���� ���۷��� maker�� ����
		this.year = year; //������ �Ű����� year�� ���� ���� ���۷��� year�� ����
		this.size = size; //������ �Ű����� size�� ���� ���� ���۷��� sizer�� ����
	}
	
	public void show() //�޼ҵ� show ����
	{
		System.out.print(this.maker + "���� ���� " + this.year + "���� "); //maker�� yesr�� ������ �޽��� ���
		System.out.println(this.size + "��ġ TV"); //size�� ������ �޽��� ���
	}
}
