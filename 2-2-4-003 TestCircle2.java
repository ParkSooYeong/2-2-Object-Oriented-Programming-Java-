/* SKU CoE ITE : Object-Oriented Programming ���� 4-1(C side renew) - 20170910 �ڼ��� */

package classEx; //��Ű�� �̸� classEx

public class TestCircle2 //Ŭ���� TestCircle2 ����
{
	public static void main(String[] args) //���� �޼ҵ� ����
	{
		Circle donut = new Circle(2, "��������(renew)"); //renew - Circle�� ���� donut ����(��ü ����)
		
		/* donut.radius = 2; //������ �������� 2�� ����
		donut.name = "��������"; //������ �̸� ���� */ //renew - �����ڷ� ���� ���ʿ�
		
		double area = donut.getArea(); //������ ���� �˾Ƴ���
		
		System.out.println(donut.name + "�� ������ " + area); //������ �̸��� ���� ���� �޽��� ���
	}
}
