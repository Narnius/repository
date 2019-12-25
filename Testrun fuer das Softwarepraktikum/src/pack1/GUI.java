package pack1;

import javax.swing.JFrame;

public class GUI {

	public GUI() {
		
		Var.jf1 = new JFrame();
		Var.jf1.setSize(Var.screenwidth,Var.screenheight);
		Var.jf1.setLocationRelativeTo(null);
		Var.jf1.setLayout(null);
		Var.jf1.setTitle("MeteorSchauer");
		Var.jf1.setResizable(false);
		Var.jf1.setVisible(true);
	}

}
