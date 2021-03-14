package extendEx;

public class CarEx
{
	public static void main(String[] args)
	{
		Sedan sedan = new Sedan();
		Truck truck = new Truck();
		
		sedan.setColor("Red");
		truck.setColor("Gray");
		sedan.speedup(30);
		truck.speedup(25);
		sedan.setSeat(5);
		truck.setLoadage(50);
		
		System.out.println("세단의 색상 = " + sedan.color);
		System.out.println("세단의 속도 = " + sedan.speed);
		System.out.println("세단의 좌석수 = " + sedan.seat);
		
		System.out.println("트럭의 색상 = " + truck.color);
		System.out.println("트럭의 속도 = " + truck.speed);
		System.out.println("트럭의 적재량 = " + truck.loadage);
	}
}
