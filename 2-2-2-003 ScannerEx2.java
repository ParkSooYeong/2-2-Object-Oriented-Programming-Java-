/* SKU CoE ITE : Object-Oriented Programming 실습 1 - 20170910 박수영 */

package scannerEx; //패키지 이름 scannerEx

import java.util.Scanner; //Scanner 클래스의 경로명은 java.util.Scanner

public class ScannerEx2 //클래스 이름 ScannerEx2
{
	public static void main(String[] args) //메인 함수 시작
	{
		Scanner scan = new Scanner(System.in); //Scanner 객체 scan 생성
		
		System.out.print("이름 : "); //이름 입력 지시 메시지 출력
		String name = scan.next(); //이름을 입력받아 문자열 name에 저장
		
		System.out.print("Java : "); //성적1 입력 지시 메시시 출력
		int java = scan.nextInt(); //성적1을 입력받아 정수형 변수 java에 저장
		
		System.out.print("컴퓨터통신 : "); //성적2 입력 지시 메시지 출력
		int comm = scan.nextInt(); //성적2를 입력받아 정수형 변수 comm에 저장
		
		System.out.print("전자회로설계 : "); //성적3 입력 지시 메시지 출력
		int elec = scan.nextInt(); //성적3을 입력받아 정수형 변수 elec에 저장
		
		int sum = java + comm + elec; //성적들을 더하여 합계를 정수형 변수 sum에 저장
		double avg = sum / 3.0; //합계를 과목 수 만큼 나누어서 평균을 실수형 변수 avg에 저장
		
		System.out.println(name + " 님의 성적은 다음과 같습니다."); //이름을 포함한 안내 메시지 출력
		System.out.println("총점 : " + sum); //총점 메시지 출력
		System.out.println("평균 : " + avg); //평균 메시지 출력
		
		scan.close(); //scanner 스트림 닫기
	}
}
