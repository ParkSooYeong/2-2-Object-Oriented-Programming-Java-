/* SKU CoE ITE : Object-Oriented Programming 과제4 - 20170910 박수영 */

// 8주차 수업 프로젝트 - 디폴트 패키지

import java.awt.*; // 그래픽 처리를 위한 클래스들의 경로명
import javax.swing.*; // 스윙 컴포넌트 클래스들의 경로명
import java.awt.event.*; // AWT 이벤트 사용을 위한 경로명

@SuppressWarnings("serial") // 컴파일 시 경고를 체크하지 않기 위한 코드
public class Homework4 extends JFrame // JFrame을 상속받는 Homework4 클래스 선언
{
	Container contentPane = getContentPane(); // 프레임의 컨텐트팬을 알아낸다, 전역필드로 사용
	
	public Homework4() // Homework4 기본 생성자
	{
		setTitle("키 누르기 : Homework4"); // 프레임 타이틀 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 윈도우가 닫힐 때 프로그램도 함께 종료한다.
		
		contentPane.setLayout(null); // 특별히 출력할 내용이 없으므로 배치관리자 삭제
		contentPane.addKeyListener(new MyKeyListener()); // Key 이벤트 리스너 달기
		contentPane.setBackground(Color.CYAN); // 컨텐트팬의 초기 색을 옥색으로 설정
		
		setSize(500, 500); // 가로 500, 세로 500 크기로 프레임 크기 설정
		setLocation(100, 100); // 프레임의 출력 위치를 모니터 화면 상 가로 100, 세로 100의 위치로 지정
		setVisible(true); // 프레임이 화면에 나타나도록 지시
		
		// 교재 P.370 Key 이벤트와 KeyListener 참조
		contentPane.setFocusable(true); // 컨텐트팬이 포커스를 받을 수 있도록 설정
		contentPane.requestFocus(); // 컨텐트팬에게 포커스를 주어 키 입력을 받을 수 있게 함
	}
	
	class MyKeyListener implements KeyListener // 내부 클래스로 Key 리스너 작성
	{
		public void keyPressed(KeyEvent keyevent) // 모든 키에 대해 키가 눌러질 때
		{
			if(keyevent.getKeyChar() == 'r') //키 r이 눌러지면 아래 코드를 실행
			{
				contentPane.setBackground(Color.RED); // 컨텐트팬의 색을 적색으로 설정
			}
		}
		
		public void keyReleased(KeyEvent keyevent) // 모든 키에 대해 눌러진 키가 떼어질 때
		{
			contentPane.setBackground(Color.CYAN); // 컨텐트팬의 색을 옥색으로 설정
		}
		
		public void keyTyped(KeyEvent keyevent) {} // 유니코드 키가 입력될 때
	}
	
	public static void main(String [] args) // 메인 메소드 실행 시작
	{
		new Homework4(); // Homework4 객체 생성
	}
}
