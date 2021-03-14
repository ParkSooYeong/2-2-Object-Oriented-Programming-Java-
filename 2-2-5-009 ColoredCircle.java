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
		System.out.print("�������� " + radius + "�� " + color + " �� �Դϴ�.");
	}
}
