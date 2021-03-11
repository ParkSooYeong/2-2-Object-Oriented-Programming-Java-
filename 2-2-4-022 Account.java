/* SKU CoE ITE : Object-Oriented Programming 3주차 과제 - 20170910 박수영 */

package third; //패키지 이름 third

public class Account //은행계좌 클래스 Account 선언
{
	int balance; //정수형 잔액 필드 balance 선언
	String number; //문자열 계좌번호 필드 number 선언
	
	public Account(String number) //생성자 Account 선언
	{
		this.number = number; //계좌번호 초기화
	}
	
	public int bank(int balance) //입금 메소드 bank 선언
	{
		this.balance = balance; //잔액 초기화
		return balance; //현재의 총 잔액값 반환
	}
	
	public int withdraw(int amount) //인출 메소드 withdraw 선언
	{
		balance -= amount; //잔액에서 amount만큼 감소
		return balance; //감소가 된 잔액값 반환
	}
	
	public int deposit(int amount) //저축 메소드 deposit 선언
	{
		balance += amount; //잔액에서 amount만큼 추가
		return balance; //추가가 된 잔액값 반환
	}
}
