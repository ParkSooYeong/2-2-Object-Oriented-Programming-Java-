import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class Final extends JFrame
{
	Final()
	{
		setTitle("�׽�Ʈ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.LEFT));
		c.setSize(500,500);
		c.setVisible(true);
		c.setLocation(500,500);
		
		JTextField text = new JTextField("�׽�Ʈ�Դϴ�");
		text.getText();
	}
	
	public static void main(String [] args)
	{
		new Final();
	}
}
