public class Student //�л� Ŭ���� ����
{
	// �ʵ� ����
	String name;
	int num;
	String dept;
	int grade;
	
	//������ ���� , this ���۷��� ���
	public Student(String name, int num, String dept, int grade)
	{
		this.name = name;
		this.num = num;
		this.dept = dept;
		this.grade = grade;
	}
	
	// ���� ��� �޼ҵ� ����
	public void printInfo()
	{
		System.out.print("�̸� : " + name);
		System.out.print("�й� : " + num);
		System.out.print("�а� : " + dept);
	}
}