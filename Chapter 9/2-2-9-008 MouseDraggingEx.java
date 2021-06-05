import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class MouseDraggingEx extends JFrame
{
	public MouseDraggingEx()
	{
		super("µå·¡±ëµ¿¾È YELLOW·Î º¯°æ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setBackground(Color.GREEN);
		
		MyMouseListener ml = new MyMouseListener();
		c.addMouseMotionListener(ml);
		c.addMouseListener(ml);
		setSize(350, 250);
		setVisible(true);
	}
	
	class MyMouseListener extends MouseAdapter implements MouseMotionListener
	{
		public void mouseDragged(MouseEvent e)
		{
			Container c = (Container)e.getSource();
			c.setBackground(Color.YELLOW);
		}
		
		public void mouseMoved(MouseEvent e) {}
		
		public void mouseReleased(MouseEvent e)
		{
			Container c = (Container)e.getSource();
			c.setBackground(Color.GREEN);
		}
	}
	
	public static void main(String[] args)
	{
		new MouseDraggingEx();
	}
}
