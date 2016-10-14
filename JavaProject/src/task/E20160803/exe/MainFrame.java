package task.E20160803.exe;

import java.awt.GridLayout;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	private Panel panel = new Panel();
	
	public MainFrame(){
		this.setLayout(new GridLayout(0,1));
		this.setTitle("Main");
		this.setVisible(true);
		this.setSize(400, 500);
		this.setLocation(500, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.add(panel);
	}
	
}
