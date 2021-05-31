/* SKU CoE ITE : Object-Oriented Programming Exercise - 20170910 박수영 */

package third; //패키지 이름 third

public class Goods //클래스 Goods 선언
{
	String name;
	int price, numberOfStock;
	
	public Goods(String name, int price, int numberOfStock)
	{
		this.name = name;
		this.price = price;
		this.numberOfStock = numberOfStock;
	}
}
