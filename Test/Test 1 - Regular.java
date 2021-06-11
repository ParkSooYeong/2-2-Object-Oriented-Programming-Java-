public class Regular extends Student //학생 클래스를 상속받는 레귤러 클래스 선언
{
	// 생성자 호출
	public Regular(String name, int num, String dept, int grade)
	{
		super(name, num, dept, grade);
	}

	// 총 취득학점을 매개변수로 받아서 설정
	public void setCredit(int grade)
	{
		printInfo();
		System.out.println("총 취득학점 : " + grade);
	}
	
	// 메인 메소드 설정
	public static void main(String [] args)
	{
		// 객체 생성
		Student stu1 = new Regular("박수영", 20170910, "정보통신공학과", setCredit(100));
		Student stu2 = new Regular("윤민영", 20201234, "정보통신공학과", setCredit(200));
			
		// 출력
		setCredit(stu1);
		setCredit(stu2);
	}
}
