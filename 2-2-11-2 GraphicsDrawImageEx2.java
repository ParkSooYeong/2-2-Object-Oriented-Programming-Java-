/* SKU CoE ITE - ParkSooYoung */
/* Grade 2 , Semester 2 , Chapter 11 , Number 2 */

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class GraphicsDrawImageEx2 extends JFrame
{
	public GraphicsDrawImageEx2()
	{
		setTitle("�г��� ũ�⿡ ���߾� �̹��� �׸���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		
		setSize(200, 300);
		setVisible(true);
	}
	
	class MyPanel extends JPanel
	{
		private ImageIcon icon = new ImageIcon("images/image0.jpg"); // �̹��� �ε�
		private Image img = icon.getImage(); // �̹��� ��ü
		
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			
			// �̹����� �г� ũ��� �����Ͽ� �׸���
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
		}
	}
	
	public static void main(String[] args)
	{
		new GraphicsDrawImageEx2();
	}
}
