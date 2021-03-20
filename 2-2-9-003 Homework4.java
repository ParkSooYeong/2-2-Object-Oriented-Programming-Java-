/* SKU CoE ITE : Object-Oriented Programming ����4 - 20170910 �ڼ��� */

// 8���� ���� ������Ʈ - ����Ʈ ��Ű��

import java.awt.*; // �׷��� ó���� ���� Ŭ�������� ��θ�
import javax.swing.*; // ���� ������Ʈ Ŭ�������� ��θ�
import java.awt.event.*; // AWT �̺�Ʈ ����� ���� ��θ�

@SuppressWarnings("serial") // ������ �� ��� üũ���� �ʱ� ���� �ڵ�
public class Homework4 extends JFrame // JFrame�� ��ӹ޴� Homework4 Ŭ���� ����
{
	Container contentPane = getContentPane(); // �������� ����Ʈ���� �˾Ƴ���, �����ʵ�� ���
	
	public Homework4() // Homework4 �⺻ ������
	{
		setTitle("Ű ������ : Homework4"); // ������ Ÿ��Ʋ ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ������ �����찡 ���� �� ���α׷��� �Բ� �����Ѵ�.
		
		contentPane.setLayout(null); // Ư���� ����� ������ �����Ƿ� ��ġ������ ����
		contentPane.addKeyListener(new MyKeyListener()); // Key �̺�Ʈ ������ �ޱ�
		contentPane.setBackground(Color.CYAN); // ����Ʈ���� �ʱ� ���� �������� ����
		
		setSize(500, 500); // ���� 500, ���� 500 ũ��� ������ ũ�� ����
		setLocation(100, 100); // �������� ��� ��ġ�� ����� ȭ�� �� ���� 100, ���� 100�� ��ġ�� ����
		setVisible(true); // �������� ȭ�鿡 ��Ÿ������ ����
		
		// ���� P.370 Key �̺�Ʈ�� KeyListener ����
		contentPane.setFocusable(true); // ����Ʈ���� ��Ŀ���� ���� �� �ֵ��� ����
		contentPane.requestFocus(); // ����Ʈ�ҿ��� ��Ŀ���� �־� Ű �Է��� ���� �� �ְ� ��
	}
	
	class MyKeyListener implements KeyListener // ���� Ŭ������ Key ������ �ۼ�
	{
		public void keyPressed(KeyEvent keyevent) // ��� Ű�� ���� Ű�� ������ ��
		{
			if(keyevent.getKeyChar() == 'r') //Ű r�� �������� �Ʒ� �ڵ带 ����
			{
				contentPane.setBackground(Color.RED); // ����Ʈ���� ���� �������� ����
			}
		}
		
		public void keyReleased(KeyEvent keyevent) // ��� Ű�� ���� ������ Ű�� ������ ��
		{
			contentPane.setBackground(Color.CYAN); // ����Ʈ���� ���� �������� ����
		}
		
		public void keyTyped(KeyEvent keyevent) {} // �����ڵ� Ű�� �Էµ� ��
	}
	
	public static void main(String [] args) // ���� �޼ҵ� ���� ����
	{
		new Homework4(); // Homework4 ��ü ����
	}
}
