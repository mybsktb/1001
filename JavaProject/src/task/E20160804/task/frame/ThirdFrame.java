package task.E20160804.task.frame;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import task.E20160804.task.panel.Panel;

/**
 * 3.��������ť���Լ�һ���ı���
 *	������ ��ť1 ��ʱ�����ı�������������: ��һ�У������˰�ť1  �ڶ��У� ��ť�ܹ��ĵ������
 *	������ ��ť2 ��ʱ�����ı�������������: ��ť�ܹ��������
 */
public class ThirdFrame extends JFrame {

	public static final String BTN1 = "��ť1";
	private JButton jBtn1 = new JButton("��ť1");
	private JButton jBtn2 = new JButton("��ť2");
	private JTextArea jTextArea = new JTextArea(5,10);
	private Panel panel = new Panel();
	private Panel panel1 = new Panel();
	// ����
	private int count = 0;
	
	public ThirdFrame(){
		this.setTitle("��ҵ3");
		this.setSize(500, 300);
		this.setLocation(500, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		init();
	}
	
	// ��ʼ��
	private void init(){
		this.setLayout(new GridLayout(0,1));
		panel.add(jBtn1);
		panel.add(jBtn2);
		// ��ӹ�����
		JScrollPane jsp = new JScrollPane(jTextArea);
		panel1.add(jsp);
		ActionLis aLis = new ActionLis();
		// ��Ӽ���
		jBtn1.addActionListener(aLis);
		jBtn2.addActionListener(aLis);
		this.add(panel);
		this.add(panel1);
	}
	
	class ActionLis implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton jBtn = (JButton)e.getSource();
			// �����ť1
			if (BTN1.equals(jBtn.getText())) {
				// ׷������
				jTextArea.append("������" + BTN1 + "\n");
			}

			if (e.getSource() instanceof JButton) {
				// ׷������
				jTextArea.append("��ť�ܹ��������Ϊ��" + ++count + "��" + "\n");
			}
		}
	}
	
	public static void main(String[] args) {
		new ThirdFrame();
	}
}
