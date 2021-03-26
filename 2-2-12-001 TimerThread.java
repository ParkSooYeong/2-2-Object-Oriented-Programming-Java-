import javax.swing.*;

class TimerThread extends Thread
{
	private JLabel timerLabel; // Ÿ�̸� ���� ��µǴ� ���̺�
	
	public TimerThread(JLabel timerLabel)
	{
		this.timerLabel = timerLabel;
	}
	
	// ������ �ڵ�. run()�� �����ϸ� ������ ����
	@Override
	public void run()
	{
		int n = 0; // Ÿ�̸� ī��Ʈ ��
		
		while(true) // ���� ����
		{
			timerLabel.setText(Integer.toString(n));
			n++; // ī��Ʈ ����
			
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
