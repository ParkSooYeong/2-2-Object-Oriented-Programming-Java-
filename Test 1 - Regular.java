public class Regular extends Student //�л� Ŭ������ ��ӹ޴� ���ַ� Ŭ���� ����
{
	// ������ ȣ��
	public Regular(String name, int num, String dept, int grade)
	{
		super(name, num, dept, grade);
	}

	// �� ��������� �Ű������� �޾Ƽ� ����
	public void setCredit(int grade)
	{
		printInfo();
		System.out.println("�� ������� : " + grade);
	}
	
	// ���� �޼ҵ� ����
	public static void main(String [] args)
	{
		// ��ü ����
		Student stu1 = new Regular("�ڼ���", 20170910, "������Ű��а�", setCredit(100));
		Student stu2 = new Regular("���ο�", 20201234, "������Ű��а�", setCredit(200));
			
		// ���
		setCredit(stu1);
		setCredit(stu2);
	}
}