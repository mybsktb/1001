package task.E20160803.gui;

import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
//	private Panel panel = new Panel();
	private Panel pnl1 = new Panel("ÉÏ");
	private Panel pnl2 = new Panel("ÖÐ");
	private Panel pnl3 = new Panel("ÏÂ");
//	MainFrame mainFrame = new MainFrame();
	public MainFrame(String name) {
		super(name);
		//this.setTitle("Windows");
		this.setBounds(400, 200, 300, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Image image = this.getToolkit().getImage("src\\task\\E20160803\\gui\\icon\\icon.png");
		this.setIconImage(image);
	}
	
	private void init(){
		this.setLayout(new GridLayout(0,1));
		this.add(pnl1);
		this.add(pnl2);
		this.add(pnl3);
	}
}
