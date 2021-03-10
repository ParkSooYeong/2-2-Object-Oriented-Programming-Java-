/* SKU oE ITE - ParkSooYoung */
/* Grade 2 , Semester 2 , Chapter 2 , Number 4 */

public class TypeConversion
{
	public static void main(String[] args)
	{
		byte b = 127;
		int i = 100;
		System.out.println(b+i); // b가 int 타입으로 자동 변환
		System.out.println(10/4);
		System.out.println(10.0/4); // 4가 4.0으로 자동 변환
		System.out.println((char)0x12340041); // 하위 2바이트, 0x0041은 문자 'A'
		System.out.println((byte)(b+i)); // 227은 16진수로 0xE3, 즉 -29
		System.out.println((int)2.9 + 1.8);
		System.out.println((int)(2.9 + 1.8));
		System.out.println((int)2.9 + (int)1.8);
	}
}
