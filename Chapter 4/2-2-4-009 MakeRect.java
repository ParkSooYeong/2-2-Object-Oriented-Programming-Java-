/* SKU CoE ITE : Object-Oriented Programming 3주차 복습 - 20170910 박수영 */

package third; //패키지 이름 third

public class MakeRect //클래스 MakeRect 선언
{
	public static void main(String[] args) //메인 메소드 시작
	{
		Rectangle rect1 = new Rectangle(4, 5); //객체 생성
		
		System.out.println("사각형의 면적은 " + rect1.getArea()); //사각형 면적 포함 메시지 출력
	}
}
