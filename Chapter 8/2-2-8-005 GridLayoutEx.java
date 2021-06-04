import javax.swing.*;
import java.awt.*;
@SuppressWarnings("serial")

public class GridLayoutEx extends JFrame
{
	GridLayoutEx()
	{
		setTitle("GridLayout");
		setSize(300, 200);
		setLocation(500, 400);
		
		Container contentPane = getContentPane();
		
		contentPane.setLayout(new GridLayout(4, 3));
		contentPane.add(new JButton("1"));
		contentPane.add(new JButton("2"));
		contentPane.add(new JButton("3"));
		contentPane.add(new JButton("4"));
		contentPane.add(new JButton("5"));
		contentPane.add(new JButton("6"));
		contentPane.add(new JButton("7"));
		contentPane.add(new JButton("8"));
		contentPane.add(new JButton("9"));
		contentPane.add(new JButton("*"));
		contentPane.add(new JButton("0"));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new GridLayoutEx();
	}
}
