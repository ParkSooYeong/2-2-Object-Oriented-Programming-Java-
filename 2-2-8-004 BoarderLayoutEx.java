import javax.swing.*;
import java.awt.*;
@SuppressWarnings("serial")

public class BoarderLayoutEx extends JFrame
{
	BoarderLayoutEx()
	{
		setTitle("BoarderLayout");
		setSize(300, 200);
		setLocation(500, 400);
		
		Container contentPane = getContentPane();
		
		contentPane.setLayout(new BorderLayout(30, 20));
		contentPane.add(new JButton("add"), BorderLayout.NORTH);
		contentPane.add(new JButton("sub"), BorderLayout.SOUTH);
		contentPane.add(new JButton("mul"), BorderLayout.EAST);
		contentPane.add(new JButton("div"), BorderLayout.WEST);
		contentPane.add(new JButton("Calculate"), BorderLayout.CENTER);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new BoarderLayoutEx();
	}
}