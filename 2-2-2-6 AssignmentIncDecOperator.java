/* SKU oE ITE - ParkSooYoung */
/* Grade 2 , Semester 2 , Chapter 2 , Number 7 */

public class AssignmentIncDecOperator
{
	public static void main(String[] args)
	{
		int a=3, b=3, c=3;
		// ���� ������ ���
		a += 3; // a=a+3 = 6
		b *= 3; // b=b*3 = 9
		c %= 2; // c=c%2 = 1
		System.out.println("a=" + a + ", b=" + b + ", c=" + c);
		
		int d=3;
		// ���� ������ ���
		a = d++; // a=3, b=4
		System.out.println("a=" + a + ", d=" + d);
		a = ++d; // a=5, b=5
		System.out.println("a=" + a + ", d=" + d);
		a = d--; // a=5, b=4
		System.out.println("a=" + a + ", d=" + d);
		a = --d; // a=3, b=3
		System.out.println("a=" + a + ", d=" + d);
	}
}
