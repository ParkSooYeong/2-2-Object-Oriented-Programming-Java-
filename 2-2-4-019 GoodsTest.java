/* SKU CoE ITE : Object-Oriented Programming Exercise - 20170910 박수영 */

package third; //패키지 이름 third

import java.util.Scanner; //Scanner 클래스 호출

public class GoodsTest //클래스 GoodsTest 선언
{
	public static void main(String args[])
	{
		Goods[] goodsArray;
		goodsArray = new Goods[3];
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<goodsArray.length; i++)
		{
			System.out.println("상품 " + (i+1) + "에 대한 정보를 입력하시오");
			System.out.print("상품명 : ");
			String name = scanner.nextLine();
			
			System.out.print("가격 : ");
			int price = scanner.nextInt();
			
			System.out.print("재고수량 : ");
			int numberOfStock = scanner.nextInt();
			
			scanner.nextLine();
			goodsArray[i] = new Goods(name, price, numberOfStock);
		}
		
		for(int i=0; i<goodsArray.length; i++)
		{
			System.out.println("상품명 : " + goodsArray[i].name);
			System.out.println("가격 : " + goodsArray[i].price);
			System.out.println("재고수량 : " + goodsArray[i].numberOfStock);
		}
		
		scanner.close(); //Scanner 클래스 사용 종료
	}
}
