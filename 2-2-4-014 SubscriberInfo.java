/* SKU CoE ITE : Object-Oriented Programming 3주차 실습2 - 20170910 박수영 */

package third; //패키지 이름 third

public class SubscriberInfo //클래스 SubscriberInfo 선언
{
	String name, id, password; //문자열 필드 name, id, password 선언
	String phoneNo, address; //문자열 필드 phoneNo, address 선언
	
	SubscriberInfo(String name, String id, String password) //
	{
		this.name = name; //매개 문자열 name으로 받은 값을 레퍼런스 name에 저장
		this.id = id; //매개 문자열 id로 받은 값을 레퍼런스 id에 저장
		this.password = password; //매개 문자열 password로 받은 값을 레퍼런스 password에 저장
	}
	
	SubscriberInfo(String name, String id, String password, String phoneNo, String address)
	{
		this(name, id, password); //타 생성자 호출
		this.phoneNo = phoneNo; //매개 문자열 phoneNo로 받은 값을 레퍼런스 phoneNo에 저장
		this.address = address; //매개 문자열 address으로 받은 값을 레퍼런스 address에 저장
	}
	
	//change password
	void changePassword(String password) //메소드 changePassword 선언
	{
		this.password = password; //매개 문자열 password로 받은 값을 레퍼런스 password에 저장
	}
	
	//account phone number
	void setPhoneNo(String phoneNo) //메소드 setPhoneNo 선언
	{
		this.phoneNo = phoneNo; //매개 문자열 phoneNo로 받은 값을 레퍼런스 phoneNo에 저장
	}
	
	//account address
	void setAddress(String address) //메소드 setAddress 선언
	{
		this.address = address; //매개 문자열 address으로 받은 값을 레퍼런스 address에 저장
	}
}
