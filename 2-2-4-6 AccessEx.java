/* SKU CoE ITE - ParkSooYoung */
/* Grade 2 , Semester 2 , Chapter 4 , Number 6 */

class Sample
{
	public int a;
	public int b;
	int c; // 디폴트 접근 지정
}

public class AccessEx
{
	public static void main(String[] args)
	{
		Sample sample = new Sample();
		sample.a = 10;
		sample.b = 10;
		sample.c = 10;
	}
}
