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
 * 3.有两个按钮，以及一个文本域。
 *	当单击 按钮1 的时候，在文本域中增加内容: 第一行：你点击了按钮1  第二行： 按钮总共的点击次数
 *	当单击 按钮2 的时候，在文本域中增加内容: 按钮总共点击次数
 */
public class ThirdFrame extends JFrame {

	public static final String BTN1 = "按钮1";
	private JButton jBtn1 = new JButton("按钮1");
	private JButton jBtn2 = new JButton("按钮2");
	private JTextArea jTextArea = new JTextArea(5,10);
	private Panel panel = new Panel();
	private Panel panel1 = new Panel();
	// 计数
	private int count = 0;
	
	public ThirdFrame(){
		this.setTitle("作业3");
		this.setSize(500, 300);
		this.setLocation(500, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		init();
	}
	
	// 初始化
	private void init(){
		this.setLayout(new GridLayout(0,1));
		panel.add(jBtn1);
		panel.add(jBtn2);
		// 添加滚动条
		JScrollPane jsp = new JScrollPane(jTextArea);
		panel1.add(jsp);
		ActionLis aLis = new ActionLis();
		// 添加监听
		jBtn1.addActionListener(aLis);
		jBtn2.addActionListener(aLis);
		this.add(panel);
		this.add(panel1);
	}
	
	class ActionLis implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton jBtn = (JButton)e.getSource();
			// 点击按钮1
			if (BTN1.equals(jBtn.getText())) {
				// 追加内容
				jTextArea.append("你点击了" + BTN1 + "\n");
			}

			if (e.getSource() instanceof JButton) {
				// 追加内容
				jTextArea.append("按钮总共点击次数为：" + ++count + "次" + "\n");
			}
		}
	}
	
	public static void main(String[] args) {
		new ThirdFrame();
	}
}
