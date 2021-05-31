/* SKU CoE ITE : Object-Oriented Programming 실습(20200909 B side) - 20170910 박수영 */

package classEx; //패키지 이름 classEx

public class CarExample //클래스 CarExample 선언
{
	public static void main(String[] args) //메인 메소드 시작
	{
		Car myCar = new Car(); //Car형 변수 myCar 선언
		
		myCar.company = "Audi"; //제작회사 아우디
		myCar.model = "R8 5.2 Quattro Spyder"; //모델 R8 5.2 콰트로 스파이더
		myCar.color = "Snow White"; //색상 스노우 화이트
		myCar.maxSpeed = 313; //최고 속력 313km/h
		myCar.speed = 0; //속도 0
		
		System.out.println("제작회사 = " + myCar.company); //제작회사 포함 메시지 출력
		System.out.println("모델 = " + myCar.model); //모델 포함 메시지 출력
		System.out.println("색상 = " + myCar.color); //색상 포함 메시지 출력
		System.out.println("최고 속력 = " + myCar.maxSpeed); //최대 속력 포함 메시지 출력
		System.out.println("속도 = " + myCar.speed); //속도 포함 메시지 출력
		
		myCar.speed = 80; //80km/h로 가속 부여
		
		System.out.println("가속도 = " + myCar.speed); //가속도 포함 메시지 출력
	}
}
