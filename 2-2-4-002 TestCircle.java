/* SKU CoE ITE : Object-Oriented Programming ���� 4-1(B side renew) - 20170910 �ڼ��� */

package classEx; //��Ű�� �̸� classEx

public class TestCircle //Ŭ���� TestCircle ����
{
	public static void main(String[] args) //���� �޼ҵ� ����
	{
		Circle pizza; //Circle�� ���� pizza ����
		pizza = new Circle(10, "��������(renew)"); //renew - Circle ��ü ����
		
		/* pizza.radius = 10; //������ �������� 10���� ����
		pizza.name = "��������"; //������ �̸� ���� */ //renew - �����ڷ� ���� ���ʿ� 
		
		double area = pizza.getArea(); //������ ���� �˾Ƴ���
		
		System.out.println(pizza.name + "�� ������ " + area); //������ �̸��� ���� ���� �޽��� ���
	}
}
