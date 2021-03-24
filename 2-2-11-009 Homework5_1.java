/* SKU CoE ITE : Object-Oriented Programming ���� 5.1 - 20170910 �ڼ��� */

import javax.swing.*; // ���� ������Ʈ Ŭ�������� ��θ�
import java.awt.*; // �׷��� ó���� ���� Ŭ�������� ��θ�

@SuppressWarnings("serial") // ������ �� ��� üũ���� �ʱ� ���� �ڵ�
public class Homework5_1 extends JFrame // JFrame�� ��ӹ޴� Homework5_1 Ŭ���� ����
{
	Homework5_1() // ������ Homework5_1
	{
		setTitle("20170910 �ڼ��� HW#5_1 : �ڵ��� �׸���"); // ������ Ÿ��Ʋ ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ������ �����찡 ���� �� ���α׷��� �Բ� �����Ѵ�.
		setContentPane(new MyPanel()); // MyPanel �г��� ����Ʈ������ ���
		Container contentPane = getContentPane(); // �������� ����Ʈ���� �˾Ƴ���.
		contentPane.setBackground(Color.BLACK); // ������ ��� ����
		setSize(500,300); // ������ ũ�� 500 x 300
		setVisible(true); // ������ ���
	}
	
	class MyPanel extends JPanel // JPanel�� ��ӹ��� �г� MyPanel�� �����Ѵ�.
	{
		public void paintComponent(Graphics g) // MyPanel�� ���θ� �׸��� �޼ҵ�
		{
			super.paintComponent(g); // JPanel�� ������ paintComponent() ȣ��
			g.setColor(Color.ORANGE); // ��Ȳ���� �����Ѵ�.
			g.drawLine(0, 200, 500, 200); // ����
			
			g.setColor(Color.WHITE); // �Ͼ���� �����Ѵ�.
			g.fillRoundRect(100, 100, 300, 75, 150, 50); // �� ��ü
			g.fillRoundRect(175, 50, 150, 100, 150, 150); // �� ��ü
			g.fillArc(160, 150, 50, 50, 180, 180); // ���� Ÿ�̾�
			g.fillArc(295, 150, 50, 50, 180, 180); // ���� Ÿ�̾�
			g.fillArc(382, 122, 33, 33, 270, 180); // ����Ʈ Ŀ��
			g.drawString("Someday I want to go on a drive date with my lover in a car like this...", 60, 240);
			// (60, 240)�� ���ڿ� ���
			
			g.setColor(Color.RED); // �������� �����Ѵ�.
			g.fillRoundRect(20, 140, 80, 10, 40, 13); // �ν��� �ܺ� �Ҳ�
			
			g.setColor(Color.YELLOW); // ������� �����Ѵ�.
			g.fillArc(385, 124, 28, 28, 270, 180); // ����Ʈ �ھ�
			g.drawLine(420, 124, 470, 118); // �� �ٱ� ���
			g.drawLine(420, 138, 470, 138); // �� �ٱ� �ߴ�
			g.drawLine(420, 152, 470, 158); // �� �ٱ� �ߴ�
			g.fillRoundRect(51, 141, 40, 7, 40, 13); // �ν��� ���� �Ҳ�
			g.fillOval(20, 10, 80, 80); // ��
			
			g.setColor(Color.CYAN); // �ϴû��� �����Ѵ�.
			g.fillArc(188, 60, 125, 75, 0, 180); // â��
			
			g.setColor(Color.BLACK); // �������� �����Ѵ�.
			g.fillArc(170, 160, 30, 30, 180, 180); // ���� ��
			g.fillArc(305, 160, 30, 30, 180, 180); // ���� ��
			g.drawLine(250, 60, 250, 175); // �� �� ���μ�
			g.drawLine(175, 102, 325, 102); // �� �� ���μ�
			g.fillOval(240, 110, 5, 5); // �� �¼� ������
			g.fillOval(255, 110, 5, 5); // �� �¼� ������
			g.drawOval(140, 110, 40, 40); // BMW �ΰ� ���� �׵θ�
			g.drawOval(137, 107, 46, 46); // BMW �ΰ� �ܺ� �׵θ�
			g.fillOval(40, 10, 60, 60); // �� �׸���
			
			g.setColor(Color.GRAY); // ȸ���� �����Ѵ�.
			g.fillRect(85, 140, 15, 10); // ��ⱸ
			
			g.setColor(Color.BLUE); // �Ķ����� �����Ѵ�.
			g.fillArc(140, 110, 40, 40, 90, 90); // BMW �ΰ� ��2��и� ���� ����
			g.fillArc(140, 110, 40, 40, 270, 90); // BMW �ΰ� ��4��и� ���� ����
		}
	}
	
	public static void main(String [] args) //main() �޼ҵ忡�� ���� ����
	{
		new Homework5_1(); // Homework5_1 ��ü ����
	}
}
