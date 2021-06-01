public class SmartPhoneEx
{
	public static void main(String[] args)
	{
		SmartPhone phone = new SmartPhone();
		
		phone.printLogo();
		phone.sendCall();
		
		System.out.println("3°ú 5¸¦ ´õÇÏ¸é " + phone.calculate(3,  5));
		
		phone.schedule();
	}
}
