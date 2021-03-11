/* SKU CoE ITE : Object-Oriented Programming 3주차 실습 - 20170910 박수영 */

package third; //패키지 이름 third

public class TV //클래스 TV 선언
{
	String maker; //문자열 필드 maker 선언
	int year, size; //정수형 필드 year, size 선언
	
	public TV(String maker, int year, int size) //생성자 TV 선언
	{
		this.maker = maker; //매개 문자열 maker로 받은 값을 레퍼런스 maker에 저장
		this.year = year; //정수형 매개변수 year로 받은 값을 레퍼런스 year에 저장
		this.size = size; //정수형 매개변수 size로 받은 값을 레퍼런스 sizer에 저장
	}
	
	public void show() //메소드 show 선언
	{
		System.out.print(this.maker + "에서 만든 " + this.year + "년형 "); //maker와 yesr를 포함한 메시지 출력
		System.out.println(this.size + "인치 TV"); //size를 포함한 메시지 출력
	}
}
