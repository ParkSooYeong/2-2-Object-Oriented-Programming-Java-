import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class MouseListenerEx extends JFrame
{
	JLabel la = new JLabel("Hello"); // "Hello" ��¿� ���̺�
	Container c = getContentPane();
	
	public MouseListenerEx()
	{
		setTitle("Mouse �̺�Ʈ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c.addMouseListener(new MyMouseListener());
		
		c.setLayout(null);
		la.setSize(50, 20); // ���̺��� ũ�� 50x20 ����
		la.setLocation(30, 30); // ���̺��� ��ġ (30,30) ����
		c.add(la);
		
		setSize(200, 200);
		setVisible(true);
	}
	
	class MyMouseListener extends MouseAdapter
	{
		public void mousePressed(MouseEvent e)
		{
			int x = e.getX(); // ���콺�� Ŭ�� ��ǥ x
			int y = e.getY(); // ���콺�� Ŭ�� ��ǥ y
			la.setLocation(x, y); // (x,y) ��ġ�� ���̺� �̵�
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
