import java.util.Scanner;

public class Transfer extends Student //�л� Ŭ���� ��ӹ޴� Ʈ������ Ŭ���� ����
{
	//������ ����
	public Transfer(String name, int num, String dept, int grade)
	{
		super(name, num, dept, grade);
	}

	// ���� ����, ��� ���� ����
	int a_grade;
	int b_grade;
	
	// ��� �� ��� �޼ҵ�
	setCredit(a_grade);
	printInfo(b_grade);
	
	// ���� �޼ҵ� , ��ĳ�� Ŭ���� ���
	public static void main(String [] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		Regular stu1 = new Student("�ڼ���", 20170910, "������Ű��а�", setCredit(100));
		Regular stu2 = new Student("���ο�", 20201234, "������Ű��а�", setCredit(200));
			
		printInfo(stu1);
		printInfo(stu2);
		
		scanner.close();
	}
}
