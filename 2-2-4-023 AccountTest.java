/* SKU CoE ITE : Object-Oriented Programming 3주차 과제 - 20170910 박수영 */

package third; //패키지 이름 third

import java.util.Scanner; //Scanner 클래스 호출

public class AccountTest //은행계좌 테스트 클래스 AccountTest 선언
{
	public static void main(String args[]) //메인 메소드 시작
	{
		Scanner scanner = new Scanner(System.in); //Scanner형 객체 scanner 생성

		System.out.print("개설하실 계좌번호를 입력하세요. : "); //개설할 계좌번호 입력 지시 메시지 출력
		String name = scanner.nextLine(); //입력받은 계좌번호를 문자열 필드 name에 저장
		System.out.println("계좌번호 " + name + " 개설되었습니다."); //계좌번호를 포함한 개설 완료 메시지 출력
		System.out.println(""); //가시성을 위한 라인 공백
		
		Account account = new Account(name); //Account형 객체 account 선언 및 계좌번호를 매개 변수로 사용
			
		System.out.print("예금할 금액을 입력하세요. : "); //입금 입력 지시 메시지 출력
		int input = scanner.nextInt(); //입력받은 입금액을 정수형 필드 input에 저장
		int money = account.bank(input); //account의 입금 메소드 bank 호출 및 입금액 input을 매개 변수로 사용,
										 //입금액을 아래의 계산 과정에서도 지속될 수 있도록 정수형 필드 money에 저장
		System.out.println(money + "원이 입금되었습니다."); //입금액을 포함한 입금 완료 메시지 출력
		System.out.println("잔액은 " + money + "원 입니다."); //잔액 메시지 출력
		System.out.println(""); //가시성을 위한 라인 공백
			
		System.out.print("추가 예금할 금액을 입력하세요. : "); //추가 입금 입력 지시 메시지 출력
		int add = scanner.nextInt(); //입력받은 추가금액을 정수형 필드 add에 저장
		int additional = account.deposit(add); //account의 저축 메소드 deposit 호출 및 추가금액 add를 매개 변수로 사용,
											   //계산 결과값을 정수형 필드 additional에 저장 
		System.out.println(add + "원이 입금되었습니다."); //추가금액을 포함한 추가 입금 완료 메시지 출력
		System.out.println("잔액은 " + additional + "원 입니다."); //추가 금액이 더해진 잔액 메시지 출력
		System.out.println(""); //가시성을 위한 라인 공백
		
		System.out.print("출금할 금액을 입력하세요. : "); //출금 입력 지시 메시지 출력
		int output = scanner.nextInt(); //입력받은 출금액을 정수형 필드 output에 저장
		int result = account.withdraw(output); //account의 인출 메소드 withdraw 호출 및 출금액 output을 매개 변수로 사용,
											   //계산 결과값을 정수형 필드 result에 저장
		System.out.println(output + "원이 출금되었습니다."); //출금액을 포함한 출금 완료 메시지 출력
		System.out.println("잔액은 " + result + "원 입니다."); //출금액이 감소된 잔액 메시지 출력

		scanner.close(); //scanner 스트림 닫기
	}
}
