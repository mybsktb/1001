package task.E20160804.task.frame;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

import task.E20160804.task.panel.Panel;

/**
 * 有一个下拉列表框，以及一个输入框；当下拉列表的内容发生变化的时候，
 * 输入框的内容显示下拉列表变化后的内容
 */
public class SecondFrame extends JFrame{
	// 新建下拉列表
	JComboBox comboBox = new JComboBox();
	// 输入框
	JTextField jTextField = new JTextField();
	private Panel panel = new Panel();
	
	public SecondFrame(){
		this.setTitle("作业2");
		this.setSize(400, 300);
		this.setLocation(500, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		init();
	}
	
	// 初始化
	private void init(){
		this.setLayout(new FlowLayout());
		comboBox.addItem("音乐天地");
		comboBox.addItem("旅游世界");
		comboBox.addItem("篮球天堂");
		panel.add(jTextField);
		panel.add(comboBox);
		// 添加监听器
		comboBox.addItemListener(new ItemListener(){
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				JComboBox comb = (JComboBox)e.getSource();
				// 将下拉列表当前值写入输入框内
				jTextField.setText((String)comb.getSelectedItem());
			}
		});
		this.add(panel);
	}
	
	public static void main(String[] args) {
		new SecondFrame();
	}
}
