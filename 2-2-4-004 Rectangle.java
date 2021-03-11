/* SKU CoE ITE : Object-Oriented Programming 예제 4-2 - 20170910 박수영 */

package classEx; //패키지 이름 classEx

public class Rectangle //클래스 Rectangle 선언
{
	int width; //정수형 너비 필드 width 선언
	int height; //정수형 높이 필드 height 선언
	
	int getArea() //정수형 메소드 getArea 선언
	{
		return width * height; //사각형의 면적 계산 후 반환
	}
}
