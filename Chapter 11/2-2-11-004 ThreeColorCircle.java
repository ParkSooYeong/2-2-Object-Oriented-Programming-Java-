import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class ThreeColorCircle extends JFrame
{
	public ThreeColorCircle()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		setSize(200,200);
		setVisible(true);
	}
	
	class MyPanel extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			g.setColor(Color.RED); // »¡°£»öÀ» ¼±ÅÃÇÑ´Ù.
			g.fillArc(30, 30, 100, 100, 90, 120);
			g.setColor(Color.BLUE);
			g.fillArc(30, 30, 100, 100, 210, 120);
			g.setColor(Color.YELLOW);
			g.fillArc(30, 30, 100, 100, 330, 120);
		}
	}
	
	public static void main(String [] args)
	{
		new ThreeColorCircle();
	}
}
