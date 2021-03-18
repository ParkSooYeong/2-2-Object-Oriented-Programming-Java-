package gui_EX;
import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class WindowEx1 extends JFrame
{
	WindowEx1()
	{
		setTitle("Hello, Java"); //title
		setSize(300,300); //프레임 크기 300x300
		setVisible(true); //프레임 출력
		
		Container contentPane = getContentPane();
		JLabel label = new JLabel("Hello, Java");
		contentPane.add(label);
	}
	
	public static void main(String[] args)
	{
		WindowEx1 frame = new WindowEx1();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
