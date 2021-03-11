/* SKU CoE ITE : Object-Oriented Programming 예제 4-1(B side renew) - 20170910 박수영 */

package classEx; //패키지 이름 classEx

public class TestCircle //클래스 TestCircle 선언
{
	public static void main(String[] args) //메인 메소드 시작
	{
		Circle pizza; //Circle형 변수 pizza 선언
		pizza = new Circle(10, "수영피자(renew)"); //renew - Circle 객체 생성
		
		/* pizza.radius = 10; //피자의 반지름을 10으로 설정
		pizza.name = "수영피자"; //피자의 이름 설정 */ //renew - 생성자로 인해 불필요 
		
		double area = pizza.getArea(); //피자의 면적 알아내기
		
		System.out.println(pizza.name + "의 면적은 " + area); //피자의 이름과 면적 포함 메시지 출력
	}
}
