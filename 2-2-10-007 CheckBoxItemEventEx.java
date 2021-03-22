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
		setTitle("üũ�ڽ��� ItemEvent ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("��� 100��, �� 500��, ü�� 20000��"));
		MyItemListener listener = new MyItemListener();
		
		apple = new JCheckBox("���");
		pear = new JCheckBox("��");
		cherry = new JCheckBox("ü��");
		
		//apple.setBorderPainted(true);
		
		c.add(apple); c.add(pear); c.add(cherry);
		
		apple.addItemListener(listener);
		pear.addItemListener(listener);
		cherry.addItemListener(listener);
		
		sumLabel = new JLabel("���� 0 �� �Դϴ�.");
		c.add(sumLabel); setSize(250,200); setVisible(true);
	}
	
	class MyItemListener implements ItemListener
	{
		int sum = 0; // ������ ��
		
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
			
			sumLabel.setText("���� " + sum + "�� �Դϴ�.");
		}
	}
	
	public static void main(String [] args)
	{
		new CheckBoxItemEventEx();
	}
}
