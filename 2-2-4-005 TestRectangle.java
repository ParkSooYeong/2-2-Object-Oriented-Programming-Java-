/* SKU CoE ITE : Object-Oriented Programming ���� 4-2(B side) - 20170910 �ڼ��� */

package classEx; //��Ű�� �̸� classEx

public class TestRectangle //Ŭ���� Rectangle ����
{
	public static void main(String[] args) //���� �޼ҵ� ����
	{
		Rectangle rect = new Rectangle(); //Rectangle�� ���� rect ����(��ü ����)
		
		rect.width = 4; //�簢�� ���� ���� 4
		rect.height = 5; //�簢�� ���� ���� 5
		
		System.out.println("�簢���� ������ " + rect.getArea()); //�簢���� ���� ��� ��� ���� �޽��� ���
	}
}
