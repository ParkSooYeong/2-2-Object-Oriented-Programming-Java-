/* SKU CoE ITE : Object-Oriented Programming 과제 5.2 - 20170910 박수영 */

import javax.swing.*; // 스윙 컴포넌트 클래스들의 경로명
import java.awt.*; // 그래픽 처리를 위한 클래스들의 경로명

@SuppressWarnings("serial") // 컴파일 시 경고를 체크하지 않기 위한 코드
public class Homework5_2 extends JFrame // JFrame을 상속받는 Homework5_2 클래스 선언
{
	Homework5_2() // 생성자 Homework5_2
	{
		setTitle("20170910 박수영 HW#5_2 : 눈사람 그리기"); // 프레임 타이틀 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 윈도우가 닫힐 때 프로그램도 함께 종료한다.
		setContentPane(new MyPanel()); // MyPanel 패널을 컨텐트팬으로 사용
		setSize(400,550); // 프레임 크기 400 x 550
		setVisible(true); // 프레임 출력
	}
	
	class MyPanel extends JPanel // JPanel을 상속받은 패널 MyPanel을 구현한다.
	{
		public void paintComponent(Graphics g) // MyPanel의 내부를 그리는 메소드
		{
			super.paintComponent(g); // JPanel에 구현된 paintComponent() 호출
			g.setColor(Color.CYAN); // 하늘색을 선택한다.
			int []x = {160, 120, 160, 240, 280, 240}; // 얼굴 x좌표
			int []y = {50, 130, 230, 230, 130, 50}; // 얼굴 y좌표
			g.fillPolygon(x, y, 6); // 얼굴
			g.fillRoundRect(140, 230, 120, 60, 50, 50); // 상체
			g.fillRoundRect(130, 290, 140, 100, 60, 60); // 하체
			g.fillRoundRect(145, 385, 40, 40, 20, 20); // 왼쪽 발
			g.fillRoundRect(215, 385, 40, 40, 20, 20); // 오른쪽 발
			
			g.setColor(Color.ORANGE); // 주황색을 선택한다.
			int []a = {200, 100, 200}; // 코 x좌표
			int []b = {110, 130, 150}; // 코 y좌표
			g.fillPolygon(a, b, 3); //코
			
			g.setColor(Color.WHITE); // 하얀색을 선택한다.
			g.fillOval(156, 58, 38, 38); // 왼쪽 눈
			g.fillOval(206, 58, 38, 38); // 오른쪽 눈
			g.fillArc(150, 79, 100, 140, 180, 180); // 아랫 입술
			
			g.setColor(Color.CYAN); // 하늘색을 선택한다.
			g.fillArc(150, 115, 100, 60, 180, 180); // 윗 입술
			g.fillRoundRect(180, 165, 40, 25, 10, 10); // 앞니
			
			g.setColor(Color.BLACK); // 검정색을 선택한다.
			g.drawArc(155, 55, 40, 40, 0, 180); // 왼쪽 눈썹
			g.drawArc(205, 55, 40, 40, 0, 180); // 오른쪽 눈썹
			int []c = {190, 180, 200, 220, 210}; // 상체 단추 x좌표
			int []d = {245, 265, 275, 255, 245}; // 상체 단추 y좌표
			g.fillPolygon(c, d, 5); // 상체 단추
			int []e = {190, 180, 200, 220, 210}; // 상체 단추 x좌표
			int []f = {305, 325, 335, 325, 305}; // 상체 단추 y좌표
			g.fillPolygon(e, f, 5); // 상체 단추
			int []h = {190, 185, 210, 215, 210}; // 상체 단추 x좌표
			int []i = {345, 375, 375, 365, 350}; // 상체 단추 y좌표
			g.fillPolygon(h, i, 5); // 상체 단추
			g.fillOval(163, 65, 23, 23); // 왼쪽 눈동자
			g.fillOval(213, 65, 23, 23); // 오른쪽 눈동자
			g.drawArc(150, 25, 30, 50, 0, 90); // 왼쪽 머리카락
			g.drawArc(180, 5, 20, 90, 0, 90); // 중간 머리카락
			g.drawArc(220, 15, 25, 70, 90, 90); // 오른쪽 머리카락
			g.drawLine(140, 250, 70, 350); // 왼쪽 팔
			g.drawLine(260, 250, 330, 350); // 왼쪽 팔
			
			g.setColor(Color.WHITE); // 하얀색을 선택한다.
			g.fillOval(165, 70, 8, 8); // 왼쪽 눈동자 생기
			g.fillOval(215, 70, 8, 8); // 오른쪽 눈동자 생기
			
			g.setColor(Color.MAGENTA); // 마젠타색을 선택한다.
			g.setFont(new Font("Jokerman", Font.ITALIC, 21)); // 설정한 폰트 및 크기로 출력
			g.drawString("Do You Want to Build a Snowman~?", 10, 470); // (10, 470)에 문자열 출력
		}
	}
	
	public static void main(String [] args) //main() 메소드에서 실행 시작
	{
		new Homework5_2(); // Homework5_2 객체 생성
	}
}
