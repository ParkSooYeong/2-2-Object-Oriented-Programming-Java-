/* SKU CoE ITE : Object-Oriented Programming ���� 4-6 - 20170910 �ڼ��� */

package third; //��Ű�� �̸� third

public class Circle //Ŭ���� Circle ����
{
	int radius;
	
	public Circle(int radius)
	{
		this.radius = radius;
	}
	
	public double getArea()
	{
		return 3.14 * radius * radius;
	}
}
