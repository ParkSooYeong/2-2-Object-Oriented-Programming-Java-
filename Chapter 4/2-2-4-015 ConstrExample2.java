/* SKU CoE ITE : Object-Oriented Programming 3주차 실습2 - 20170910 박수영 */

package third; //패키지 이름 third

public class ConstrExample2 //클래스 ConstrExample2 선언
{
	public static void main(String args[]) //메인 메소드 시작
	{
		SubscriberInfo obj1, obj2; //SubscriberInfo형 필드 obj1,2 선언
		
		obj1 = new SubscriberInfo("박수영", "SKT T1", "1234abc"); //필드 obj1 객체 생성
		obj2 = new SubscriberInfo("이상혁", "FAKER", "xyz6789"); //필드 obj2 객체 생성
		
		printSubscriberInfo(obj1);
		printSubscriberInfo(obj2);
	}
	
	static void printSubscriberInfo(SubscriberInfo obj)
	{
		System.out.println("이름 : " + obj.name); //이름 메시지 출력
		System.out.println("아이디 : " + obj.id); //아이디 메시지 출력
		System.out.println("패스워드 : " + obj.password); //패스워드 메시지 출력
		System.out.println("전화번호 : " + obj.phoneNo); //전화번호 메시지 출력
		System.out.println("주소 : " + obj.address); //주소 메시지 출력
		System.out.println();
	}
}
