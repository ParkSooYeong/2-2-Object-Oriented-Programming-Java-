/* SKU CoE ITE : Object-Oriented Programming Exercise - 20170910 �ڼ��� */

package third; //��Ű�� �̸� third

import java.util.Scanner; //Scanner Ŭ���� ȣ��

public class GoodsTest //Ŭ���� GoodsTest ����
{
	public static void main(String args[])
	{
		Goods[] goodsArray;
		goodsArray = new Goods[3];
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<goodsArray.length; i++)
		{
			System.out.println("��ǰ " + (i+1) + "�� ���� ������ �Է��Ͻÿ�");
			System.out.print("��ǰ�� : ");
			String name = scanner.nextLine();
			
			System.out.print("���� : ");
			int price = scanner.nextInt();
			
			System.out.print("������ : ");
			int numberOfStock = scanner.nextInt();
			
			scanner.nextLine();
			goodsArray[i] = new Goods(name, price, numberOfStock);
		}
		
		for(int i=0; i<goodsArray.length; i++)
		{
			System.out.println("��ǰ�� : " + goodsArray[i].name);
			System.out.println("���� : " + goodsArray[i].price);
			System.out.println("������ : " + goodsArray[i].numberOfStock);
		}
		
		scanner.close(); //Scanner Ŭ���� ��� ����
	}
}
