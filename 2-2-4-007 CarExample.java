/* SKU CoE ITE : Object-Oriented Programming �ǽ�(20200909 B side) - 20170910 �ڼ��� */

package classEx; //��Ű�� �̸� classEx

public class CarExample //Ŭ���� CarExample ����
{
	public static void main(String[] args) //���� �޼ҵ� ����
	{
		Car myCar = new Car(); //Car�� ���� myCar ����
		
		myCar.company = "Audi"; //����ȸ�� �ƿ��
		myCar.model = "R8 5.2 Quattro Spyder"; //�� R8 5.2 ��Ʈ�� �����̴�
		myCar.color = "Snow White"; //���� ����� ȭ��Ʈ
		myCar.maxSpeed = 313; //�ְ� �ӷ� 313km/h
		myCar.speed = 0; //�ӵ� 0
		
		System.out.println("����ȸ�� = " + myCar.company); //����ȸ�� ���� �޽��� ���
		System.out.println("�� = " + myCar.model); //�� ���� �޽��� ���
		System.out.println("���� = " + myCar.color); //���� ���� �޽��� ���
		System.out.println("�ְ� �ӷ� = " + myCar.maxSpeed); //�ִ� �ӷ� ���� �޽��� ���
		System.out.println("�ӵ� = " + myCar.speed); //�ӵ� ���� �޽��� ���
		
		myCar.speed = 80; //80km/h�� ���� �ο�
		
		System.out.println("���ӵ� = " + myCar.speed); //���ӵ� ���� �޽��� ���
	}
}
