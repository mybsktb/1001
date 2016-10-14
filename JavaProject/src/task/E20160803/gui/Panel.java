package task.E20160803.gui;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Panel extends JPanel{
	private JLabel jLabel = new JLabel("性别：");
	private JLabel jLabel2 = new JLabel("兴趣：");
	private JRadioButton jRadoiButton = new JRadioButton("男");
	private JRadioButton jRadoiButton2 = new JRadioButton("女");
	ButtonGroup buttonGroup  = new ButtonGroup();
	private JCheckBox jCheckBox = new JCheckBox("足球");
	private JCheckBox jCheckBox1 = new JCheckBox("篮球");
	private JCheckBox jCheckBox2 = new JCheckBox("游戏");
	private JButton jButton = new JButton("确定");
	
	public Panel(){
		buttonGroup.add(jRadoiButton);
		buttonGroup.add(jRadoiButton2);
		this.add(jLabel);
		this.add(jRadoiButton);
		this.add(jRadoiButton2);
	}
	public Panel(String name){
		if (name.equals("上")) {
			buttonGroup.add(jRadoiButton);
			buttonGroup.add(jRadoiButton2);
			this.add(jLabel);
			this.add(jRadoiButton);
			this.add(jRadoiButton2);
		} else if (name.equals("中")){
			this.add(jLabel2);
			this.add(jCheckBox);
			this.add(jCheckBox1);
			this.add(jCheckBox2);
		} else if (name.equals("下")){
			this.add(jButton);
		}
	}
}
