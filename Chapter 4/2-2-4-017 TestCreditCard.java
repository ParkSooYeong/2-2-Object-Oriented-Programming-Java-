/* SKU CoE ITE : Object-Oriented Programming 3주차 실습3 - 20170910 박수영 */

package third; //패키지 이름 third

public class TestCreditCard //클래스 TestCreditCard 선언
{
	public static void main(String args[])
	{
		CreditCard card = new CreditCard(33345, "SooYoung Park", 0);
		
		System.out.println("카드 번호 : " + card.number);
		System.out.println("이름 : " + card.name);
		System.out.println("포인트 : " + card.point);
		
		card.addPoint(300000);
		
		System.out.println("포인트 : " + card.point);
	}
}
