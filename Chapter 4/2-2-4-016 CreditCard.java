/* SKU CoE ITE : Object-Oriented Programming 3주차 실습3 - 20170910 박수영 */

package third; //패키지 이름 third

public class CreditCard //클래스 CreditCard 선언
{
	int number;
	String name;
	int point;
	
	CreditCard(int number, String name, int point)
	{
		this.number = number;
		this.name = name;
		this.point = point;
	}
	
	void addPoint(int amount)
	{
		point += amount * 0.01;
	}
}
