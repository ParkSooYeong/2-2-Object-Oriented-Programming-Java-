import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class RunnableTimerEx extends JFrame
{
	public RunnableTimerEx()
	{
		setTitle("Thread�� ��ӹ��� Ÿ�̸� ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// Ÿ�̸� ���� ����� ���̺� ����
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel);
		
		TimerRunnable runnable = new TimerRunnable(timerLabel);
		Thread th = new Thread(runnable);
		setSize(250,150);
		setVisible(true);
		th.start(); // Ÿ�̸� �������� ������ �����ϰ� �Ѵ�.
	}
	
	public static void main(String[] args)
	{
		new RunnableTimerEx();
	}
}
