import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class TabAndThreadEx extends JFrame
{
	private MyLabel bar = new MyLabel(100);
	public TabAndThreadEx(String title)
	{
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		bar.setBackground(Color.ORANGE);
		bar.setOpaque(true);
		bar.setLocation(20, 20);
		bar.setSize(300 ,20);
		c.add(bar);
		
		c.addKeyListener(new KeyAdapter()
		{
			public void keyPressed(KeyEvent e)
			{
				bar.fill();
			}
		});
		
		setSize(350, 200);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
		ConsumerThread th = new ConsumerThread(bar);
		th.start();
	}
	
	public static void main(String [] args)
	{
		new TabAndThreadEx("�ƹ��ų� ���� ���� �� ä���");
	}
}
