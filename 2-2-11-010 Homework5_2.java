/* SKU CoE ITE : Object-Oriented Programming ���� 5.2 - 20170910 �ڼ��� */

import javax.swing.*; // ���� ������Ʈ Ŭ�������� ��θ�
import java.awt.*; // �׷��� ó���� ���� Ŭ�������� ��θ�

@SuppressWarnings("serial") // ������ �� ��� üũ���� �ʱ� ���� �ڵ�
public class Homework5_2 extends JFrame // JFrame�� ��ӹ޴� Homework5_2 Ŭ���� ����
{
	Homework5_2() // ������ Homework5_2
	{
		setTitle("20170910 �ڼ��� HW#5_2 : ����� �׸���"); // ������ Ÿ��Ʋ ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ������ �����찡 ���� �� ���α׷��� �Բ� �����Ѵ�.
		setContentPane(new MyPanel()); // MyPanel �г��� ����Ʈ������ ���
		setSize(400,550); // ������ ũ�� 400 x 550
		setVisible(true); // ������ ���
	}
	
	class MyPanel extends JPanel // JPanel�� ��ӹ��� �г� MyPanel�� �����Ѵ�.
	{
		public void paintComponent(Graphics g) // MyPanel�� ���θ� �׸��� �޼ҵ�
		{
			super.paintComponent(g); // JPanel�� ������ paintComponent() ȣ��
			g.setColor(Color.CYAN); // �ϴû��� �����Ѵ�.
			int []x = {160, 120, 160, 240, 280, 240}; // �� x��ǥ
			int []y = {50, 130, 230, 230, 130, 50}; // �� y��ǥ
			g.fillPolygon(x, y, 6); // ��
			g.fillRoundRect(140, 230, 120, 60, 50, 50); // ��ü
			g.fillRoundRect(130, 290, 140, 100, 60, 60); // ��ü
			g.fillRoundRect(145, 385, 40, 40, 20, 20); // ���� ��
			g.fillRoundRect(215, 385, 40, 40, 20, 20); // ������ ��
			
			g.setColor(Color.ORANGE); // ��Ȳ���� �����Ѵ�.
			int []a = {200, 100, 200}; // �� x��ǥ
			int []b = {110, 130, 150}; // �� y��ǥ
			g.fillPolygon(a, b, 3); //��
			
			g.setColor(Color.WHITE); // �Ͼ���� �����Ѵ�.
			g.fillOval(156, 58, 38, 38); // ���� ��
			g.fillOval(206, 58, 38, 38); // ������ ��
			g.fillArc(150, 79, 100, 140, 180, 180); // �Ʒ� �Լ�
			
			g.setColor(Color.CYAN); // �ϴû��� �����Ѵ�.
			g.fillArc(150, 115, 100, 60, 180, 180); // �� �Լ�
			g.fillRoundRect(180, 165, 40, 25, 10, 10); // �մ�
			
			g.setColor(Color.BLACK); // �������� �����Ѵ�.
			g.drawArc(155, 55, 40, 40, 0, 180); // ���� ����
			g.drawArc(205, 55, 40, 40, 0, 180); // ������ ����
			int []c = {190, 180, 200, 220, 210}; // ��ü ���� x��ǥ
			int []d = {245, 265, 275, 255, 245}; // ��ü ���� y��ǥ
			g.fillPolygon(c, d, 5); // ��ü ����
			int []e = {190, 180, 200, 220, 210}; // ��ü ���� x��ǥ
			int []f = {305, 325, 335, 325, 305}; // ��ü ���� y��ǥ
			g.fillPolygon(e, f, 5); // ��ü ����
			int []h = {190, 185, 210, 215, 210}; // ��ü ���� x��ǥ
			int []i = {345, 375, 375, 365, 350}; // ��ü ���� y��ǥ
			g.fillPolygon(h, i, 5); // ��ü ����
			g.fillOval(163, 65, 23, 23); // ���� ������
			g.fillOval(213, 65, 23, 23); // ������ ������
			g.drawArc(150, 25, 30, 50, 0, 90); // ���� �Ӹ�ī��
			g.drawArc(180, 5, 20, 90, 0, 90); // �߰� �Ӹ�ī��
			g.drawArc(220, 15, 25, 70, 90, 90); // ������ �Ӹ�ī��
			g.drawLine(140, 250, 70, 350); // ���� ��
			g.drawLine(260, 250, 330, 350); // ���� ��
			
			g.setColor(Color.WHITE); // �Ͼ���� �����Ѵ�.
			g.fillOval(165, 70, 8, 8); // ���� ������ ����
			g.fillOval(215, 70, 8, 8); // ������ ������ ����
			
			g.setColor(Color.MAGENTA); // ����Ÿ���� �����Ѵ�.
			g.setFont(new Font("Jokerman", Font.ITALIC, 21)); // ������ ��Ʈ �� ũ��� ���
			g.drawString("Do You Want to Build a Snowman~?", 10, 470); // (10, 470)�� ���ڿ� ���
		}
	}
	
	public static void main(String [] args) //main() �޼ҵ忡�� ���� ����
	{
		new Homework5_2(); // Homework5_2 ��ü ����
	}
}
