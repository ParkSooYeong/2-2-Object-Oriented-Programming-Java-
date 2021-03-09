/* SKU CoE ITE : Object-Oriented Programming 예제 2-4 - 20170910 박수영 */

package scannerEx; //패키지 이름 scannerEx

import java.util.Scanner; //Scanner 클래스의 경로명은 java.util.Scanner

public class ScannerEx //클래스 이름 ScannerEx
{
	public static void main(String args[]) //메인 함수 시작
	{
		System.out.println("이름, 거주도시, 나이, 체중을 빈칸으로 분리하여 입력하세요."); //입력 지시 메시지 출력
		Scanner scanner = new Scanner(System.in); //Scanner 객체 생성
		
		String name = scanner.next(); //문자열 name에 이름 저장
		String city = scanner.next(); //문자열 city에 거주도시 저장
		int age = scanner.nextInt(); //정수형 변수 age에 나이 저장
		double weight = scanner.nextDouble(); //실수형 변수 weight에 체중 저장
		
		System.out.println("당신의 이름은 " + name + "입니다."); //입력받은 이름 출력
		System.out.println("당신이 사는 도시는 " + city + "입니다."); //입력받은 거주도시 출력
		System.out.println("당신의 나이는 " + age + "세입니다."); //입력받은 나이 출력
		System.out.println("당신의 체중은 " + weight + "kg입니다."); //입력받은 체중 출력
		
		scanner.close(); //scanner 스트림 닫기
	}
}
