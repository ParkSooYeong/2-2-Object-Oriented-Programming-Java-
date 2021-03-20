import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class KeyPlusMinus extends JFrame
{
	private JLabel label = new JLabel("Love Java");
	
	public KeyPlusMinus()
	{
		setTitle("+, - 키로 폰트 크기 조절");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		label.setFont(new Font("TimesRoman", Font.PLAIN, 10)); // 10 픽셀 크기
		
		label.addKeyListener(new MyKeyAdapter());
		
		c.add(label);
		setSize(350, 250);
		setVisible(true);
		
		label.setFocusable(true);
		label.requestFocus();
	}
	
	class MyKeyAdapter extends KeyAdapter
	{
		public void keypressed(KeyEvent e)
		{
			if(e.getKeyChar() == '+')
			{
				JLabel la = (JLabel)e.getSource();
				Font f = la.getFont();
				int size = f.getSize();
				la.setFont(new Font("TimesRoman", Font.PLAIN, size+5));
			}
			else if(e.getKeyChar() == '-')
			{
				JLabel la = (JLabel)e.getSource();
				Font f = la.getFont();
				int size = f.getSize();
				if(size <= 5)
				{
					return;
				}
				la.setFont(new Font("TimesRoman", Font.PLAIN, size-5));
			}
		}
	}
	
	public static void main(String[] args)
	{
		new KeyPlusMinus();
	}
}
