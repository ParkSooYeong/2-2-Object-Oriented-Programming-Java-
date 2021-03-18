import javax.swing.*;
import java.awt.*;
@SuppressWarnings("serial")

public class FlowLayoutEx extends JFrame
{
	FlowLayoutEx()
	{
		setTitle("FlowLayout");
		setSize(300, 200);
		setLocation(500, 400);
		
		Container contentPane = getContentPane();
		
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
		contentPane.add(new JButton("add"));
		contentPane.add(new JButton("sub"));
		contentPane.add(new JButton("mul"));
		contentPane.add(new JButton("div"));
		contentPane.add(new JButton("Calculate"));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new FlowLayoutEx();
	}
}