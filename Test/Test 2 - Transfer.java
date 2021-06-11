import java.util.Scanner;

public class Transfer extends Student //학생 클래스 상속받는 트랜스퍼 클래스 선언
{
	//생성자 선언
	public Transfer(String name, int num, String dept, int grade)
	{
		super(name, num, dept, grade);
	}

	// 인정 학점, 취득 학점 선언
	int a_grade;
	int b_grade;
	
	// 계산 및 출력 메소드
	setCredit(a_grade);
	printInfo(b_grade);
	
	// 메인 메소드 , 스캐너 클래스 사용
	public static void main(String [] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		Regular stu1 = new Student("박수영", 20170910, "정보통신공학과", setCredit(100));
		Regular stu2 = new Student("윤민영", 20201234, "정보통신공학과", setCredit(200));
			
		printInfo(stu1);
		printInfo(stu2);
		
		scanner.close();
	}
}
