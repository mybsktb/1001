package task.E20160804.event;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MainFrame extends JFrame{
	private Panel pnl1 = new Panel(Panel.UP_PANEL);
	private Panel pnl2 = new Panel(Panel.DOWN_PANEL);
	private Panel pnl3 = new Panel("");
	
	public static final String FIXED_BTN_TEXT_CONFIRM = "ȷ��";
	public static final String FIXED_BTN_TEXT_CANCEL = "ȡ��";
	public static final String FIXED_BTN_TEXT_RESET = "���";
	private JButton fixedButton = new JButton("ȷ��");
	private JButton cancelButton = new JButton("���");
	public MainFrame(String name){
		super(name);
		this.setBounds(400, 200, 400, 500);
		this.setVisible(true);
		init();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Image image = this.getToolkit().getImage("src\\task\\E20160804\\event\\icon\\icon.png");
		this.setIconImage(image);
	}
	
	public MainFrame() {
	}

	private void init(){
		this.setLayout(new GridLayout(0,1));
		this.add(new JLabel("��ӭ��¼"));
		this.add(pnl1);
		this.add(pnl2);
		this.add(pnl3);
		this.add(fixedButton);
		this.add(cancelButton);
		FixedActionListener fixAL = new FixedActionListener();
		fixedButton.addActionListener(fixAL);
		cancelButton.addActionListener(fixAL);
	}

	class FixedActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton jBtn = (JButton)e.getSource();
			if (MainFrame.FIXED_BTN_TEXT_CONFIRM.equals(jBtn.getActionCommand())) {
				String name = pnl1.getUserNameText().getText();
				String psd = pnl2.getPasswordText().getText();
				// ��ʾ��
				JOptionPane.showMessageDialog(null, "�û�����" + name + " ���룺" + psd);
			} else if (MainFrame.FIXED_BTN_TEXT_RESET.equals(jBtn.getText())) {
				pnl1.getUserNameText().setText("");
				pnl2.getPasswordText().setText("");
			}
		}
	}
}
