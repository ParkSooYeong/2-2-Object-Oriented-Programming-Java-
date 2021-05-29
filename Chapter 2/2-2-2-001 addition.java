/* SKU CoE ITE : Object-Oriented Programming 과제 1 - 20170910 박수영 */

import java.util.Scanner; //Scanner 클래스의 경로명은 java.util.Scanner

public class addition
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in); //Scanner 객체 생성
		
		System.out.print("첫번째 정수를 입력해주세요. : "); //첫번째 정수 입력 지시
		int a = scanner.nextInt(); //첫번째 정수를 입력받고 정수형 변수 a에 저장
		
		System.out.print("두번째 정수를 입력해주세요. : "); //두번째 정수 입력 지시
		int b = scanner.nextInt(); //두번째 정수를 입력받고 정수형 변수 b에 저장
		
		int result; //계산 결과 정수형 변수 result
		
		result = a + b; //덧셈 연산
		System.out.println(a + "+" + b + "=" + result); //덧셈 결과 출력
		
		result = a - b; //뺄셈 연산
		System.out.println(a + "-" + b + "=" + result); //뺄셈 결과 출력
		
		result = a * b; //곱셈 연산
		System.out.println(a + "*" + b + "=" + result); //곱셈 결과 출력
		
		result = a / b; //나눗셈 연산
		System.out.println(a + "/" + b + "=" + result); //나눗셈 결과 출력
		
		scanner.close(); //scanner 스트림 닫기
	}
}
