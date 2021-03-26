import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
class MyLabel extends JLabel
{
	private int barSize = 0; // ���� ũ��
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
			return; // ũ�Ⱑ 0�̱� ������ �ٸ� �׸� �ʿ� ����
		}
		g.fillRect(0, 0, width, this.getHeight());
	}
	
	synchronized void fill()
	{
		if(barSize == maxBarSize)
		{
			try
			{
				wait(); // ���� ũ�Ⱑ �ִ��̸�, ConsumerThread�� ���� ���� ũ�Ⱑ �پ�鶧���� ���
			}
			
			catch(InterruptedException e)
			{
				return;
			}
		}
		
		barSize++;
		repaint(); // �� �ٽ� �׸���
		notify(); // ��ٸ��� ConsumerThread ������ �����
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
			repaint(); // �� �ٽ� �׸���
			notify(); // ��ٸ��� Ű �̺�Ʈ ������(������) �����
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
