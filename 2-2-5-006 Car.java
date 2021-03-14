package extendEx;

public class Car
{
	String color;
	int speed;
	
	void setColor(String color)
	{
		this.color = color;
	}
	
	void speedup(int value)
	{
		speed = speed + value;
	}
	
	void speedDown(int value)
	{
		speed = speed - value;
	}
}
