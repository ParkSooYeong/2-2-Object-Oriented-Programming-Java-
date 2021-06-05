import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class IndepClassListener extends JFrame
{
	IndepClassListener()
	{
		setTitle("Action ÀÌº¥Æ® ¸®½º³Ê ¿¹Á¦");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		
		btn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();
				
				if(b.getText().equals("Action"))
				{
					b.setText("¾×¼Ç");
				}
				else
				{
					b.setText("Action");
				}
				
				setTitle(b.getText());
			}
		});
		
		container.add(btn);
		setSize(250, 120);
		setVisible(true);
	}
	
	public static void main(String [] args)
	{
		new IndepClassListener();
	}
}
