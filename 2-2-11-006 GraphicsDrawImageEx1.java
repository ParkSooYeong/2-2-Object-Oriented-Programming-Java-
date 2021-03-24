import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class GraphicsDrawImageEx1 extends JFrame
{
	GraphicsDrawImageEx1()
	{
		setTitle("���� ũ��� ���ϴ� ��ġ�� �̹��� �׸���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		setSize(300,400);
		setVisible(true);
	}
	
	class MyPanel extends JPanel
	{
		ImageIcon icon = new ImageIcon("images/image0.jpg");
		Image img = icon.getImage();
		
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			//g.drawImage(img, 20, 20, this);
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
		}
	}
	
	public static void main(String [] args)
	{
		new GraphicsDrawImageEx1();
	}
}
