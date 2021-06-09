import javax.swing.*;

public class TimerRunnable implements Runnable
{
	private JLabel timerLabel; // 타이머 값이 출력되는 레이블
	
	public TimerRunnable(JLabel timerLabel)
	{
		this.timerLabel = timerLabel;
	}
	
	// 스레드 코드. run()이 종료하면 스레드 종료
	@Override
	public void run()
	{
		int n = 0; // 타이머 카운트 값
		
		while(true) // 무한 루프
		{
			timerLabel.setText(Integer.toString(n));
			n++; // 카운트 증가
			
			try
			{
				Thread.sleep(1000);
			}
			
			catch(InterruptedException e)
			{
				return;
			}
		}
	}
}
