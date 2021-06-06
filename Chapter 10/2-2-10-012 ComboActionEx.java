import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class ComboActionEx extends JFrame
{
	String [] fruits = {"apple", "banana", "mango"};
	ImageIcon [] img = {new ImageIcon("images/apple.jpg"),
			new ImageIcon("images/banana.jpg"), new ImageIcon("images/mango.jpg")};
	JLabel imgLabel = new JLabel(img[0]);
	
	ComboActionEx()
	{
		setTitle("ÄÞº¸¹Ú½º È°¿ë ¿¹Á¦");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JComboBox<String> combo = new JComboBox<String>(fruits);
		c.add(combo); c.add(imgLabel);
		
		combo.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				@SuppressWarnings("unchecked")
				JComboBox<String> cb = (JComboBox<String>)e.getSource();
				int index = cb.getSelectedIndex();
				imgLabel.setIcon(img[index]);
			}
		});
		
		setSize(300, 250);
		setVisible(true);
	}
	
	public static void main(String [] args)
	{
		new ComboActionEx();
	}
}
