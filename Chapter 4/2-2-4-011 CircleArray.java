/* SKU CoE ITE : Object-Oriented Programming 예제 4-6 - 20170910 박수영 */

package third; //패키지 이름 third

public class CircleArray //클래스 CircleArray 선언
{
	public static void main(String args[])
	{
		Circle[] c; //Circle형 배열 c 선언
		c = new Circle[5];
		
		for(int i=0; i<c.length; i++)
		{
			c[i] = new Circle(i);
		}
		
		for(int i=0; i<c.length; i++)
		{
			System.out.print((int)(c[i].getArea()) + " ");
		}
	}
}
  
