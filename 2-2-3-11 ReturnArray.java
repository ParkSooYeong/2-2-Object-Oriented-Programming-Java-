/* SKU CoE ITE - ParkSooYoung */
/* Grade 2 , Semester 2 , Chapter 3 , Number 11 */

public class ReturnArray
{
	static int[] makeArray() // 일차원 정수 배열 리턴
	{
		int temp[] = new int[4]; // 배열 생성
		for(int i=0; i<temp.length; i++)
		{
			temp[i] = i; // 배열 초기화, 0, 1, 2, 3
		}
		return temp;
	}
	
	public static void main(String[] args)
	{
		int intArray[]; // 배열 레퍼런스 선언
		intArray = makeArray(); // 메소드가 리턴한 배열 참조
		for(int i=0; i<intArray.length; i++)
		{
			System.out.print(intArray[i] + " ");
		}
	}
}
