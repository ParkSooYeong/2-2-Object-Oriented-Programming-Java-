import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class RunnableTimerEx extends JFrame
{
	public RunnableTimerEx()
	{
		setTitle("Thread를 상속받은 타이머 스레드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// 타이머 값을 출력할 레이블 생성
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel);
		
		TimerRunnable runnable = new TimerRunnable(timerLabel);
		Thread th = new Thread(runnable);
		setSize(250,150);
		setVisible(true);
		th.start(); // 타이머 스레드의 실행을 시작하게 한다.
	}
	
	public static void main(String[] args)
	{
		new RunnableTimerEx();
	}
}
