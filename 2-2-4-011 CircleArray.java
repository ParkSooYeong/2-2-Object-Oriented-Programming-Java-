/* SKU CoE ITE : Object-Oriented Programming ���� 4-6 - 20170910 �ڼ��� */

package third; //��Ű�� �̸� third

public class CircleArray //Ŭ���� CircleArray ����
{
	public static void main(String args[])
	{
		Circle[] c; //Circle�� �迭 c ����
		c = new Circle[5];
		
		for(int i=0; i<c.length; i++)
		{
			c[i] = new Circle(i);
		}
		
		for(int i=0; i<c.length; i++)
		{
			System.out.print((int)(c[i].getArea()) + " ");
		}
	}
}
  