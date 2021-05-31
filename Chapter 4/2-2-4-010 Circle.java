/* SKU CoE ITE : Object-Oriented Programming 예제 4-6 - 20170910 박수영 */

package third; //패키지 이름 third

public class Circle //클래스 Circle 선언
{
	int radius;
	
	public Circle(int radius)
	{
		this.radius = radius;
	}
	
	public double getArea()
	{
		return 3.14 * radius * radius;
	}
}
