/* SKU oE ITE - ParkSooYoung */
/* Grade 2 , Semester 2 , Chapter 2 , Number 1 */

/*
 * 소스 파일 : Basic.java
 */

public class Basic
{
	public static int sum(int n, int m)
	{
		return n + m; // 메소드
	}
	
	// main() 메소드에서 실행 시작
	public static void main(String[] args)
	{
		int i = 20;
		int s;
		char a;
		
		s = sum(i, 10); // 메소드 호출
		a = '?';
		System.out.println(a); // 문자 '?' 출력
		System.out.println("Hello"); // "Hello" 문자열 출력
		System.out.println(s); // 정수 s 값 30 출력
	}
}
