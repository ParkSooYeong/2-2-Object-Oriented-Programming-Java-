/* SKU CoE ITE - ParkSooYoung */
/* Grade 2 , Semester 2 , Chapter 6 , Number 2 */

class Point1
{
	private int x, y;
	public Point1(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	public String toString()
	{
		return "Point(" + x + "," + y + ")";
	}
}

public class ToStringEx
{
	public static void main(String[] args)
	{
		Point1 a = new Point1(2,3);
		System.out.println(a.toString());
		System.out.println(a); // a는 a.toString()으로 자동 변환됨
	}
}
