import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class PlusMinusImageFrame extends JFrame
{
	public PlusMinusImageFrame()
	{
		super("�׷��� �̹��� 10% Ȯ�� ���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(new MyPanel());
		setSize(300,300);
		setVisible(true);
		
		getContentPane().setFocusable(true); // ������Ʈ�� ��Ŀ���� ���� �� �ֵ��� ����
		getContentPane().requestFocus(); // ������Ʈ�� ��Ŀ�� ����
	}
	
	class MyPanel extends JPanel
	{
		private ImageIcon icon = new ImageIcon("images/apple.jpg");
		private Image img = icon.getImage();
		private double width;
		private double height;
		
		public MyPanel()
		{
			width = img.getWidth(this);
			height = img.getHeight(this);
			addKeyListener(new KeyAdapter()
			{
				public void keyPressed(KeyEvent e)
				{
					if(e.getKeyChar() == '+')
					{
						width = width*1.1;
						height = height*1.1;
						repaint();
					}
					else if(e.getKeyChar() == '-')
					{
						if(width*0.9 < 1 || height*0.9 < 1)
						{
							return; // 1���� �۰� �Ǵ� ���� ���� ������ �ʰ� �Ǵ� ���� ����
						}
						
						width = width*0.9;
						height = height*0.9;
						repaint();
					}
				}
			});
		}
		
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			g.drawImage(img, 10, 10, (int)width, (int)height, this);
		}
	}
	
	public static void main(String [] args)
	{
		new PlusMinusImageFrame();
	}
}
