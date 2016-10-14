package task.E20160804.task.frame;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

import task.E20160804.task.panel.Panel;

/**
 * ��һ�������б���Լ�һ������򣻵������б�����ݷ����仯��ʱ��
 * ������������ʾ�����б�仯�������
 */
public class SecondFrame extends JFrame{
	// �½������б�
	JComboBox comboBox = new JComboBox();
	// �����
	JTextField jTextField = new JTextField();
	private Panel panel = new Panel();
	
	public SecondFrame(){
		this.setTitle("��ҵ2");
		this.setSize(400, 300);
		this.setLocation(500, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		init();
	}
	
	// ��ʼ��
	private void init(){
		this.setLayout(new FlowLayout());
		comboBox.addItem("�������");
		comboBox.addItem("��������");
		comboBox.addItem("��������");
		panel.add(jTextField);
		panel.add(comboBox);
		// ��Ӽ�����
		comboBox.addItemListener(new ItemListener(){
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				JComboBox comb = (JComboBox)e.getSource();
				// �������б�ǰֵд���������
				jTextField.setText((String)comb.getSelectedItem());
			}
		});
		this.add(panel);
	}
	
	public static void main(String[] args) {
		new SecondFrame();
	}
}
