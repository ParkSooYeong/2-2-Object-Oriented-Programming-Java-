package Fifth;

public class ColoredCircle extends Circle
{
	String color;
	
	public ColoredCircle(int radius, String color)
	{
		super(radius);
		
		this.color = color;
	}
	
	void showColor()
	{
		System.out.print("반지름이 " + radius + "인 " + color + " 원 입니다.");
	}
}
