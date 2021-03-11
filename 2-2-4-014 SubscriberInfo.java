/* SKU CoE ITE : Object-Oriented Programming 3���� �ǽ�2 - 20170910 �ڼ��� */

package third; //��Ű�� �̸� third

public class SubscriberInfo //Ŭ���� SubscriberInfo ����
{
	String name, id, password; //���ڿ� �ʵ� name, id, password ����
	String phoneNo, address; //���ڿ� �ʵ� phoneNo, address ����
	
	SubscriberInfo(String name, String id, String password) //
	{
		this.name = name; //�Ű� ���ڿ� name���� ���� ���� ���۷��� name�� ����
		this.id = id; //�Ű� ���ڿ� id�� ���� ���� ���۷��� id�� ����
		this.password = password; //�Ű� ���ڿ� password�� ���� ���� ���۷��� password�� ����
	}
	
	SubscriberInfo(String name, String id, String password, String phoneNo, String address)
	{
		this(name, id, password); //Ÿ ������ ȣ��
		this.phoneNo = phoneNo; //�Ű� ���ڿ� phoneNo�� ���� ���� ���۷��� phoneNo�� ����
		this.address = address; //�Ű� ���ڿ� address���� ���� ���� ���۷��� address�� ����
	}
	
	//change password
	void changePassword(String password) //�޼ҵ� changePassword ����
	{
		this.password = password; //�Ű� ���ڿ� password�� ���� ���� ���۷��� password�� ����
	}
	
	//account phone number
	void setPhoneNo(String phoneNo) //�޼ҵ� setPhoneNo ����
	{
		this.phoneNo = phoneNo; //�Ű� ���ڿ� phoneNo�� ���� ���� ���۷��� phoneNo�� ����
	}
	
	//account address
	void setAddress(String address) //�޼ҵ� setAddress ����
	{
		this.address = address; //�Ű� ���ڿ� address���� ���� ���� ���۷��� address�� ����
	}
}
