/* SKU CoE ITE : Object-Oriented Programming 예제 4-2(B side) - 20170910 박수영 */

package classEx; //패키지 이름 classEx

public class TestRectangle //클래스 Rectangle 선언
{
	public static void main(String[] args) //메인 메소드 시작
	{
		Rectangle rect = new Rectangle(); //Rectangle형 변수 rect 선언(객체 생성)
		
		rect.width = 4; //사각형 가로 길이 4
		rect.height = 5; //사각형 세로 길이 5
		
		System.out.println("사각형의 면적은 " + rect.getArea()); //사각형의 면적 계산 결과 포함 메시지 출력
	}
}
