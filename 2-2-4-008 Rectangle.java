/* SKU CoE ITE : Object-Oriented Programming 3���� ���� - 20170910 �ڼ��� */

package third; //��Ű�� �̸� third

public class Rectangle //Ŭ���� Rectangle ����
{
	int width; //������ �ʵ� width ����
	int height; //������ �ʵ� height ����
	
	public Rectangle(int cwidth, int cheight) //������ Rectangle ����
	{
		this.width = cwidth; //������ �Ű����� cwidth�� ���� ���� width�� ���� , ���� ���
		this.height = cheight; //������ �Ű����� cheight�� ���� ���� height�� ���� , ���� ���
	}
	
	int getArea() //������ �޼ҵ� getArea ����
	{
		return this.width * this.height; //�簢���� ���� ��� �� ��ȯ , ���� ���
	}
}