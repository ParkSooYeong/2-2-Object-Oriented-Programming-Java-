import java.awt.event.*;
import javax.swing.*;

// ������ Ŭ������ �̺�Ʈ �����ʸ� �ۼ��Ѵ�.

class MyActionListener implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		JButton button = (JButton)e.getSource();
		
		if(button.getText().equals("Action"))
		{
			button.setText("�׼�");
		}
		else
		{
			button.setText("Action");
		}
	}
}
