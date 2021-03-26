import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
class MyLabel extends JLabel
{
	private int barSize = 0; // 바의 크기
	private int maxBarSize;
	
	public MyLabel(int maxBarSize)
	{
		this.maxBarSize = maxBarSize;
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(Color.MAGENTA);
		int width = (int) (((double)(getWidth()))/maxBarSize*barSize);
		if(width == 0)
		{
			return; // 크기가 0이기 때문에 바를 그릴 필요 없음
		}
		g.fillRect(0, 0, width, this.getHeight());
	}
	
	synchronized void fill()
	{
		if(barSize == maxBarSize)
		{
			try
			{
				wait(); // 바의 크기가 최대이면, ConsumerThread에 의해 바의 크기가 줄어들때까지 대기
			}
			
			catch(InterruptedException e)
			{
				return;
			}
		}
		
		barSize++;
		repaint(); // 바 다시 그리기
		notify(); // 기다리는 ConsumerThread 스레드 깨우기
	}
	
	synchronized void consume()
	{
		if(barSize == 0)
		{
			try
			{
				wait();
			}
			
			catch(InterruptedException e)
			{
				return;
			}
			
			barSize--;
			repaint(); // 바 다시 그리기
			notify(); // 기다리는 키 이벤트 리스너(스레드) 깨우기
		}
	}
}

class ConsumerThread extends Thread
{
	private MyLabel bar;
	
	public ConsumerThread(MyLabel bar)
	{
		this.bar = bar;
	}
	
	@Override
	public void run()
	{
		while(true)
		{
			try
			{
				sleep(200);
				bar.consume();
			}
			
			catch(InterruptedException e)
			{
				return;
			}
		}
	}
}
