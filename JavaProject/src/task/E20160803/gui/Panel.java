package task.E20160803.gui;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Panel extends JPanel{
	private JLabel jLabel = new JLabel("�Ա�");
	private JLabel jLabel2 = new JLabel("��Ȥ��");
	private JRadioButton jRadoiButton = new JRadioButton("��");
	private JRadioButton jRadoiButton2 = new JRadioButton("Ů");
	ButtonGroup buttonGroup  = new ButtonGroup();
	private JCheckBox jCheckBox = new JCheckBox("����");
	private JCheckBox jCheckBox1 = new JCheckBox("����");
	private JCheckBox jCheckBox2 = new JCheckBox("��Ϸ");
	private JButton jButton = new JButton("ȷ��");
	
	public Panel(){
		buttonGroup.add(jRadoiButton);
		buttonGroup.add(jRadoiButton2);
		this.add(jLabel);
		this.add(jRadoiButton);
		this.add(jRadoiButton2);
	}
	public Panel(String name){
		if (name.equals("��")) {
			buttonGroup.add(jRadoiButton);
			buttonGroup.add(jRadoiButton2);
			this.add(jLabel);
			this.add(jRadoiButton);
			this.add(jRadoiButton2);
		} else if (name.equals("��")){
			this.add(jLabel2);
			this.add(jCheckBox);
			this.add(jCheckBox1);
			this.add(jCheckBox2);
		} else if (name.equals("��")){
			this.add(jButton);
		}
	}
}
