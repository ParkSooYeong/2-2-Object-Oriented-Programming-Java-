import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class LabelEx extends JFrame
{
	LabelEx()
	{
		setTitle("JLabel ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel textLabel = new JLabel("����ִ� �ڹ�!");
		ImageIcon img = new ImageIcon("images/icon1.png");
		JLabel imageLabel = new JLabel(img);
		
		ImageIcon icon = new ImageIcon("images/icon.gif");
		JLabel label = new JLabel("��ȭ�ּ���!",icon, SwingConstants.CENTER);
		c.add(textLabel); c.add(imageLabel); c.add(label);
		setSize(500,600);
		setVisible(true);
	}
	
	public static void main(String [] args)
	{
		new LabelEx();
	}
}
