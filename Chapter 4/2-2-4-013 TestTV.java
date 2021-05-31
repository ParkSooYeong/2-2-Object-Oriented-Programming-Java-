/* SKU CoE ITE : Object-Oriented Programming 3주차 실습 - 20170910 박수영 */

package third; //패키지 이름 third

public class TestTV //클래스 TestTV 선언
{
	public static void main(String args[]) //메인 메소드 시작
	{
		TV myTV = new TV("LG", 2020, 80); //TV형 필드 myTV 선언 및 객체 생성
		
		myTV.show(); //myTV 객체의 show 메소드 실행
	}
}
