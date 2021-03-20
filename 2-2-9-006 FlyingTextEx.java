import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class FlyingTextEx extends JFrame
{
	private JLabel la = new JLabel("HELLO");
	
	FlyingTextEx()
	{
		super("��,��,��,�� Ű�� �̿��Ͽ� �ؽ�Ʈ �����̱�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane(); // ����Ʈ�� �˾Ƴ���
		c.setLayout(null);
		c.addKeyListener(new MyKeyListener()); // Ű ������ �ޱ�
		la.setLocation(50, 50);
		la.setSize(100, 20);
		c.add(la);
		setSize(300, 300);
		setVisible(true);
		c.setFocusable(true); // ����Ʈ���� ��Ŀ���� ���� �� �ֵ��� ����
		c.requestFocus(); // ����Ʈ�ҿ� ��Ŀ�� ����. Ű �Է� ��������
	}
	
	class MyKeyListener extends KeyAdapter
	{
		public void keyPressed(KeyEvent e)
		{
			int keyCode = e.getKeyCode(); // �Էµ� Ű�ڵ�
			
			switch(keyCode)
			{
				case KeyEvent.VK_UP:
					la.setLocation(la.getX(), la.getY() - 10);
					break;
				case KeyEvent.VK_DOWN:
					la.setLocation(la.getX(), la.getY() + 10);
					break;
				case KeyEvent.VK_LEFT:
					la.setLocation(la.getX() - 10, la.getY());
					break;
				case KeyEvent.VK_RIGHT:
					la.setLocation(la.getX() + 10, la.getY());
					break;
				case KeyEvent.VK_Q:
					System.exit(0);
			}
		}
	}
	
	public static void main(String[] args)
	{
		new FlyingTextEx();
	}
}
