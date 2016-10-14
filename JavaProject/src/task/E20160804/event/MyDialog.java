package task.E20160804.event;

import java.awt.GridLayout;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MyDialog extends JDialog {
	JFrame jFrame = new JFrame();
	JPanel jPanel = new JPanel();
	JTextArea jTextArea = new JTextArea(400,200);
	
	public MyDialog(){
		jFrame.setSize(500, 500);
		jFrame.setLocation(500, 300);
		jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		jFrame.setVisible(true);
		init();
	}
	
	private void init(){
		jFrame.setLayout(new GridLayout());
		
	}
}
