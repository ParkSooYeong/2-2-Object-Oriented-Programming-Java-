/* SKU CoE ITE : Object-Oriented Programming 과제 5.1 - 20170910 박수영 */

import javax.swing.*; // 스윙 컴포넌트 클래스들의 경로명
import java.awt.*; // 그래픽 처리를 위한 클래스들의 경로명

@SuppressWarnings("serial") // 컴파일 시 경고를 체크하지 않기 위한 코드
public class Homework5_1 extends JFrame // JFrame을 상속받는 Homework5_1 클래스 선언
{
	Homework5_1() // 생성자 Homework5_1
	{
		setTitle("20170910 박수영 HW#5_1 : 자동차 그리기"); // 프레임 타이틀 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 윈도우가 닫힐 때 프로그램도 함께 종료한다.
		setContentPane(new MyPanel()); // MyPanel 패널을 컨텐트팬으로 사용
		Container contentPane = getContentPane(); // 프레임의 컨텐트팬을 알아낸다.
		contentPane.setBackground(Color.BLACK); // 검정색 배경 설정
		setSize(500,300); // 프레임 크기 500 x 300
		setVisible(true); // 프레임 출력
	}
	
	class MyPanel extends JPanel // JPanel을 상속받은 패널 MyPanel을 구현한다.
	{
		public void paintComponent(Graphics g) // MyPanel의 내부를 그리는 메소드
		{
			super.paintComponent(g); // JPanel에 구현된 paintComponent() 호출
			g.setColor(Color.ORANGE); // 주황색을 선택한다.
			g.drawLine(0, 200, 500, 200); // 지면
			
			g.setColor(Color.WHITE); // 하얀색을 선택한다.
			g.fillRoundRect(100, 100, 300, 75, 150, 50); // 차 몸체
			g.fillRoundRect(175, 50, 150, 100, 150, 150); // 차 상체
			g.fillArc(160, 150, 50, 50, 180, 180); // 좌측 타이어
			g.fillArc(295, 150, 50, 50, 180, 180); // 우측 타이어
			g.fillArc(382, 122, 33, 33, 270, 180); // 라이트 커버
			g.drawString("Someday I want to go on a drive date with my lover in a car like this...", 60, 240);
			// (60, 240)에 문자열 출력
			
			g.setColor(Color.RED); // 빨간색을 선택한다.
			g.fillRoundRect(20, 140, 80, 10, 40, 13); // 부스터 외부 불꽃
			
			g.setColor(Color.YELLOW); // 노란색을 선택한다.
			g.fillArc(385, 124, 28, 28, 270, 180); // 라이트 코어
			g.drawLine(420, 124, 470, 118); // 빛 줄기 상단
			g.drawLine(420, 138, 470, 138); // 빛 줄기 중단
			g.drawLine(420, 152, 470, 158); // 빛 줄기 중단
			g.fillRoundRect(51, 141, 40, 7, 40, 13); // 부스터 내부 불꽃
			g.fillOval(20, 10, 80, 80); // 달
			
			g.setColor(Color.CYAN); // 하늘색을 선택한다.
			g.fillArc(188, 60, 125, 75, 0, 180); // 창문
			
			g.setColor(Color.BLACK); // 검정색을 선택한다.
			g.fillArc(170, 160, 30, 30, 180, 180); // 좌측 휠
			g.fillArc(305, 160, 30, 30, 180, 180); // 우측 휠
			g.drawLine(250, 60, 250, 175); // 차 문 세로선
			g.drawLine(175, 102, 325, 102); // 차 문 가로선
			g.fillOval(240, 110, 5, 5); // 뒷 좌석 손잡이
			g.fillOval(255, 110, 5, 5); // 앞 좌석 손잡이
			g.drawOval(140, 110, 40, 40); // BMW 로고 내부 테두리
			g.drawOval(137, 107, 46, 46); // BMW 로고 외부 테두리
			g.fillOval(40, 10, 60, 60); // 달 그림자
			
			g.setColor(Color.GRAY); // 회색을 선택한다.
			g.fillRect(85, 140, 15, 10); // 배기구
			
			g.setColor(Color.BLUE); // 파란색을 선택한다.
			g.fillArc(140, 110, 40, 40, 90, 90); // BMW 로고 제2사분면 방향 색상
			g.fillArc(140, 110, 40, 40, 270, 90); // BMW 로고 제4사분면 방향 색상
		}
	}
	
	public static void main(String [] args) //main() 메소드에서 실행 시작
	{
		new Homework5_1(); // Homework5_1 객체 생성
	}
}
