/* SKU CoE ITE - ParkSooYoung */
/* Grade 2 , Semester 2 , Chapter 4 , Number 2 */

public class Book
{
	String title;
	String author;
	
	void show()
	{
		System.out.println(title + " " + author);
	}
	
	public Book() // ������
	{
		this("", "");
		System.out.println("������ ȣ���");
	}
	public Book(String title) // ������
	{
		this(title, "���ڹ̻�");
	}
	public Book(String title, String author) // ������
	{
		this.title = title;
		this.author = author;
	}
	
	public static void main(String[] args)
	{
		Book littlePrince = new Book("�����", "�������丮"); // ������ Book(String t, String a) ȣ��
		Book loveStory = new Book("������"); // ������ Book(String t) ȣ��
		Book emptyBook = new Book();
		System.out.println(littlePrince.title + " " + littlePrince.author);
		System.out.println(loveStory.title + " " + loveStory.author);
		loveStory.show();
	}
}
