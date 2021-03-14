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
		
		System.out.println("������ ���� = " + sedan.color);
		System.out.println("������ �ӵ� = " + sedan.speed);
		System.out.println("������ �¼��� = " + sedan.seat);
		
		System.out.println("Ʈ���� ���� = " + truck.color);
		System.out.println("Ʈ���� �ӵ� = " + truck.speed);
		System.out.println("Ʈ���� ���緮 = " + truck.loadage);
	}
}
