/* SKU CoE ITE : Object-Oriented Programming 3���� ���� - 20170910 �ڼ��� */

package third; //��Ű�� �̸� third

public class Account //������� Ŭ���� Account ����
{
	int balance; //������ �ܾ� �ʵ� balance ����
	String number; //���ڿ� ���¹�ȣ �ʵ� number ����
	
	public Account(String number) //������ Account ����
	{
		this.number = number; //���¹�ȣ �ʱ�ȭ
	}
	
	public int bank(int balance) //�Ա� �޼ҵ� bank ����
	{
		this.balance = balance; //�ܾ� �ʱ�ȭ
		return balance; //������ �� �ܾװ� ��ȯ
	}
	
	public int withdraw(int amount) //���� �޼ҵ� withdraw ����
	{
		balance -= amount; //�ܾ׿��� amount��ŭ ����
		return balance; //���Ұ� �� �ܾװ� ��ȯ
	}
	
	public int deposit(int amount) //���� �޼ҵ� deposit ����
	{
		balance += amount; //�ܾ׿��� amount��ŭ �߰�
		return balance; //�߰��� �� �ܾװ� ��ȯ
	}
}
