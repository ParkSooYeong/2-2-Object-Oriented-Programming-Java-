/* SKU CoE ITE : Object-Oriented Programming ���� 4-1(renew) - 20170910 �ڼ��� */

package classEx; //��Ű�� �̸� classEx

public class Circle //Ŭ���� Circle ����
{
	int radius; //������ �ʵ� radius ���� , ���� �������� �����ϴ� ��� ����
	String name; //���ڿ� �ʵ� name ���� , ���� �̸��� �����ϴ� ��� ����
	
	public Circle(int cradius, String cname) //renew - ������
	{
		radius = cradius; //renew - ������ �ʱ�ȭ
		name = cname; //renew - �̸� �ʱ�ȭ
	}
	
	public double getArea() //�Ǽ��� ��� �޼ҵ� getArea ����
	{
		return 3.14 * radius * radius; //���� ���� ��� �� ��ȯ
	}
}
