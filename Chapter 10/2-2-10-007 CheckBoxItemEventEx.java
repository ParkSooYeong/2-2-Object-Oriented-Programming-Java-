import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class CheckBoxItemEventEx extends JFrame
{
	JCheckBox apple, pear, cherry;
	JLabel sumLabel;
	
	CheckBoxItemEventEx()
	{
		setTitle("체크박스와 ItemEvent 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("사과 100원, 배 500원, 체리 20000원"));
		MyItemListener listener = new MyItemListener();
		
		apple = new JCheckBox("사과");
		pear = new JCheckBox("배");
		cherry = new JCheckBox("체리");
		
		//apple.setBorderPainted(true);
		
		c.add(apple); c.add(pear); c.add(cherry);
		
		apple.addItemListener(listener);
		pear.addItemListener(listener);
		cherry.addItemListener(listener);
		
		sumLabel = new JLabel("현재 0 원 입니다.");
		c.add(sumLabel); setSize(250,200); setVisible(true);
	}
	
	class MyItemListener implements ItemListener
	{
		int sum = 0; // 가격의 합
		
		public void itemStateChanged(ItemEvent e)
		{
			if(e.getStateChange() == ItemEvent.SELECTED)
			{
				if(e.getItem() == apple)
				{
					sum += 100;
				}
				else if(e.getItem() == pear)
				{
					sum += 500;
				}
				else
				{
					sum += 20000;
				}
			}
			else
			{
				if(e.getItem() == apple)
				{
					sum -= 100;
				}
				else if(e.getItem() == pear)
				{
					sum -= 500;
				}
				else
				{
					sum -= 20000;
				}
			}
			
			sumLabel.setText("현재 " + sum + "원 입니다.");
		}
	}
	
	public static void main(String [] args)
	{
		new CheckBoxItemEventEx();
	}
}
