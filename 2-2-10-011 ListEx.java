import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class ListEx extends JFrame
{
	ListEx()
	{
		setTitle("리스트 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		String [] fruits = {"apple", "banana", "kiwi", "mango", "pear", "peach", "berry", "strawberry", "blackberry"};
		
		JList<String> strList = new JList<String>(fruits);
		c.add(strList);
		
		JList<String> scrollList = new JList<String>(fruits);
		c.add(new JScrollPane(scrollList));
		setSize(300,300); setVisible(true);
	}
	
	public static void main(String [] args)
	{
		new ListEx();
	}
}
