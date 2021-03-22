import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class ImageCheckBoxEx extends JFrame
{
	ImageCheckBoxEx()
	{
		setTitle("체크박스 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		ImageIcon img_a = new ImageIcon("images/apple.png");
		ImageIcon img_p = new ImageIcon("images/pear.png");
		ImageIcon img_c = new ImageIcon("images/cherry.png");
		
		// 3개의 체크박스를 생성한다.
		JCheckBox apple = new JCheckBox("사과", img_a);
		JCheckBox pear = new JCheckBox("배", img_p, true);
		JCheckBox cherry = new JCheckBox("체리", img_c);
		
		apple.setBorderPainted(true);
		pear.setBorderPainted(true);
		cherry.setBorderPainted(true);
		
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		setSize(600,200);
		setVisible(true);
	}
	
	public static void main(String [] args)
	{
		new ImageCheckBoxEx();
	}
}
