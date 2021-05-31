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
	
	public Book() // 생성자
	{
		this("", "");
		System.out.println("생성자 호출됨");
	}
	public Book(String title) // 생성자
	{
		this(title, "작자미상");
	}
	public Book(String title, String author) // 생성자
	{
		this.title = title;
		this.author = author;
	}
	
	public static void main(String[] args)
	{
		Book littlePrince = new Book("어린왕자", "생텍쥐페리"); // 생성자 Book(String t, String a) 호출
		Book loveStory = new Book("춘향전"); // 생성자 Book(String t) 호출
		Book emptyBook = new Book();
		System.out.println(littlePrince.title + " " + littlePrince.author);
		System.out.println(loveStory.title + " " + loveStory.author);
		loveStory.show();
	}
}
