import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class LabelEx extends JFrame
{
	LabelEx()
	{
		setTitle("JLabel 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel textLabel = new JLabel("재미있는 자바!");
		ImageIcon img = new ImageIcon("images/icon1.png");
		JLabel imageLabel = new JLabel(img);
		
		ImageIcon icon = new ImageIcon("images/icon.gif");
		JLabel label = new JLabel("전화주세요!",icon, SwingConstants.CENTER);
		c.add(textLabel); c.add(imageLabel); c.add(label);
		setSize(500,600);
		setVisible(true);
	}
	
	public static void main(String [] args)
	{
		new LabelEx();
	}
}
