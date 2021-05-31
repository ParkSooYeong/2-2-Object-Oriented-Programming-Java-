/* SKU CoE ITE : Object-Oriented Programming 예제 4-1(renew) - 20170910 박수영 */

package classEx; //패키지 이름 classEx

public class Circle //클래스 Circle 선언
{
	int radius; //정수형 필드 radius 선언 , 원의 반지름을 저장하는 멤버 변수
	String name; //문자열 필드 name 선언 , 원의 이름을 저장하는 멤버 변수
	
	public Circle(int cradius, String cname) //renew - 생성자
	{
		radius = cradius; //renew - 반지름 초기화
		name = cname; //renew - 이름 초기화
	}
	
	public double getArea() //실수형 멤버 메소드 getArea 선언
	{
		return 3.14 * radius * radius; //원의 면적 계산 후 반환
	}
}
