package task.E20160803.exe;

import javax.swing.*;

public class Test {

	private static JLabel textLabel = new JLabel("�ı���");
	private static JTextField textField = new JTextField(10);
	private static JLabel buttonLabel = new JLabel("��ť��");
	private static JButton button = new JButton("ȷ��");
	private static JLabel chooseLabel = new JLabel("ѡ���");
	private static JCheckBox ckb1 = new JCheckBox("ϲ������");
	private static JCheckBox ckb2 = new JCheckBox("ϲ������");
	private static JCheckBox ckb3 = new JCheckBox("ϲ������");
	private static JLabel radioLabel = new JLabel("��ѡ��ť��");
	private static JRadioButton radioBtn1 = new JRadioButton("��");
	private static JRadioButton radioBtn2 = new JRadioButton("Ů");
	private static ButtonGroup buttonGroup = new ButtonGroup();
	private static JLabel listLabel = new JLabel("�����б�");
	private static ComboBox comboBox1 = new ComboBox();
	private static JLabel textAreaLabel = new JLabel("�ı�����"); 
	private static JTextArea textArea = new JTextArea(10,10);
	
	public static void main(String[] args) {
		MainFrame frm = new MainFrame();
		
		buttonGroup.add(radioBtn1);
		buttonGroup.add(radioBtn2);
		
		Panel panel1 = new Panel();
		Panel panel2 = new Panel();
		Panel panel3 = new Panel();
		Panel panel4 = new Panel();
		Panel panel5 = new Panel();
		Panel panel6 = new Panel();
		
		panel1.add(textLabel);
		panel1.add(textField);
		panel2.add(buttonLabel);
		panel2.add(button);
		panel3.add(chooseLabel);
		panel3.add(ckb1);
		panel3.add(ckb2);
		panel3.add(ckb3);
		panel4.add(radioLabel);
		panel4.add(radioBtn1);
		panel4.add(radioBtn2);
		panel5.add(listLabel);
		panel5.add(comboBox1);
		panel6.add(textAreaLabel);
		panel6.add(textArea);
		
		frm.add(panel1);
		frm.add(panel2);
		frm.add(panel3);
		frm.add(panel4);
		frm.add(panel5);
		frm.add(panel6);
	}

}
