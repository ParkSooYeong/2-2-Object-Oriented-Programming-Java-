/* SKU CoE ITE - ParkSooYoung */
/* Grade 2 , Semester 2 , Chapter 10 , Number 1 */

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class TextFieldEx extends JFrame
{
	public TextFieldEx()
	{
		setTitle("텍스트필드 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("이름 "));
		c.add(new JTextField(20)); // 창의 열 개수 20
		c.add(new JLabel("학과 "));
		c.add(new JTextField("정보통신공학부", 20)); // 창의 열 개수 20
		c.add(new JLabel("주소 "));
		c.add(new JTextField("서울시 ...", 20)); // 창의 열 개수 20
		
		setSize(300,150);
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new TextFieldEx();
	}
}
