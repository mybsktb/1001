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
	// 指定文本框输入内容的长度
	public static final int TEXT_LENGTH = 5; //？
	// 新建文本框对象
	JTextField jTextField1 = new JTextField(5);
	JTextField jTextField2 = new JTextField(5);
	JTextField jTextField3 = new JTextField(5);
	// 中间容器
	JPanel jPanel = new JPanel();
	
	public FirstFrame() {
		this.setTitle("作业1");
		this.setSize(400, 300);
		this.setLocation(500, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		init();
	}
	
	/** 初始化*/
	private void init() {
		// 添加到中间容器
		jPanel.add(jTextField1);
		jPanel.add(jTextField2);
		jPanel.add(jTextField3);
		jTextField1.requestFocus();
		// 添加焦点事件监听
		FoucsListen focusLis = new FoucsListen();
		jTextField1.addFocusListener(focusLis);
		jTextField2.addFocusListener(focusLis);
		jTextField3.addFocusListener(focusLis);
		// 添加按键事件监听
		jTextField1.addKeyListener(focusLis);
		jTextField2.addKeyListener(focusLis);
		jTextField3.addKeyListener(focusLis);

		this.setLayout(new FlowLayout());
		this.add(jPanel);
	}
	
	/** 焦点监听 */
	class FoucsListen implements FocusListener,KeyListener{
		
		/* 获取焦点*/
		@Override
		public void focusGained(FocusEvent e) {
			JTextField jTf = (JTextField) e.getSource();
			// 文本框内容全选
			jTf.selectAll();
		}

		@Override
		public void focusLost(FocusEvent e) {
		}

		/* 
		 * 按键按下又被释放
		 */
		@Override
		public void keyTyped(KeyEvent e) {
			// 获取事件源
			JTextField jFld = (JTextField)e.getSource();
			// 长度大于指定长度时换下一输入框
			if(jFld.getDocument().getLength() == TEXT_LENGTH){
				jFld.transferFocus(); //相当于TAB键
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
