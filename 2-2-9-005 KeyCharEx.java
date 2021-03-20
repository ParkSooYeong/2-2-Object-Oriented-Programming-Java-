import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class KeyCharEx extends JFrame
{
	private JLabel la = new JLabel("<Enter> Ű�� ������ �ٲ�ϴ�.");
	
	KeyCharEx()
	{
		super("KeyListener�� ���� Ű �Է� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane(); // ����Ʈ�� �˾Ƴ���
		c.setLayout(new FlowLayout());
		c.add(la);
		c.addKeyListener(new MyKeyListener()); // Ű ������ �ޱ�
		setSize(250, 250);
		setVisible(true);
		
		c.setFocusable(true); // ����Ʈ���� ��Ŀ���� ���� �� �ֵ��� ����
		c.requestFocus(); // ����Ʈ�ҿ� ��Ŀ�� ����. Ű �Է� ��������
	}
	
	class MyKeyListener extends KeyAdapter
	{
		public void keyPressed(KeyEvent e)
		{
			// ������ ���� ����� ���� �����ϰ� r, b, g ���� ����
			int r = (int) (Math.random() * 256); // red ����
			int g = (int) (Math.random() * 256); // green ����
			int b = (int) (Math.random() * 256); // blue ����
			
			switch(e.getKeyChar()) // �Էµ� Ű ����
			{
				case '\n': // <Enter> Ű �Է�
					la.setText("r = " + r + "g = " + g + "b = " + b);
					getContentPane().setBackground(new Color(r, g, b));
					break;
				case 'q':
					System.exit(0);
				case 'd':
					la.setVisible(false);
					break;
			}
		}
	}
	
	public static void main(String[] args)
	{
		new KeyCharEx();
	}
}
