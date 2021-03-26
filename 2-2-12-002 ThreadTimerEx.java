import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class ThreadTimerEx extends JFrame
{
	public ThreadTimerEx()
	{
		setTitle("Thread�� ��ӹ��� Ÿ�̸� ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// Ÿ�̸� ���� ����� ���̺� ����
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel);
		
		TimerThread th = new TimerThread(timerLabel);
		setSize(250,150);
		setVisible(true);
		th.start(); // Ÿ�̸� �������� ������ �����ϰ� �Ѵ�.
	}
	
	public static void main(String[] args)
	{
		new ThreadTimerEx();
	}
}
