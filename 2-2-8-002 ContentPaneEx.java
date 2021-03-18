package gui_EX;
import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class ContentPaneEx extends JFrame
{
	ContentPaneEx()
	{
		setTitle("ContetnPane�� JFrame"); //�������� Ÿ��Ʋ �ޱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane(); //����Ʈ�� ��������
		contentPane.setBackground(Color.ORANGE); //����Ʈ�ҿ� FlowLayout
		contentPane.setLayout(new FlowLayout());
		
		JButton btnOK = new JButton("OK");
		btnOK.setBackground(Color.PINK);
		contentPane.add(btnOK);
		JButton btnC = new JButton("Cancle");
		btnC.setBackground(Color.GREEN);
		contentPane.add(btnC);
		JButton btnI = new JButton("Ignore");
		btnI.setBackground(Color.BLUE);
		contentPane.add(btnI);
		
		setSize(300,150); //������ ũ�� 300x150 ����
		setVisible(true); //ȭ�鿡 ������ ���
	}
	
	public static void main(String[] args)
	{
		new ContentPaneEx();
	}
}
