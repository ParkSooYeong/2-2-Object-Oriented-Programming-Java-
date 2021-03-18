package gui_EX;
import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class ContentPaneEx extends JFrame
{
	ContentPaneEx()
	{
		setTitle("ContetnPane과 JFrame"); //프레임의 타이틀 달기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane(); //컨텐트팬 가져오기
		contentPane.setBackground(Color.ORANGE); //컨텐트팬에 FlowLayout
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
		
		setSize(300,150); //프레임 크기 300x150 설정
		setVisible(true); //화면에 프레임 출력
	}
	
	public static void main(String[] args)
	{
		new ContentPaneEx();
	}
}
