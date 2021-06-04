import javax.swing.*;
import java.awt.*;
@SuppressWarnings("serial")

public class GridLayoutEx2 extends JFrame
{
	public GridLayoutEx2()
	{
		setTitle("GridLayout Sample");
		setSize(300, 200);
		setLocation(500, 400);
		
		GridLayout grid = new GridLayout(4,2,0,5);
		
		Container c = getContentPane();
		
		c.setLayout(grid);
		c.add(new JLabel("ÀÌ¸§"));
		c.add(new JTextField(""));
		c.add(new JLabel("ÇÐ¹ø"));
		c.add(new JTextField(""));
		c.add(new JLabel("ÇÐ°ú"));
		c.add(new JTextField(""));
		c.add(new JLabel("°ú¸ñ"));
		c.add(new JTextField(""));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new GridLayoutEx2();
	}
}
