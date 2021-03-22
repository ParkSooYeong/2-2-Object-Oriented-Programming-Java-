import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class MenuActionEventEx extends JFrame
{
	JLabel imgLabel = new JLabel(); // �� ���̺�
	
	MenuActionEventEx()
	{
		setTitle("Menu�� Action ������ ����� ����");
		createMenu();
		getContentPane().add(imgLabel, BorderLayout.CENTER);
		setSize(500, 400); setVisible(true);
	}
	
	void createMenu()
	{
		JMenuBar mb = new JMenuBar(); //�޴��� ����
		JMenu screenMenu = new JMenu("Screen");
		JMenuItem [] menuItem = new JMenuItem [4];
		String [] itemTitle = {"Load", "Hide", "ReShow", "Exit"};
		
		MenuActionListener listener = new MenuActionListener();
		for(int i=0; i<menuItem.length; i++)
		{
			menuItem[i] = new JMenuItem(itemTitle[i]);
			menuItem[i].addActionListener(listener);
			screenMenu.add(menuItem[i]);
		}
		
		mb.add(screenMenu);
		setJMenuBar(mb); // �޴��ٸ� �����ӿ� ����
	}
	
	class MenuActionListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String cmd = e.getActionCommand();
			switch(cmd) //�޴� �������� ���� ����
			{
			case "Load" :
				if(imgLabel.getIcon() != null)
				{
					return;
				}
				imgLabel.setIcon(new ImageIcon("images/img.jpg"));
				break;
			case "Hide" :
				imgLabel.setVisible(false);
				break;
			case "ReShow" :
				imgLabel.setVisible(true);
				break;
			case "Exit" :
				System.exit(0);
				break;
			}
		}
	}
	
	public static void main(String [] args)
	{
		new MenuActionEventEx();
	}
}
