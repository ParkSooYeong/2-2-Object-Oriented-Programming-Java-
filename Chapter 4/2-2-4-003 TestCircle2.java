/* SKU CoE ITE : Object-Oriented Programming 예제 4-1(C side renew) - 20170910 박수영 */

package classEx; //패키지 이름 classEx

public class TestCircle2 //클래스 TestCircle2 선언
{
	public static void main(String[] args) //메인 메소드 시작
	{
		Circle donut = new Circle(2, "수영도넛(renew)"); //renew - Circle형 변수 donut 선언(객체 생성)
		
		/* donut.radius = 2; //도넛의 반지름을 2로 설정
		donut.name = "수영도넛"; //도넛의 이름 설정 */ //renew - 생성자로 인해 불필요
		
		double area = donut.getArea(); //도넛의 면적 알아내기
		
		System.out.println(donut.name + "의 면적은 " + area); //도넛의 이름과 면적 포함 메시지 출력
	}
}
