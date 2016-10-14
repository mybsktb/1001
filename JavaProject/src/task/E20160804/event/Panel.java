package task.E20160804.event;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * 
 */
public class Panel extends JPanel{
	private static final long serialVersionUID = 1L;
	public static final String UP_PANEL = "上";
	public static final String DOWN_PANEL = "下";
	private JButton fixedButton = new JButton("确定");
	private JTextField userNameText = new JTextField(10);
	private JTextField passwordText = new JTextField(10);
	
	public Panel(String position){
		if (UP_PANEL.equals(position)) {
			this.add(new JLabel("用户名："));
			this.add(userNameText);
		} else if (DOWN_PANEL.equals(position)) {
			this.add(new JLabel("密码："));
			this.add(passwordText);
		} 

	}
	
	public JTextField getUserNameText() {
		return userNameText;
	}

	public void setUserNameText(JTextField userNameText) {
		this.userNameText = userNameText;
	}

	public JTextField getPasswordText() {
		return passwordText;
	}

	public void setPasswordText(JTextField passwordText) {
		this.passwordText = passwordText;
	}
}
