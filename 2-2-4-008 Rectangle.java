/* SKU CoE ITE : Object-Oriented Programming 3주차 복습 - 20170910 박수영 */

package third; //패키지 이름 third

public class Rectangle //클래스 Rectangle 선언
{
	int width; //정수형 필드 width 선언
	int height; //정수형 필드 height 선언
	
	public Rectangle(int cwidth, int cheight) //생성자 Rectangle 선언
	{
		this.width = cwidth; //정수형 매개변수 cwidth로 받은 값을 width에 저장 , 참조 사용
		this.height = cheight; //정수형 매개변수 cheight로 받은 값을 height에 저장 , 참조 사용
	}
	
	int getArea() //정수형 메소드 getArea 선언
	{
		return this.width * this.height; //사각형의 면적 계산 후 반환 , 참조 사용
	}
}