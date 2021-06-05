import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class MouseListenerEx extends JFrame
{
	JLabel la = new JLabel("Hello"); // "Hello" 출력용 레이블
	Container c = getContentPane();
	
	public MouseListenerEx()
	{
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c.addMouseListener(new MyMouseListener());
		
		c.setLayout(null);
		la.setSize(50, 20); // 레이블의 크기 50x20 설정
		la.setLocation(30, 30); // 레이블의 위치 (30,30) 설정
		c.add(la);
		
		setSize(200, 200);
		setVisible(true);
	}
	
	class MyMouseListener extends MouseAdapter
	{
		public void mousePressed(MouseEvent e)
		{
			int x = e.getX(); // 마우스의 클릭 좌표 x
			int y = e.getY(); // 마우스의 클릭 좌표 y
			la.setLocation(x, y); // (x,y) 위치로 레이블 이동
			c.setBackground(Color.ORANGE);
		} 
		
		public void mouseReleased(MouseEvent e)
		{
			c.setBackground(Color.PINK);
		}
	}
	
	public static void main(String [] args)
	{
		new MouseListenerEx();
	}
}
