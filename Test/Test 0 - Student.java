public class Student //학생 클래스 생성
{
	// 필드 선언
	String name;
	int num;
	String dept;
	int grade;
	
	//생성자 선언 , this 레퍼런스 사용
	public Student(String name, int num, String dept, int grade)
	{
		this.name = name;
		this.num = num;
		this.dept = dept;
		this.grade = grade;
	}
	
	// 정보 출력 메소드 선언
	public void printInfo()
	{
		System.out.print("이름 : " + name);
		System.out.print("학번 : " + num);
		System.out.print("학과 : " + dept);
	}
}
