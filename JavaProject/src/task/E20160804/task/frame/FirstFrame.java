package task.E20160804.task.frame;

import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FirstFrame extends JFrame {
	// ָ���ı����������ݵĳ���
	public static final int TEXT_LENGTH = 5; //��
	// �½��ı������
	JTextField jTextField1 = new JTextField(5);
	JTextField jTextField2 = new JTextField(5);
	JTextField jTextField3 = new JTextField(5);
	// �м�����
	JPanel jPanel = new JPanel();
	
	public FirstFrame() {
		this.setTitle("��ҵ1");
		this.setSize(400, 300);
		this.setLocation(500, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		init();
	}
	
	/** ��ʼ��*/
	private void init() {
		// ��ӵ��м�����
		jPanel.add(jTextField1);
		jPanel.add(jTextField2);
		jPanel.add(jTextField3);
		jTextField1.requestFocus();
		// ��ӽ����¼�����
		FoucsListen focusLis = new FoucsListen();
		jTextField1.addFocusListener(focusLis);
		jTextField2.addFocusListener(focusLis);
		jTextField3.addFocusListener(focusLis);
		// ��Ӱ����¼�����
		jTextField1.addKeyListener(focusLis);
		jTextField2.addKeyListener(focusLis);
		jTextField3.addKeyListener(focusLis);

		this.setLayout(new FlowLayout());
		this.add(jPanel);
	}
	
	/** ������� */
	class FoucsListen implements FocusListener,KeyListener{
		
		/* ��ȡ����*/
		@Override
		public void focusGained(FocusEvent e) {
			JTextField jTf = (JTextField) e.getSource();
			// �ı�������ȫѡ
			jTf.selectAll();
		}

		@Override
		public void focusLost(FocusEvent e) {
		}

		/* 
		 * ���������ֱ��ͷ�
		 */
		@Override
		public void keyTyped(KeyEvent e) {
			// ��ȡ�¼�Դ
			JTextField jFld = (JTextField)e.getSource();
			// ���ȴ���ָ������ʱ����һ�����
			if(jFld.getDocument().getLength() == TEXT_LENGTH){
				jFld.transferFocus(); //�൱��TAB��
			}
		}

		@Override
		public void keyPressed(KeyEvent e) {
		}

		@Override
		public void keyReleased(KeyEvent e) {
		}
	}
	
	public static void main(String[] args) {
		new FirstFrame();
	}
}
