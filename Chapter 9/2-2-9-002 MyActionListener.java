import java.awt.event.*;
import javax.swing.*;

// 독립된 클래스로 이벤트 리스너를 작성한다.

class MyActionListener implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		JButton button = (JButton)e.getSource();
		
		if(button.getText().equals("Action"))
		{
			button.setText("액션");
		}
		else
		{
			button.setText("Action");
		}
	}
}
